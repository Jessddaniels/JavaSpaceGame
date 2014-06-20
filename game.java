import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;
import java.util.ArrayList;
import java.io.File;


public class game extends Core implements KeyListener, MouseMotionListener, MouseListener, MouseWheelListener{

	public static void main(String args[]) {
      game jess = new game();
      jess.run();
      //new game().run();
      //new game().runStartScreen();
	}
   private long startTime = System.currentTimeMillis();
   public Player p1 = new Player();
   ArrayList<EnemyShip> enemyList = new ArrayList<>();
   private boolean lost = false;
	private String mess ="";
   private String messEnergy ="Energy is at " + p1.getEnergy() + "%";
	Image bg = new ImageIcon("C:\\Users\\Jess\\Desktop\\Game\\Pictures\\backgroundSpace.jpg").getImage();
   Image gameOver = new ImageIcon("C:\\Users\\Jess\\Desktop\\Game\\Pictures\\backgroundGameOver.jpg").getImage();
   Image youWin = new ImageIcon("C:\\Users\\Jess\\Desktop\\Game\\Pictures\\backgroundYouWin.jpg").getImage();
	Point lazerPoint;
   boolean lazerAlive;
   Level level1 = new Level(1);
   private String win = "";
   MyThread secondThread = new MyThread("secondThread", 6000);
   Thread SecondThread = new Thread(secondThread);
	public void init(){
      SecondThread.start();
      super.init();
		Window w = s.getFullScreenWindow();
		w.addMouseListener(this);
		w.addMouseMotionListener(this);
		w.addMouseWheelListener(this);
		w.addKeyListener(this);
		w.setFocusTraversalKeysEnabled(false);
		loadImages();
	}	
	
	//load images and add scenes
   public ArrayList<EnemyShip> getEnemyList() {
      return enemyList;
   }
	public void loadImages() {
		p1.setVelocityX(0.0f);
		p1.setVelocityY(0.0f);
		p1.setX(1);
		p1.setY(s.getHeight()/2);
   }

   public void theLevel() {
      if (level1.placeEnemies(1,startTime,getCumTime() - 2 *totalWePaused,enemyList.size(),s) != null) {
      enemyList.add(level1.placeEnemies(1,startTime,System.currentTimeMillis(), enemyList.size(), s));
      }
   }
	
	//draws graphics
	public void draw(Graphics2D g) {
		Window w = s.getFullScreenWindow();
      if (win == "") {//if player has not won or lost
      //draws background
		g.drawImage(bg, 0, 0, null);
      //draws player
		g.drawImage(p1.getImage(), Math.round(p1.getX()), Math.round(p1.getY()), null);
      //draws lazer
      if (lazerAlive == true && lazerPoint != null) {
         g.setColor(Color.RED);
         g.drawLine((int)(p1.getX()+p1.getWidth()),(int) (p1.getY()+p1.getHeight()/2-3), (int)(lazerPoint.getX()), (int)(lazerPoint.getY()-3));
         g.drawLine((int)(p1.getX()+p1.getWidth()),(int) (p1.getY()+p1.getHeight()/2+3), (int)(lazerPoint.getX()), (int)(lazerPoint.getY())+3);
         g.drawLine((int)(p1.getX()+p1.getWidth()),(int) (p1.getY()+p1.getHeight()/2-2), (int)(lazerPoint.getX()), (int)(lazerPoint.getY())-2);
         g.drawLine((int)(p1.getX()+p1.getWidth()),(int) (p1.getY()+p1.getHeight()/2+2), (int)(lazerPoint.getX()), (int)(lazerPoint.getY())+2);
         g.setColor(Color.ORANGE);
         g.drawLine((int)(p1.getX()+p1.getWidth()),(int) (p1.getY()+p1.getHeight()/2-1), (int)(lazerPoint.getX()), (int)(lazerPoint.getY())-1);
         g.drawLine((int)(p1.getX()+p1.getWidth()),(int) (p1.getY()+p1.getHeight()/2+1), (int)(lazerPoint.getX()), (int)(lazerPoint.getY())+1);
         g.setColor(Color.YELLOW);
         g.drawLine((int)(p1.getX()+p1.getWidth()),(int) (p1.getY()+p1.getHeight()/2), (int)(lazerPoint.getX()), (int)(lazerPoint.getY()));
         g.setColor(Color.WHITE);
      }
      //draws enemies
      for (int i = 0; i<enemyList.size(); i++) {
         if (enemyList.get(i).Alive()) {
   		   g.drawImage(enemyList.get(i).getImage(), Math.round(enemyList.get(i).getX()), Math.round(enemyList.get(i).getY()), null);
         }
      }
      //draws string
		g.drawString(mess, 40, 50);
      g.drawString(messEnergy, 400, 50);
      }
      if (win == "loss") {
         secondThread.running = false;
         secondThread.soundPlayer.sourceLine.stop();
         g.drawImage(gameOver, 0, 0, null);
      }
      if (win == "win") {
         
         g.drawImage(youWin, 0, 0, null);
         secondThread.running = false;
         secondThread.soundPlayer.sourceLine.stop();
      }
	}
	
   public void setMessEnergy(){
      messEnergy ="Energy Level: " + p1.getEnergy() + "%";
   }
	public Player getP1(){
      return p1;
   }
	public void update(long timePassed){
      
      checkCollisions();
      theLevel();
      //ship velocity after colloding with game edge
		if(p1.getX() <= 0){
			p1.setVelocityX((float)0.01);
		} else if(p1.getX()+p1.getWidth() >= s.getWidth()) {
			p1.setVelocityX((float)(-0.01));
		}
		if(p1.getY() <= 0){
			p1.setVelocityY((float)0.01);
		} else if(p1.getY() + p1.getHeight() >= s.getHeight()) {
			p1.setVelocityY((float)(-0.01));
		}
      //updates enemies
      for (int i = 0; i<enemyList.size(); i++) {
         enemyList.get(i).update(timePassed, p1);
      }
      //updates player 1
		p1.update(timePassed);
      setMessEnergy();
      if (p1.getEnergy() < 2.0) 
      lazerAlive = false;
      //if you lost
      if (lost) {
         win = "loss";
      }
      //if you win
      if (-startTime + getCumTime() -2 *totalWePaused >70000) {
         win = "win";
      }
	}
   //Deals with player 1 ship collisions with enemies
	public void checkCollisions() {
      for (int i = 0; i<enemyList.size(); i++) {
         Rectangle r1 = enemyList.get(i).getBounds();
         Rectangle d = p1.getBounds();
         if (d.intersects(r1) && enemyList.get(i).Alive()) {
            lost = true;
         }
      }
   }
	//*****************************************************************************************
   //***************The following deals with game responses to the mouse**********************
	public void mousePressed(MouseEvent e) {
		//mess = "you pressed down the mouse";
      if (p1.getEnergy() > 2.5) {
         if(!(p1.getLazerOn())){
            p1.addEnergy(-0.5);
         }
         Point point1 = new Point(e.getLocationOnScreen());
         lazerPoint = point1;
         lazerAlive = true;
         p1.setLazerOn(true);
         for (int i = 0; i<enemyList.size(); i++) {
            Rectangle r1 = enemyList.get(i).getBounds();
            Rectangle locRec = new Rectangle((int)(point1.getX()),(int)(point1.getY()),(int)1,(int)1);
      		if(locRec.intersects(r1)){
               enemyList.get(i).shipExplode();
      		}
   	   }
      } else {
         lazerAlive = false;
         p1.setLazerOn(false);
      }
	}
	public void mouseReleased(MouseEvent e){
		//mess= "you released the mouse";
      lazerAlive = false;
      p1.setLazerOn(false);
	}
	public void mouseClicked(MouseEvent e){
	}
	public void mouseEntered(MouseEvent e){
	}
	public void mouseExited(MouseEvent e){
	}
	
	//mouse motion interface
	public void mouseDragged(MouseEvent e){
		//mess="you are dragging the mouse";
	}
	public void mouseMoved(MouseEvent e){
		//mess = "you are moving the mouse";
	}
	//wheel interface
	public void mouseWheelMoved(MouseWheelEvent e) {
		//mess="moving mouse wheel";
	}
	//*****************************************************************************************
   //***************The following deals with game responses to keyboard***********************
	public void keyPressed(KeyEvent e){
		int keyCode = e.getKeyCode();
		if(keyCode == KeyEvent.VK_ESCAPE){
         secondThread.soundPlayer.sourceLine.stop();
         secondThread.running = false;
			stop();
		} else if(keyCode == KeyEvent.VK_D){
			p1.setVelocityX(0.2f);
			e.consume();
		} else if(keyCode == KeyEvent.VK_A){
			p1.setVelocityX(- 0.2f);
			e.consume();
		} else if(keyCode == KeyEvent.VK_S){
			p1.setVelocityY(0.2f);
			e.consume();
		} else if(keyCode == KeyEvent.VK_W){
			p1.setVelocityY(- 0.2f);
			e.consume();
      } else if(keyCode == KeyEvent.VK_P){
			setPaused(true);
			e.consume();
      } else if(keyCode == KeyEvent.VK_O){
			setPaused(false);
			e.consume();
		} else {
			//mess = "Pressed : " + KeyEvent.getKeyText(keyCode);
			e.consume();
		}
	}
	//keyReleased
	public void keyReleased(KeyEvent e) {
		int keyCode = e.getKeyCode();
      if(keyCode == KeyEvent.VK_D){
			p1.setVelocityX(0);
			e.consume();
		} else if(keyCode == KeyEvent.VK_A){
			p1.setVelocityX(0);
			e.consume();
		} else if(keyCode == KeyEvent.VK_S){
			p1.setVelocityY(0);
			e.consume();
		} else if(keyCode == KeyEvent.VK_W){
			p1.setVelocityY(0);
			e.consume();
		} else {

		//mess = "Released : "+KeyEvent.getKeyText(keyCode);
		e.consume();
      }
	}
	//last method from interface
	public void keyTyped(KeyEvent e) {
		e.consume();
	}

}
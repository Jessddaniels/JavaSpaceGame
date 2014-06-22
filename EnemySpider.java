import java.awt.*;
import javax.swing.ImageIcon;

public class EnemySpider extends EnemyShip {
   Image enemyShipImage = new ImageIcon("Pictures\\alienship2.png").getImage();
   Image enemyShipExplode1Image = new ImageIcon("Pictures\\alienship2Explode1.png").getImage();
   Image enemyShipExplode2Image = new ImageIcon("Pictures\\alienship2Explode2.png").getImage();
   Image enemyShipExplode3Image = new ImageIcon("Pictures\\alienship2Explode3.png").getImage();
   Image enemyShipExplode4Image = new ImageIcon("Pictures\\alienship2Explode4.png").getImage();
   
   public EnemySpider() {
      super();/*
      super.setImage(enemyShipImage);
      super.setImageExplode1(enemyShipExplode1Image);
      super.setImageExplode2(enemyShipExplode2Image);
      super.setImageExplode3(enemyShipExplode3Image);
      super.setImageExplode4(enemyShipExplode4Image);*/
   }
   //*************getters*****************************
	/*public float getX(){
		return enemyShipSprite.getX();
	}
	public float getY(){
		return enemyShipSprite.getY();
	}	
   public Image getImage(){
		return enemyShipSprite.getImage();
	}
   public float getVelocityX() {
      return enemyShipSprite.getVelocityX();
   }
   public float getVelocityY() {
      return enemyShipSprite.getVelocityY();
   }
   public float getWidth(){
      return enemyShipSprite.getWidth();
   }
   public float getHeight(){
      return enemyShipSprite.getHeight();
   }
   public long getDeadTime(){
      return deadTime;
   }
   public Rectangle getBounds() {
     return enemyShipSprite.getBounds();
   }*/
   //************setters*************************************
   /*public void setX(float x) {
		enemyShipSprite.setX(x);
	}
	public void setY(float y) {
		enemyShipSprite.setY(y);
	}
   public void setVelocityX(float vx){
		enemyShipSprite.setVelocityX(vx);
	}
   public void setVelocityY(float vy){
		enemyShipSprite.setVelocityY(vy);
	}*/
   //**********************other methods******************************
   /*public void update(long timePassed){
		enemyShipSprite.update(timePassed);
      if (getDeadTime() != 0 && System.currentTimeMillis() - getDeadTime() >= 1200) {
          isAlive = false;
      }
	}
   public void move(){
		x = x+dx;
	}
   public boolean Alive() {
      return isAlive;
   }
   public void addScene(){
      enemyShipAnimation.addScene(enemyShipImage, 100);
   }
   public synchronized void removeScene() {
		enemyShipAnimation.removeScene();
	}
   public synchronized void addScene(Image i, long t) {
		enemyShipAnimation.addScene(i, t);
	}
   public void shipExplode(){
      	removeScene();
			addScene(enemyShipExplode1Image, 300);
         addScene(enemyShipExplode2Image, 300);
         addScene(enemyShipExplode3Image, 300);
         addScene(enemyShipExplode4Image, 300);
         deadTime = System.currentTimeMillis();

   }*/
}
import java.awt.*;
import javax.swing.ImageIcon;

public class EnemySphere extends EnemyShip {
   Image enemyShipImage = new ImageIcon("C:\\Users\\Jess\\Desktop\\Game\\Pictures\\AlienShipSphere.png").getImage();
   Image enemyShipExplode1Image = new ImageIcon("C:\\Users\\Jess\\Desktop\\Game\\Pictures\\AlienShipSphereExplode1.png").getImage();
      public EnemySphere() {
      super();
      super.setImage(enemyShipImage);
      super.enemyShipAnimation.removeScene();
      super.enemyShipAnimation.addScene(enemyShipImage, 100);/*
      super.setImageExplode1(new ImageIcon("C:\\Users\\Jess\\Desktop\\Game\\Pictures\\alienship2Explode1.png").getImage());
      super.setImageExplode2(new ImageIcon("C:\\Users\\Jess\\Desktop\\Game\\Pictures\\alienship2Explode2.png").getImage());
      super.setImageExplode3(new ImageIcon("C:\\Users\\Jess\\Desktop\\Game\\Pictures\\alienship2Explode3.png").getImage());
      super.setImageExplode4(new ImageIcon("C:\\Users\\Jess\\Desktop\\Game\\Pictures\\alienship2Explode4.png").getImage());
   */}
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
   public void update(long timePassed, Player p1){
		enemyShipSprite.update(timePassed);
      if(p1.getLazerOn()==true){
         setVelocityX((- this.getX()+p1.getX())/5000);
         setVelocityY((- this.getY()+p1.getY())/5000);
      }
      if (getDeadTime() != 0 && System.currentTimeMillis() - getDeadTime() >= 300) {
          isAlive = false;
      }
	}/*
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
	}*/
   public void shipExplode(){
      	removeScene();
			addScene(enemyShipExplode1Image, 300);
         setDeadTime(System.currentTimeMillis());

   }
}
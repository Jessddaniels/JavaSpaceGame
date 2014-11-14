import java.awt.*;
import javax.swing.ImageIcon;
public class Player {
	Image p1ShipImage = new ImageIcon("C:\\Users\\Jess\\Desktop\\Game\\Pictures\\spaceship.png").getImage();
   ImageIcon p1ShipImageIcon = new ImageIcon("C:\\Users\\Jess\\Desktop\\Game\\Pictures\\spaceship.pgn");
   private Animation p1Animation;
   private Sprite p1Sprite;
   private double Energy;
   private int RechargeTime;
   private int EnergyTime;
   private boolean lazerOn = false;
	public Player(){
      p1Animation = new Animation();
      p1Animation.addScene(p1ShipImage, 100);
      p1Sprite = new Sprite(p1Animation);
		setX(0);
		setY(0);
      setVelocityX(0);
      setVelocityY(0);
      Energy = 0;
      RechargeTime = 0;
      EnergyTime=0;
	}
	public void move(){
		setX(getX() + getVelocityX());
	}
	public float getX(){
		return p1Sprite.getX();
	}
	public float getY(){
		return p1Sprite.getY();
	}	
   //set sprite x position
	public void setX(float x) {
		p1Sprite.setX(x);
	}
	//set sprite y position
	public void setY(float y) {
		p1Sprite.setY(y);
	}
   public boolean getLazerOn() {
      return lazerOn;
   }
   public void setLazerOn(boolean isOn) {
      lazerOn = isOn;
   }
   public void addEnergy(double change){
      Energy += change;
   }
	public Image getImage(){
		return p1Sprite.getImage();
	}
   public float getVelocityX() {
      return p1Sprite.getVelocityX();
   }
   public float getVelocityY() {
      return p1Sprite.getVelocityY();
   }
   public double getEnergy(){
      return Energy;
   }
   public void setVelocityX(float vx){
		p1Sprite.setVelocityX(vx);
	}
   public void setVelocityY(float vy){
		p1Sprite.setVelocityY(vy);
	}
   public float getWidth(){
      return p1Sprite.getWidth();
   }
   public float getHeight(){
      return p1Sprite.getHeight();
   }
   public void update(long timePassed){
		p1Sprite.update(timePassed);
      EnergyTime += timePassed;
      if (Energy < 2.0)  {
         setLazerOn(false);
      }
      if (EnergyTime > RechargeTime + 1500 && Energy < 100) {
         RechargeTime += 1500;
         if (!lazerOn) {
            Energy += 1;
            if (Energy > 100) {
               Energy = 100;
            }
         } else if (lazerOn) {
            Energy -=2;
         }
      }
	}
   public Rectangle getBounds() {
      return p1Sprite.getBounds();
   }
   public void addScene(){
      p1Animation.addScene(p1ShipImage, 100);
   }
}
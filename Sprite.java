import java.awt.Image;
import java.awt.*;

public class Sprite {
	private Animation a;
	private float x;
	private float y;
	private float vx;
	private float vy;
	
	//constructor
	public Sprite(Animation a) {
		this.a =a;
	}
	
	//change position
	public void update(long timePassed){
		x += vx * timePassed;
		y += vy * timePassed;
		a.update(timePassed);
	}
	public Rectangle getBounds() {
      return new Rectangle((int)x,(int)y,(int)getWidth(),(int)getHeight());
   }
	//get x position
	public float getX() {
		return x;
	}
	//get y position
	public float getY() {
		return y;
	}
	//set sprite x position
	public void setX(float x) {
		this.x =x;
	}
	//set sprite y position
	public void setY(float y) {
		this.y =y;
	}
	
	//get sprite width
	public float getWidth(){
		return a.getImage().getWidth(null);
	}
	//get sprite height
	public float getHeight(){
		return a.getImage().getHeight(null);
	}
	//get horizontal velocity
	public float getVelocityX(){
		return vx;
	}
	//get Vertical velocity
	public float getVelocityY(){
		return vy;
	}
	//set horizontal velocity
	public void setVelocityX(float vx){
		this.vx = vx;
	}
	//set vertical velocity
	public void setVelocityY(float vy){
		this.vy = vy;
	}
	//get sprites image
	public Image getImage() {
		return a.getImage();
	}
}
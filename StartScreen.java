import java.awt.*;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.*;


public class StartScreen extends Core implements KeyListener, MouseListener, ActionListener{
   private String mess ="";
   public static void main(String args[]) {
      StartScreen jessSS = new StartScreen();
      jessSS.runStartScreen();
     
	}
   public void init(){
      super.init();
		Window w = s.getFullScreenWindow();
		w.addMouseListener(this);
		w.addKeyListener(this);
	}	
   //draws graphics
	public void draw(Graphics2D g) {
		Window w = s.getFullScreenWindow();
   }
   public void mousePressed(MouseEvent e) {
		mess = "you pressed down the mouse";
   }
	public void mouseReleased(MouseEvent e){
		mess= "you released the mouse";
	}
	public void mouseClicked(MouseEvent e){
	}
	public void mouseEntered(MouseEvent e){
	}
	public void mouseExited(MouseEvent e){
	}
   public void keyPressed(KeyEvent e){
		int keyCode = e.getKeyCode();
		if(keyCode == KeyEvent.VK_ESCAPE){
			stop();
		} else {
			mess = "Pressed : " + KeyEvent.getKeyText(keyCode);
			e.consume();
		}
	}
   //keyReleased
	public void keyReleased(KeyEvent e) {
		int keyCode = e.getKeyCode();
		mess = "Released : "+KeyEvent.getKeyText(keyCode);
		e.consume();
	}
	//last method from interface
	public void keyTyped(KeyEvent e) {
		e.consume();
	}
   public void actionPerformed(ActionEvent event) {
      stop();
      game jess = new game();
      jess.run();
   }
}

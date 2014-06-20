import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Images extends Frame {
	public static void main(String[] args) {
		DisplayMode dm = new DisplayMode(800, 600, 64, DisplayMode.REFRESH_RATE_UNKNOWN);
		Images i = new Images();
		i.run(dm);
	}
	
	private Screen s;
	private Image bg;
	private Image pic;
	private boolean loaded;
	
	public void run(DisplayMode dm) {
		setBackground(Color.PINK);
		setForeground(Color.WHITE);
		setFont(new Font("Arial", Font.PLAIN, 24));
		loaded = false;
			
		s = new Screen();
		try {
			s.setFullScreen(dm, this);
			loadpics();
			try{
				Thread.sleep(5000);
			}catch(Exception ex){}
		}finally{
			s.restoreScreen();
		}
	}
	//loads pictures
	public void loadpics() {
	   bg = new ImageIcon("C:\\Users\\Jess\\Desktop\\background2.jpg").getImage();
	   pic = new ImageIcon("C:\\Users\\Jess\\Desktop\\horse.jpg").getImage();
		loaded = true;
		repaint();
	}
	public void paint(Graphics g) {
		/*if(g instanceof Graphics2D) {
			Graphics2D g2 = (Graphics2D)g;
			g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, 
					RenderingHints.VALUE_TEXT_ANTIALIASING_ON);
		}*/
		//g.drawString("This is gona be awesome", 200, 200);
		if(loaded) {
			g.drawImage(bg , 0, 0,null);
			g.drawImage(pic, 500, 300, null);
		}
	}
}

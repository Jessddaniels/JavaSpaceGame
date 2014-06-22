import java.awt.*;
import javax.swing.*;

public abstract class Core {
	private static DisplayMode modes[] = {
		//new DisplayMode(800,600,32,0),
		//new DisplayMode(800,600,24,0),
		new DisplayMode(800,600,16,0),
		//new DisplayMode(6440,480,32,0),
		//new DisplayMode(6440,480,24,0),
		//new DisplayMode(6440,480,16,0)
	};
   public long cumTime = 0;
   public long timePausedTotal;
   public long weJustUnpaused;
   public long totalWePaused;
   public long weJustPaused;
	private boolean running;
   private boolean paused;
   private boolean noTimePassed = false;
	protected ScreenManager s;
	
	///stop method
	public void stop(){
		running = false;
      paused = true;
	}
   public void setPaused(boolean value){
      paused = value;
   }
	//call init and gameloop
	public void run(){
		try{
			init();
			gameLoop();
		}finally{
			s.restoreScreen();
			
		}
	}/*
   public void runStartScreen(){
      try{
			init();
         startScreen();
		}finally{
			s.restoreScreen();
			
		}
   }*//*
   public void startScreen(){
      JButton button1 = new JButton();
      button1.setText("Start");
      button1.setBackground(Color.BLUE);
      s.f.add(button1);
      button1.addActionListener(new StartScreen());
      s.f.setVisible(true);
      while(running) {
			try{
				Thread.sleep(20);
			} catch(Exception ex){
			}
		}
   }*/
	//set to full screen
	public void init(){
		s= new ScreenManager();
		DisplayMode dm = s.findFirstCompatibleMode(modes);
		s.setFullScreen(dm);
		Window w = s.getFullScreenWindow();
		w.setFont(new Font("Arieal", Font.PLAIN, 20));
		w.setForeground(Color.WHITE);
		running = true;
      
	}
	//main game loop
	public void gameLoop() {
		long startTime = System.currentTimeMillis();
		cumTime = startTime;
      long cumPauseTime = startTime;
		
		while(running) {
         long timePaused;
         long startPause = System.currentTimeMillis();
         cumPauseTime = startPause;
         if (paused) {
            timePaused = System.currentTimeMillis() - cumPauseTime;
            cumPauseTime += timePaused;
            //timePausedTotal += timePaused;
            noTimePassed = true;
            try{
   				Thread.sleep(20);
   			} catch(Exception ex){
   			}
         }
         if (noTimePassed == true) {
            weJustUnpaused = System.currentTimeMillis();
            totalWePaused += (weJustUnpaused - weJustPaused);
            //System.out.println("this" + totalWePaused);
         }
         while(!paused) {
   			long timePassed = System.currentTimeMillis() - cumTime - cumPauseTime + startPause;
   			cumTime += timePassed;
            if (noTimePassed == false)
   			update(timePassed);
            if (noTimePassed)
               timePausedTotal += (System.currentTimeMillis() -startPause);
   			noTimePassed = false;
   			Graphics2D g = s.getGraphics();
   			draw(g);
   			g.dispose();
   			s.update();
   			try{
   				Thread.sleep(20);
   			} catch(Exception ex){
   			}
         }
         try{
				Thread.sleep(20);
			} catch(Exception ex){
			}
         timePaused = 0;
         weJustPaused=System.currentTimeMillis();
		}
	}
	//update animation
	public void update(long timePassed){
	}
	public long getCumTime(){
      return cumTime;
   }
	//draw to the screen
	public abstract void draw(Graphics2D g);
   
}

import java.io.File;
public class MyThread implements Runnable{
   String name;
	int time;
   public boolean running;
   public MakeSound soundPlayer = new MakeSound();
	
	public MyThread(String s, int time) {
		name = s;
		this.time = time;
	}
	
	public void run() {
		try { 
			running = true;
         threadLoop();
		} catch(Exception e) {
		   
		}
	}
   public void threadLoop() {
		long startTime = System.currentTimeMillis();
		long cumTime = startTime;
      soundPlayer.playSound("C:\\Users\\Jess\\Documents\\GitHub\\JavaSpaceGame\\Sounds\\mysongextended_Copy.wav");
		while(running == true) {
			long timePassed = System.currentTimeMillis() - cumTime;
			cumTime += timePassed;
         try{
   			Thread.sleep(20);
   		} catch(Exception ex){
   		}
		}
	}
}
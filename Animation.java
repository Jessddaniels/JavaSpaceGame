import java.awt.Image;
import java.util.ArrayList;
/*
contains an arraylist of scene objects with durations
*/
public class Animation {

	private ArrayList scenes;
	private int sceneIndex;
	private long elapsedTime;
	private long totalTime;
	private int sceneCount;
	
	//constructor
	public Animation(){
		scenes = new ArrayList();
		sceneCount = 0;
		totalTime = 0;
		start();
	}
	//add scene to ArrayList and set time for each scene
	public synchronized void addScene(Image i, long t) {
		totalTime += t;
		sceneCount++;
		scenes.add(new OneScene(i, totalTime));
		
	}
	//remove last scene from ArrayList
	public synchronized void removeScene() {
		if(sceneCount  > 0){
			totalTime -= getScene(sceneCount-1).endTime;
			scenes.remove(sceneCount-1);
			sceneCount--;
		}
	}
	//start animation from beginning
	public synchronized void start(){
		elapsedTime = 0;
		sceneIndex = 0;
	}
	
	//change scenes
	public synchronized void update(long timePassed) {
		if(scenes.size()>1) {
			elapsedTime += timePassed;
			if(elapsedTime >= totalTime) {
				elapsedTime = 0;
				sceneIndex = 0;
			}
			while(elapsedTime > getScene(sceneIndex).endTime) {
				sceneIndex++;
			}
		}
	}
	
	// get animations current scene(aka image)
	public synchronized Image getImage(){
		if(scenes.size() == 0) {
			return null;
		} else {
			return getScene(sceneIndex).pic;
		}
	}
	
	//get scene
	private OneScene getScene(int x) {
		return (OneScene)scenes.get(x);
	}
	//private inner class
	//each scene is its own object
	private class OneScene{
		Image pic;
		long endTime;
		
		public OneScene(Image pic, long endTime){
			this.pic = pic;
			this.endTime = endTime;
		}
	}
}
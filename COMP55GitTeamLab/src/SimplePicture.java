
import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class SimplePicture extends GraphicsProgram {
	public static int SIZE = 700;
	
	public void init() { // init 
		setSize(SIZE, SIZE);
	}
	
	public void run() { // run
		GImage robot = new GImage("robot.jpg", 200, 100);
		add(robot);
		GLabel label = new GLabel("How I look when I drink a Starbucks coffee with a triple shot", 200, 400);
		add(label);
	}
}
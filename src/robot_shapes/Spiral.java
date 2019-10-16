package robot_shapes;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		
		Robot rob = new Robot();
		rob.penDown();
		rob.setSpeed(100);
		// Try changing the 75!, what does this do?
		for(int i = 0; i < 75; i++) {
			// Random penColor, try changing it to a specific color!
			rob.setRandomPenColor();
			//What if we change the 5 to a different number?
			rob.move(5*i);
			// Try changing these numbers too!
			rob.turn(360/7);
			//How can we make the penWidth really fat?
			rob.setPenWidth(i);
		}
	}
}
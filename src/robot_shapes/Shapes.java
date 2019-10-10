package robot_shapes;

import org.jointheleague.graphical.robot.Robot;

public class Shapes {

	public static void main(String[] args) {
		Robot rob = new Robot();
		
		//Draw a Square
		rob.penDown();
		for(int i = 0; i < 4; i++) {
			rob.move(100);
			rob.turn(90);
		}
		
		//Now you draw a different shape!
		
		
		
		
	
	}
}

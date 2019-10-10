package robot_draw;

import java.awt.event.KeyEvent;

import org.jointheleague.graphical.robot.Robot;

public class RobotDraw {
	/*
	 * Make the Robot move around the screen when the arrow keys are pressed...
	 */
	public void moveRobot(Robot rob, int keyPressed) throws InterruptedException {
		// If the up arrow is pressed, move the Robot up the screen.
		if(keyPressed==KeyEvent.VK_UP) {
			//rob.setAngle();
			//rob.setPenColor(Color.);
			//rob.move();
		}
		// If the down arrow is pressed, move the Robot down.
		if(keyPressed==KeyEvent.VK_DOWN) {
			//rob.setAngle();
			//rob.setPenColor(Color.);
			//rob.move();
		}
		// If the left arrow is pressed, make the Robot go left.
		if(keyPressed==KeyEvent.VK_LEFT) {
			//rob.setAngle();
			//rob.setPenColor(Color.);
			//rob.move();
		}
		// If right is pressed, move the Robot right.
		if(keyPressed==KeyEvent.VK_RIGHT) {
			//rob.setAngle();
			//rob.setPenColor(Color.);
			//rob.move();
		}
	}
}

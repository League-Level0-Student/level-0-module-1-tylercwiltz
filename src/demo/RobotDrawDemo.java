package demo;

import java.awt.Color;
import java.awt.event.KeyEvent;

import org.jointheleague.graphical.robot.Robot;

public class RobotDrawDemo {
	/*
	 * Make the Robot move around the screen when the arrow keys are pressed...
	 */
	public void moveRobot(Robot rob, int keyPressed) throws InterruptedException {
			
		// If the up arrow is pressed, move the Robot up the screen.
			if(keyPressed==KeyEvent.VK_UP) {
				rob.setAngle(0);
				rob.setPenColor(Color.blue);
				rob.move(10);
			}
			// If the down arrow is pressed, move the Robot down.
			if(keyPressed==KeyEvent.VK_DOWN) {
				rob.setAngle(180);
				rob.setPenColor(Color.red);
				rob.move(10);
			}
			// If the left arrow is pressed, make the Robot go left.
			if(keyPressed==KeyEvent.VK_LEFT) {
				rob.setAngle(-90);
				rob.setPenColor(Color.green);
				rob.move(10);
				
			}
			// If right is pressed, move the Robot right.
			if(keyPressed==KeyEvent.VK_RIGHT) {
				rob.setAngle(90);
				rob.setPenColor(Color.yellow);
				rob.move(10);
			}
		}
}
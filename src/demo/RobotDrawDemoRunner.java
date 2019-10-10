//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package demo;

import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotDrawDemoRunner implements KeyEventDispatcher {

	Robot rob = new Robot("mini");
	boolean canDraw=false;
	int width = 1;
	int keyPressed = 0;
	
	private void setCanDraw(int keyPressed) throws InterruptedException {
		// If space is pressed, toggle canDraw
		if(keyPressed==KeyEvent.VK_SPACE) {
			canDraw=!canDraw;
		}
	}
	
	private void setWidth(int keyPressed) throws InterruptedException {
		// If w is pressed, the width is set
		String ans="";
		if(keyPressed==KeyEvent.VK_W) {
			ans = JOptionPane.showInputDialog("How wide do you want the pen to be? (Enter a number)");
			width = Integer.parseInt(ans);
		}
	}

	public static void main(String[] args) {
		new RobotDrawDemoRunner().controlTheRobot();
		
	}

	private void controlTheRobot() {
		JOptionPane.showMessageDialog(null, "Directions:\n Arrow keys to move\n SPACE to draw line \n W to change pen width");
		KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
		rob.setSpeed(10);
	}

	public boolean dispatchKeyEvent(KeyEvent e) {
		if (e.getID() == KeyEvent.KEY_PRESSED) {
			try {
				// call moveRobot() method
				new RobotDrawDemo().moveRobot(rob,e.getKeyCode());
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			try {
				// call setCanDraw() method
				setCanDraw(e.getKeyCode());
				if(canDraw) {
					rob.penDown();
				}
				else {
					rob.penUp();
				}
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			try {
				// call setWidth() method
				setWidth(e.getKeyCode());
				rob.setPenWidth(width);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			
		}
		return false;
	}
}

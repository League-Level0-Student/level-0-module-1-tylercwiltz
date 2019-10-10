//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package robot_draw;

import java.applet.AudioClip;
import java.awt.Color;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotDrawRunner implements KeyEventDispatcher {

	Robot rob = new Robot("mini");
	boolean canDraw=false;
	int width = 1;
	
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
		int[] r = new int[]{4,5,6};
		for(int i = 0; i < r.length; i++ ) {
			System.out.println(r[i]);
		}
		new RobotDrawRunner().controlTheRobot();
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
				new RobotDraw().moveRobot(rob, e.getKeyCode());
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			try {
				// call setCanDraw() 
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
				setWidth(e.getKeyCode());
				rob.setPenWidth(width);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			
		}
		return false;
	}
}
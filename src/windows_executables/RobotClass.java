package windows_executables;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class RobotClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void robotkey() throws AWTException  {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ESCAPE);
	}

	public static void robotkey2() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyPress(KeyEvent.VK_CANCEL);
	}


}

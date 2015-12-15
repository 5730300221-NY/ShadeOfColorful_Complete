package input;

import java.awt.event.KeyEvent;
import entity.Sheep;


public class InputUtility {

	private static boolean reset = false;
	private static boolean red = false;
	private static boolean green = false;
	private static boolean blue = false;
	private static boolean bright = false;
	private static boolean dark = false;
	private static boolean space = false;
	private static boolean pause = false;

	// getter & setter

	public static boolean isReset() {
		return reset;
	}

	public static boolean isPause() {
		return pause;
	}

	public static void setPause(boolean pause) {
		InputUtility.pause = pause;
	}

	public static void setReset(boolean reset) {
		InputUtility.reset = reset;
	}

	public static boolean isRed() {
		return red;
	}

	public static void setRed(boolean red) {
		InputUtility.red = red;
	}

	public static boolean isGreen() {
		return green;
	}

	public static void setGreen(boolean green) {
		InputUtility.green = green;
	}

	public static boolean isBlue() {
		return blue;
	}

	public static void setBlue(boolean blue) {
		InputUtility.blue = blue;
	}

	public static boolean isBright() {
		return bright;
	}

	public static void setBright(boolean bright) {
		InputUtility.bright = bright;
	}

	public static boolean isDark() {
		return dark;
	}

	public static void setDark(boolean dark) {
		InputUtility.dark = dark;
	}

	public static boolean isSpace() {
		return space;
	}

	public static void setSpace(boolean space) {
		InputUtility.space = space;
	}
	
	public static void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_SPACE && space == false) {
			InputUtility.setSpace(true);
		}
		if (e.getKeyCode() == KeyEvent.VK_Q) {
			InputUtility.setReset(true);

		}
		if (e.getKeyCode() == KeyEvent.VK_W) {
			InputUtility.setRed(true);

		}
		if (e.getKeyCode() == KeyEvent.VK_E) {
			InputUtility.setGreen(true);

		}
		if (e.getKeyCode() == KeyEvent.VK_R) {
			InputUtility.setBlue(true);

		}
		if (e.getKeyCode() == KeyEvent.VK_O) {
			InputUtility.setBright(true);

		}
		if (e.getKeyCode() == KeyEvent.VK_I) {
			InputUtility.setDark(true);

		}
	}

	public static void keyRelease(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			InputUtility.setSpace(false);
		}
		if (e.getKeyCode() == KeyEvent.VK_Q) {
			if (InputUtility.isReset()) {
				Sheep.setColor(0);
			}
			InputUtility.setReset(false);
		}
		if (e.getKeyCode() == KeyEvent.VK_W) {
			InputUtility.setRed(false);
		}
		if (e.getKeyCode() == KeyEvent.VK_E) {
			InputUtility.setGreen(false);
		}
		if (e.getKeyCode() == KeyEvent.VK_R) {
			InputUtility.setBlue(false);
		}
		if (e.getKeyCode() == KeyEvent.VK_O) {
			InputUtility.setBright(false);
		}
		if (e.getKeyCode() == KeyEvent.VK_I) {
			InputUtility.setDark(false);
		}
	}

	public static void Updatestate() {

		// RedBright
		if (red == true && green == false && blue == false && bright == true
				&& dark == false && reset == false) {
			Sheep.setState(1);
		}

		// RedDark
		else if (red == true && green == false && blue == false
				&& bright == false && dark == true && reset == false) {
			Sheep.setState(2);
		}

		// BlueBright
		else if (red == false && green == false && blue == true
				&& bright == true && dark == false && reset == false) {
			Sheep.setState(3);
		}

		// BlueDark
		else if (red == false && green == false && blue == true
				&& bright == false && dark == true && reset == false) {
			Sheep.setState(4);
		}

		// GreenBright
		else if (red == false && green == true && blue == false
				&& bright == true && dark == false && reset == false) {
			Sheep.setState(5);
		}

		// GreenDark
		else if (red == false && green == true && blue == false
				&& bright == false && dark == true && reset == false) {
			Sheep.setState(6);

		}

		// PinkBright
		else if (red == true && green == false && blue == true
				&& bright == true && dark == false && reset == false) {
			Sheep.setState(7);
		}

		// YellowBright
		else if (red == true && green == true && blue == false
				&& bright == true && dark == false && reset == false) {
			Sheep.setState(8);
		}

		// CyanBright
		else if (red == false && green == true && blue == true
				&& bright == true && dark == false && reset == false) {
			Sheep.setState(9);
		}

		// PinkDark
		else if (red == true && green == false && blue == true
				&& bright == false && dark == true && reset == false) {
			Sheep.setState(10);
		}

		// YellowDark
		else if (red == true && green == true && blue == false
				&& bright == false && dark == true && reset == false) {
			Sheep.setState(11);
		}

		// CyanDark
		else if (red == false && green == true && blue == true
				&& bright == false && dark == true && reset == false) {
			Sheep.setState(12);
		}

		// WhiteBright
		else if (red == true && green == true && blue == true && bright == true
				&& dark == false && reset == false) {
			Sheep.setState(13);
		}

		// WhiteDark
		else if (red == true && green == true && blue == true
				&& bright == false && dark == true && reset == false) {
			Sheep.setState(14);
		} else {
			Sheep.setState(15);
		}

	}

}

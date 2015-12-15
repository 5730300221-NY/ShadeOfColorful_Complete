package entity;

import render.AudioUtility;
import render.GameScreen;
import render.GameTitle;
import render.GameWindow;

public class GameManager {
	public static GameWindow frame;
	public static GameScreen gc;
	public static GameTitle gt;
	public static GameLogic gl;
	private static boolean Ingame;

	public GameManager() {
		Ingame = false;
	}

	public static boolean isIngame() {
		return Ingame;
	}

	public static void setIngame(boolean ingame) {
		Ingame = ingame;
	}

	public static void rungame() {

		gt = new GameTitle();
		gc = new GameScreen();
		gl = GameLogic.getInstance();
		frame = new GameWindow(gt);

		while (true) {
			try {
				Thread.sleep(35);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			frame.getCurrentScene().repaint();

			if (frame.getCurrentScene() instanceof GameScreen) {
				if (!Ingame) {
					AudioUtility.playSound("GameSound");
					Ingame = true;
				}
				if (!((GameScreen) (frame.getCurrentScene())).isPauseStatus()) {
					gl.logicUpdate();
				}
			}
		}

	}

}

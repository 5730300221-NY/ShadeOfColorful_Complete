package entity;

import render.AudioUtility;
import render.GameOver;
import render.GameScreen;
import render.GameTitle;
import render.GameWindow;
import render.HighScore;
import render.HowToPlay;
import render.NewColor;

public class GameManager {
	public static GameWindow frame;
	public static GameScreen gc;
	public static GameTitle gt;
	public static HowToPlay howToPlay;
	public static NewColor newColor;
	public static HighScore highScore;
	public static GameOver gameOver;
	public static GameLogic gl;
	private static boolean Ingame;

	public GameManager() {
		Ingame = false;
		gt = new GameTitle();
		gc = new GameScreen();
		gl = GameLogic.getInstance();
		frame = new GameWindow(gt);
		gameOver = new GameOver();
		howToPlay = new HowToPlay();
		newColor = new NewColor();
		highScore = new HighScore();
	}

	public static boolean isIngame() {
		return Ingame;
	}

	public static void setIngame(boolean ingame) {
		Ingame = ingame;
	}

	public static void rungame() {

//		gt = new GameTitle();
//		gc = new GameScreen();
//		gl = GameLogic.getInstance();
//		frame = new GameWindow(gt);
//		gameOver = new GameOver();
//		howToPlay = new HowToPlay();
//		newColor = new NewColor();
//		highScore = new HighScore();

		while (true) {
			try {
				Thread.sleep(35);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			frame.getCurrentScene().repaint();
			//frame.getCurrentScene().requestFocus();

			if (frame.getCurrentScene() instanceof GameScreen) {
				if (!Ingame) {
					AudioUtility.playSound("GameSound");
					Ingame = true;
					frame.getCurrentScene().repaint();
					//frame.getCurrentScene().requestFocus();
				}
				if (!((GameScreen) (frame.getCurrentScene())).isPauseStatus()) {
					gl.logicUpdate();
					//frame.getCurrentScene().repaint();
					//frame.getCurrentScene().requestFocus();
				}
				//frame.getCurrentScene().repaint();
			}
			//frame.getCurrentScene().repaint();
		}

	}

}

package entity;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import render.AudioUtility;
import render.GameBackground;
import render.Button;
import render.GameOver;
import render.GameScreen;
import render.GameTitle;
import render.NewColor;
import render.RenderableHolder;

public class GameLogic {
	private static GameLogic instance = new GameLogic();
	protected Sheep sheep;
	protected PlayerStatus playerStatus;
	protected Button button;
	protected Beam beam;
	protected GameBackground bg;
	protected static List<Wolf> wolves;
	private int wscore;
	private static int wolfGen;
	private int spawnDelayCounter = (int) Math.ceil((Math.random())) * 90;

	public GameLogic() {
		sheep = new Sheep();
		playerStatus = new PlayerStatus();
		button = new Button();
		beam = new Beam();
		wscore = 3000;
		wolfGen = 10 + ((playerStatus.getRoundstate() - 1));
		bg = new GameBackground();
		wolves = new CopyOnWriteArrayList<Wolf>();
		RenderableHolder.getInstance().add(sheep);
		RenderableHolder.getInstance().add(playerStatus);
		RenderableHolder.getInstance().add(button);
		RenderableHolder.getInstance().add(beam);
		RenderableHolder.getInstance().add(bg);
	}

	public static GameLogic getInstance() {
		return instance;
	}

	public static void setInstance(GameLogic instance) {
		GameLogic.instance = instance;
	}

	public Sheep getSheep() {
		return sheep;
	}

	public void setSheep(Sheep sheep) {
		this.sheep = sheep;
	}

	public PlayerStatus getPlayerStatus() {
		return playerStatus;
	}

	public void setPlayerStatus(PlayerStatus playerStatus) {
		this.playerStatus = playerStatus;
	}

	public Button getButton() {
		return button;
	}

	public void setButton(Button button) {
		this.button = button;
	}

	public Beam getBeam() {
		return beam;
	}

	public void setBeam(Beam beam) {
		this.beam = beam;
	}

	public GameBackground getBg() {
		return bg;
	}

	public void setBg(GameBackground bg) {
		this.bg = bg;
	}

	public static List<Wolf> getWolves() {
		return wolves;
	}

	public static void setWolves(List<Wolf> wolves) {
		GameLogic.wolves = wolves;
	}

	public int getSpawnDelayCounter() {
		return spawnDelayCounter;
	}

	public void setSpawnDelayCounter(int spawnDelayCounter) {
		this.spawnDelayCounter = spawnDelayCounter;
	}

	public int getWolfGen() {
		return wolfGen;
	}

	public void setWolfGen(int wolfGen) {
		this.wolfGen = wolfGen;
	}

	public void WolfRoundGen() {

		if (playerStatus.getRoundstate() == 1) {
			int colorlist[] = { 1, 3, 5 };

			int genborn = (1230 - (((int) Math.ceil((Math.random() * 2)) + 2) * 100));
			if (genborn <= 925)
				genborn = 1230;

			int colorgen = colorlist[(int) (Math.random() * (colorlist.length))];
			if (colorgen == 1 && colorgen == 3 && colorgen == 5)
				wscore = 3000;
			else if (colorgen == 2 && colorgen == 4 && colorgen == 6)
				wscore = 3200;
			else if (colorgen == 7 && colorgen == 8 && colorgen == 9)
				wscore = 5000;
			else if (colorgen == 10 && colorgen == 11 && colorgen == 12)
				wscore = 5300;
			else if (colorgen == 0 && colorgen == 13 && colorgen == 14)
				wscore = 6000;
			else if (colorgen == 15 && colorgen == 16 && colorgen == 17)
				wscore = 6400;
			else if (colorgen == 18 && colorgen == 19 && colorgen == 20)
				wscore = 7000;

			Wolf a = new Wolf(colorgen, wscore, 4, genborn,
					(300 + (int) (Math.random() * 21)));
			wolves.add(a);
			RenderableHolder.getInstance().getRenderable().add(a);
		}

		else if (playerStatus.getRoundstate() == 2) {
			int colorlist[] = { 2, 4, 6 };
			int genborn = (1230 - (((int) Math.ceil((Math.random() * 2)) + 2) * 100));
			if (genborn <= 925)
				genborn = 1230;

			int colorgen = colorlist[(int) (Math.random() * (colorlist.length))];
			if (colorgen == 1 && colorgen == 3 && colorgen == 5)
				wscore = 3000;
			else if (colorgen == 2 && colorgen == 4 && colorgen == 6)
				wscore = 3200;
			else if (colorgen == 7 && colorgen == 8 && colorgen == 9)
				wscore = 5000;
			else if (colorgen == 10 && colorgen == 11 && colorgen == 12)
				wscore = 5300;
			else if (colorgen == 0 && colorgen == 13 && colorgen == 14)
				wscore = 6000;
			else if (colorgen == 15 && colorgen == 16 && colorgen == 17)
				wscore = 6400;
			else if (colorgen == 18 && colorgen == 19 && colorgen == 20)
				wscore = 7000;

			Wolf a = new Wolf(colorgen, wscore, 4, genborn,
					(300 + (int) (Math.random() * 21)));
			wolves.add(a);
			RenderableHolder.getInstance().getRenderable().add(a);
		}

		else if (playerStatus.getRoundstate() == 3) {
			int colorlist[] = { 1, 2, 3, 4, 5, 6 };
			int genborn = (1230 - (((int) Math.ceil((Math.random() * 2)) + 2) * 100));
			if (genborn <= 925)
				genborn = 1230;

			int colorgen = colorlist[(int) (Math.random() * (colorlist.length))];
			if (colorgen == 1 && colorgen == 3 && colorgen == 5)
				wscore = 3000;
			else if (colorgen == 2 && colorgen == 4 && colorgen == 6)
				wscore = 3200;
			else if (colorgen == 7 && colorgen == 8 && colorgen == 9)
				wscore = 5000;
			else if (colorgen == 10 && colorgen == 11 && colorgen == 12)
				wscore = 5300;
			else if (colorgen == 0 && colorgen == 13 && colorgen == 14)
				wscore = 6000;
			else if (colorgen == 15 && colorgen == 16 && colorgen == 17)
				wscore = 6400;
			else if (colorgen == 18 && colorgen == 19 && colorgen == 20)
				wscore = 7000;

			Wolf a = new Wolf(colorgen, wscore, 5, genborn,
					(300 + (int) (Math.random() * 21)));
			wolves.add(a);
			RenderableHolder.getInstance().getRenderable().add(a);
		}

		else if (playerStatus.getRoundstate() == 4) {
			int colorlist[] = { 7, 8, 9 };
			int genborn = (1230 - (((int) Math.ceil((Math.random() * 2)) + 2) * 100));
			if (genborn <= 925)
				genborn = 1230;

			int colorgen = colorlist[(int) (Math.random() * (colorlist.length))];
			if (colorgen == 1 && colorgen == 3 && colorgen == 5)
				wscore = 3000;
			else if (colorgen == 2 && colorgen == 4 && colorgen == 6)
				wscore = 3200;
			else if (colorgen == 7 && colorgen == 8 && colorgen == 9)
				wscore = 5000;
			else if (colorgen == 10 && colorgen == 11 && colorgen == 12)
				wscore = 5300;
			else if (colorgen == 0 && colorgen == 13 && colorgen == 14)
				wscore = 6000;
			else if (colorgen == 15 && colorgen == 16 && colorgen == 17)
				wscore = 6400;
			else if (colorgen == 18 && colorgen == 19 && colorgen == 20)
				wscore = 7000;

			Wolf a = new Wolf(colorgen, wscore, 4, genborn,
					(300 + (int) (Math.random() * 21)));
			wolves.add(a);
			RenderableHolder.getInstance().getRenderable().add(a);
		}

		else if (playerStatus.getRoundstate() == 5) {
			int colorlist[] = { 4, 5, 7, 8, 9 };
			int genborn = (1230 - (((int) Math.ceil((Math.random() * 2)) + 2) * 100));
			if (genborn <= 925)
				genborn = 1230;

			int colorgen = colorlist[(int) (Math.random() * (colorlist.length))];
			if (colorgen == 1 && colorgen == 3 && colorgen == 5)
				wscore = 3000;
			else if (colorgen == 2 && colorgen == 4 && colorgen == 6)
				wscore = 3200;
			else if (colorgen == 7 && colorgen == 8 && colorgen == 9)
				wscore = 5000;
			else if (colorgen == 10 && colorgen == 11 && colorgen == 12)
				wscore = 5300;
			else if (colorgen == 0 && colorgen == 13 && colorgen == 14)
				wscore = 6000;
			else if (colorgen == 15 && colorgen == 16 && colorgen == 17)
				wscore = 6400;
			else if (colorgen == 18 && colorgen == 19 && colorgen == 20)
				wscore = 7000;

			Wolf a = new Wolf(colorgen, wscore, 4, genborn,
					(300 + (int) (Math.random() * 21)));
			wolves.add(a);
			RenderableHolder.getInstance().getRenderable().add(a);
		}

		else if (playerStatus.getRoundstate() == 6) {
			int colorlist[] = { 0, 13, 14, 3, 6, 7 };
			int genborn = (1230 - (((int) Math.ceil((Math.random() * 2)) + 2) * 100));
			if (genborn <= 925)
				genborn = 1230;

			int colorgen = colorlist[(int) (Math.random() * (colorlist.length))];
			if (colorgen == 1 && colorgen == 3 && colorgen == 5)
				wscore = 3000;
			else if (colorgen == 2 && colorgen == 4 && colorgen == 6)
				wscore = 3200;
			else if (colorgen == 7 && colorgen == 8 && colorgen == 9)
				wscore = 5000;
			else if (colorgen == 10 && colorgen == 11 && colorgen == 12)
				wscore = 5300;
			else if (colorgen == 0 && colorgen == 13 && colorgen == 14)
				wscore = 6000;
			else if (colorgen == 15 && colorgen == 16 && colorgen == 17)
				wscore = 6400;
			else if (colorgen == 18 && colorgen == 19 && colorgen == 20)
				wscore = 7000;

			Wolf a = new Wolf(colorgen, wscore, 4, genborn,
					(300 + (int) (Math.random() * 21)));
			wolves.add(a);
			RenderableHolder.getInstance().getRenderable().add(a);
		}

		else if (playerStatus.getRoundstate() == 7) {
			int colorlist[] = { 1, 8, 10, 11, 12 };
			int genborn = (1230 - (((int) Math.ceil((Math.random() * 2)) + 2) * 100));
			if (genborn <= 925)
				genborn = 1230;

			int colorgen = colorlist[(int) (Math.random() * (colorlist.length))];
			if (colorgen == 1 && colorgen == 3 && colorgen == 5)
				wscore = 3000;
			else if (colorgen == 2 && colorgen == 4 && colorgen == 6)
				wscore = 3200;
			else if (colorgen == 7 && colorgen == 8 && colorgen == 9)
				wscore = 5000;
			else if (colorgen == 10 && colorgen == 11 && colorgen == 12)
				wscore = 5300;
			else if (colorgen == 0 && colorgen == 13 && colorgen == 14)
				wscore = 6000;
			else if (colorgen == 15 && colorgen == 16 && colorgen == 17)
				wscore = 6400;
			else if (colorgen == 18 && colorgen == 19 && colorgen == 20)
				wscore = 7000;

			Wolf a = new Wolf(colorgen, wscore, 4, genborn,
					(300 + (int) (Math.random() * 21)));
			wolves.add(a);
			RenderableHolder.getInstance().getRenderable().add(a);
		}

		else if (playerStatus.getRoundstate() == 8) {
			int colorlist[] = { 7, 8, 9, 10, 11, 12, 13, 14 };
			int genborn = (1230 - (((int) Math.ceil((Math.random() * 2)) + 2) * 100));
			if (genborn <= 925)
				genborn = 1230;

			int colorgen = colorlist[(int) (Math.random() * (colorlist.length))];
			if (colorgen == 1 && colorgen == 3 && colorgen == 5)
				wscore = 3000;
			else if (colorgen == 2 && colorgen == 4 && colorgen == 6)
				wscore = 3200;
			else if (colorgen == 7 && colorgen == 8 && colorgen == 9)
				wscore = 5000;
			else if (colorgen == 10 && colorgen == 11 && colorgen == 12)
				wscore = 5300;
			else if (colorgen == 0 && colorgen == 13 && colorgen == 14)
				wscore = 6000;
			else if (colorgen == 15 && colorgen == 16 && colorgen == 17)
				wscore = 6400;
			else if (colorgen == 18 && colorgen == 19 && colorgen == 20)
				wscore = 7000;

			Wolf a = new Wolf(colorgen, wscore, 4, genborn,
					(300 + (int) (Math.random() * 21)));
			wolves.add(a);
			RenderableHolder.getInstance().getRenderable().add(a);
		}

		else if (playerStatus.getRoundstate() == 9) {
			int colorlist[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,
					14 };
			int genborn = (1230 - (((int) Math.ceil((Math.random() * 2)) + 2) * 100));
			if (genborn <= 925)
				genborn = 1230;

			int colorgen = colorlist[(int) (Math.random() * (colorlist.length))];
			if (colorgen == 1 && colorgen == 3 && colorgen == 5)
				wscore = 3000;
			else if (colorgen == 2 && colorgen == 4 && colorgen == 6)
				wscore = 3200;
			else if (colorgen == 7 && colorgen == 8 && colorgen == 9)
				wscore = 5000;
			else if (colorgen == 10 && colorgen == 11 && colorgen == 12)
				wscore = 5300;
			else if (colorgen == 0 && colorgen == 13 && colorgen == 14)
				wscore = 6000;
			else if (colorgen == 15 && colorgen == 16 && colorgen == 17)
				wscore = 6400;
			else if (colorgen == 18 && colorgen == 19 && colorgen == 20)
				wscore = 7000;

			Wolf a = new Wolf(colorgen, wscore, 5, genborn,
					(300 + (int) (Math.random() * 21)));
			wolves.add(a);
			RenderableHolder.getInstance().getRenderable().add(a);
		}

		else if (playerStatus.getRoundstate() == 10) {
			int colorlist[] = { 15, 18, 19, 13, 7, 12 };
			int genborn = (1230 - (((int) Math.ceil((Math.random() * 2)) + 2) * 100));
			if (genborn <= 925)
				genborn = 1230;

			int colorgen = colorlist[(int) (Math.random() * (colorlist.length))];
			if (colorgen == 1 && colorgen == 3 && colorgen == 5)
				wscore = 3000;
			else if (colorgen == 2 && colorgen == 4 && colorgen == 6)
				wscore = 3200;
			else if (colorgen == 7 && colorgen == 8 && colorgen == 9)
				wscore = 5000;
			else if (colorgen == 10 && colorgen == 11 && colorgen == 12)
				wscore = 5300;
			else if (colorgen == 0 && colorgen == 13 && colorgen == 14)
				wscore = 6000;
			else if (colorgen == 15 && colorgen == 16 && colorgen == 17)
				wscore = 6400;
			else if (colorgen == 18 && colorgen == 19 && colorgen == 20)
				wscore = 7000;

			Wolf a = new Wolf(colorgen, wscore, 4, genborn,
					(300 + (int) (Math.random() * 21)));
			wolves.add(a);
			RenderableHolder.getInstance().getRenderable().add(a);
		}

		else if (playerStatus.getRoundstate() == 11) {
			int colorlist[] = { 2, 3, 9, 12, 13, 14, 15, 16, 17 };
			int genborn = (1230 - (((int) Math.ceil((Math.random() * 2)) + 2) * 100));
			if (genborn <= 925)
				genborn = 1230;

			int colorgen = colorlist[(int) (Math.random() * (colorlist.length))];
			if (colorgen == 1 && colorgen == 3 && colorgen == 5)
				wscore = 3000;
			else if (colorgen == 2 && colorgen == 4 && colorgen == 6)
				wscore = 3200;
			else if (colorgen == 7 && colorgen == 8 && colorgen == 9)
				wscore = 5000;
			else if (colorgen == 10 && colorgen == 11 && colorgen == 12)
				wscore = 5300;
			else if (colorgen == 0 && colorgen == 13 && colorgen == 14)
				wscore = 6000;
			else if (colorgen == 15 && colorgen == 16 && colorgen == 17)
				wscore = 6400;
			else if (colorgen == 18 && colorgen == 19 && colorgen == 20)
				wscore = 7000;

			Wolf a = new Wolf(colorgen, wscore, 5, genborn,
					(300 + (int) (Math.random() * 21)));
			wolves.add(a);
			RenderableHolder.getInstance().getRenderable().add(a);
		}

		else if (playerStatus.getRoundstate() == 12) {
			int colorlist[] = { 16, 17, 20, 14, 8, 10 };
			int genborn = (1230 - (((int) Math.ceil((Math.random() * 2)) + 2) * 100));
			if (genborn <= 925)
				genborn = 1230;

			int colorgen = colorlist[(int) (Math.random() * (colorlist.length))];
			if (colorgen == 1 && colorgen == 3 && colorgen == 5)
				wscore = 3000;
			else if (colorgen == 2 && colorgen == 4 && colorgen == 6)
				wscore = 3200;
			else if (colorgen == 7 && colorgen == 8 && colorgen == 9)
				wscore = 5000;
			else if (colorgen == 10 && colorgen == 11 && colorgen == 12)
				wscore = 5300;
			else if (colorgen == 0 && colorgen == 13 && colorgen == 14)
				wscore = 6000;
			else if (colorgen == 15 && colorgen == 16 && colorgen == 17)
				wscore = 6400;
			else if (colorgen == 18 && colorgen == 19 && colorgen == 20)
				wscore = 7000;

			Wolf a = new Wolf(colorgen, wscore, 4, genborn,
					(300 + (int) (Math.random() * 21)));
			wolves.add(a);
			RenderableHolder.getInstance().getRenderable().add(a);
		}

		else if (playerStatus.getRoundstate() == 13) {
			int colorlist[] = { 1, 6, 7, 10, 13, 14, 18, 19, 20 };
			int genborn = (1230 - (((int) Math.ceil((Math.random() * 2)) + 2) * 100));
			if (genborn <= 925)
				genborn = 1230;

			int colorgen = colorlist[(int) (Math.random() * (colorlist.length))];
			if (colorgen == 1 && colorgen == 3 && colorgen == 5)
				wscore = 3000;
			else if (colorgen == 2 && colorgen == 4 && colorgen == 6)
				wscore = 3200;
			else if (colorgen == 7 && colorgen == 8 && colorgen == 9)
				wscore = 5000;
			else if (colorgen == 10 && colorgen == 11 && colorgen == 12)
				wscore = 5300;
			else if (colorgen == 0 && colorgen == 13 && colorgen == 14)
				wscore = 6000;
			else if (colorgen == 15 && colorgen == 16 && colorgen == 17)
				wscore = 6400;
			else if (colorgen == 18 && colorgen == 19 && colorgen == 20)
				wscore = 7000;

			Wolf a = new Wolf(colorgen, wscore, 5, genborn,
					(300 + (int) (Math.random() * 21)));
			wolves.add(a);
			RenderableHolder.getInstance().getRenderable().add(a);
		}

		else {
			int colorlist[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,
					14, 15, 16, 17, 18, 19, 20 };
			int genborn = (1230 - (((int) Math.ceil((Math.random() * 2)) + 2) * 100));
			if (genborn <= 925)
				genborn = 1230;
			int wspeed = 6;
			if (playerStatus.getRoundstate() > 14
					|| playerStatus.getRoundstate() < 17)
				wspeed = 6;
			else if (playerStatus.getRoundstate() > 16
					|| playerStatus.getRoundstate() < 21)
				wspeed = 7;
			else
				wspeed = 8;
			int colorgen = colorlist[(int) (Math.random() * (colorlist.length))];
			if (colorgen == 1 && colorgen == 3 && colorgen == 5)
				wscore = 3000;
			else if (colorgen == 2 && colorgen == 4 && colorgen == 6)
				wscore = 3200;
			else if (colorgen == 7 && colorgen == 8 && colorgen == 9)
				wscore = 5000;
			else if (colorgen == 10 && colorgen == 11 && colorgen == 12)
				wscore = 5300;
			else if (colorgen == 0 && colorgen == 13 && colorgen == 14)
				wscore = 6000;
			else if (colorgen == 15 && colorgen == 16 && colorgen == 17)
				wscore = 6400;
			else if (colorgen == 18 && colorgen == 19 && colorgen == 20)
				wscore = 7000;

			Wolf a = new Wolf(colorgen, wscore, wspeed, genborn,
					(300 + (int) (Math.random() * 21)));
			wolves.add(a);
			RenderableHolder.getInstance().getRenderable().add(a);
		}

	}

	public static void KillWolf(int color) {
		for (Wolf a : wolves) {
			if (a.getWolfColor() == color) {
				a.setDestroyed(true);
				PlayerStatus.setScore(PlayerStatus.getScore()
						+ a.getWolfPoint());
			}
		}
	}

	public static void clearwolf() {
		wolfGen = 10;
		PlayerStatus.setRoundstate(1);
		AudioUtility.stopSound("GameSound");
		for (Wolf b : wolves) {
			wolves.remove(b);
			RenderableHolder.getInstance().getRenderable().remove(b);
		}
		GameManager.setIngame(false);
	}

	public void logicUpdate() {
		synchronized (beam) {
			beam.update();
		}
		//beam.update();
		for (Wolf a : wolves) {
			a.update();
			if (a.collide(sheep) && !a.isDestroyed()) {
				try {
					AudioUtility.stopSound("GameSound");
					AudioUtility.playSound("GameOver");
					Thread.sleep(2000);
					playerStatus.setRoundstate(1);
					wolfGen = 10 + ((playerStatus.getRoundstate() - 1));
					for (Wolf b : wolves) {
						wolves.remove(b);
						RenderableHolder.getInstance().getRenderable()
								.remove(b);
					}
					GameManager.setIngame(false);
					GameManager.frame.switchScene(new GameOver());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			if (a.isDestroyed()) {
				new Thread(new Runnable() {
					@Override
					public void run() {
						try {
							Thread.sleep(40);
							RenderableHolder.getInstance().add(beam);
							RenderableHolder.getInstance().getRenderable().remove(beam);
							wolves.remove(a);
							RenderableHolder.getInstance().getRenderable()
									.remove(a);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}).start();
			}
		}
//		try {
//			Thread.sleep(40);
//			RenderableHolder.getInstance().add(beam);
//		} catch (InterruptedException e1) {
//			
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		RenderableHolder.getInstance().add(beam);
//		try {
//		Thread.sleep(20);
//		RenderableHolder.getInstance().getRenderable().remove(beam);
//	} catch (InterruptedException e1) {
//		
//		// TODO Auto-generated catch block
//		e1.printStackTrace();
//	}
		RenderableHolder.getInstance().getRenderable().remove(beam);

		--spawnDelayCounter;
		if (spawnDelayCounter == 0) {

			if (wolves.size() == 0 && this.wolfGen == 0) {

				try {
					AudioUtility.playSound("Finish");
					Thread.sleep(2000);
					playerStatus
							.setRoundstate(playerStatus.getRoundstate() + 1);
					wolfGen = 10 + ((playerStatus.getRoundstate() - 1));
					GameManager.frame.switchScene(new NewColor());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			if (this.getWolfGen() > 0) {
				WolfRoundGen();
				this.wolfGen = (this.wolfGen - 1);
			}
			if (playerStatus.getRoundstate() < 14) {
				spawnDelayCounter = ((int) (Math.ceil((Math.random() * 2))) + 2) * 20;
			} else if (playerStatus.getRoundstate() > 13
					&& playerStatus.getRoundstate() < 21) {
				spawnDelayCounter = ((int) (Math.ceil((Math.random() * 2))) + 2) * 14;
			} else if (playerStatus.getRoundstate() > 20
					&& playerStatus.getRoundstate() < 24) {
				spawnDelayCounter = ((int) (Math.ceil((Math.random() * 2))) + 2) * 12;
			} else if (playerStatus.getRoundstate() > 23
					&& playerStatus.getRoundstate() < 28) {
				spawnDelayCounter = ((int) (Math.ceil((Math.random() * 2))) + 2) * 9;
			} else if (playerStatus.getRoundstate() > 27
					&& playerStatus.getRoundstate() < 31) {
				spawnDelayCounter = ((int) (Math.ceil((Math.random() * 2))) + 2) * 7;
			} else {
				spawnDelayCounter = ((int) (Math.ceil((Math.random() * 2))) + 2) * 5;
			}
		}

	}

}

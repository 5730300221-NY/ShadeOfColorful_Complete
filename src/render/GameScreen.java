package render;

import input.InputUtility;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import entity.Beam;
import entity.GameLogic;
import entity.GameManager;
import entity.Sheep;

public class GameScreen extends JPanel {

	private static JLabel Home;
	private static boolean PauseStatus;

	public GameScreen() {
		Home = new JLabel();
		this.setDoubleBuffered(true);
		this.setPreferredSize(new Dimension(1280, 720));
		this.PauseStatus = false;
		ClassLoader cloader = RenderableHolder.class.getClassLoader();
		ImageIcon HomeButton = new ImageIcon(
				cloader.getResource("image/Home2.png"));
		Home.setIcon(HomeButton);
		this.add(Home);
		this.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) {

				InputUtility.setPause(false);
				if (!isPauseStatus()) {
					
					if (e.getKeyCode() == KeyEvent.VK_SPACE) {
							Sheep.setSheepIndex(0);
							Beam.BeamIndex =0;
							Sheep.setColor(0);
					}
					
					if (e.getKeyCode() == KeyEvent.VK_Q) {
						Button.update(6);
						InputUtility.keyRelease(e);
						InputUtility.Updatestate();
					}
					if (e.getKeyCode() == KeyEvent.VK_W) {
						Button.update(7);
						InputUtility.keyRelease(e);
						InputUtility.Updatestate();
					}
					if (e.getKeyCode() == KeyEvent.VK_E) {
						Button.update(8);
						InputUtility.keyRelease(e);
						InputUtility.Updatestate();
					}
					if (e.getKeyCode() == KeyEvent.VK_R) {
						Button.update(9);
						InputUtility.keyRelease(e);
						InputUtility.Updatestate();
					}
					if (e.getKeyCode() == KeyEvent.VK_O) {
						Button.update(10);
						InputUtility.keyRelease(e);
						InputUtility.Updatestate();
					}
					if (e.getKeyCode() == KeyEvent.VK_I) {
						Button.update(11);
						InputUtility.keyRelease(e);
						InputUtility.Updatestate();
					}
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {

				if (e.getKeyCode() == KeyEvent.VK_ENTER&& !InputUtility.isPause()) {
					InputUtility.setPause(true);
					setPauseStatus(!isPauseStatus());
				}

				if (!isPauseStatus()) {
					if (e.getKeyCode() == KeyEvent.VK_SPACE) {
						Beam.BeamIndex =1;
						new Thread(new Runnable() {
							
							@Override
							public void run() {
								AudioUtility.playSound("Attack");
								Sheep.setSheepIndex(1);
								//Beam.BeamIndex =1;
								GameLogic.KillWolf(Sheep.getSheepColor());	
							}
						}).start();
					} 
					
					else if (e.getKeyCode() == KeyEvent.VK_Q) {
						Button.update(0);
						InputUtility.keyPressed(e);
						InputUtility.Updatestate();
						Sheep.Update();
					} else if (e.getKeyCode() == KeyEvent.VK_W) {
						Button.update(1);
						InputUtility.keyPressed(e);
						InputUtility.Updatestate();
						Sheep.Update();
					} else if (e.getKeyCode() == KeyEvent.VK_E) {
						Button.update(2);
						InputUtility.keyPressed(e);
						InputUtility.Updatestate();
						Sheep.Update();
					} else if (e.getKeyCode() == KeyEvent.VK_R) {
						Button.update(3);
						InputUtility.keyPressed(e);
						InputUtility.Updatestate();
						Sheep.Update();
					} else if (e.getKeyCode() == KeyEvent.VK_O) {
						Button.update(4);
						InputUtility.keyPressed(e);
						InputUtility.Updatestate();
						Sheep.Update();
					} else if (e.getKeyCode() == KeyEvent.VK_I) {
						Button.update(5);
						InputUtility.keyPressed(e);
						InputUtility.Updatestate();
						Sheep.Update();
					}
				}
			}
		});

		Home.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				setPauseStatus(false);
				GameLogic.clearwolf();
				AudioUtility.stopSound("Intro");
				AudioUtility.stopSound("GameSound");
				AudioUtility.playSound("Intro");
				GameManager.frame.switchScene(GameManager.gt);
			}
		});
	}

	public static boolean isPauseStatus() {
		return PauseStatus;
	}

	public static void setPauseStatus(boolean pauseStatus) {
		PauseStatus = pauseStatus;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		for (IRenderable en : RenderableHolder.getInstance().getRenderable()) {
			if (en.IsVisible()) {
				en.draw(g2d);
			}
		}
	}
}

package render;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import entity.GameManager;
import entity.PlayerStatus;

public class GameTitle extends JPanel {

	private BufferedImage IntroBG, Ishade, Iof, Icolorful, Eu, Ed;
	private static JLabel Stbn;
	private static JLabel Hgbn;
	private static JLabel Abbn;
	private static int eyestate;

	public GameTitle() {
		Stbn = new JLabel();
		Hgbn = new JLabel();
		Abbn = new JLabel();
		eyestate = 1;
		this.setDoubleBuffered(true);
		this.setPreferredSize(new Dimension(1280, 720));
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.setBorder(BorderFactory.createEmptyBorder(350, 700, 0, 0));
		Stbn.setBorder(BorderFactory.createEmptyBorder(0, 0, 80, 0));
		Hgbn.setBorder(BorderFactory.createEmptyBorder(0, 0, 80, 0));
		Abbn.setBorder(BorderFactory.createEmptyBorder(0, 0, 80, 0));
		ClassLoader cloader = RenderableHolder.class.getClassLoader();
		ImageIcon St1 = new ImageIcon(cloader.getResource("image/Start1.png"));
		ImageIcon St0 = new ImageIcon(cloader.getResource("image/Start0.png"));
		ImageIcon Hg1 = new ImageIcon(cloader.getResource("image/HG1.png"));
		ImageIcon Hg0 = new ImageIcon(cloader.getResource("image/HG0.png"));
		Stbn.setIcon(St1);
		Hgbn.setIcon(Hg0);
		this.add(Stbn);
		this.add(Hgbn);

		Stbn.addMouseListener(new MouseListener() {

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
				Stbn.setIcon(St0);

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				eyestate = 0;
				Stbn.setIcon(St1);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				PlayerStatus.setScore(0);
				AudioUtility.playSound("Click");
				GameManager.frame.switchScene(new HowToPlay());
			}
		});

		Hgbn.addMouseListener(new MouseListener() {

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
				Hgbn.setIcon(Hg0);

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				eyestate = 1;
				Hgbn.setIcon(Hg1);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				AudioUtility.playSound("Click");
				HighScoreUtility.displayTop5();
				GameManager.frame.switchScene(new HighScore());
				String message = "High Score";
			}
		});

	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		try {
			ClassLoader cloader = RenderableHolder.class.getClassLoader();
			IntroBG = ImageIO.read(cloader.getResource("image/IntroBG.png"));
			Ishade = ImageIO.read(cloader.getResource("image/ishade.png"));
			Iof = ImageIO.read(cloader.getResource("image/iof.png"));
			Icolorful = ImageIO
					.read(cloader.getResource("image/icolorful.png"));
			Eu = ImageIO.read(cloader.getResource("image/Up.png"));
			Ed = ImageIO.read(cloader.getResource("image/Down.png"));
		} catch (IOException ex) {
			System.out.println("can't load");
		}
		g.drawImage(IntroBG, 0, 0, null);
		g.drawImage(Ishade, 130, 70, null);
		g.drawImage(Iof, 470, 70, null);
		g.drawImage(Icolorful, 630, 70, null);
		if (eyestate == 0)
			g.drawImage(Eu, 400, 451, null);
		else if (eyestate == 1)
			g.drawImage(Ed, 405, 444, null);
	}

}
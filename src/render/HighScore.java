package render;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
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
import javax.swing.SwingConstants;

import entity.GameManager;

public class HighScore extends JPanel {
	public BufferedImage bg;
	private static JLabel back;

	public HighScore() {
		back = new JLabel();
		HighScoreUtility.displayTop5();
		this.setPreferredSize(new Dimension(1280, 720));
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.setBorder(BorderFactory.createEmptyBorder(160, 0, 0, 0));
		this.setBackground(Color.WHITE);
		JLabel title = new JLabel(String.format("%19s", "rank")
				+ String.format("%15s", "name")
				+ String.format("%19s", "score"), SwingConstants.CENTER);
		title.setFont(new Font("Cooper Black", Font.BOLD, 50));
		title.setForeground(Color.yellow);
		this.add(title);
		back.setBorder(BorderFactory.createEmptyBorder(380, 525, 0, 0));
		ClassLoader cloader = RenderableHolder.class.getClassLoader();
		ImageIcon back0 = new ImageIcon(cloader.getResource("image/Home0.png"));
		ImageIcon back1 = new ImageIcon(cloader.getResource("image/Home1.png"));
		back.setIcon(back0);
		this.add(back);

		back.addMouseListener(new MouseListener() {

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
				back.setIcon(back0);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				back.setIcon(back1);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				AudioUtility.playSound("Click");
				GameManager.frame.switchScene(new GameTitle());
			}
		});

	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		try {
			ClassLoader cloader = RenderableHolder.class.getClassLoader();
			bg = ImageIO.read(cloader.getResource("image/high.png"));
		} catch (IOException ex) {
			System.out.println("can't load");
		}

		g.drawImage(bg, 0, 0, null);
		g.setFont(Resource.titleFont);
		g.setColor(new Color(255, 200, 255));
		int y = 260;
		int xName;
		int xScore;
		String name = "";
		String score = "";

		for (int i = 0; i < 5; i++) {
			g.drawString("" + (i + 1), 320, y);
			name = HighScoreUtility.getHighScoreRecord()[i].getName();
			xName = (int) g.getFontMetrics(Resource.titleFont)
					.getStringBounds(name, g).getWidth();
			g.drawString(name, 670 - xName, y);
			score = "" + HighScoreUtility.getHighScoreRecord()[i].getScore();
			xScore = (int) g.getFontMetrics(Resource.titleFont)
					.getStringBounds(score, g).getWidth();
			g.drawString(score, 1070 - xScore, y);
			y += 65;

		}

	}

}

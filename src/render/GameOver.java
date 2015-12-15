package render;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.xml.soap.Text;

import entity.GameManager;
import entity.PlayerStatus;

public class GameOver extends JPanel {

	private BufferedImage bg;
	private static JTextField text;
	private static String textIn;

	public GameOver() {
		textIn = "";
		this.setPreferredSize(new Dimension(1280, 720));
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.setBorder(BorderFactory.createEmptyBorder(340, 0, 0, 0));
		this.setBackground(Color.WHITE);

		JPanel pMessage = new JPanel(new BorderLayout());
		HighScoreUtility.checkScore(PlayerStatus.getScore());
		// HighScoreUtility.recordHighScore(PlayerStatus.getScore());
		JLabel message = new JLabel(HighScoreUtility.getMessage(),
				SwingConstants.CENTER);
		// message.setBorder(BorderFactory.createEmptyBorder(0, 300, 0, 0));
		message.setFont(Resource.titleFont);
		message.setForeground(Color.WHITE);
		pMessage.add(message, BorderLayout.NORTH);
		pMessage.setOpaque(false);
		this.add(pMessage);
		if (!HighScoreUtility.isAdd()) {
			JLabel back = new JLabel();

			back.setBorder(BorderFactory.createEmptyBorder(0, 0, 100, 200));
			ClassLoader cloader = RenderableHolder.class.getClassLoader();
			ImageIcon back0 = new ImageIcon(
					cloader.getResource("image/Home0.png"));
			ImageIcon back1 = new ImageIcon(
					cloader.getResource("image/Home1.png"));
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

		if (HighScoreUtility.isAdd()) {
			// this.setBorder(BorderFactory.createEmptyBorder(340, 300, 360,
			// 300));
			JPanel pp = new JPanel(new GridLayout(2, 1));
			pp.setBorder(BorderFactory.createEmptyBorder(0, 280, 20, 280));
			JLabel add = new JLabel("Enter your name : ");
			add.setFont(Resource.standardFont);
			add.setForeground(Color.white);
			add.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 300));

			JLabel submit = new JLabel();
			submit.setBorder(BorderFactory.createEmptyBorder(0, 0, 200, 600));

			ClassLoader cloader = RenderableHolder.class.getClassLoader();
			ImageIcon submit0 = new ImageIcon(
					cloader.getResource("image/submit0.png"));
			ImageIcon submit1 = new ImageIcon(
					cloader.getResource("image/submit1.png"));
			submit.setIcon(submit0);

			text = new JTextField();
			text.setMaximumSize(new Dimension(450, 20));
			text.setFont(Resource.titleFont);

			pp.add(add);
			pp.add(text);

			pp.setOpaque(false);
			this.add(pp);

			this.add(submit);
			this.setOpaque(false);

			submit.addMouseListener(new MouseListener() {

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
					submit.setIcon(submit0);
				}

				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					submit.setIcon(submit1);
				}

				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					AudioUtility.playSound("Click");
					textIn = text.getText();
					HighScoreUtility.recordHighScore(PlayerStatus.getScore());

					GameManager.frame.switchScene(new HighScore());
				}
			});
		}

	}

	public static String getText() {
		if (text.getText() != null)
			textIn = text.getText();
		else
			textIn = "";
		return textIn;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		try {
			ClassLoader cloader = RenderableHolder.class.getClassLoader();
			bg = ImageIO.read(cloader.getResource("image/gameover.png"));
		} catch (IOException ex) {
			System.out.println("can't load");
		}
		g.drawImage(bg, 0, 0, null);
	}
}

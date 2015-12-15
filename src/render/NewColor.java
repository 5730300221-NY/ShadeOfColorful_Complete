package render;


import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import entity.GameManager;
import entity.PlayerStatus;

public class NewColor extends JPanel {
	private BufferedImage C, C0, C1, C2, C3, C4, C5, C6, C7;
	private static JLabel OK;
	
	public NewColor() {
		OK = new JLabel();
		this.setDoubleBuffered(true);
		this.setPreferredSize(new Dimension(1280, 720));
		OK.setBorder(BorderFactory.createEmptyBorder(589, 0, 0, 0));
		ClassLoader cloader = RenderableHolder.class.getClassLoader();
		ImageIcon OkButton = new ImageIcon(cloader.getResource("image/OkButton.png"));
		OK.setIcon(OkButton);
		this.add(OK);
		this.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					AudioUtility.playSound("Start");
					GameManager.frame.switchScene(new GameScreen());
				}
			}
		});

	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		try {
			ClassLoader cloader = RenderableHolder.class.getClassLoader();
			C = ImageIO.read(cloader.getResource("image/Tip2.png"));
			C0 = ImageIO.read(cloader.getResource("image/Tip.png"));
			C1 = ImageIO.read(cloader.getResource("image/ColorSet1.png"));
			C2 = ImageIO.read(cloader.getResource("image/ColorSet2.png"));
			C3 = ImageIO.read(cloader.getResource("image/ColorSet3.png"));
			C4 = ImageIO.read(cloader.getResource("image/ColorSet4.png"));
			C5 = ImageIO.read(cloader.getResource("image/ColorSet5.png"));
			C6 = ImageIO.read(cloader.getResource("image/ColorSet6.png"));
			C7 = ImageIO.read(cloader.getResource("image/ColorSet7.png"));
		} catch (IOException ex) {
			System.out.println("can't load");
		}
		if (PlayerStatus.getRoundstate() == 1)
			g.drawImage(C1, 0, 0, null);
		else if (PlayerStatus.getRoundstate() == 2)
			g.drawImage(C2, 0, 0, null);
		else if (PlayerStatus.getRoundstate() == 4)
			g.drawImage(C3, 0, 0, null);
		else if (PlayerStatus.getRoundstate() == 6)
			g.drawImage(C4, 0, 0, null);
		else if (PlayerStatus.getRoundstate() == 7)
			g.drawImage(C5, 0, 0, null);
		else if (PlayerStatus.getRoundstate() == 10)
			g.drawImage(C6, 0, 0, null);
		else if (PlayerStatus.getRoundstate() == 12)
			g.drawImage(C7, 0, 0, null);
		else if (PlayerStatus.getRoundstate() > 13)
			g.drawImage(C, 0, 0, null);
		else
			g.drawImage(C0, 0, 0, null);
	}
}

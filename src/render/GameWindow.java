package render;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameWindow extends JFrame {
	private JPanel currentFrame;

	public GameWindow(JPanel frame) {
		super("Shade Of Colorful");
		ClassLoader cloader = RenderableHolder.class.getClassLoader();
		java.net.URL url = cloader.getResource("image/Icon.png");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image img = kit.createImage(url);
		this.setIconImage(img);
		if (frame instanceof GameTitle) {
			AudioUtility.playSound("Intro");
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		this.currentFrame = frame;
		getContentPane().add(currentFrame);
		pack();
		this.setVisible(true);
		this.currentFrame.requestFocus();

	}

	public void switchScene(JPanel frame) {
		getContentPane().remove(currentFrame);
		getContentPane().removeAll();
		this.currentFrame = frame;
		if (frame instanceof GameScreen) {
			AudioUtility.stopSound("Intro");
		}
		
		getContentPane().add(currentFrame);
		getContentPane().validate();
		pack();
		currentFrame.requestFocus();
	}

	public JPanel getCurrentScene() {
		return currentFrame;
	}

	public void setCurrentFrame(JPanel currentFrame) {
		this.currentFrame = currentFrame;
	}

}

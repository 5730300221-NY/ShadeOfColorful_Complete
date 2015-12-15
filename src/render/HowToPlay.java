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


public class HowToPlay extends JPanel{
		private BufferedImage H1,H2,H3,H4;
		private static JLabel skip; 
		private static JLabel next; 
		private static JLabel play; 
		private int page;
		
		public HowToPlay(){
			this.page=1;
			skip = new JLabel();
			next = new JLabel();
			play = new JLabel();
			this.setDoubleBuffered(true);
			this.setPreferredSize(new Dimension(1280, 720));
			this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
			this.setBorder(BorderFactory.createEmptyBorder(520,400,0,0));
			skip.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 50));
			next.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
			play.setBorder(BorderFactory.createEmptyBorder(0, 150, 0, 0));
			ClassLoader cloader = RenderableHolder.class.getClassLoader();
			ImageIcon skip0 = new ImageIcon(cloader.getResource("image/Skip0.png"));
			ImageIcon skip1 = new ImageIcon(cloader.getResource("image/Skip1.png"));
			ImageIcon next0 = new ImageIcon(cloader.getResource("image/Next0.png"));
			ImageIcon next1 = new ImageIcon(cloader.getResource("image/Next1.png"));
			ImageIcon play0 = new ImageIcon(cloader.getResource("image/Play0.png"));
			ImageIcon play1 = new ImageIcon(cloader.getResource("image/Play1.png"));
			skip.setIcon(skip0);
			next.setIcon(next0);
			play.setIcon(play0);
			play.setVisible(false);
			this.add(skip);
			this.add(next);
			this.add(play);
			
			skip.addMouseListener(new MouseListener() {
				
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
					skip.setIcon(skip0);
					
				}
				
				@Override
				public void mouseEntered(MouseEvent e) {
					skip.setIcon(skip1);
					
				}
				
				@Override
				public void mouseClicked(MouseEvent e) {
					AudioUtility.playSound("Click");
					GameManager.frame.switchScene(new NewColor());
				}
			});
			
			next.addMouseListener(new MouseListener() {
				
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
					next.setIcon(next0);
				}
				
				@Override
				public void mouseEntered(MouseEvent e) {
					next.setIcon(next1);
					
				}
				
				@Override
				public void mouseClicked(MouseEvent e) {
					AudioUtility.playSound("Click");
					if(getPage()+1>=4){
						remove(skip);
						remove(next);
						play.setVisible(true);
					}
					setPage(getPage()+1);
				}
			});
			
			play.addMouseListener(new MouseListener() {
				
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
					play.setIcon(play0);
				}
				
				@Override
				public void mouseEntered(MouseEvent e) {
					play.setIcon(play1);
					
				}
				
				@Override
				public void mouseClicked(MouseEvent e) {
					AudioUtility.playSound("Click");
					setPage(1);
					GameManager.frame.switchScene(new NewColor());
				}
			});
		}
		
		
		public int getPage() {
			return page;
		}


		public void setPage(int page) {
			this.page = page;
		}


		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			try {
				ClassLoader cloader = RenderableHolder.class.getClassLoader();
				H1 = ImageIO.read(cloader.getResource("image/H1.png"));
				H2 = ImageIO.read(cloader.getResource("image/H2.png"));
				H3 = ImageIO.read(cloader.getResource("image/H3.png"));
				H4 = ImageIO.read(cloader.getResource("image/H4.png"));
			} catch (IOException ex) {
				System.out.println("can't load");
			}
			if(this.page==1) g.drawImage(H1, 0, 0, null);
			else if(this.page==2) g.drawImage(H2, 0, 0, null);
			else if(this.page==3) g.drawImage(H3, 0, 0, null);
			else if(this.page==4) g.drawImage(H4, 0, 0, null);
		}
}

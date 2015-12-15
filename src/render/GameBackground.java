package render;

import java.awt.Graphics2D;

import entity.PlayerStatus;

public class GameBackground implements IRenderable {
	
	@Override
	public void draw(Graphics2D g2d) {
		if(PlayerStatus.getRoundstate()==1) g2d.drawImage(Resource.BC1,0,0,null);
		else if(PlayerStatus.getRoundstate()>=2 && PlayerStatus.getRoundstate()<=3)g2d.drawImage(Resource.BC2,0,0,null);
		else if(PlayerStatus.getRoundstate()>=4 && PlayerStatus.getRoundstate()<=5)g2d.drawImage(Resource.BC3,0,0,null);
		else if(PlayerStatus.getRoundstate()==6)g2d.drawImage(Resource.BC4,0,0,null);
		else if(PlayerStatus.getRoundstate()>=7 && PlayerStatus.getRoundstate()<=9)g2d.drawImage(Resource.BC5,0,0,null);
		else if(PlayerStatus.getRoundstate()>=10 && PlayerStatus.getRoundstate()<=11)g2d.drawImage(Resource.BC6,0,0,null);
		else if(PlayerStatus.getRoundstate()>=12 && PlayerStatus.getRoundstate()<=13)g2d.drawImage(Resource.BC7,0,0,null);
		else if(PlayerStatus.getRoundstate()>=14 && PlayerStatus.getRoundstate()<=16)g2d.drawImage(Resource.R14,0,0,null);
		else if(PlayerStatus.getRoundstate()>=17 && PlayerStatus.getRoundstate()<=20)g2d.drawImage(Resource.R17,0,0,null);
		else if(PlayerStatus.getRoundstate()>=21)g2d.drawImage(Resource.R21,0,0,null);
	}

	@Override
	public boolean IsVisible() {
		return true;
	}

	@Override
	public int getZ() {
		return Integer.MIN_VALUE;
	}
			
}

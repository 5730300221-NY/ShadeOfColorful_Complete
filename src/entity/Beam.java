package entity;

import input.InputUtility;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

import render.IRenderable;
import render.Resource;

public class Beam implements IRenderable {
	public static int BeamIndex = 0;

	@Override
	public void draw(Graphics2D g2d) {
		if (BeamIndex == 1) {
			if (Sheep.getSheepColor() == 0)
				g2d.drawImage(Resource.Black_B, 110, 50, null);
			else if (Sheep.getSheepColor() == 1)
				g2d.drawImage(Resource.Rbright_B, 110, 50, null);
			else if (Sheep.getSheepColor() == 2)
				g2d.drawImage(Resource.Rdark_B, 110, 50, null);
			else if (Sheep.getSheepColor() == 3)
				g2d.drawImage(Resource.Bbright_B, 110, 50, null);
			else if (Sheep.getSheepColor() == 4)
				g2d.drawImage(Resource.Bdark_B, 110, 50, null);
			else if (Sheep.getSheepColor() == 5)
				g2d.drawImage(Resource.Gbright_B, 110, 50, null);
			else if (Sheep.getSheepColor() == 6)
				g2d.drawImage(Resource.Gdark_B, 110, 50, null);
			else if (Sheep.getSheepColor() == 7)
				g2d.drawImage(Resource.RBbright_B, 110, 50, null);
			else if (Sheep.getSheepColor() == 8)
				g2d.drawImage(Resource.RGbright_B, 110, 50, null);
			else if (Sheep.getSheepColor() == 9)
				g2d.drawImage(Resource.GBbright_B, 110, 50, null);
			else if (Sheep.getSheepColor() == 10)
				g2d.drawImage(Resource.RBdark_B, 110, 50, null);
			else if (Sheep.getSheepColor() == 11)
				g2d.drawImage(Resource.RGdark_B, 110, 50, null);
			else if (Sheep.getSheepColor() == 12)
				g2d.drawImage(Resource.GBdark_B, 110, 50, null);
			else if (Sheep.getSheepColor() == 13)
				g2d.drawImage(Resource.RGBbright_B, 110, 50, null);
			else if (Sheep.getSheepColor() == 14)
				g2d.drawImage(Resource.RGBdark_B, 110, 50, null);
			else if (Sheep.getSheepColor() == 15)
				g2d.drawImage(Resource.RbrightGdark_B, 110, 50, null);
			else if (Sheep.getSheepColor() == 16)
				g2d.drawImage(Resource.RdarkBbright_B, 110, 50, null);
			else if (Sheep.getSheepColor() == 17)
				g2d.drawImage(Resource.GdarkBbright_B, 110, 50, null);
			else if (Sheep.getSheepColor() == 18)
				g2d.drawImage(Resource.RdarkGbright_B, 110, 50, null);
			else if (Sheep.getSheepColor() == 19)
				g2d.drawImage(Resource.RbrightBdark_B, 110, 50, null);
			else if (Sheep.getSheepColor() == 20)
				g2d.drawImage(Resource.GbrightBdark_B, 110, 50, null);
		}
	}

	@Override
	public boolean IsVisible() {
		return true;
	}

	@Override
	public int getZ() {
		return Integer.MAX_VALUE;
	}

}

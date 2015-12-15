package entity;

import java.awt.Graphics2D;
import render.IRenderable;
import render.Resource;

public class Sheep implements IRenderable {
	private static int SheepColor; // 0-20
	private static int SheepIndex;
	private static boolean IsShot;
	private static Beam beam;
	private static int state = 0;

	public Sheep() {
		SheepColor = 0;
		SheepIndex = 0;
		IsShot = false;
		state = 0;
	}

	public static int getSheepColor() {
		return SheepColor;
	}

	public static void setSheepColor(int sheepColor) {
		SheepColor = sheepColor;
	}

	public static int getSheepIndex() {
		return SheepIndex;
	}

	public static void setSheepIndex(int sheepIndex) {
		SheepIndex = sheepIndex;
	}

	public static boolean isIsShot() {
		return IsShot;
	}

	public static void setIsShot(boolean isShot) {
		IsShot = isShot;
	}

	public static Beam getBeam() {
		return beam;
	}

	public static void setBeam(Beam beam) {
		Sheep.beam = beam;
	}

	public static int getState() {
		return state;
	}

	public static void setState(int state) {
		Sheep.state = state;
	}

	public static void setColor(int state) {
		// nColor will be in range 0-14

		if (state == 15) {
			return;
		}

		else if (SheepColor == 0)
			SheepColor = state;

		else if (SheepColor == 1) {
			if (state == 3)
				SheepColor = 7;
			else if (state == 4)
				SheepColor = 19;
			else if (state == 5)
				SheepColor = 8;
			else if (state == 6)
				SheepColor = 15;
			else
				SheepColor = state;
		}

		else if (SheepColor == 2) {
			if (state == 3)
				SheepColor = 16;
			else if (state == 4)
				SheepColor = 10;
			else if (state == 5)
				SheepColor = 18;
			else if (state == 6)
				SheepColor = 11;
			else
				SheepColor = state;
		}

		else if (SheepColor == 3) {
			if (state == 1)
				SheepColor = 7;
			else if (state == 2)
				SheepColor = 16;
			else if (state == 5)
				SheepColor = 9;
			else if (state == 6)
				SheepColor = 17;
			else
				SheepColor = state;
		}

		else if (SheepColor == 4) {
			if (state == 1)
				SheepColor = 19;
			else if (state == 2)
				SheepColor = 10;
			else if (state == 5)
				SheepColor = 20;
			else if (state == 6)
				SheepColor = 12;
			else
				SheepColor = state;
		}

		else if (SheepColor == 5) {
			if (state == 1)
				SheepColor = 8;
			else if (state == 2)
				SheepColor = 18;
			else if (state == 3)
				SheepColor = 9;
			else if (state == 4)
				SheepColor = 20;
			else
				SheepColor = state;
		}

		else if (SheepColor == 6) {
			if (state == 1)
				SheepColor = 15;
			else if (state == 2)
				SheepColor = 11;
			else if (state == 3)
				SheepColor = 17;
			else if (state == 4)
				SheepColor = 12;
			else
				SheepColor = state;
		} else {
			SheepColor = state;
		}

		setSheepColor(SheepColor);

	}

	public static void Update() {
		Sheep.setColor(Sheep.state);
	}

	@Override
	public void draw(Graphics2D g2d) {
		if (SheepIndex == 0) {
			if (Sheep.getSheepColor() == 0)
				g2d.drawImage(Resource.Black_S0, 300, 340, null);
			else if (Sheep.getSheepColor() == 1)
				g2d.drawImage(Resource.Rbright_S0, 300, 340, null);
			else if (Sheep.getSheepColor() == 2)
				g2d.drawImage(Resource.Rdark_S0, 300, 340, null);
			else if (Sheep.getSheepColor() == 3)
				g2d.drawImage(Resource.Bbright_S0, 300, 340, null);
			else if (Sheep.getSheepColor() == 4)
				g2d.drawImage(Resource.Bdark_S0, 300, 340, null);
			else if (Sheep.getSheepColor() == 5)
				g2d.drawImage(Resource.Gbright_S0, 300, 340, null);
			else if (Sheep.getSheepColor() == 6)
				g2d.drawImage(Resource.Gdark_S0, 300, 340, null);
			else if (Sheep.getSheepColor() == 7)
				g2d.drawImage(Resource.RBbright_S0, 300, 340, null);
			else if (Sheep.getSheepColor() == 8)
				g2d.drawImage(Resource.RGbright_S0, 300, 340, null);
			else if (Sheep.getSheepColor() == 9)
				g2d.drawImage(Resource.GBbright_S0, 300, 340, null);
			else if (Sheep.getSheepColor() == 10)
				g2d.drawImage(Resource.RBdark_S0, 300, 340, null);
			else if (Sheep.getSheepColor() == 11)
				g2d.drawImage(Resource.RGdark_S0, 300, 340, null);
			else if (Sheep.getSheepColor() == 12)
				g2d.drawImage(Resource.GBdark_S0, 300, 340, null);
			else if (Sheep.getSheepColor() == 13)
				g2d.drawImage(Resource.RGBbright_S0, 300, 340, null);
			else if (Sheep.getSheepColor() == 14)
				g2d.drawImage(Resource.RGBdark_S0, 300, 340, null);
			else if (Sheep.getSheepColor() == 15)
				g2d.drawImage(Resource.RbrightGdark_S0, 300, 340, null);
			else if (Sheep.getSheepColor() == 16)
				g2d.drawImage(Resource.RdarkBbright_S0, 300, 340, null);
			else if (Sheep.getSheepColor() == 17)
				g2d.drawImage(Resource.GdarkBbright_S0, 300, 340, null);
			else if (Sheep.getSheepColor() == 18)
				g2d.drawImage(Resource.RdarkGbright_S0, 300, 340, null);
			else if (Sheep.getSheepColor() == 19)
				g2d.drawImage(Resource.RbrightBdark_S0, 300, 340, null);
			else if (Sheep.getSheepColor() == 20)
				g2d.drawImage(Resource.GbrightBdark_S0, 300, 340, null);
		} else if (SheepIndex == 1) {
			if (Sheep.getSheepColor() == 0)
				g2d.drawImage(Resource.Black_S1, 300, 340, null);
			else if (Sheep.getSheepColor() == 1)
				g2d.drawImage(Resource.Rbright_S1, 300, 340, null);
			else if (Sheep.getSheepColor() == 2)
				g2d.drawImage(Resource.Rdark_S1, 300, 340, null);
			else if (Sheep.getSheepColor() == 3)
				g2d.drawImage(Resource.Bbright_S1, 300, 340, null);
			else if (Sheep.getSheepColor() == 4)
				g2d.drawImage(Resource.Bdark_S1, 300, 340, null);
			else if (Sheep.getSheepColor() == 5)
				g2d.drawImage(Resource.Gbright_S1, 300, 340, null);
			else if (Sheep.getSheepColor() == 6)
				g2d.drawImage(Resource.Gdark_S1, 300, 340, null);
			else if (Sheep.getSheepColor() == 7)
				g2d.drawImage(Resource.RBbright_S1, 300, 340, null);
			else if (Sheep.getSheepColor() == 8)
				g2d.drawImage(Resource.RGbright_S1, 300, 340, null);
			else if (Sheep.getSheepColor() == 9)
				g2d.drawImage(Resource.GBbright_S1, 300, 340, null);
			else if (Sheep.getSheepColor() == 10)
				g2d.drawImage(Resource.RBdark_S1, 300, 340, null);
			else if (Sheep.getSheepColor() == 11)
				g2d.drawImage(Resource.RGdark_S1, 300, 340, null);
			else if (Sheep.getSheepColor() == 12)
				g2d.drawImage(Resource.GBdark_S1, 300, 340, null);
			else if (Sheep.getSheepColor() == 13)
				g2d.drawImage(Resource.RGBbright_S1, 300, 340, null);
			else if (Sheep.getSheepColor() == 14)
				g2d.drawImage(Resource.RGBdark_S1, 300, 340, null);
			else if (Sheep.getSheepColor() == 15)
				g2d.drawImage(Resource.RbrightGdark_S1, 300, 340, null);
			else if (Sheep.getSheepColor() == 16)
				g2d.drawImage(Resource.RdarkBbright_S1, 300, 340, null);
			else if (Sheep.getSheepColor() == 17)
				g2d.drawImage(Resource.GdarkBbright_S1, 300, 340, null);
			else if (Sheep.getSheepColor() == 18)
				g2d.drawImage(Resource.RdarkGbright_S1, 300, 340, null);
			else if (Sheep.getSheepColor() == 19)
				g2d.drawImage(Resource.RbrightBdark_S1, 300, 340, null);
			else if (Sheep.getSheepColor() == 20)
				g2d.drawImage(Resource.GbrightBdark_S1, 300, 340, null);
		}
	}

	@Override
	public boolean IsVisible() {
		return true;
	}

	@Override
	public int getZ() {
		return Integer.MAX_VALUE - 3;
	}

}

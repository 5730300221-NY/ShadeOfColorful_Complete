package render;

import java.awt.Graphics2D;
import entity.Sheep;

public class Button implements IRenderable {

	private static int R = 0;
	private static int G = 0;
	private static int B = 0;
	private static int Dark = 0;
	private static int Bright = 0;
	private static int reset = 0;

	public static int getR() {
		return R;
	}

	public static void setR(int r) {
		R = r;
	}

	public static int getG() {
		return G;
	}

	public static void setG(int g) {
		G = g;
	}

	public static int getB() {
		return B;
	}

	public static void setB(int b) {
		B = b;
	}

	public static int getDark() {
		return Dark;
	}

	public static void setDark(int dark) {
		Dark = dark;
	}

	public static int getBright() {
		return Bright;
	}

	public static void setBright(int bright) {
		Bright = bright;
	}

	public static int getReset() {
		return reset;
	}

	public static void setReset(int reset) {
		Button.reset = reset;
	}

	public static void update(int key) {
		if (key == 0) {
			setReset(1);
		} else if (key == 6) {
			setReset(0);
		}
		if (key == 1) {
			setR(1);
		} else if (key == 7) {
			setR(0);
		}
		if (key == 2) {
			setG(1);
		} else if (key == 8) {
			setG(0);
		}
		if (key == 3) {
			setB(1);
		} else if (key == 9) {
			setB(0);
		}
		if (key == 4) {
			setBright(1);
		} else if (key == 10) {
			setBright(0);
		}
		if (key == 5) {
			setDark(1);
		} else if (key == 11) {
			setDark(0);
		}
	}

	@Override
	public void draw(Graphics2D g2d) {
		if (getReset() == 0) {
			if (Sheep.getSheepColor() == 0)
				g2d.drawImage(Resource.Black_R, 80, 40, null);
			else if (Sheep.getSheepColor() == 1)
				g2d.drawImage(Resource.Rbright_R, 80, 40, null);
			else if (Sheep.getSheepColor() == 2)
				g2d.drawImage(Resource.Rdark_R, 80, 40, null);
			else if (Sheep.getSheepColor() == 3)
				g2d.drawImage(Resource.Bbright_R, 80, 40, null);
			else if (Sheep.getSheepColor() == 4)
				g2d.drawImage(Resource.Bdark_R, 80, 40, null);
			else if (Sheep.getSheepColor() == 5)
				g2d.drawImage(Resource.Gbright_R, 80, 40, null);
			else if (Sheep.getSheepColor() == 6)
				g2d.drawImage(Resource.Gdark_R, 80, 40, null);
			else if (Sheep.getSheepColor() == 7)
				g2d.drawImage(Resource.RBbright_R, 80, 40, null);
			else if (Sheep.getSheepColor() == 8)
				g2d.drawImage(Resource.RGbright_R, 80, 40, null);
			else if (Sheep.getSheepColor() == 9)
				g2d.drawImage(Resource.GBbright_R, 80, 40, null);
			else if (Sheep.getSheepColor() == 10)
				g2d.drawImage(Resource.RBdark_R, 80, 40, null);
			else if (Sheep.getSheepColor() == 11)
				g2d.drawImage(Resource.RGdark_R, 80, 40, null);
			else if (Sheep.getSheepColor() == 12)
				g2d.drawImage(Resource.GBdark_R, 80, 40, null);
			else if (Sheep.getSheepColor() == 13)
				g2d.drawImage(Resource.RGBbright_R, 80, 40, null);
			else if (Sheep.getSheepColor() == 14)
				g2d.drawImage(Resource.RGBdark_R, 80, 40, null);
			else if (Sheep.getSheepColor() == 15)
				g2d.drawImage(Resource.RbrightGdark_R, 80, 40, null);
			else if (Sheep.getSheepColor() == 16)
				g2d.drawImage(Resource.RdarkBbright_R, 80, 40, null);
			else if (Sheep.getSheepColor() == 17)
				g2d.drawImage(Resource.GdarkBbright_R, 80, 40, null);
			else if (Sheep.getSheepColor() == 18)
				g2d.drawImage(Resource.RdarkGbright_R, 80, 40, null);
			else if (Sheep.getSheepColor() == 19)
				g2d.drawImage(Resource.RbrightBdark_R, 80, 40, null);
			else if (Sheep.getSheepColor() == 20)
				g2d.drawImage(Resource.GbrightBdark_R, 80, 40, null);
		} else if (getReset() == 1) {
			if (Sheep.getSheepColor() == 0)
				g2d.drawImage(Resource.Black_R1, 80, 40, null);
			else if (Sheep.getSheepColor() == 1)
				g2d.drawImage(Resource.Rbright_R1, 80, 40, null);
			else if (Sheep.getSheepColor() == 2)
				g2d.drawImage(Resource.Rdark_R1, 80, 40, null);
			else if (Sheep.getSheepColor() == 3)
				g2d.drawImage(Resource.Bbright_R1, 80, 40, null);
			else if (Sheep.getSheepColor() == 4)
				g2d.drawImage(Resource.Bdark_R1, 80, 40, null);
			else if (Sheep.getSheepColor() == 5)
				g2d.drawImage(Resource.Gbright_R1, 80, 40, null);
			else if (Sheep.getSheepColor() == 6)
				g2d.drawImage(Resource.Gdark_R1, 80, 40, null);
			else if (Sheep.getSheepColor() == 7)
				g2d.drawImage(Resource.RBbright_R1, 80, 40, null);
			else if (Sheep.getSheepColor() == 8)
				g2d.drawImage(Resource.RGbright_R1, 80, 40, null);
			else if (Sheep.getSheepColor() == 9)
				g2d.drawImage(Resource.GBbright_R1, 80, 40, null);
			else if (Sheep.getSheepColor() == 10)
				g2d.drawImage(Resource.RBdark_R1, 80, 40, null);
			else if (Sheep.getSheepColor() == 11)
				g2d.drawImage(Resource.RGdark_R1, 80, 40, null);
			else if (Sheep.getSheepColor() == 12)
				g2d.drawImage(Resource.GBdark_R1, 80, 40, null);
			else if (Sheep.getSheepColor() == 13)
				g2d.drawImage(Resource.RGBbright_R1, 80, 40, null);
			else if (Sheep.getSheepColor() == 14)
				g2d.drawImage(Resource.RGBdark_R1, 80, 40, null);
			else if (Sheep.getSheepColor() == 15)
				g2d.drawImage(Resource.RbrightGdark_R1, 80, 40, null);
			else if (Sheep.getSheepColor() == 16)
				g2d.drawImage(Resource.RdarkBbright_R1, 80, 40, null);
			else if (Sheep.getSheepColor() == 17)
				g2d.drawImage(Resource.GdarkBbright_R1, 80, 40, null);
			else if (Sheep.getSheepColor() == 18)
				g2d.drawImage(Resource.RdarkGbright_R1, 80, 40, null);
			else if (Sheep.getSheepColor() == 19)
				g2d.drawImage(Resource.RbrightBdark_R1, 80, 40, null);
			else if (Sheep.getSheepColor() == 20)
				g2d.drawImage(Resource.GbrightBdark_R1, 80, 40, null);

		}

		if (R == 0) {
			g2d.drawImage(Resource.RedButton, 80, 350, null);
		} else {
			g2d.drawImage(Resource.RedButton1, 80, 350, null);
		}
		if (G == 0) {
			g2d.drawImage(Resource.GreenButton, 80, 550, null);
		} else {
			g2d.drawImage(Resource.GreenButton1, 80, 550, null);
		}
		if (B == 0) {
			g2d.drawImage(Resource.BlueButton, 320, 550, null);
		} else {
			g2d.drawImage(Resource.BlueButton1, 320, 550, null);
		}
		if (Bright == 0) {
			g2d.drawImage(Resource.BrightButton, 1100, 560, null);
		} else {
			g2d.drawImage(Resource.BrightButton1, 1100, 560, null);
		}
		if (Dark == 0) {
			g2d.drawImage(Resource.DarkButton, 880, 555, null);
		} else {
			g2d.drawImage(Resource.DarkButton1, 880, 555, null);
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

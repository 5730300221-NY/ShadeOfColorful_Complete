package render;

import java.awt.Font;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Resource {
	public static final Font standardFont = new Font("Tahoma", Font.BOLD, 30);
	public static final Font titleFont = new Font("Cooper Black",Font.BOLD,40);
	private static BufferedImage getImage(String directory) {
		BufferedImage im;
		try {
			ClassLoader loader = Resource.class.getClassLoader();
			im = ImageIO.read(loader.getResource(directory));
		} catch (Exception e) {
			im = null;
		}
		return im;
	}

	// set1
	public static BufferedImage BlueButton, BrightButton, DarkButton,
			GreenButton, RedButton;
	public static BufferedImage BlueButton1, BrightButton1, DarkButton1,
			GreenButton1, RedButton1;
	public static BufferedImage Bbright_B, Bbright_R, Bbright_R1, Bbright_S0,
			Bbright_S1, Bbright_W0;
	public static BufferedImage Bdark_B, Bdark_R, Bdark_R1, Bdark_S0, Bdark_S1,
			Bdark_W0;
	public static BufferedImage Gbright_B, Gbright_R, Gbright_R1, Gbright_S0,
			Gbright_S1, Gbright_W0;
	public static BufferedImage Gdark_B, Gdark_R, Gdark_R1, Gdark_S0, Gdark_S1,
			Gdark_W0;
	public static BufferedImage Rbright_B, Rbright_R, Rbright_R1, Rbright_S0,
			Rbright_S1, Rbright_W0;
	public static BufferedImage Rdark_B, Rdark_R, Rdark_R1, Rdark_S0, Rdark_S1,
			Rdark_W0;
	// set3
	public static BufferedImage Black_B, Black_R, Black_R1, Black_S0, Black_S1,
			Black_W0;
	public static BufferedImage RGBbright_B, RGBbright_R, RGBbright_R1,
			RGBbright_S0, RGBbright_S1, RGBbright_W0;
	public static BufferedImage RGBdark_B, RGBdark_R, RGBdark_R1, RGBdark_S0,
			RGBdark_S1, RGBdark_W0;
	// set2(DiffTone) //nameNOTsameFilename
	public static BufferedImage GbrightBdark_B, GbrightBdark_R,
			GbrightBdark_R1, GbrightBdark_S0, GbrightBdark_S1, GbrightBdark_W0;
	public static BufferedImage GdarkBbright_B, GdarkBbright_R,
			GdarkBbright_R1, GdarkBbright_S0, GdarkBbright_S1, GdarkBbright_W0;
	public static BufferedImage RbrightBdark_B, RbrightBdark_R,
			RbrightBdark_R1, RbrightBdark_S0, RbrightBdark_S1, RbrightBdark_W0;
	public static BufferedImage RbrightGdark_B, RbrightGdark_R,
			RbrightGdark_R1, RbrightGdark_S0, RbrightGdark_S1, RbrightGdark_W0;
	public static BufferedImage RdarkBbright_B, RdarkBbright_R,
			RdarkBbright_R1, RdarkBbright_S0, RdarkBbright_S1, RdarkBbright_W0;
	public static BufferedImage RdarkGbright_B, RdarkGbright_R,
			RdarkGbright_R1, RdarkGbright_S0, RdarkGbright_S1, RdarkGbright_W0;
	// set2(SameTone)
	public static BufferedImage GBbright_B, GBbright_R, GBbright_R1,
			GBbright_S0, GBbright_S1, GBbright_W0;
	public static BufferedImage GBdark_B, GBdark_R, GBdark_R1, GBdark_S0,
			GBdark_S1, GBdark_W0;
	public static BufferedImage RBbright_B, RBbright_R, RBbright_R1,
			RBbright_S0, RBbright_S1, RBbright_W0;
	public static BufferedImage RBdark_B, RBdark_R, RBdark_R1, RBdark_S0,
			RBdark_S1, RBdark_W0;
	public static BufferedImage RGbright_B, RGbright_R, RGbright_R1,
			RGbright_S0, RGbright_S1, RGbright_W0;
	public static BufferedImage RGdark_B, RGdark_R, RGdark_R1, RGdark_S0,
			RGdark_S1, RGdark_W0;
	public static BufferedImage Wolf1, BC1, BC2, BC3, BC4, BC5, BC6, BC7, R14,
			R17, R21;
	public static BufferedImage St1, St0, Hg1, Hg0;
	public static BufferedImage IntroBG, Ishade, Iof, Icolorful, Eu, Em, Ed;

	static {

		BC1 = getImage("image/BC1.png");
		BC2 = getImage("image/BC2.png");
		BC3 = getImage("image/BC3.png");
		BC4 = getImage("image/BC4.png");
		BC5 = getImage("image/BC5.png");
		BC6 = getImage("image/BC6.png");
		BC7 = getImage("image/BC7.png");
		R14 = getImage("image/R14.png");
		R17 = getImage("image/R17.png");
		R21 = getImage("image/R21.png");

		BlueButton = getImage("image/BlueButton.png");
		BrightButton = getImage("image/BrightButton.png");
		DarkButton = getImage("image/DarkButton.png");
		GreenButton = getImage("image/GreenButton.png");
		RedButton = getImage("image/RedButton.png");

		BlueButton1 = getImage("image/BlueButton1.png");
		BrightButton1 = getImage("image/BrightButton1.png");
		DarkButton1 = getImage("image/DarkButton1.png");
		GreenButton1 = getImage("image/GreenButton1.png");
		RedButton1 = getImage("image/RedButton1.png");

		Bbright_B = getImage("image/Bbright_B.png");
		Bbright_R = getImage("image/Bbright_R.png");
		Bbright_R1 = getImage("image/Bbright_R1.png");
		Bbright_S0 = getImage("image/Bbright_S0.png");
		Bbright_S1 = getImage("image/Bbright_S1.png");
		Bbright_W0 = getImage("image/Bbright_W0.png");

		Bdark_B = getImage("image/Bdark_B.png");
		Bdark_R = getImage("image/Bdark_R.png");
		Bdark_R1 = getImage("image/Bdark_R1.png");
		Bdark_S0 = getImage("image/Bdark_S0.png");
		Bdark_S1 = getImage("image/Bdark_S1.png");
		Bdark_W0 = getImage("image/Bdark_W0.png");

		Gbright_B = getImage("image/Gbright_B.png");
		Gbright_R = getImage("image/Gbright_R.png");
		Gbright_R1 = getImage("image/Gbright_R1.png");
		Gbright_S0 = getImage("image/Gbright_S0.png");
		Gbright_S1 = getImage("image/Gbright_S1.png");
		Gbright_W0 = getImage("image/Gbright_W0.png");

		Gdark_B = getImage("image/Gdark_B.png");
		Gdark_R = getImage("image/Gdark_R.png");
		Gdark_R1 = getImage("image/Gdark_R1.png");
		Gdark_S0 = getImage("image/Gdark_S0.png");
		Gdark_S1 = getImage("image/Gdark_S1.png");
		Gdark_W0 = getImage("image/Gdark_W0.png");

		Rbright_B = getImage("image/Rbright_B.png");
		Rbright_R = getImage("image/Rbright_R.png");
		Rbright_R1 = getImage("image/Rbright_R1.png");
		Rbright_S0 = getImage("image/Rbright_S0.png");
		Rbright_S1 = getImage("image/Rbright_S1.png");
		Rbright_W0 = getImage("image/Rbright_W0.png");

		Rdark_B = getImage("image/Rdark_B.png");
		Rdark_R = getImage("image/Rdark_R.png");
		Rdark_R1 = getImage("image/Rdark_R1.png");
		Rdark_S0 = getImage("image/Rdark_S0.png");
		Rdark_S1 = getImage("image/Rdark_S1.png");
		Rdark_W0 = getImage("image/Rdark_W0.png");

		Black_B = getImage("image/Black_B.png");
		Black_R = getImage("image/Black_R.png");
		Black_R1 = getImage("image/Black_R1.png");
		Black_S0 = getImage("image/Black_S0.png");
		Black_S1 = getImage("image/Black_S1.png");
		Black_W0 = getImage("image/Black_W0.png");

		RGBbright_B = getImage("image/RGBbright_B.png");
		RGBbright_R = getImage("image/RGBbright_R.png");
		RGBbright_R1 = getImage("image/RGBbright_R1.png");
		RGBbright_S0 = getImage("image/RGBbright_S0.png");
		RGBbright_S1 = getImage("image/RGBbright_S1.png");
		RGBbright_W0 = getImage("image/RGBbright_W0.png");

		RGBdark_B = getImage("image/RGBdark_B.png");
		RGBdark_R = getImage("image/RGBdark_R.png");
		RGBdark_R1 = getImage("image/RGBdark_R1.png");
		RGBdark_S0 = getImage("image/RGBdark_S0.png");
		RGBdark_S1 = getImage("image/RGBdark_S1.png");
		RGBdark_W0 = getImage("image/RGBdark_W0.png");

		GbrightBdark_B = getImage("image/GbrightBdark_B.png");
		GbrightBdark_R = getImage("image/GbrightBdark_R.png");
		GbrightBdark_R1 = getImage("image/GbrightBdark_R1.png");
		GbrightBdark_S0 = getImage("image/GbrightBdark_S0.png");
		GbrightBdark_S1 = getImage("image/GbrightBdark_S1.png");
		GbrightBdark_W0 = getImage("image/GbrightBdark_W0.png");

		GdarkBbright_B = getImage("image/GdarkBbright_B.png");
		GdarkBbright_R = getImage("image/GdarkBbright_R.png");
		GdarkBbright_R1 = getImage("image/GdarkBbright_R1.png");
		GdarkBbright_S0 = getImage("image/GdarkBbright_S0.png");
		GdarkBbright_S1 = getImage("image/GdarkBbright_S1.png");
		GdarkBbright_W0 = getImage("image/GdarkBbright_W0.png");

		RbrightBdark_B = getImage("image/RbrightBdark_B.png");
		RbrightBdark_R = getImage("image/RbrightBdark_R.png");
		RbrightBdark_R1 = getImage("image/RbrightBdark_R1.png");
		RbrightBdark_S0 = getImage("image/RbrightBdark_S0.png");
		RbrightBdark_S1 = getImage("image/RbrightBdark_S1.png");
		RbrightBdark_W0 = getImage("image/RbrightBdark_W0.png");

		RbrightGdark_B = getImage("image/RbrightGdark_B.png");
		RbrightGdark_R = getImage("image/RbrightGdark_R.png");
		RbrightGdark_R1 = getImage("image/RbrightGdark_R1.png");
		RbrightGdark_S0 = getImage("image/RbrightGdark_S0.png");
		RbrightGdark_S1 = getImage("image/RbrightGdark_S1.png");
		RbrightGdark_W0 = getImage("image/RbrightGdark_W0.png");

		RdarkBbright_B = getImage("image/RdarkBbright_B.png");
		RdarkBbright_R = getImage("image/RdarkBbright_R.png");
		RdarkBbright_R1 = getImage("image/RdarkBbright_R1.png");
		RdarkBbright_S0 = getImage("image/RdarkBbright_S0.png");
		RdarkBbright_S1 = getImage("image/RdarkBbright_S1.png");
		RdarkBbright_W0 = getImage("image/RdarkBbright_W0.png");

		RdarkGbright_B = getImage("image/RdarkGbright_B.png");
		RdarkGbright_R = getImage("image/RdarkGbright_R.png");
		RdarkGbright_R1 = getImage("image/RdarkGbright_R1.png");
		RdarkGbright_S0 = getImage("image/RdarkGbright_S0.png");
		RdarkGbright_S1 = getImage("image/RdarkGbright_S1.png");
		RdarkGbright_W0 = getImage("image/RdarkGbright_W0.png");

		GBbright_B = getImage("image/GBbright_B.png");
		GBbright_R = getImage("image/GBbright_R.png");
		GBbright_R1 = getImage("image/GBbright_R1.png");
		GBbright_S0 = getImage("image/GBbright_S0.png");
		GBbright_S1 = getImage("image/GBbright_S1.png");
		GBbright_W0 = getImage("image/GBbright_W0.png");

		GBdark_B = getImage("image/GBdark_B.png");
		GBdark_R = getImage("image/GBdark_R.png");
		GBdark_R1 = getImage("image/GBdark_R1.png");
		GBdark_S0 = getImage("image/GBdark_S0.png");
		GBdark_S1 = getImage("image/GBdark_S1.png");
		GBdark_W0 = getImage("image/GBdark_W0.png");

		RBbright_B = getImage("image/RBbright_B.png");
		RBbright_R = getImage("image/RBbright_R.png");
		RBbright_R1 = getImage("image/RBbright_R1.png");
		RBbright_S0 = getImage("image/RBbright_S0.png");
		RBbright_S1 = getImage("image/RBbright_S1.png");
		RBbright_W0 = getImage("image/RBbright_W0.png");

		RBdark_B = getImage("image/RBdark_B.png");
		RBdark_R = getImage("image/RBdark_R.png");
		RBdark_R1 = getImage("image/RBdark_R1.png");
		RBdark_S0 = getImage("image/RBdark_S0.png");
		RBdark_S1 = getImage("image/RBdark_S1.png");
		RBdark_W0 = getImage("image/RBdark_W0.png");

		RGbright_B = getImage("image/RGbright_B.png");
		RGbright_R = getImage("image/RGbright_R.png");
		RGbright_R1 = getImage("image/RGbright_R1.png");
		RGbright_S0 = getImage("image/RGbright_S0.png");
		RGbright_S1 = getImage("image/RGbright_S1.png");
		RGbright_W0 = getImage("image/RGbright_W0.png");

		RGdark_B = getImage("image/RGdark_B.png");
		RGdark_R = getImage("image/RGdark_R.png");
		RGdark_R1 = getImage("image/RGdark_R1.png");
		RGdark_S0 = getImage("image/RGdark_S0.png");
		RGdark_S1 = getImage("image/RGdark_S1.png");
		RGdark_W0 = getImage("image/RGdark_W0.png");

		Wolf1 = getImage("image/Wolf1.png");
	}

}

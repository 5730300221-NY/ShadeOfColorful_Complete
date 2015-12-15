package entity;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

import render.IRenderable;

public class PlayerStatus implements IRenderable {
	private Sheep sheep;
	private static int Score;
	private static int roundstate;

	public PlayerStatus() {
		roundstate = 1;
		Score = 0;
	}

	public Sheep getSheep() {
		return sheep;
	}

	public void setSheep(Sheep sheep) {
		this.sheep = sheep;
	}

	public static int getRoundstate() {
		return roundstate;
	}

	public static void setRoundstate(int roundstate) {
		PlayerStatus.roundstate = roundstate;
	}

	public static int getScore() {
		return Score;
	}

	public static void setScore(int score) {
		Score = score;
	}

	@Override
	public void draw(Graphics2D g2d) {
		g2d.setFont(new Font("Tahoma", Font.BOLD, 40));
		g2d.setColor(Color.WHITE);
		g2d.drawString(getScore() + "", 1080, 70);
		g2d.drawString("Round : " + getRoundstate() + "", 550, 70);
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

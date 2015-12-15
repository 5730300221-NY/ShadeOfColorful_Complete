package render;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class HighScoreUtility {

	public static class HighScoreRecord implements Comparable<HighScoreRecord> {
		private String name = "";
		private int score = 0;

		public HighScoreRecord(String name, int score) {
			this.name = name;
			this.score = score;
		}

		public HighScoreRecord(String record) throws ScoreFormatException {
			int index = record.indexOf(":");
			if (index < 0)
				throw new ScoreFormatException(1);
			for (int i = index + 1; i < record.length(); i++) {
				if ("0123456789".indexOf(record.substring(i, i + 1)) < 0)
					throw new ScoreFormatException(0);
			}
			this.name = record.substring(0, index);
			this.score = Integer.parseInt(record.substring(index + 1));
		}

		public String getRecord() {
			return name.trim() + ":" + score;
		}

		public String getName() {
			return name;
		}

		public String getScore() {
			String score = "" + this.score;
			int a = score.length() % 3;
			if (a == 0)
				a = 3;
			String score2 = score.substring(0, a) + ",";
			for (int i = a; i < score.length(); i += 3) {
				if (i + 3 == score.length())
					score2 += score.substring(i, i + 3);
				else
					score2 += score.substring(i, i + 3) + ",";
			}
			return score2;
		}

		private static String[] defaultRecord() {
			return new String[] { "A:90000", "B:75000", "C:60000", "D:52000",
					"E:45000" };
		}

		@Override
		public int compareTo(HighScoreRecord o) {
			if (this.score > o.score)
				return -1;
			else if (this.score < o.score)
				return 1;
			return 0;
		}
	}

	private static HighScoreRecord[] highScoreRecord = null;
	private static String readFileName = "highscore";
	private static String message = "";
	private static boolean add = false;

	public static void checkScore(int score) {
		if (!loadHighScore() || highScoreRecord == null) {
			JOptionPane.showMessageDialog(null, "Error loading highscore.",
					"Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
		int index = highScoreRecord.length;
		for (int i = 0; i < highScoreRecord.length; i++) {
			if (score > highScoreRecord[i].score) {
				index = i;
				break;
			}
		}

		if (index >= highScoreRecord.length) {
			message = "Your score is " + score + ".";
			add = false;

		} else {
			add = true;
			for (int i = highScoreRecord.length - 1; i >= index + 1; i--) {
				highScoreRecord[i] = highScoreRecord[i - 1];
			}
			message = "Congratulation, your rank is " + (index + 1) + ".";
		}
	}

	public static void recordHighScore(int score) {
		if (!loadHighScore() || highScoreRecord == null) {
			return;
		}
		int index = highScoreRecord.length;
		for (int i = 0; i < highScoreRecord.length; i++) {
			if (score > highScoreRecord[i].score) {
				index = i;
				break;
			}
		}
		if (isAdd()) {
			for (int i = highScoreRecord.length - 1; i >= index + 1; i--) {
				highScoreRecord[i] = highScoreRecord[i - 1];
			}
			String in = GameOver.getText();
			highScoreRecord[index] = new HighScoreRecord(in, score);
			try {
				BufferedWriter out = new BufferedWriter(new FileWriter(
						"highscore"));
				String write = "";
				for (int i = 0; i < highScoreRecord.length; i++) {
					write += highScoreRecord[i].getRecord() + "\n";
				}
				out.write(write);
				out.close();
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null, "Error saving high score.",
						"Error", JOptionPane.ERROR_MESSAGE);
				highScoreRecord = null;
				return;
			}
		}
	}

	public static String getMessage() {
		return message;
	}

	public static boolean isAdd() {
		return add;
	}

	public static void displayTop5() {
		if (!loadHighScore() || highScoreRecord == null) {
			JOptionPane.showMessageDialog(null, "Error loading highscore.",
					"Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
	}

	private static boolean loadHighScore() {
		File f = new File(readFileName);
		if (!f.exists()) {
			if (!createDefaultScoreFile())
				return false;
		}
		if (!readAndParseScoreFile(f)) {
			f.delete();
			if (!createDefaultScoreFile())
				return false;
			return readAndParseScoreFile(f);
		}
		return true;

	}

	private static boolean readAndParseScoreFile(File f) {
		try {
			BufferedReader in = new BufferedReader(new FileReader(f));
			highScoreRecord = new HighScoreRecord[5];
			String str = "";
			int c;
			while ((c = in.read()) != -1) {
				str += (char) c;
			}
			in.close();
			String[] records = str.split("\n");
			for (int i = 0; i < highScoreRecord.length; i++) {
				try {
					highScoreRecord[i] = new HighScoreRecord(records[i]);
				} catch (ScoreFormatException e) {
					System.err.println("Error parsing line " + (i + 1) + ", "
							+ e.getMessage());
					highScoreRecord[i] = new HighScoreRecord("ERROR_RECORD", 0);
				}
			}
			Arrays.sort(highScoreRecord);
			return true;
		} catch (Exception e) {
			highScoreRecord = null;
		}
		return false;
	}

	private static boolean createDefaultScoreFile() {
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("highscore"));
			String str = "";
			for (String s : HighScoreRecord.defaultRecord()) {
				str += s + "\n";
			}
			str = str.trim();
			out.write(str);
			out.close();
			return true;
		} catch (IOException e1) {
			highScoreRecord = null;
			return false;
		}
	}

	public static void setReadFileName(String name) {
		readFileName = name;
	}

	public static HighScoreRecord[] getHighScoreRecord() {
		return highScoreRecord;
	}

}
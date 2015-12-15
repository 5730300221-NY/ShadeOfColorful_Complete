package render;

public class ScoreParsingException extends Exception {
	private int errorType;

	public ScoreParsingException(int errorType) {
		this.errorType = errorType;
	}

	@Override
	public String getMessage() {
		String message = "";
		if (this.errorType == 0)
			message = "No record score";
		if (this.errorType == 1)
			message = "Wrong record format";
		return message;
	}
}

package checkers.backend.configuration;

public enum GameType {
	INTERNATIONAL(10, 20), //not available option
	CLASSIC(8, 12);

	private int boardSize;
	private int pawnQuantity;

	private GameType(int boardSize, int pawnQuantity) {
		this.boardSize = boardSize;
		this.pawnQuantity = pawnQuantity;
	}

	public int getBoardSize() {
		return boardSize;
	}

	public int getPawnQuantity() {
		return pawnQuantity;
	}

}

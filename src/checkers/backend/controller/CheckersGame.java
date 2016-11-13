package checkers.backend.controller;

import checkers.backend.configuration.GameType;
import checkers.backend.model.Checkers;
import checkers.backend.model.board.StartPoint;

public class CheckersGame {
	private Checkers checkers;

	public CheckersGame(GameType gameType) {
		super();
		this.checkers = new Checkers(gameType.getBoardSize(), gameType.getPawnQuantity());
	}
	
	public void placePawnsOnBoard(GameType gameType) {
		//TODO
		//parse from mat(screen view)
		checkers.getBoard().placePawns(checkers.getWhitePawns(), gameType, StartPoint.BOTTOM);
		checkers.getBoard().placePawns(checkers.getBlackPawns(), gameType, StartPoint.TOP);
	}

	public Checkers getCheckers() {
		return checkers;
	}
	
	
	
}

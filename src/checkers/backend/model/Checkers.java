package checkers.backend.model;

import java.util.ArrayList;
import java.util.List;

import checkers.backend.model.board.Board;
import checkers.backend.model.pawn.Colour;
import checkers.backend.model.pawn.Pawn;
import checkers.backend.model.pawn.State;

public class Checkers {
	private Board board;
	private List<Pawn> whitePawns;
	private List<Pawn> blackPawns;

	public Checkers(int size, int pawnQuantity) {
		super();
		initBoard(size);
		initPawns(pawnQuantity);
	}

	private void initBoard(int size) {
		this.board = new Board(size);
	}

	private void initPawns(int pawnQuantity) {
		this.whitePawns = createBatch(pawnQuantity, Colour.WHITE);
		this.blackPawns = createBatch(pawnQuantity, Colour.BLACK);
	}

	private ArrayList<Pawn> createBatch(int pawnQuantity, Colour colour) {
		ArrayList<Pawn> batchPawns = new ArrayList<>();
		for (int i = 0; i < pawnQuantity; i++) {
			Pawn pawn = new Pawn(colour, State.ALIVE);
			batchPawns.add(pawn);
		}
		return batchPawns;
	}

	public Board getBoard() {
		return board;
	}

	public List<Pawn> getWhitePawns() {
		return whitePawns;
	}

	public List<Pawn> getBlackPawns() {
		return blackPawns;
	}

}

package checkers.backend.model.board;

import java.util.List;

import checkers.backend.configuration.GameType;
import checkers.backend.model.field.Field;
import checkers.backend.model.pawn.Pawn;

public class Board {
	private int size;
	private Field[][] fields;

	public Board(int size) {
		super();
		this.size = size;
		initFields(size); // board with fields size x size
	}

	public void initFields(int size) {
		fields = new Field[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				fields[i][j] = new Field();
			}
		}
	}

	public int getSize() {
		return size;
	}

	public Field[][] getFields() {
		return fields;
	}

	public void placePawns(List<Pawn> pawns, GameType gameType, StartPoint startPoint) {
		int xIndex = checkAxisXStartIndex(gameType, startPoint);
		int yIndex = checkAxisYStartIndex(gameType, startPoint);
		for (Pawn pawn : pawns) {
			fields[xIndex][yIndex].setPawn(pawn);
			xIndex = iterateXIndex(xIndex, yIndex);
			yIndex = iterateYIndex(xIndex, yIndex);		
		}
	}

	private int checkAxisXStartIndex(GameType gameType, StartPoint startPoint) {
		if (startPoint == StartPoint.BOTTOM) {
			return AxisX.X1.ordinal();
		} else { // start point from top
			return AxisX.X6.ordinal();
		}
	}

	private int checkAxisYStartIndex(GameType gameType, StartPoint startPoint) {
		if (startPoint == StartPoint.BOTTOM) {
			return AxisY.A.ordinal();
		} else { // start point from top
			return AxisY.B.ordinal();
		}
	}
	
	private boolean isNextRow(int yIndex) {
		int iterateValue = 2;
		if((yIndex + iterateValue) >= size) {
			return true;
		} else {
			return false;
		}
	}
	
	private int iterateXIndex(int xIndex, int yIndex) {
		if(isNextRow(yIndex)) {
			return ++xIndex;
		}
		return xIndex;
	}
	
	private int iterateYIndex(int xIndex, int yIndex) {
		int iterateValue = 2;
		if(isNextRow(yIndex)) {
			return (xIndex % 2);
		} else {
			return yIndex + iterateValue;
		}
	}
}

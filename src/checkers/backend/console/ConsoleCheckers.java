package checkers.backend.console;

import checkers.backend.configuration.GameType;
import checkers.backend.controller.CheckersGame;
import checkers.backend.model.board.AxisX;
import checkers.backend.model.board.AxisY;
import checkers.backend.model.field.Field;
/**
 * 
 * @author Neo
 * Test class for backend logic
 */
public class ConsoleCheckers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckersGame cg = new CheckersGame(GameType.CLASSIC);
		cg.placePawnsOnBoard(GameType.CLASSIC);
		
		printBoard(cg);
	}
	
	private static void printBoard(CheckersGame checkersGame) {
		Field[][] board = checkersGame.getCheckers().getBoard().getFields();
		AxisX[] x = AxisX.values();
		
		for(int i = 0; i < 8; i++) {
			System.out.print(x[i].getLabel() + "| ");
			for(int j = 0; j < 8; j++) {
				Field field = board[i][j];
				if(field.isPawn()) {
					System.out.print(board[i][j].getPawn().getColour().getName() + " ");
				} else {
					System.out.print("_____ ");
				}
				
			}
			System.out.println("");
		}
		System.out.print(" |________________________________________________\n   ");
		for(AxisY y: AxisY.values()) {
			System.out.print("  " + y.getLabel() + "   ");
		}
	}
}

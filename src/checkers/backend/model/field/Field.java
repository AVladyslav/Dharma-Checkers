package checkers.backend.model.field;

import checkers.backend.model.pawn.Pawn;

public class Field {
	private Pawn pawn;
	
	public boolean isPawn() {
		if(pawn != null) {
			return true;
		} else {
			return false;
		}
	}

	public Pawn getPawn() {
		return pawn;
	}

	public void setPawn(Pawn pawn) {
		this.pawn = pawn;		//TODO only alive pawns
	}
	
}

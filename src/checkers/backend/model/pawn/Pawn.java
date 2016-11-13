package checkers.backend.model.pawn;

public class Pawn {
	private Colour colour;
	private State state;

	public Pawn(Colour colour, State state) {
		super();
		this.colour = colour;
		this.state = state;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Colour getColour() {
		return colour;
	}
	
}

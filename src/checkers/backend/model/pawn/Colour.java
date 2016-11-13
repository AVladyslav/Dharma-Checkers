package checkers.backend.model.pawn;

public enum Colour {
	WHITE("white"),
	BLACK("black");
	
	private final String name;

	private Colour(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	
}

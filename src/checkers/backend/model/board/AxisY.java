package checkers.backend.model.board;

public enum AxisY {
	A("A"),
	B("B"),
	C("C"),
	D("D"),
	E("E"),
	F("F"),
	G("G"),
	H("H");
	
	private final String label;

	private AxisY(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
	
}

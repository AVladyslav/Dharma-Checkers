package checkers.backend.model.board;

public enum AxisX {
	X1("1"),
	X2("2"),
	X3("3"),
	X4("4"),
	X5("5"),
	X6("6"),
	X7("7"),
	X8("8");
	
	private final String label;

	private AxisX(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
	
}

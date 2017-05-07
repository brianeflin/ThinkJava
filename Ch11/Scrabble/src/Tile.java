
public class Tile {

	private char letter;
	private int value;
	
	public Tile(char letter, int value) {
		this.letter = letter;
		this.value = value;
	}

	public char getLetter() {
		return letter;
	}

	public void setLetter(char letter) {
		this.letter = letter;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public boolean equals(Tile tile2){
		return this.letter == tile2.letter &&
				this.value == tile2.value;
	}

	public String toString() {
		return String.format("%c(%d)\n", this.letter, this.value);
	}
	
	public static void printTile(Tile tile) {
		System.out.printf("%c(%d)\n", tile.getLetter(), tile.getValue());
	}
	
	public static void testTile() {
		Tile tile = new Tile('Z', 10);
		printTile(tile);
	}
}

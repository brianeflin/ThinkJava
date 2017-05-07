
public class Main {

	public static void main(String[] args) {
		Tile.testTile();
		
		Tile tile1 = new Tile('A', 2);
		Tile tile2 = new Tile('A', 3);
		Tile.printTile(tile1);
		Tile.printTile(tile2);
		System.out.println(tile1.equals(tile2));
		
		Tile tile3 = new Tile('B', 2);
		Tile.printTile(tile1);
		Tile.printTile(tile3);
		System.out.println(tile1.equals(tile3));
		
		Tile tile4 = new Tile('B', 2);
		Tile.printTile(tile3);
		Tile.printTile(tile4);
		System.out.println(tile3.equals(tile4));
	}
}

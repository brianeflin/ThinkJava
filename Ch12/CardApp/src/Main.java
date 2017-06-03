
public class Main {

	public static void main(String[] args) {
		
		Card card = new Card(11, 1);
		System.out.println(card);
	}

	private static Card[] makeDeck() {
		Card[] cards = new Card[52];
		int index = 0;
		for (int suit = 0; suit < 4; suit++) {
			for (int rank = 1; rank < 14; rank++) {
				cards[index] = new Card(rank, suit);
				index++;
			}
		}
		return cards;
	}
}

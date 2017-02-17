public class finalProjectDriver 
{
	//hi?
		public static void main(String[] args) 
		{
			boolean stillPlaying = true;
			Card.generateCards();
//				while(stillPlaying = true)
//					{
			for (Card v:Card.cardDeck);
				{
					for(int i =0;i<6;i++)
						{
							for(int j =0;j<4;j++)
								{
									Board.board [i] [j] = Card.cardDeck.get(0);
									Card.cardDeck.remove(0);
								}
						}
				}
			Board.printBoard();
			Game.runGame();
				//	}
		}
}
//jello?
import java.util.Collections;

public class Board 
{
	static Card [][]board = new Card [6][4];
	
	public static int column;
	{
		
	printBoard();
	}
	public static void printBoard()
	{
		
		
		Collections.shuffle(Card.cardDeck);
		System.out.println("Here are the cards:");
		
			for (Card v:Card.cardDeck);
		{

			for(int i =0;i<6;i++)
				{
					System.out.print((i+1)+" ");
					for(int j =0;j<4;j++)
						{
							//prints the board
							
							System.out.print(board[i] [j].getA()+" ");
						}
					System.out.println();
				}
		}
		
		
		
	}
		//one

	public static void printBoardSpecial()
	{
	
		
		Collections.shuffle(Card.cardDeck);
		System.out.println("Here are the cards:");
		
			for (Card v:Card.cardDeck);
		{

			for(int i =0;i<6;i++)
				{
					System.out.print((i+1)+" ");

					for(int j =0;j<4;j++)
						{
							//prints the board
							System.out.print(board[i] [j].getName()+" ");
						}
					System.out.println();
				}
		}
		
		
}
}

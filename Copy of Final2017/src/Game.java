import java.util.Scanner;

public class Game 
{
	//hello?
	static int row1;
	static int column1;
	static int row2;
	static int column2;

public static void runGame()
	{
	System.out.println("code:");
	System.out.println("(input anything)");
	Scanner userInput100 = new Scanner(System.in);
	String code= userInput100.nextLine();
	//doesn't work , i don't know why
	if(code.equals("marie"));
		{
		Board.printBoardSpecial();
		}
	
	
	printGame();
	
	}
	public static void printGame()
	{
		boolean stillPlaying = true;
		while(stillPlaying)
			{
//		System.out.println("Pick cards with the same value.(Enter the coordinates. Example:(21))");
		for (Card v:Card.cardDeck);
		System.out.println("first card:");
		Scanner userInput1 = new Scanner(System.in);
		String firstCard= userInput1.nextLine();
		row1 = Integer.parseInt(firstCard.substring(0, 1))-1;
		column1 = Integer.parseInt(firstCard.substring(1)) -1;//-1	
		if(row1 >6)
			{
			row1 = 6;
			}
		System.out.println("second card:");

		Scanner userInput2 = new Scanner(System.in);
		String secondCard= userInput2.nextLine();
		row2 = Integer.parseInt(secondCard.substring(0, 1))-1;
		column2 = Integer.parseInt(secondCard.substring(1)) -1;//-1
		
		Board.board[row1][column1].setA(Board.board[row1][column1].getName());
		Board.board[row2][column2].setA(Board.board[row2][column2].getName());
		System.out.println(Board.board[row1][column1].getName()+", is your first card and "+Board.board[row2][column2].getName()+" is your second card.");

		Board.printBoard();
		
		try {
			  Thread.sleep(10000);
			} catch (InterruptedException ie) {
			}
		
		
		
		Board.board[row1][column1].setA(" ----- ");
		Board.board[row2][column2].setA(" ----- ");
		System.out.println("");
		Board.printBoard();
		if(Board.board[row1][column1].getName().equals(Board.board[row2][column2].getName()))
		{
			System.out.println("Good Job! You got a match!");
			System.out.println("Enter YES to keep playing");
			
			Scanner userInput9 = new Scanner(System.in);
			String keepPlaying= userInput2.nextLine();
			if(keepPlaying.equals("YES"))
			{
				System.out.println("ok, try to get another match");
			}
			else
			{
				System.out.println("Ok. Goodbye.");
				stillPlaying = false;
			}
		}

	}
	}
}
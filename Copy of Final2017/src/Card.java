//yellow?
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Card
{
	public String player;
	private String name;
	private int value;
	private String a;
	static ArrayList <Card> cardDeck = new <Card>ArrayList();
	public Card(String n, int v, String k)
{
	name=n;
	value=v;
	a=k;
}

public static void generateCards()
{
	System.out.println("Which cards would you like to use?");
	System.out.println("cards with fruits on them (f)");
	System.out.println("cards with animals on them (a)");
	System.out.println("or you can have cards with whatever you want on them (?)");
	Scanner userInput7 = new Scanner(System.in);
	String choice= userInput7.nextLine();
	if(choice.equals("a"))
		{
	addAnimals();
		}
	if(choice.equals("f"))
		{
	addFruits();	
		}
	if(choice.equals("?"))
		{
			addNewCards();
		}

}
	public static void addAnimals()
	{
		//ok
		String s = " ----- ";
		cardDeck.add(new Card ("cat    ", 2, s));
		cardDeck.add(new Card ("dog    ",3 , s));
		cardDeck.add(new Card ("hippo  ", 4, s));
		cardDeck.add(new Card ("panda  ", 5, s));
		cardDeck.add(new Card ("fish   ", 6, s));
		cardDeck.add(new Card ("snake  ", 7, s));
		cardDeck.add(new Card ("pig    ", 8, s));
		cardDeck.add(new Card ("owl    ", 9, s));
		cardDeck.add(new Card ("monkey ", 10,s));
		cardDeck.add(new Card ("rabbit ", 11,s));
		cardDeck.add(new Card ("frog   ", 12,s));
		cardDeck.add(new Card ("lion   ", 13,s));
	
	cardDeck.add(new Card ("cat    ", 2, s));
	cardDeck.add(new Card ("dog    ",3 , s));
	cardDeck.add(new Card ("hippo  ", 4, s));
	cardDeck.add(new Card ("panda  ", 5, s));
	cardDeck.add(new Card ("fish   ", 6, s));
	cardDeck.add(new Card ("snake  ", 7, s));
	cardDeck.add(new Card ("pig    ", 8, s));
	cardDeck.add(new Card ("owl    ", 9, s));
	cardDeck.add(new Card ("monkey ", 10,s));
	cardDeck.add(new Card ("rabbit ", 11,s));
	cardDeck.add(new Card ("frog   ", 12,s));
	cardDeck.add(new Card ("lion   ", 13,s));
	Collections.shuffle(cardDeck);
	}

public static void addFruits()
	{
	String s = " ----- ";
	                           
		cardDeck.add(new Card ("apple  ", 2, s));
		cardDeck.add(new Card ("bananna",3 , s));
		cardDeck.add(new Card ("grapes ", 4, s));
		cardDeck.add(new Card ("pear   ", 5, s));
		cardDeck.add(new Card ("peach  ", 6, s));
		cardDeck.add(new Card ("cherry ", 7, s));
		cardDeck.add(new Card ("mango  ", 8, s));
		cardDeck.add(new Card ("orange ", 9, s));
		cardDeck.add(new Card ("melon  ", 10, s));
		cardDeck.add(new Card ("apricot", 11, s));
		cardDeck.add(new Card ("plum   ", 12, s));
		cardDeck.add(new Card ("lemon  ", 13, s));
		
		cardDeck.add(new Card ("apple  ", 2, s));
		cardDeck.add(new Card ("bananna",3 , s));
		cardDeck.add(new Card ("grapes ", 4, s));
		cardDeck.add(new Card ("pear   ", 5, s));
		cardDeck.add(new Card ("peach  ", 6, s));
		cardDeck.add(new Card ("cherry ", 7, s));
		cardDeck.add(new Card ("mango  ", 8, s));
		cardDeck.add(new Card ("orange ", 9, s));
		cardDeck.add(new Card ("melon  ", 10, s));
		cardDeck.add(new Card ("apricot", 11, s));
		cardDeck.add(new Card ("plum   ", 12, s));
		cardDeck.add(new Card ("lemon  ", 13, s));
		Collections.shuffle(cardDeck);
}
public static void addNewCards()
{
	System.out.println("input 24 words and they will be made into cards");
	for(int i = 0; i<24; i++)
		{
			Scanner userInput7 = new Scanner(System.in);
			String userCard= userInput7.nextLine();
			cardDeck.add(new Card (userCard, 1, "-------"));

		}
}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public static ArrayList<Card> getCardDeck() {
		return cardDeck;
	}

	public static void setCardDeck(ArrayList<Card> cardDeck) {
		Card.cardDeck = cardDeck;
	}
	
}
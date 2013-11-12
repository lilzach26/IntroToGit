import java.util.Random;

//Zach LaVigne
//10/7/13  110

/**
Card class creates objects that represent individual cards in a standard 52 
card deck. Cards containing the same rank will be considered equal. The cards
will be immutable objects.
*/
public class Card
{
   //Declare fields and constants
   private int rank, suit;
   public static int SPADES=1, CLUBS=2, HEARTS=3, DIAMONDS=4, ACE=1, JACK=11, QUEEN=12, KING=13;
   
   //Define methods
   
   /**
   Constructor creates a card given a suit and a rank
   @parems int representing the suit, int representing the rank
   */
   public Card(int rank, int suit)
   {
      if(rank >= 1 && rank <= 13)
         this.rank = rank;
      else
      {
         Random rankGenerator = new Random();
         this.rank = rankGenerator.nextInt(13)+1;
      }
      
      if(suit >= 1 && suit <= 4)
         this.suit = suit;
      else 
      {
         Random suitGenerator = new Random();
         this.suit = suitGenerator.nextInt(4)+1;
      }
   }
   
   /**
   getRank method returns the rank of a Card object
   @returns String representing the rank of the card
   */
   public int getRank()
   {
      if(rank >= 1 && rank <= 13)
         return rank;
      else
         return -1;
   }
   
   /**
   getSuit returns the suit of a card object
   @returns String representing the suit of the card
   */
   public int getSuit()
   {
      if(suit >= 1 && suit <= 4)
         return suit;
      else 
         return -1;
   }
   
   /**
   toString method displays the card as one would name it aloud
   @returns String containing the rank and suit of the card
   */
   public String toString()
   {
      String rankString, suitString, cardString;
      
      if(rank >= 2 && rank <= 10)
         rankString = Integer.toString(rank);
      else if(rank == Card.ACE)
         rankString = "Ace";
      else if(rank == Card.JACK)
         rankString = "Jack";
      else if(rank == Card.QUEEN)
         rankString = "Queen";
      else if(rank == Card.KING)
         rankString = "King"; 
      else 
         rankString = "Error";
      
      switch(suit)
      {
         case 1:
            suitString = "Spades";
            break;
         case 2:
            suitString = "Clubs";
            break;
         case 3:
            suitString = "Hearts";
            break;
         case 4:
            suitString = "Diamonds";
            break;
         default: 
            suitString = "Error";
            break;
      }
      
      cardString = rankString + "of" + suitString;
      return cardString;
      
      //Add code
      System.out.println("Test for changes");
   }
}
package cards;

public class DeckOfCardsTest
{
   // execute application
   public static void main( String args[] )
   {
      DeckOfCards myDeckOfCards = new DeckOfCards();
      myDeckOfCards.shuffle(); // place Cards in random order


      //deal 2 hands
      Card[] leftHand = myDeckOfCards.dealHand();
      Card[] rightHand = myDeckOfCards.dealHand();

      System.out.printf( "%-20s%-20s\n", "Left hand: ", "Right hand ");
              // print all 52 Cards in the order in which they are dealt
      for ( int i = 0; i < leftHand.length; i++ )
      {
         System.out.printf( "%-20s%-20s\n", leftHand[i], rightHand[i]);

      } // end for
      int couplesLeft = myDeckOfCards.couples(leftHand);
      int couplesRight = myDeckOfCards.couples(rightHand);
      if(myDeckOfCards.pair(couplesLeft)){
         System.out.println("Left hand has a pair");
      }

      if(myDeckOfCards.pair(couplesRight)){
         System.out.println("Right hand has a pair");
      }


   } // end main
} // end class DeckOfCardsTest


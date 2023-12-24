
package cs1.OOPBlackJackApp;

import  cs1.app.*;
import java.util.ArrayList;

public class Deck
{
    //data members
    private ArrayList<Card> cardsList;
    
    //constructor
    public Deck()
    {
        cardsList = new ArrayList<Card>();
        
        for( int i = 1; i <= 13; i++ )
        {
            for( int j = 1; j <= 4; j++ )
            {
                Card card1 = new Card( i * 10 + j );
                cardsList.add( card1 );   
            }
        }     
    }
    
    //methods
    public Card deal()
    {
        Card card = cardsList.remove( cardsList.size() - 1 );
        return card;
    }
    
    public void shuffle()
    {
        for( int i = 0; i < ( cardsList.size() / 2 ); i++ )
        {
            int randomNumber = canvas.getRandomInt( 0, cardsList.size() - 1 );
            int nextRandomNumber = canvas.getRandomInt( 0, cardsList.size() - 1 );

            Card card = cardsList.get( randomNumber );
            cardsList.set( randomNumber, cardsList.get( nextRandomNumber ) );
            cardsList.set( nextRandomNumber, card );
        }
    }
    
    public void draw( double y )
    {
        double x = 40;
        for( int i = 0; i < cardsList.size(); i++ )
        {
            cardsList.get( i ).draw( x, y );
            x += 10;
        }
    }
    
    public static void main( String[] args )
    {
        Deck deck = new Deck();
        
        Card card = deck.deal();
        
        System.out.println( card.getName() );
        System.out.println( card.getPoints() );
        System.out.println( card.getRank() );      
    }
}
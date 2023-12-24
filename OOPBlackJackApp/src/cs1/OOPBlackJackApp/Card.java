
package cs1.OOPBlackJackApp;

import  cs1.app.*;

public class Card
{
    //data members
    private int rank;
    private int suit;
    private int points;
    private String fileName;
    
    //constructor
    public Card( int initNumber )
    {
        rank = (initNumber / 10) - 1;
        suit = initNumber % 10;
        
        if( rank >= 10 )
        {
            points = 10;
        }
        else
        {
            points = rank + 1;
        }
        
        fileName = "card" + initNumber + ".png";
    }
    
    //methods
    public int getPoints( )
    {
        return points;
    }
    
    public double getWidth()
    {
        return 71;
    }
    
    public double getHeight()
    {
        return 96;
    }
    
    public void draw( double x, double y )
    {
        canvas.drawImage( x, y, fileName );
    }
    
    public String getRank( )
    {
        String[] cardName = { "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
        return cardName[ rank ];
    }
    
    public String getSuit( )
    {
        String name = "";
        
        switch( suit )
        {
            case 1:
                name =  "Clubs";
                break;
            case 2:
                name = "Diamonds";
                break;
            case 3:
                name = "Hearts";
                break;
            case 4:
                name = "Spades";
                break;
            default:
                name = "Error";
                break;
        }
        return name;
    }
    
    public String getName()
    {
        return getRank() + " of " + getSuit();
    }
    
    public static void main(String[] args)
    {
        Card card1 = new Card( 84 );
        
        System.out.println( "card rank : " + card1.getRank() );      
        System.out.println( "card suit : " + card1.getSuit() );      
        System.out.println( "card name : " + card1.getName() );      
        System.out.println( "card points : " + card1.getPoints() );    
        System.out.println( "card width : " + card1.getWidth() );    
        System.out.println( "card height: " + card1.getHeight() );   
    }
}

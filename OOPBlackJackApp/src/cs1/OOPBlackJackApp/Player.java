
package cs1.OOPBlackJackApp;

import  cs1.app.*;

public class Player
{
    //data members
    private String name;
    private int points;
    private boolean active;
    private Card lastCard;
    
    //constructor
    public Player( String initName )
    {
        name = initName;
        points = 0;
        active = true;
        lastCard = new Card (0);
    }
    
    //methods
    public String getName()
    {
        return name;
    }
    
    int getPoints()
    {
        return points;
    }
    
    boolean isActive()
    {
        return active;
    }
    
    void stopPlaying()
    {
        active = false;
    }
    
    void collectCard( Card card )
    {
        if ( active == true )
        {
            lastCard = card;
            points += card.getPoints();
            
            if ( points >= 21 )
            {
                active = false;
            }
        }
    }
    
    public void draw( double x, double y )
    {
        String color;
        
        if( active == true )
        {
            color = "blue";
        }
        else
        {
            color = "red";
        }
        
        lastCard.draw( x, y );
        canvas.drawSquare( x, y, 22, "black" );
        canvas.drawSquare( x, y, 20, "white" );
        canvas.drawText( x, y, points, color );
        
        canvas.drawText( x, y + 55, name, "black" );
    }
    
    public static void main( String[] args ) 
    {
        Player mickey = new Player( "Mickey" );
        
        System.out.println( "player name: " + mickey.getName( ) );      // Mickey
        System.out.println( "player points: " + mickey.getPoints() );  // 0
        System.out.println( "player active: " + mickey.isActive () );   // true

        Card card1 = new Card( 64 );
        mickey.collectCard( card1 );
        
        System.out.println( "player name: " + mickey.getName( ) );      
        System.out.println( "player points: " + mickey.getPoints() );  
        System.out.println( "player active: " + mickey.isActive () );  
        
        Player minnie = new Player( "Minnie" );
        Card card2 = new Card( 104 );
        minnie.collectCard( card2 );
        
        System.out.println( "player name: " + minnie.getName( ) );      
        System.out.println( "player points: " + minnie.getPoints() );  
        System.out.println( "player active: " + minnie.isActive () ); 
        
        minnie.stopPlaying();
        
        System.out.println( "player name: " + minnie.getName( ) );      
        System.out.println( "player points: " + minnie.getPoints() );  
        System.out.println( "player active: " + minnie.isActive () ); 
    }
}

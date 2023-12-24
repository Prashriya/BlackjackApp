
package cs1.OOPBlackJackApp;

import  cs1.app.*;
import java.util.ArrayList;

public class Casino
{
    //data members
    private ArrayList<Player> playersList;
    
    //constructors
    public Casino()
    {
        playersList = new ArrayList<Player>();
    }
    
    public void add( Player player )
    {
        playersList.add( player );
    }
    
    public boolean hasActive()
    {
        if( playersList.size() > 0 )
        {
            for( int i = 0; i < playersList.size(); i++ )
            {
                if(playersList.get(i).isActive() == true )
                {
                    return true;
                }
            }
        }
        return false;
    }
    
    public void drawPlayers()
    {
        double positionX = canvas.getWidth() / ( playersList.size() * 2 );
        double positionY = ( 1.0 * canvas.getHeight() / 6.0 );
        
        for( int i = 0; i < playersList.size(); i++ )
        {
            playersList.get( i ).draw( positionX, positionY );
            
            positionX = positionX + ( canvas.getWidth() / playersList.size() );
        }
    }
    
    public void playGame()
    {
        Deck deck = new Deck();
        deck.shuffle();
        
        int curPlayer = 0;
        
        Player prash = new Player( "Prash" );
        add( prash );
        
        Player ram = new Player( "Ram" );
        add( ram );
        
        Player sita = new Player( "Sita" );
        add( sita );
        
        Player krish = new Player( "Krish" );
        add( krish );
        
        Player devi = new Player( "Devi" );
        add( devi );

        while( hasActive() == true )
        {  
            drawPlayers();
            deck.draw( 200 );
            
            if( playersList.get( curPlayer ).isActive() == true )
            {
                Touch touch = canvas.waitForTouch();
                int touchX = touch.getX();
                int numberOfTaps = touch.getTaps();
            
                if( numberOfTaps == 2 )
                {
                    playersList.get( curPlayer ).stopPlaying();
                }
                else
                {
                    Card card = deck.deal();
                    playersList.get( curPlayer ).collectCard(card);
                } 
            }
            curPlayer = ( curPlayer + 1 ) % playersList.size();
        }
        drawPlayers();
        deck.draw( 200 );
        
        canvas.sleep( 1 );
        canvas.clear();
        
        canvas.drawText( canvas.getWidth() / 2, canvas.getHeight() / 2, "Game Over!", "red" );
    }
}
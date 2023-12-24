
package cs1.OOPBlackJackApp;

import  cs1.app.*;

public class OOPBlackJackApp
{
    public void run()
    {
        canvas.setLandscape();
//        Card card1 = new Card( 84 );       
//        card1.draw( 80, 100 );
//        
//        Player mickey = new Player( "Mickey");
//        mickey.draw( 80, 100 );
//
//        Card card1 = new Card( 113 );
//        mickey.collectCard( card1 );
//        mickey.draw( 200, 100 );
        
//        Player mickey = new Player( "Mickey");
//        Card card1 = new Card( 84 );
//        mickey.collectCard( card1 );
//        mickey.draw( 50, 70 );
//        
//        Player minnie = new Player( "Minnie");
//        Card card2 = new Card( 111 );
//        minnie.collectCard( card2 );
//        minnie.draw( 150, 200 );
//        
//        Player tom = new Player( "Tom");
//        Card card3 = new Card( 133 );
//        tom.collectCard( card3 );
//        tom.draw( 300, 90 );
//        
//        Player jerry = new Player( "Jerry");
//        Card card4 = new Card( 0 );
//        jerry.collectCard( card4 );
//        jerry.draw( 420, 140 );
//
//        Deck deck = new Deck();
//        deck.shuffle();
//        deck.draw( 55 );    // assuming no cards dealt from deck
//        Card card = deck.deal( );
//        
//        System.out.println( "points: " + card.getPoints( ) );      
//        System.out.println( "rank: " + card.getRank() ); 
//        
//        Casino casino = new Casino();
//        Player prash = new Player( "Prash" );
//        casino.add( prash );
//        
//        Player ram = new Player("Ram");
//        casino.add(ram);
//        
//        Player sita = new Player( "Sita" );
//        casino.add(sita);
//        casino.drawPlayers();
        
        Casino casino = new Casino();
        casino.playGame();
    }
}
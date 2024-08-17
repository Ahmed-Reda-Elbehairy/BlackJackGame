
package blackjack;


public class Card {
    private final int suit ;
    private final int rank ;
    private final int value;
    
    public Card (int s , int r , int v) {
      
        suit=s;
        rank=r;
        value=v;
        
    } 
    public Card ( Card C) {
        
        this.rank = C.rank ;
        this.suit = C.suit;
        this.value = C.value ;
        
    }   

    Card() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    public int getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    public int getValue() {
        return value;
    }
    

    
    
}

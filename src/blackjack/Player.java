/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;


public class Player {
    Card[]player_cards=new Card[11];
    private String name ;
    private int Score = 0 ;
    boolean blackjack = false ;
    boolean win = false ;
    boolean busted = false ;
     
    
    
    
     
    
     

    public int getScore() {
        return Score;
    }
    

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int Score) {
        this.Score = Score;
    }


    
}

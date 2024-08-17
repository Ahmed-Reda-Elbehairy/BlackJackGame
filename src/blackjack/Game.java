
package blackjack;
import java.util.Random ;
import java.util.Scanner ;
public class Game {
    
    Scanner input = new Scanner(System.in);
    Random rand = new Random ();
    Player[]players = new Player[4];
    
    Card[]cards=new Card[52];
     static int maximumscore ;
  
    void generatingCards (){
    for (int i = 0 ; i < 13 ; i++) 
    {
        int value ;
        int rank = i ;  //to generate ranks from 0 to 12
        if (rank >= 10) {
            value = 10 ; // if the card is picture then the value will be 10
        }
        else {
            value = rank+1 ; // ro generate values from 1 to 10
        }
        cards[i] = new Card (0 ,rank , value) ; // 13 cards with the same suit but different values and ranks
    } 
    
    
    
     for (int i = 13 ; i < 26 ; i++) 
    {
        int value ;
       int rank = i-13 ; //to generate ranks from 0 to 12
        if (rank >= 10) {
            value = 10 ; // if the card is picture then the value will be 10
        }
        else {
            value = rank+1 ; // ro generate values from 1 to 10
        }
        cards[i] = new Card (1 ,rank , value) ; // 13 cards with the same suit but different values and ranks
    }
     
     
     
     
       for (int i = 26 ; i < 39 ; i++) 
    {
        int value ;
        int rank = i-26 ; //to generate ranks from 0 to 12
        if (rank >= 10) {
            value = 10 ; // if the card is picture then the value will be 10
        }
        else {
            value = rank+1 ; // ro generate values from 1 to 10
        }
        cards[i] = new Card (2 ,rank , value) ; // 13 cards with the same suit but different values and ranks
    }
       
       
       
        
         for (int i = 39 ; i < 52 ; i++) 
    {
        int value ;
        int rank = i-39 ; //to generate ranks from 0 to 12
        if (rank >= 10) {
            value = 10 ; // if the card is picture then the value will be 10
        }
        else {
            value = rank+1 ; // ro generate values from 1 to 10
        }
        cards[i] = new Card (3 ,rank , value) ; // 13 cards with the same suit but different values and ranks
    } 
         
         
   }
     Card addCards(){
         Card c;
       while (true){
       int x =rand.nextInt(51); // to generate random numbers between 0 and 51
       if (cards[x]!=null) { 
            c = cards[x] ; // taking the object cards [x] whatever x is in new object c if exists
            
           
       }
       else{continue ;} // if not exists then continue to the next iteration
       cards[x]=null ; // if cards[x] is found then empty that object after having it in c 
       break ; 
       }
       
        return c ; 
     }
     
     
     void setInformationOfThePlayers (){
         for(int j = 0 ; j < 4 ; j++){
         System.out.printf("Enter player %d name" , j+1) ;  // to print the word "player" then the number of the player
         String players_names=input.next();  // taking the name string
         players[j]=new Player();  //instantiating the array of players
         players[j].setName(players_names);  // putting the input in its location 
            for (int k = 0 ; k < 2 ; k++ ) {
                players[j].player_cards[k] = addCards();
                // giving each player two cards while taking their names 
                
            }
         }
     }
    void updateScore(){
        int score0 = 0 , score1=0 , score2 =0 , score3=0 ;
        for (int k = 0 ; k < 11 ; k++) {
            
            if (players[0].player_cards[k]!=null){
            score0 += players[0].player_cards[k].getValue() ; // adding the cards values to player 0 score
            players[0].setScore(score0);
            }
        }
          for (int k = 0 ; k < 11 ; k++) {
             if (players[1].player_cards[k]!=null){
            score1 += players[1].player_cards[k].getValue() ; // adding the cards values to player 1 score
            players[1].setScore(score1);
          } 
          }
            for (int k = 0 ; k < 11 ; k++) {
                 if (players[2].player_cards[k]!=null){
            score2 += players[2].player_cards[k].getValue() ; // adding the cards values to player 2 score
            players[2].setScore(score2); 
            }
            }
              for (int k = 0 ; k < 11 ; k++) {
                   if (players[3].player_cards[k]!=null){
            score3 += players[3].player_cards[k].getValue() ; // adding the cards values to player 3 score
            players[3].setScore(score3);
              }
              }
            
     }
        
           
    int findingMaximumScoooooore() {
        maximumscore = players[0].getScore() ;
        for (int i = 0 ; i < 4 ;i++) {
            if (players[i].getScore() > maximumscore  )
            {
                maximumscore=players[i].getScore();
            }
            
        }
    
    
        return maximumscore;
    }

             
}

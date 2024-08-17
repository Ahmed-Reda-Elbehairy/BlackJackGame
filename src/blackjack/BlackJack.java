
package blackjack;
import java.util.Scanner ;

public class BlackJack {

    
    public static void main(String[] args) {
        
        GUI gui = new GUI();
        int cnt = 0 ;
        int maxscore;
      
        
        Scanner input = new Scanner(System.in);
        Game obj=new Game();
        obj.generatingCards();
        obj.setInformationOfThePlayers();
        
        for(int i = 0 ; i < 3 ; i++) {
            int k = 2 ; 
            System.out.printf("it's player %d turn\n" , i+1) ;
            while (true) {
            System.out.println("1)hit");
            System.out.println("2)stand");
            int answer = input.nextInt();
            if(answer == 1) {
                
                while (k > 11){
                obj.players[i].player_cards[k] = obj.addCards();
                obj.updateScore();
                gui.runGUI( obj.cards, obj.players[0].player_cards, obj.players[1].player_cards,  obj.players[2].player_cards, obj.players[3].player_cards );
                k++ ;
                break ;
                    }
                }
            else {break ;}
            
            }
            
            
        }
        maxscore = obj.findingMaximumScoooooore();
        int k = 2 ;
        while (true){
        if (obj.players[3].getScore()< maxscore) {
            
        
            while (k > 11){
                obj.players[3].player_cards[k] = obj.addCards();
                obj.updateScore();
                k++ ;
                break ;
            
                }
            obj.updateScore();
            maxscore = obj.findingMaximumScoooooore();
            }
        else {break ;}
        }
        maxscore = obj.findingMaximumScoooooore();
        for (int i = 0 ; i < 4 ; i++){
            if (obj.players[i].getScore() > maxscore) {
                
               System.out.printf("player %d wins" , i+1);
               break;
                
            }
            else if (obj.players[i].getScore()==21) {
                
                System.out.printf("player %d is blackjack" , i+1);
                break ;
            }
            else if(obj.players[i].getScore() > 21){
                
                System.out.printf("player %d is busted" , i+1) ;
                break ;
            }
            else {System.out.println("push");
            
           break ;
                   } 
           
    
   
        }
    }
}


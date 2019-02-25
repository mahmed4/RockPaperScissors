import java.util.Scanner; 
import java.util.Random;
public class RockPaperScissorsRevisedAhmed {

	public static void main(String[] args) {
		// Md Ahmed
	        final int ROCK = 1;
	        final int PAPER = 2;
	        final int SCISSOR = 3;
	        final int LIZARD= 4;
	        final int SPOCK = 5;
	        Scanner cen = new Scanner (System.in);;
	        Random rand = new Random();
	        
	        System.out.print("Enter your play: 1 for ROCK, 2 for PAPER, 3 for SCISSOR, 4 for LIZARD, 5 for SPOCK: ");
	        int user = cen.nextInt();
	    
	        int computerRandom = (rand.nextInt(5) +1);
	        String computerValue = "";
	        if (computerRandom == 1){
	        	computerValue = "ROCK";
	        }else if (computerRandom == 2){
	        	computerValue = "PAPER";
	        }else if (computerRandom == 3){
	        	computerValue = "SCISSOR";
	        }else if (computerRandom == 4){
	        	computerValue = "LIZARD";
	        }else if (computerRandom == 5){
	        	computerValue = "SPOCK";
	        }
	        System.out.println("Computer played: " +computerValue);
	        
	        switch (user)
	        {
	        case 1: 
	        	switch (computerRandom){
	        	case ROCK:System.out.println("You are tied."); break;
	        	case PAPER:System.out.println("You are loser."); break;
	        	case SCISSOR:System.out.println("You are winner."); break;
	        	case LIZARD:System.out.println("You are winner."); break;
	        	case SPOCK:System.out.println("You are loser."); break;}
	        	break;
	        	
	        case 2: 
	        	switch (computerRandom){
	        	case ROCK:System.out.println("You are winner."); break;
	        	case PAPER:System.out.println("You are tied."); break;
	        	case SCISSOR:System.out.println("You are loser."); break;
	        	case LIZARD:System.out.println("You are loser."); break;
	        	case SPOCK:System.out.println("You are winner."); break;}
	        	break;
	        	
	        case 3: 
	        	switch (computerRandom){
	        	case ROCK:System.out.println("You are loser."); break;
	        	case PAPER:System.out.println("You are winner."); break;
	        	case SCISSOR:System.out.println("You are tied."); break;
	        	case LIZARD:System.out.println("You are winner."); break;
	        	case SPOCK:System.out.println("You are loser."); break;}
	        	break;
	        	
	        case 4: 
	        	switch (computerRandom){
	        	case ROCK:System.out.println("You are loser."); break;
	        	case PAPER:System.out.println("You are winner."); break;
	        	case SCISSOR:System.out.println("You are loser."); break;
	        	case LIZARD:System.out.println("You are tied."); break;
	        	case SPOCK:System.out.println("You are winner."); break;}
	        	break;
	        	
	        case 5: 
	        	switch (computerRandom){
	        	case ROCK:System.out.println("You are winner."); break;
	        	case PAPER:System.out.println("You are loser."); break;
	        	case SCISSOR:System.out.println("You are winner."); break;
	        	case LIZARD:System.out.println("You are loser."); break;
	        	case SPOCK:System.out.println("You are tied."); break;}
	        	break;
         default: {System.out.println("User did not enter a value of 1-5. Try again.");
                break;
	        }
	}
	        cen.close();
}

}



public class Uc6 {
	 public static void main(String[] args) {
	        int current_place = 0;
	        int roll = 0;
	        System.out.println("Welcone to Snake and Ladder Game Simulator");
	        while (current_place <= 99) {
	            Random rn = new Random();
	            int dice = rn.nextInt(6) + 1;
	            System.out.println("The Player Got Die Value : "+dice);
	            current_place = current_place + dice;
	            roll = roll + 1;


	            Random a = new Random();
	            int option = a.nextInt(3) + 1;

	            switch (option) {
	                case 1:
	                    current_place = current_place;
	                    System.out.println("The Player Got No play");
	                    break;
	                case 2:
	                    current_place = current_place + dice;
	                    System.out.println("The Player Got Ladder");
	                    if (current_place > 100) {
	                        current_place = current_place - dice;
	                    }
	                    break;
	                case 3:
	                    current_place = current_place - dice-dice;
	                    System.out.println("The Player Got Snake");
	                    if (current_place < 0) {
	                        current_place = 0;
	                    }
	                    break;
	            }
	            if (current_place > 100) {
	                current_place = current_place - dice;
	            }
	            System.out.println("Present position of player is "+current_place);
	            System.out.println("............................................");
	        }
	        System.out.println("The Player finally reached 100 and Won the game");
	        System.out.println("No of Times the Die rolled is "+roll);
	    }
}


public class Uc5 {
	public static void main(String[] args) {
        int current_place = 0;
        System.out.println("Welcone to Snake and Ladder Game Simulator");
        while (current_place <= 99) {
            Random rn = new Random();
            int dice = rn.nextInt(6) + 1;
            current_place = current_place + dice;
            System.out.println("The Player Got Die Value : " + dice);
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
                    current_place = current_place - dice - dice;
                    System.out.println("The Player Got Snake");
                    if (current_place < 0) {
                        current_place = 0;
                    }
                    break;
            }
            if (current_place > 100) {
                current_place = current_place - dice;
            }
            System.out.println("Current place of the Player : " + current_place);
            System.out.println("__________");
        }
        System.out.println("Finally Won the Game and reached " + current_place);
    }
}

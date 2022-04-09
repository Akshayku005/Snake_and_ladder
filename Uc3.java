
public class Uc3 {
	int dice() {
		int dice=(int)(Math.random()*10%6+1);
		return dice;
		}
	int option() {
		int option=(int)(Math.random()*10%3+1);
		return option;
		}
	public static void main(String[] args) {
		int position=0;
		Uc3 a=new Uc3();
		System.out.println("Player 1 is at start position "+position);
		System.out.print("Player 1 rolls the dice and got : ");
		System.out.println(a.dice());
		int option=a.option();
		if(option==1) {
			System.out.println("NO PLAY | Player stay at position where he was");
		}
		else if (option==2) {
			System.out.println("LADDER |Player Move ahead by Number "+a.dice());
			position=position+a.dice();
		}
		else if (option==3) {
			System.out.println("SNAKE |Player Bitten by snake go back by Number  "+a.dice());
			position=position-a.dice();
			}
	}
}
}

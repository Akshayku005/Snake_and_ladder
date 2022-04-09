
public class Uc4 {
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
		Uc4 a=new Uc4();
		System.out.println("Player 1 is at start position "+position);
		System.out.println("Player 1 rolls the dice and got");
		while(position<100){
		//System.out.println(rv.dice());
		int option=a.option();
		switch (option) {
			case 1:
			System.out.println("NO PLAYs");
			break;
			case 2  :
			System.out.println("LADDER ");
position=position+a.dice();
			 if(position>100){
				position=position-a.dice();
				}
			break;

			case 3:
			System.out.println("SNAKE");
			if(position>0) {
			position=position-a.dice();
			}
			else if(position<0){
			break;
		}
			break;

		}

	}
		System.out.println("Player 1 Wins at position "+position);
	}
}

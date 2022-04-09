
public class Uc7 {
	int turn=2;
	int position1=0;
	int position2=0; 
	int dice() {
		int dice=(int)(Math.random()*10%6+1);
		return dice;
	}
	int option() {
		int option=(int)(Math.random()*10%3+1);
		return option;
		}
	int turnChange() {

		if(turn==2) {
			turn=1;
		}
		else if(turn==1) {
			turn=2;
		}
		return turn;
	}
	void main_game( ) {
		int dice=dice();
		int option=option();
		switch(option) {
		case 1 :
			turnChange();
		break;


		case 2 :
		if(turn==1 && position1<100)
		{
			position1=position1+dice;
			if(position1>100) {
				position1=position1-dice;
			}
			else if(position1<=100) {
				break;
			}
		}
		if(turn==2 && position2<100) {

			position2=position2+dice;
			if(position2>100) {
				position2=position2-dice;
			}
			else if(position2<=100) {
				break;
			}
			turnChange();

			}
		break;
		case 3 :
		{
			if(turn==1 && position1>0)
			{
				position1=position1-dice;

				}
			}
			if(turn==2 && position2>0) {

				position2=position2-dice;

			}
			turnChange();
			break;


		}
	}

	public static void main(String[] args) {

		int diceCount=0;
		Uc7 rv=new Uc7();
		System.out.println("Welcome To Snake And Ladder Game");
		while(rv.position1<=99 &&rv.position2<=99) {
		rv.main_game();
		diceCount++;
		System.out.println("1st Player position after roll number  "+diceCount+" is "+rv.position1);
		//rv.turnChange();
		System.out.println("2nd Player position after roll number "+diceCount+" is "+rv.position2);
		}
		System.out.println("Player 1 reached "+rv.position1   +"th position");
		System.out.println("Player 2 reached "+rv.position2   +"th position");
		if(rv.position1>rv.position2) {
			System.out.println("player 1 won the game");
		}
		else {
			System.out.println("Player 2 won the game");
		}

		System.out.println("Number of times the dice rolled is "+diceCount);
	}
}

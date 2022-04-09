
public class Uc2 {
	int dice() {
		int dice=(int)(Math.random()*10%6+1);
		return dice;
	}




	public static void main(String[] args) {
		int position=0;
		Uc2 a=new Uc2();
		int dice=(int)(Math.random()*10%6+1);
		System.out.println("Player 1 rolls the dice and got");
		System.out.println(a.dice());


}
}

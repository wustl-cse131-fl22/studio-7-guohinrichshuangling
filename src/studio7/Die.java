package studio7;

public class Die {

	private int sides;
	public Die(int n) {
		this.sides = n;
	}
	public int roll() {
		
		int random = (int) (Math.random() * sides) + 1;
		return random;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Die d1 = new Die(6);
		Die d2 = new Die(1000);
		System.out.println(d1.roll());
		System.out.println(d2.roll());
	}
}
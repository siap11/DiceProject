public class DiceRunner{
	public static void main(String[]args){

	// Test 1
		Die die = new Die();
		Die die2 = new Die();

		int rollCount = 0;
		int sum = 0;

		do{
			die.roll();
			die2.roll();
			rollCount++;

			System.out.println("Roll Number: " + rollCount);
			System.out.println(die.toString());
			System.out.println(die2.toString());
			System.out.println();

			sum = die.getValue() + die2.getValue();

		}while(sum!=2);

		System.out.println("It took " + rollCount + " rolls to get snake eyes.");



	}
}
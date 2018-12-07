public class DiceRunner{
	public static void main(String[]args){

	// Test 1
		System.out.println("Test 1:");
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

		System.out.println();

	// Test 2
		System.out.println("Test 2:");
		DiceHolder diceHolder = new DiceHolder();
		int returnVal = 1;

		Die newDie;
		int sides;

		do{
			sides = (int)(Math.random()*20)+4;
			newDie = new Die(sides);

			System.out.println("Adding die:");
			System.out.print(diceHolder);

			returnVal = diceHolder.addDie(newDie);
			System.out.println();
		}while(returnVal == 1);

		System.out.println("Before shake:");
		System.out.println(diceHolder);


		diceHolder.shake();
		System.out.println("After shake:");
		System.out.println(diceHolder);

	}
}
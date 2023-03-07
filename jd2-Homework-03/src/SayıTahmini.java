import java.util.Scanner;

public class SayıTahmini {

	public static void main(String[] args) {

		/*
		 * Generate random number: Math.random ile double tipinde 0.0 <= number < 1.0
		 * arasında bir sayı döner.
		 */

		Scanner scanner = new Scanner(System.in);

		while (true) {
			double number = Math.random();
			int numberInt = (int) (number * 100);
			System.out.println(numberInt);

			int counter = 0;

			while (true) {
				System.out.println("------------------");

				System.out.println("enter a number between 1-100:");
				int num = scanner.nextInt();

				if (num < numberInt) {
					counter++;
					System.out.println("Too low, try again");
				} else if (num > numberInt) {
					counter++;
					System.out.println("Too high, try again");
				} else {
					System.out.println("correct number");
					counter++;
					System.out.println("you have predicted the correct number in " + counter + " steps");
					
					break;
				}

			}
			System.out.println("do you want to continue? Y/N");
			String answer = scanner.next();
			if (answer.equalsIgnoreCase("N")) {
				break;
			}
		}

	}

}



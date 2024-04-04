/*
 * Cesar A Reyna
 * COSC 1430
 * Project #3
 * 10/11/2022
 * The program prompts the user to "Enter grade " the prompt is in a loop.
 * The program will continue accepting input until a negative number is entered.
 * Upon receiving a negative input the program will give the user an output of the
 * total number of grades and the total of each type of grade.
 */

package one;
public class ScoreCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Loop initialization
		boolean loopcondition = false;
		int count = 0, next = 1, a = 0, b = 0, c = 0, d = 0, f = 0;
		while (!loopcondition) // Loop termination condition
		{ // Body of loop
			System.out.println("Enter grade ");
			next = SavitchIn.readLineInt();

			if (next < 0)
				loopcondition = true;
			else if (next >= 90) {
				a++;
				count++;
			} else if (next >= 80) {
				b++;
				count++;
			} else if (next >= 70) {
				c++;
				count++;
			} else if (next >= 60) {
				d++;
				count++;
			} else if (next < 60) {
				f++;
				count++;
			}

		}
		System.out.println("Total number of grades = " + count);
		System.out.println("Number of A = " + a);
		System.out.println("Number of B = " + b);
		System.out.println("Number of C = " + c);
		System.out.println("Number of D = " + d);
		System.out.println("Number of F = " + f);

	}

}

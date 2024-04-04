/*
 * Cesar A Reyna
 * COSC 1430
 * Lab 04
 * 10/27/22
 * program copied from class notes
 * my program was not functional
 */



package one;
import java.util.Scanner;

public class DiamondOfAsterisks {

	public static void main(String[] args) {
		
		int size;
		System.out.println("Please input your number here:");
		// Create Scanner object
		Scanner s = new Scanner(System.in);
		// Read the next integer from the screen
		size = s.nextInt();
		// Top section
		for (int i = 0; i < size / 2 + 1; i++) {
		for (int k = size / 2 - i; k >= 1; k -= 1) {
		System.out.print(" ");
		}
		for (int j = 1; j <= 2 * i + 1; j++) {
		System.out.print("*");
		}
		System.out.println();
		}
		// bottom section
		for (int i = size / 2 - 1; i >= 0; i--) {
		// Print out the white space: number of white space is
		// size/2 - i
		for (int k = 1; k <= size / 2 - i; k++) {
		System.out.print(" ");
		}
		// Print out *: number of * is 2*i + 1
		for (int k = 1; k <= 2 * i + 1; k++) {
		System.out.print("*");
		}
		System.out.println();
	
		
	}
}
}
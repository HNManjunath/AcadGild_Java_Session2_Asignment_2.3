/**
 * 
 */
package assignment2_3;

/**
 * @author MANJUNATH, This class is print x pattern.
 *
 */
public class Assignment2_3 {

	/**
	 * @param i,j,underscore2,underscore2.
	 */
	public void printXPattren() {
		int i, j;
		int underscore1 = 0; // keeps the count of the underscores preceding the first "*"
		int underscore2 = 7; // keeps the count of the underscores between the two "*"
		for (i = 0; i < 3; i++) { // loop to print the top half of the pattern.
			for (j = 0; j < underscore1; j++) { // loop to print the starting "_" if present
				System.out.print("_");
			}
			underscore1 += 2; // increment by 2 of underscores for each succeeding line
			System.out.print("*"); // prints the starting "*"
			for (j = 0; j < underscore2; j++) { // loop to print the "_" between the two "*" in each line
				System.out.print("_");
			}
			if (underscore2 > 0) { // block to decrement the count of the underscore2 and print the second "*"
				underscore2 = underscore2 - 4;
				System.out.print("*");
			}
			System.out.println(); // ends the line
		}
		underscore1 = 2; // reassign the variables
		underscore2 = 3;
		for (i = 0; i < 2; i++) { // loop to print the bottom half of the pattern
			for (j = 0; j < underscore1; j++) { // loop to print the starting "_" if present
				System.out.print("_");
			}
			underscore1 -= 2; // decrement by 2 of underscores for each succeeding line
			System.out.print("*"); // prints the starting "*"
			for (j = 0; j < underscore2; j++) { // loop to print the "_" between the two "*" in each line
				System.out.print("_");
			}
			if (underscore2 > 0) { // block to increment the count of the underscore2 and print the second "*"
				underscore2 += 4;
				System.out.print("*");
			}
			System.out.println(); // ends the line
		}
	}

	// Main Function Begins
	public static void main(String[] args) {
		Assignment2_3 printPattern = new Assignment2_3();
		printPattern.printXPattren();
	}
}
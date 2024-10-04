package loopsystem;
import java.util.Scanner;

public class domain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;
		// this loop will run until the user enters a negative number
		do {
			System.out.print("Enter a number(negative to quit): ");
			number = scanner.nextInt();
			if (number >=0) {
				System.out.println("you entered: " + number);
			} else {
				System.out.println("Exiting...");
			}
		}while (number >=0);
		scanner.close();
		
			}
				
	}



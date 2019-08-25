/*
import java.util.Scanner;

public class Collatz068V1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter number: ");
		int input = Integer.parseInt(scanner.nextLine());
		System.out.println(input);
		while (!(input == 1)) {
			if (input % 2 == 0) {
				input /= 2;
			
			} else {
				input *= 3;
				input += 1;
			
			}
			System.out.println(input);
		
		}
		
	
	
	
	
	
	}


}
*/
import java.util.Scanner;

public class CollatzHax068V1 {
	public static int makeCollatz(int input) {
		if(input%2 == 0) {
			input /= 2;
			return input;
			
		} else {
			input *= 3;
			input += 1;
			return input;
		}
		
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter #: ");
		int input = Integer.parseInt(scanner.nextLine());
		makeCollatz(input);
	}
	
	
	
}
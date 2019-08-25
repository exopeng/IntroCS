import java.util.Scanner;

public class SieveOfEratosthenes068V1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("What numbers would you like to find all primes up to? ");
		//Uses boolean array to see if prime, and index of element for each number
		boolean[] primeArray = new boolean[Integer.parseInt(scanner.nextLine()) + 1];
		for (int i = 0; i < primeArray.length; i++) {
			primeArray[i] = true;
		
		}
		primeArray[0] = false;
		primeArray[1] = false; 
		for (int i = 2; i < primeArray.length; i ++) {
			if (primeArray[i] == true ) {
				System.out.println(i);
				for (int j = i + i; j < primeArray.length; j += i) {
					primeArray[j] = false;
				
				}
				
			}
		}
	
	
	
	}




}
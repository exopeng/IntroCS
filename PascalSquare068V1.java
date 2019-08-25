import java.util.Scanner;

public class PascalSquare068V1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Dimension:");
		int dimension = Integer.parseInt(scanner.nextLine());
		int[][] pascalSquare = new int[dimension][dimension];
		for (int i = 0; i < pascalSquare.length; i++) {
			pascalSquare[0][i] = 1;
			
		}
		// above code makes all the 1's
		for (int i = 0; i < pascalSquare.length; i++) {
			pascalSquare[i][0] = 1;
		
		}
		
		for (int i = 1; i < dimension; i++) {
			for (int j = 1; j < dimension; j++) {
				pascalSquare[i][j] = pascalSquare[i][j - 1] + pascalSquare[i - 1][j];
			
			}
			
		}
		
		printer(pascalSquare);
		
		
	
	}
	
	
	public static void printer(int[][] newArray) {
		for (int i = 0; i < newArray.length; i++) {
			for (int j = 0; j < newArray.length; j++) {
				System.out.print(newArray[j][i] + " ");
			}
			System.out.println();
			
		}
		
		
	}

}
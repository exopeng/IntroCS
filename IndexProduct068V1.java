import java.util.Scanner;

public class IndexProduct068V1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many ints in width: ");
		int col = Integer.parseInt(scanner.nextLine());
		System.out.print("How many ints in height: ");
		int row = Integer.parseInt(scanner.nextLine());
		int[][] newArray = new int[row][col];
		// below code makes array of desired dimensions
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				newArray[i][j] = j * i;
			}
		}
		printArray(newArray);
	}
	
	public static void printArray(int[][] inputArray) {
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = 0; j < inputArray[0].length; j++) {
				System.out.print(inputArray[i][j] + " ");
			}
			System.out.println();
		}
	
	}
	
}
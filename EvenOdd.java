import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("width: ");
		int width = Integer.parseInt(scanner.nextLine());
		System.out.print("Height: ");
		int height = Integer.parseInt(scanner.nextLine());
		int[][] newArray = evenOdd(width, height);
		for (int i = 0; i < newArray.length; i++) {
			for (int j = 0; j < newArray[1].length; j++) {
				System.out.print(newArray[i][j] + " ");
			
			}
			System.out.println();
		}
	
	}
	
	public static int[][] evenOdd(int width, int height) {
		int[][] newArray = new int[height][width];
		for (int i = 0; i < newArray.length; i++) {
			for (int j = 0; j < newArray[1].length; j++) {
				if (j % 2 == 0) {
					newArray[i][j] = 2;
				
				} else {
					newArray[i][j] = 1;
				
				}
			
			}
		}
		
		return newArray;
	
	}
}
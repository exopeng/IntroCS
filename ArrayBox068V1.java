import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Width: ");
		int width = Integer.parseInt(scanner.nextLine());
		System.out.print("Height" );
		int height =  Integer.parseInt(scanner.nextLine());
		int[][] newArray;
		newArray = arrayBox(height, width);
		for (int i = 0; i < newArray.length; i++) {
			for (int j = 0; j < newArray[1].length; j++) {
			System.out.print(newArray[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static int[][] arrayBox(int height, int width) {
		int[][] newArray = new int[height][width];
		for(int i = 0; i < newArray.length; i++) {
			for(int j = 0; j < newArray[1].length; j++) {
				if (j == 0 || j == newArray[1].length - 1 || i == 0 || i == newArray.length - 1) {
					newArray[i][j] = 1;
				
				} else {
					newArray[i][j] = 0;
				
				}
			
			}
		
		}
		
		return newArray;
	
	
	}
}
import java.util.Scanner;

public class Drawing {
	public static void main(String[] args) {
		//2a
		System.out.print("Triangle or rectangle: ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		if (input.equals("rectangle")) {
			System.out.print("What height would you like: ");
			String height = scanner.nextLine();
			int newHeight = Integer.parseInt(height);
			if (newHeight > 20) {
				System.out.print("That is too big, Goodbye");
			} else {
				System.out.print("What width would you like: ");
				String width = scanner.nextLine();
				int newWidth = Integer.parseInt(width);
				if(newWidth > 20) {
					System.out.print("That height is too big. Goodbye");
				} else {
					for(int i = 0; i < newHeight; i++ ) {
						for(int j = 0; j < newWidth; j++) { 
							System.out.print("*");
							
						}
						System.out.println();
					}
				}
			}
		
		} else if (input.equals("triangle")) {
			System.out.print("What height would you like");
			String height1 = scanner.nextLine();
			int newHeight1 = Integer.parseInt(height1);
			if (newHeight1 > 20) {
				System.out.print("That is too big. Goodbye");
			} else {
				for (int i = 0; i < newHeight1 + 1; i++) {
					for (int j = 0; j < i; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
			}
			
		
		}
		
		
		
		
		
	
	}


}
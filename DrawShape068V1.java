import java.util.Scanner;

import java.lang.Math;

public class DrawShape068V1 { 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Square or rectangle: ");
		String input = scanner.nextLine();
		int width;
		int height;
		if (input.equals("rectangle")) {
			System.out.print("Width: ");
			width = Integer.parseInt(scanner.nextLine());
			System.out.print("Height: ");
			height = Integer.parseInt(scanner.nextLine());
		
		} else {
			System.out.print("Width: ");
			width = Integer.parseInt(scanner.nextLine());
			height = width;
		
		
		}
		drawQuad(width, height);
		double longestLine = getLongestLine(width, height);
		System.out.print(longestLine);
	
	
	
	}
	public static void drawQuad(int width, int height) {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
			System.out.print("*");
			
			}
			System.out.println();
		}
		
	
	}
	public static double getLongestLine(int width, int height) {
		width *= width;
		height *= height;
		double hypotenuse = Math.sqrt(width + height);
		
	return hypotenuse;	
	}
	
	
}
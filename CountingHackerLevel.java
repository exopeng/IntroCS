public class CountingHackerLevel {
	public static void main(String[] args) {
		//1g
		for (int j = 232; j < 260; j++) {
				if ((j%10 == 3) || (j%10 == 7) ) {
					System.out.println(j);
				
				}
			
			}
		//2d
		int size = 1;
		for (int i = 0; i <= size; i++) {
			for (int j = 0; j <= size; j++) {
				System.out.print("*");
				size++;
			}
			System.out.println();
			
		}
	}
	
}
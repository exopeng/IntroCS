import java.util.Scanner;

public class Club068V1 {
	public static void main(String args[]) {
		ClubMember[] clubMembers = new ClubMember[3];
		Scanner scanner = new Scanner(System.in);
		String name;
		String title;
		int grade;
		for (int i = 0; i < clubMembers.length; i++) {
			System.out.print("Enter name: ");
			name = scanner.nextLine();
			System.out.print("Enter title: ");
			title = scanner.nextLine();
			System.out.print("Enter grade: ");
			grade = Integer.parseInt(scanner.nextLine());
			clubMembers[i] = new ClubMember(name, title, grade);
			System.out.println();
		}
		
		printClub(clubMembers);
		
		System.out.print("Which club member do you want to change the name of: ");
		
		int memberPos = Integer.parseInt(scanner.nextLine());
		
		System.out.print("Enter new name: ");
		
		String newName = scanner.nextLine();
		
		clubMembers[memberPos].fixName(newName);
		
		printClub(clubMembers);
		
	}
	
	public static void printClub(ClubMember[] newArray) {
		System.out.println("The members are: ");
		for (int i = 0; i < newArray.length; i++) {
			System.out.println("#" + i + " : " + newArray[i].getName() + "," + newArray[i].getTitle() + "," + newArray[i].getGrade());
		}
		System.out.println();
	}
}
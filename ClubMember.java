public class ClubMember {
	
	private String myName;
	private String myTitle;
	private int myGrade;
	
	public ClubMember(String name, String title, int grade) {
		myName = name;
		myTitle = title;
		myGrade = grade;
	
	}
	
	public void fixName(String newName) {
		myName = newName;
	}
	
	public String getName() {
		return myName;
	}
	
	public String getTitle() {
		return myTitle;
	}
	
	public int getGrade() {
		return myGrade;
	}

}
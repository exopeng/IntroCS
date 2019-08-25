public class Cell {
	private String myCellVal;
	
	public Cell(String cellVal) {
		myCellVal = cellVal;
	
	}
	
	public String getCellVal() {
		return myCellVal;
	
	}
	
	public void fixCellVal(String newCellVal) {
		myCellVal = newCellVal;
	}

}
public class Bank {

    /* Declare instance variables here */
	private String myBranchName;
	private int myMaximumCapacity;
	// include an array of BankAccounts
	private BankAccount[] newArray;
	
    /**
     * Constructor
     *
     * @param branchName       The name of the branch.
     * @param maximumCapacity  The max number of BankAccounts this bank can support.
     */
	 
    public Bank(String branchName, int maximumCapacity) {

		//give the array of BankAccounts a length
		myBranchName = branchName;
		myMaximumCapacity = maximumCapacity;
		newArray = new BankAccount[myMaximumCapacity];
    }

    /**
     * Get the branch name.
     * @return    The branch name.
     */
	 
    public String getBranchName() {
		return myBranchName;

    }
	
	/**
     * Get the array
     * @return    The array .
     */
	 
    public BankAccount[] getArray() {
		return newArray;

    }

    /**
     * Looks up a BankAcount based on a social.
     * @param social  The social number to be looked up.
     * @return        The located BankAccount. If none exists, return null.
     */
	 
    public BankAccount findAccountBySocial(String social) {
		for (int i = 0; i < newArray.length; i++) {
			if (newArray[i] == null) {
				return null;
			}
			if (newArray[i].getSocial().equals(social)) {
				return newArray[i];
			}
		}
		
		return null;
    }

    /**
     * Adds a new account.
     * @param account  The account to be added.
     * @return         True if successfully added, false otherwise.
     */
	 
    public boolean addAccount(BankAccount account) {
		for (int i = 0; i < newArray.length; i++) {
			if (newArray[i] == null) {
				newArray[i] = account;
				return true;
			}
		}
		
		return false;
		
		
    }
}

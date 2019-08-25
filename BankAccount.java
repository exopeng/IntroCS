public class BankAccount {

    /* Declare instance variables here */
	//think of a better name than myInitialAmount
	private String myName;
	private String mySocial;
	private double myBalance;
	
    /**
     * Constructor
     *
     * @param name          The name of the owner of the account.
	 * @param social        The social of the owner of the account.
     * @param initialAmount The amount of money initially in the account.
     */
	 
    public BankAccount(String name, String social, double initialAmount) {
		myName = name;
		mySocial = social;
		myBalance = initialAmount;
		
    }
	
    /**
     * Get the balance of the account.
	
     * @return    The balance.
     */
	 
    public double getBalance() {
		return myBalance;
    }

    /**
     * Get the social security number of the owner.
     * @return    The social security number.
     */
	 
    public String getSocial() {
		return mySocial;
    }

    /**
     * Adds the money to the balance.
     * @param amount  The money being deposited.
     */
	 
    public void depositMoney(double amount) {
		myBalance += amount;
    }

    /**
     * Withdraws money out of the account.
     * @param amount  The amount withdrawn.
     * @return        True if successful, false otherwise.
     */
	 
    public boolean withdrawMoney(double amount) {
		if (myBalance - amount >= 0) {
			myBalance -= amount;
			return true;
		} else {
			return false;
		}
		
    }
}

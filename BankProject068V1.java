import java.util.Scanner;

public class BankProject068V1 {

    public static void main(String[] args) {
        Bank bankOfJava = new Bank("Bank of Java", 10);
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        int option = 0;

        while(option != 3) {
            System.out.println("\nWhat do you want to do?");
            System.out.println("1: add a new account");
            System.out.println("2: sign into an existing acount");
            System.out.println("3: quit");

            option = Integer.parseInt(scanner.nextLine());
            
            System.out.println();

            if (option == 1) {
                addNewAccount(bankOfJava, scanner);
            } else if (option == 2) {
                printSignIn(bankOfJava, scanner);
            }
        }
    }

    public static void addNewAccount(Bank bank, Scanner scanner) {
        /*
         1. Ask the user for input: name, social, and initial money.
         2. Create a new instance of BankAccount
         3. Try to add the BankAccount to bank.
         4. On success, welcome the new user by name. On failure, inform the user that the account could not be added.
        */
		
		System.out.println("Name:");
		String name = scanner.nextLine();
		System.out.println("Social: ");
		String social = scanner.nextLine();
		System.out.println("initial money: ");
		int initialMoney = Integer.parseInt(scanner.nextLine());
		BankAccount newSocial = new BankAccount(name, social, initialMoney);
		boolean success = bank.addAccount(newSocial);
		if (success == true) {
			System.out.println("Welcome: " + name);
		} else {
			System.out.println("Account could not be added");
		}

    }

    public static void printSignIn(Bank bank, Scanner scanner) {
        /*
         1. Ask the user for input: the social.
         2. Look up the BankAccount in bank.
         3. Process the account if found, otherwise inform the user it could not be found.
        */
		
		System.out.println("Social: ");
		String newSocial = scanner.nextLine();
		if (bank.findAccountBySocial(newSocial) != null) {
			processAccount(bank.findAccountBySocial(newSocial), scanner);
			return;
		}
		
		System.out.println("Nothing could be found...");
		

    }

    public static void processAccount(BankAccount account, Scanner scanner) {
        System.out.println("Your current balance is " + account.getBalance());
        System.out.println("What would you like to do");
        System.out.println("1: make a deposit");
        System.out.println("2: withdraw money");

        int option = Integer.parseInt(scanner.nextLine());

        if (option == 1) {
            processDeposit(account, scanner);
        } else if (option == 2) {
            processWithdrawal(account, scanner);
        }
    }

    public static void processDeposit(BankAccount account, Scanner scanner) {
        /*
         1. Ask the user for input: the amount to deposit.
         2. Deposit the money into the BankAccount
         3. Print the updated balance.
        */
		
		System.out.println("Amount to deposit: ");
		int money = Integer.parseInt(scanner.nextLine());
		account.depositMoney(money);
		System.out.println("New balance is" + account.getBalance());
		

    }

    public static void processWithdrawal(BankAccount account, Scanner scanner) {
        /*
         1. Ask the user for input: the amount to withdraw.
         2. Try to withdraw the money from the BankAccount
         3. On success inform user of the new balance, otherwise inform the user that they can't withdraw.
         4. Print the updated balance.
        */
		
		System.out.println("Amount to withdraw: ");
		int withdraw = Integer.parseInt(scanner.nextLine());
		boolean success = account.withdrawMoney(withdraw);
		if (success == true) {
			System.out.println("New balance is " + account.getBalance());
		} else {
			System.out.println("No can do: ");
		}
    }
}
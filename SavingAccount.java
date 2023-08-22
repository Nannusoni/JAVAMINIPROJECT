package JAVA_PROJECT;

public class SavingAccount {

	int balance;
	public SavingAccount(int initialBalance) {
		balance = initialBalance;
	}

	// method to check balance
	public void checkBalance() {
		System.out.println("Hello!");
		System.out.println("Your balance is " + balance);
	}

	// method to deposit amount
	public void deposit(int amountToDeposit) {
		balance = amountToDeposit + balance;
		System.out.println("You just deposited " + amountToDeposit);
		System.out.println("Your Total balance is " + balance);
	}

	// method for withdraw amount
	public int withdraw(int amountToWithdraw) {
		balance = balance - amountToWithdraw;
		System.out.println("You just withdrew " + amountToWithdraw);
		System.out.println("Your Total balance is " + balance);
		return amountToWithdraw;
	}

	public static void main(String[] args) {
		SavingAccount savings = new SavingAccount(1000);
		// Check balance:
		savings.checkBalance();
		// Deposit:
		savings.deposit(600);
		// Withdrawing:
		savings.withdraw(300);
	}
}

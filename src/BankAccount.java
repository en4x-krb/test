
public class BankAccount {
	private int accountNumber;
	private String Name;
	private int balance;

	public BankAccount(int aNumber, String name, int initialBalance) {
		// TODO Auto-generated constructor stub
		accountNumber = aNumber;
		this.Name = name;
		this.balance = initialBalance;
	}

	public void deposit(int amount) {
		balance += amount;
	}

	public void withdraw(int amount) {

		balance -= amount;
	}

	int getBalance() {
		return balance;
	}

}
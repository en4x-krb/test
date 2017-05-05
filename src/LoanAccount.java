
public class LoanAccount {
	int accountNumber;
	String Name;
	int balance;
	int interest;

	public LoanAccount(int aNumber, String name, int initialBalance) {
		// TODO Auto-generated constructor stub
		accountNumber = aNumber;
		this.Name = name;
		this.balance = initialBalance;
	}

	public void payInstalment(int amount) {
		balance -= amount;
	}

	public int getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

}
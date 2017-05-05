import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {
	BankAccount myAccount;
	@Before
	public void setUp() throws Exception {
		myAccount = new BankAccount(1434,"Enax",1300);
	}

	@Test
	public void testDeposit() {
		myAccount.deposit(900);
		assertEquals(2200,myAccount.getBalance());
		//fail("Not yet implemented");
	}

	@Test
	public void testWithdraw() {
		myAccount.withdraw(400);
		assertEquals(900,myAccount.getBalance());
		//fail("Not yet implemented");
	}

	@Test
	public void testGetBalance() {
		myAccount.deposit(900);
		myAccount.withdraw(400);
		assertEquals(1800,myAccount.getBalance());
		//fail("Not yet implemented");
	}

}

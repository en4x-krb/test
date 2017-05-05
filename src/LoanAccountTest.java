import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LoanAccountTest {
	LoanAccount myAccount;
	@Before
	public void setUp() throws Exception {
		myAccount = new LoanAccount(1434,"Enax",1300);
	}

	@Test
	public void testPayInstalment() {
		myAccount.payInstalment(400);
		assertEquals(900,myAccount.getBalance());
		//fail("Not yet implemented");
	}

	@Test
	public void testGetBalance() {
		//fail("Not yet implemented");
	}

}

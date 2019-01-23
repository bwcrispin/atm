package atm;

import org.junit.Assert;
import org.junit.Test;

public class AtmTest {

	@Test
	public void shouldReturnOneHundredForBalance() {
		Atm insideTest = new Atm(100);
		int actual = insideTest.checkBalance();
		Assert.assertEquals(100, actual);	
	}
	
	@Test
	public void shouldReturnTwoHundredForBalance() {
		Atm insideTest = new Atm(200);
		int actual = insideTest.checkBalance();
		Assert.assertEquals(200, actual);
	}
	
	@Test
	public void shouldwithdraw() {
		Atm insideTest = new Atm(100);
		int withdrawlAmount = insideTest.withdraw();
		Assert.assertEquals(50, withdrawlAmount);
	}

	@Test
	public void shouldDeposit() {
		Atm insideTest = new Atm(100);
		int depositAmount = insideTest.deposit();
		Assert.assertEquals(150, depositAmount);
	}
}
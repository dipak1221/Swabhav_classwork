package com.techlab.account;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountTest {

	@Test
	void testAccount() {
		int expectedAccno=101;
		String expectedName ="java";
		double expectedamt=500.3;
		
		Account a=new Account(101,"java",500.3);
		
		assertEquals(expectedAccno, a.getAccNO());
		assertEquals(expectedName, a.getName());
		assertEquals(expectedamt, a.getAmount());
		
	}

	@Test
	void testDeposit() {
		double expectedamt=1000;
		Account a=new Account(101,"java",500);
		a.deposit(500);
		
		assertEquals(expectedamt, a.getAmount());
	}

	@Test
	void testWithdraw() {
		double expectedamt=1000;
		Account a=new Account(101,"java",1500);
		a.withdraw(500);
		
		assertEquals(expectedamt, a.getAmount());
	}

}

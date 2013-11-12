package day4;

import junit.framework.TestCase;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankAccountTest extends TestCase {
	public void testInit ( ) {
		BankAccount x = new BankAccount (2000);
		assertTrue (x.balance() == 2000);
	}
	public void testInvalidArgs ( ) {
		BankAccount y = new BankAccount (10);
		y.withdraw(-30);
		assertTrue (y.balance() == 10);
		y.deposit(-30);
		assertTrue (y.balance() == 10);
	}
	public void testOverdraft ( ) {
		BankAccount x = new BankAccount (1000);
		x.withdraw(1001);
		assertTrue (x.balance() == 1000);
	}
	public void testDeposit ( ) {
		BankAccount x = new BankAccount (30);
		x.deposit(20);
		assertTrue (x.balance() == 50);
	}
	public void testWithdraw ( ) {
		BankAccount x = new BankAccount (50);
		x.withdraw(40);
		assertTrue (x.balance() == 10);
	}
}
	


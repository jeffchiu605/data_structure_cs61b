package day3;

public class Account {
	// This class represents a bank account whose current
    // balance is a nonnegative amount in US dollars.

    // Initialize an account with the given balance. 
    public Account (int balance) {
        this.myBalance = balance;
        this.parentAccount = null;
    }


    //initialize an account with given balance and parent account

    public Account(int balance, Account yourParentAccount)
    {
        this.myBalance = balance;
        this.parentAccount = yourParentAccount;
    }
    
    // Add the given amount to the account.
    public void deposit (int amount) {
        if (amount < 0) {
            System.out.println ("Cannot deposit negative amount.");
        } else {    
            this.myBalance = this.myBalance + amount;
        }
    }
    
    // Subtract the given amount from the account
    // if possible.  If the amount would leave a
    // negative balance, print an error message and
    // leave the balance unchanged.
    public boolean withdraw (int amount) {
        boolean sufficient = true;
        if (amount < 0) {
            sufficient = false;
            System.out.println ("Cannot withdraw negative amount.");
        } else if (this.myBalance < amount) {
            if (this.parentAccount == null){
                    System.out.println("Insufficient funds");
                sufficient = false;
            } else {
                if (this.parentAccount.withdraw(amount - this.myBalance) == true){
                    this.myBalance = 0;
                    sufficient = true;
                } else {
                    sufficient = false;
                }
            }
        } else {
            this.myBalance = this.myBalance - amount;
        }
        return sufficient;
    }

    
     // Merge account "anotherAcct" into this one by 
    // removing all the money from anotherAcct and 
    // adding that amount to this one.
    public void merge (Account anotherAcct) {
        this.myBalance += anotherAcct.myBalance;
        anotherAcct.myBalance = 0;
    }


    // Return the number of dollars in the account.
    public int balance ( ) {
        return this.myBalance;
    }

    // instance variables:
	private int myBalance;
    private Account parentAccount;
	

}

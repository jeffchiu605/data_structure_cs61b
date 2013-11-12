package day3;

public class AccountTester {
	public static void main (String [ ] args) {
        Account mike;
        mike = new Account (1000);
        System.out.println (mike.balance ());
        mike.deposit (100);
        System.out.println (mike.balance ());
        mike.withdraw (200);
        System.out.println (mike.balance ());

        
        
        //overdraft test
        Account Tom;
        Tom = new Account (2000);
        Account Kate;
        Kate = new Account (1000,Tom); 
        Kate.withdraw (1001);
        if (Kate.balance() == 0 && Tom.balance() == 1999) {}
        else {

            System.out.println("Error: Overdraft test failed");
        }


    //withdraw boolean tests
    Account peter = new Account(90);

    boolean bool1 = peter.withdraw(-5);
    boolean bool2 = peter.withdraw(100);
    boolean bool3 = peter.withdraw(50);

    if (!bool1 && !bool2 && bool3) {} else {
        System.out.println("Error: Withdraw failed");   
    }
    

    //merge tests
    Account tyler = new Account(500);
    Account bob = new Account(900);

    tyler.merge(bob);

    if(tyler.balance() == 1400 && bob.balance() == 0) {} else{
        System.out.println("Error: Merge test failed");
    }

    

    } //end main

}

package day4;

public class ModNCounter {
    private int myCount;
    private int myN;
    
    public ModNCounter ( ) {
        myCount = 0;
    }
    
    public ModNCounter (int x) {
    	myCount = 0;
    	myN = x;
    }

    public void increment ( ) {
        int myCounter = 0;
    	if (myCounter >= myN) {
        	myCount++;
        } 
    	else {
    	if (myN -1 > myCount) {
        	myCount++;
        } else {
        	myCount = 0;
    	} 
        }
    }

    public void reset ( ) {
        myCount = 0;
    }
    
    public int value ( ) {
        return myCount;
    }

}

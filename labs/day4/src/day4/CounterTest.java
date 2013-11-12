package day4;

// JUnit test case
import junit.framework.TestCase;

public class CounterTest extends TestCase {
    public void testConstructor ( ) {
        ModNCounter c = new ModNCounter ( );
        assertTrue (c.value () == 0);
    }

    
    
    public void testIncrement ( ) {
        ModNCounter c = new ModNCounter ( );
        c.increment ( );
        assertTrue (c.value() == 1);
        c.increment ( );
        assertTrue (c.value() == 2);
        
        ModNCounter x = new ModNCounter (2);
        assertTrue (x.value() == 0);
        x.increment ( );
        assertTrue (x.value() == 1);
        x.increment ( );
        assertTrue (x.value() == 0);
    }

    public void testReset ( ) {
        ModNCounter c = new ModNCounter ( );
        c.increment ( );
        c.reset ( );
        assertTrue (c.value () == 0);
    }
}

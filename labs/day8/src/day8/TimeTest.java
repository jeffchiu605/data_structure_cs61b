package day8;

import static org.junit.Assert.*;

import org.junit.Test;

public class TimeTest {
@Test
	 public void testConstructor ( ) { String [ ] timeArgs = { null, "x", "x:", ":x", "x:y", "1:", ":30", "4: 35", "55:00", "11:99", " 3:30", "00004:45", "4:007", "4:7", "4 :09", "3:30", "11:55" }; 
	 Time [ ] correctTimes = { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new Time (3, 30), new Time (11, 55) }; 
	 for (int k=0; k<timeArgs.length; k++) { 
		 try {Time t = new Time (timeArgs[k]); 
		 assertEquals (correctTimes[k], t); 
		 } catch (Exception e){
			System.out.println(e.getMessage());
			if (timeArgs[k] == null) {
			System.err.println("argument is null");
			throw new IllegalArgumentException ();
			}
			else if (timeArgs[k] == )
		 }
	 }
	}
}

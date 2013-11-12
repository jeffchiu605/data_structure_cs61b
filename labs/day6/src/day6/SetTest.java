package day6;

import junit.framework.TestCase;


public class SetTest extends TestCase {

	public void initIterator() {
		
	}
	
	public void hasNext() {
		Set a = new Set(0);
		a.initIterator();
		assertFalse (a.hasNext());
		
	}
	
	
}
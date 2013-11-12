package day13;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.*;
import junit.framework.TestCase;

public class ListTest extends TestCase {
	private static final Timer Timer = null;

	@Test
	public void testConstructor ( ) {
		List l1 = new List ( );
		assertEquals ("( )", l1.toString());
		assertTrue (l1.isEmpty());
		assertTrue (l1.size()==0);
	}
	
	public void testAddToFront ( ) {
		List l1 = new List ( );
		l1.addToFront ("b");
		assertEquals ("( b )", l1.toString());
		assertFalse (l1.isEmpty());
		assertTrue (l1.size()==1);
		l1.addToFront ("a");
		assertEquals ("( a b )", l1.toString());
		assertFalse (l1.isEmpty());
		assertTrue (l1.size()==2);
	}
	
	public void testAdd ( ) {
		Timer time.;
		List l1 = new List ( );
		l1.add("a");
		l1.add("b");
		l1.add("c");
		l1.add("d");
		l1.add("e");
		
		ArrayList l2 = new ArrayList(5);
		l2.add("a");
		l2.add("b");
		l2.add("c");
		l2.add("d");
		l2.add("e");
		
		System.out.println("Time taken to add for ArrayList");
		time.start();
		l2.add("f");
		time.stop();
		System.out.println(time);
		
		l1.add("f");
	}
	
	public void testEquals ( ) {
		List l1 = new List ( );
		List l2 = new List ( );
		List l3 = new List ( );
		assertEquals (l1, l2);
		l1.add("a");
		assertFalse (l1.equals(l2));	// arg empty, this not
		l2.add("a");
		assertEquals (l1, l2);
		assertFalse (l3.equals(l1));	// this empty, arg not
		l2.add("b");
		assertFalse (l1.equals(l2));	// this shorter than arg
		l1.add("b");
		assertEquals (l1, l2);
		l1.add("c");
		assertFalse (l1.equals(l2));	// this longer than arg
		l3.add("a");
		l3.add("a");
		assertFalse (l2.equals(l3));	// same length, different elements
	}
	

	public void testAppendInPlace ( ) {
		List l1 = new List ( );
		List l2 = new List ( );
		l1.appendInPlace(l2);
		assertEquals (l1, l2);
		assertEquals ("( )", l1.toString());
		assertEquals ("( )", l2.toString());
		l1.add("a");
		l1.appendInPlace(l2);
		assertEquals ("( a )", l1.toString());
		assertEquals ("( )", l2.toString());
		l2.appendInPlace(l1);
		assertEquals ("( a )", l1.toString());
		assertEquals ("( a )", l2.toString());
		List l3 = new List ( );
		l3.add("x");
		l3.add("y");
		l3.appendInPlace(l1);
		assertEquals("( x y a )", l3.toString());
		assertEquals("( a )", l1.toString());
		l3.add("b");
		assertEquals("( x y a b )", l3.toString());
		assertEquals("( a b )", l1.toString());
		assertEquals("( a b )", l2.toString());
	}
}
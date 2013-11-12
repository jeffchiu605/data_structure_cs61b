package day4;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class MeasurementTest extends TestCase {

	public void testDefault ( ) {
		Measurement x = new Measurement();
		assertTrue (x.toString().equals("0\'0\""));
	}
	public void testFeet ( ) {
		Measurement x = new Measurement (5);
		assertTrue (x.toString().equals("5\'0\""));
		Measurement y = new Measurement (0);
		assertTrue (y.toString().equals("0\'0\""));
	}
	public void testInchFeet ( ) {
		Measurement x = new Measurement (5, 2);
		assertTrue (x.toString().equals("5\'2\""));
		Measurement y = new Measurement (6, 13);
		assertTrue (y.toString().equals("7\'1\""));
	}
	public void testPlus() {
		Measurement a = new Measurement();
		Measurement b = new Measurement(5, 8);
		Measurement c = a.plus(b);
		assertTrue (c.toString().equals("5\'8\""));
		Measurement d = c.plus(b);
		assertTrue (d.toString().equals("11\'4\""));
		Measurement e = new Measurement(0, 21);
		Measurement f = e.plus(d);
		assertTrue (f.toString().equals("13\'1\""));
	}
	public void testMinus() {
		Measurement a = new Measurement(3, 5);
	    Measurement b = new Measurement(1, 4);
	    Measurement c = a.minus(b);
	    assertTrue(c.toString().equals("2\'1\""));
	    //number of feet should change.
	    Measurement d = c.minus(b);
	    assertTrue(d.toString().equals("0\'9\""));
	    Measurement e = new Measurement(0, 72);
	    Measurement f = new Measurement(0, 60);
	    Measurement g = e.minus(f);
	    assertTrue(g.toString().equals("1\'0\""));
	}
	public void testMultiple() {
	    Measurement a = new Measurement(0, 3);
	    Measurement b = a.multiple(3);
	    assertTrue(b.toString().equals("0\'9\""));
        //a number of feet should change.
	    Measurement c = b.multiple(2);
	    assertTrue(c.toString().equals("1\'6\""));
	    Measurement d = new Measurement(0, 30);
	    Measurement e = d.multiple(4);
	    assertTrue(e.toString().equals("10\'0\""));
	   }
	public void testToString() {
	      Measurement c = new Measurement(10, 160);
	      assertTrue(c.toString().equals("23\'4\""));
	}
}

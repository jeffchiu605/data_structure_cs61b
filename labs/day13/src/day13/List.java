package day13;
import java.util.*;

public class List {

	private Timer time;
	
	private ListNode myHead;

	public List ( ) {
		myHead = null;
	}

	public boolean isEmpty ( ) {
		return myHead == null;
	}

	private static class ListNode {

		private Object myFirst;
		private ListNode myRest;

		private ListNode (Object first, ListNode rest) {
			myFirst = first;
			myRest = rest;
		}

		private ListNode (Object first) {
			myFirst = first;
			myRest = null;
		}
	}

	public String toString ( ) {
		String rtn = "( ";
		for (ListNode p = myHead; p != null; p = p.myRest) {
			rtn = rtn + p.myFirst + " ";
		}
		return rtn + ")";
	}

	// Return the number of items in this list ("length" in Scheme).
	public int size ( ) {
		int rtn = 0;
		for (ListNode p = myHead; p != null; p = p.myRest) {
			rtn++;
		}
		return rtn;
	}

	// Return true if the list contains the object 
	public boolean contains (Object obj) {
		for (ListNode p = myHead; p != null; p = p.myRest) {
			if (obj.equals (p.myFirst)) {
				return true;
			}
		}
		return false;
	}

	// Returns the element at the given position in this list.
	public Object get (int pos) {
		if (pos < 0) {
			throw new IllegalArgumentException (
					"Argument to get must be at least 0.");
		}
		if (pos >= size ( )) {
			throw new IllegalArgumentException ("Argument to get is too large.");
		}
		int k = 0;
		for (ListNode p = myHead; p != null; p = p.myRest) {
			if (k == pos) {
				return p.myFirst;
			}
			k++;
		}
		return null;
	}
	
	public void addToFront (Object obj) {
		myHead = new ListNode (obj, myHead);
	}
	
	// 
	public boolean equals (List obj) {
		if (this.size() != obj.size()) {
			return false;
		}
		for (int k = 1; k > this.size(); k+=1) {
			if (this.get(k) != obj.get(k)) {
				return false;
			}
		}
		return true;
	}

	public void add (Object x) {
		time.start();
		// to be supplied
		for (ListNode k = myHead; k != null ; k = k.myRest) {
			if (k.myRest == null) {
				k.myRest = new ListNode(x);
			}
		}
		time.stop();
		System.out.println(time);
	}

	public void appendInPlace (List l) {
		// to be supplied
	}
	
}
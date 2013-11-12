package day12;

import java.util.NoSuchElementException;

abstract public class AbstractListNode {
	
    abstract public Comparable first ( );
    abstract public AbstractListNode rest ( );
    abstract public boolean isEmpty ( );
        public Comparable smallest ( ) {
    	  if (isEmpty ( )) {
    	    throw new NoSuchElementException ("can't find smallest in empty list");
    	  }
    	  return smallestHelper(first());
    	}

    	public Comparable smallestHelper (Comparable smallestSoFar) {
    	  if (rest().isEmpty()) {
    		  return (smallestSoFar);
    	  }
    	  else { 
    		return rest().smallestHelper(min(smallestSoFar, rest().first()));
    	  }
    	}

    	public static Comparable min (Comparable c1, Comparable c2) {
    	  if (c1.compareTo (c2) < 0) {
    	    return c1;
    	  } else {
    	    return c2;
    	  }
    	}


    // Every other list-processing method goes here.
}

class NonemptyListNode extends AbstractListNode {

    private Comparable myFirst;
    private AbstractListNode myRest;

    // cons in Scheme.
    public NonemptyListNode (Comparable first, AbstractListNode rest) {
        myFirst = first;
        if (rest == null) {
                myRest = new EmptyListNode ( );
        } else {
                myRest = rest;
        }
    }

    public NonemptyListNode (Comparable first) {
        this (first, new EmptyListNode ( ));
    }

    // car in Scheme.
    public Comparable first ( ) {
        return myFirst;
    }

    // cdr in Scheme.
    public AbstractListNode rest ( ) {
        return myRest;
    }
    
    public boolean isEmpty ( ) {
            return false;
    }
    
    public Comparable smallest ( ) {
  	  if (isEmpty ( )) {
  	    throw new NoSuchElementException ("can't find smallest in empty list");
  	  }
  	  return smallestHelper(first());
  	}

  	public Comparable smallestHelper (Comparable smallestSoFar) {
  	  if (rest().isEmpty()) {
  		  return (smallestSoFar);
  	  }
  	  else { 
  		return rest().smallestHelper(min(smallestSoFar, rest().first()));
  	  }
  	}

  	public static Comparable min (Comparable c1, Comparable c2) {
  	  if (c1.compareTo (c2) < 0) {
  	    return c1;
  	  } else {
  	    return c2;
  	  }
  	}

}

class EmptyListNode extends AbstractListNode {
    
    public EmptyListNode ( ) {
        
    }
    
    public Comparable first ( ) {
        throw new IllegalArgumentException ("There is no 'first' value stored in an EmptyListNode.");
    }
    
    public AbstractListNode rest ( ) {
        throw new IllegalArgumentException ("No elements follow an EmptyListNode.");
    }
    
    public boolean isEmpty ( ) {
        return true;
    }
    
}
package day8;

import java.util.*;

public class iterator {
	   public static void main (String [ ] args) {
		      ArrayList<String> values;
		      values = new ArrayList<String> ( );
		      values.add ("Franklin");
		      values.add ("Delano");
		      values.add ("Roosevelt");
		      // The iterator method returns an object 
		      // that has hasNext and next methods.
		      Iterator<String> iter = values.iterator ( );
		      while (iter.hasNext ( )) {
		          System.out.println (iter.next ( )); 
		      }
		   }
	   
}

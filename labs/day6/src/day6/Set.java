package day6;

public class Set {
	public class Set {
		// Represent a set of nonnegative ints from 0 to maxElement-1
		// for some initially specified maxElement. 
		
		// contains[k] is true if k is in the set, false if it isn't
		private boolean [ ] contains;
		
		// Initialize a set of ints from 0 to maxElement-1.
		public Set (int maxElement) {
			this.contains = new boolean[maxElement];
			for (int counter = 0; counter < maxElement; counter++) {
				this.contains[counter] = false;
			}
		}
		
		// precondition: 0 <= k < maxElement.
		// postcondition: k is in this set.
		public void insert (int k) {
			if (0 <= k && k < this.contains.length) {
				this.contains[k] = true;
			}
		}
		
		// precondition: 0 <= k < maxElement.
		// postcondition: k is not in this set.
		public void remove (int k) {
			if (0 <= k && k < this.contains.length) {
				this.contains[k] = false;
			}
		}
		
		// precondition: 0 <= k < maxElement
		// Return true if k is in this set, false otherwise.
		public boolean member (int k) {
			if (0 <= k && k < this.contains.length && this.contains[k] == true) {
				return true;
			} else {
				return false;
			}
		}
		
		// Return true if this set is empty, false otherwise.
		public boolean isEmpty ( ) {
			for (int counter = 0; counter < this.contains.length; counter++) {
				if (this.contains[counter] == true) {
					return false;
				}
			}
			return true;
		}
		

		private int nextIndexToReturn;
		
		public void initIterator() {
			nextIndexToReturn = -1;
			for(int k = 0; k < contains.length; k++) {
				if (contains[k] == true) {
					nextIndexToReturn = k;
				}
			}
		}
		
		public boolean hasNext() {
			return -1 < nextIndexToReturn;
		}
		
		public int next() {
			int valToReturn = nextIndexToReturn;
			for(int k = nextIndexToReturn; k < contains.length; k++) {
				if (contains[k] == true) {
					nextIndexToReturn = k;
					return valToReturn;
				}
			}
			nextIndexToReturn = -1;
			return valToReturn;
		}
		

	}
}

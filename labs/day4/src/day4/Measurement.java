package day4;

public class Measurement {
	private int inches;
	private int feet;
	/*
	 * Constructor: initialize this object to be a measurement of 0 feet, 0
	 * inches.
	 */
	public Measurement() {
		this.feet = 0;
		this.inches = 0;
	}

	/*
	 * Constructor: takes a number of feet as its single argument, using 0 as
	 * the number of inches
	 */
	public Measurement(int feet) {
		this.feet = feet;
		this.inches = 0;
	}

	/*
	 * Constructor: takes the number of feet in the measurement and the number
	 * of inches as arguments (in that order), and does the appropriate
	 * initialization
	 */
	public Measurement(int feet, int inches) {
		this.feet = feet;
		this.inches = inches;
		while (this.inches >= 12) {
			this.inches -= 12;
			this.feet += 1;
		}
	}

	/*
	 * Adds the argument m2 to the current measurement
	 */
	public Measurement plus(Measurement m2) {
		int currentM1Inches = this.feet * 12 + this.inches;
		int currentM2Inches = m2.feet * 12 + m2.inches;
		int newTotalInches = currentM1Inches + currentM2Inches;
		int newFeet = newTotalInches / 12;
		int newInches = newTotalInches % 12;
		return new Measurement (newFeet, newInches);
	}

	/*
	 * Subtracts the argument m2 from the current measurement. You may assume
	 * that m2 will always be smaller than the current measurement.
	 */
	public Measurement minus(Measurement m2) {
		
		int currentInInches = (this.feet * 12 + this.inches);
		int currentM2Inches = (m2.feet * 12 + m2.inches);
		int difference = currentInInches - currentM2Inches;
		int newFeet = difference / 12;
		int newInches = difference % 12;
		return new Measurement(newFeet, newInches); 
	}

	/*
	 * Takes a nonnegative integer argument n, and returns a new object that
	 * represents the result of multiplying this object's measurement by n. For
	 * example, if this object represents a measurement of 7 inches, multiple
	 * (3) should return an object that represents 1 foot, 9 inches.
	 */
	public Measurement multiple(int multipleAmount) {
		int currentInInches = (this.inches + this.feet*12) * multipleAmount;
		int newFeet = currentInInches / 12;
		int newInches = currentInInches % 12;
		
		return new Measurement(newFeet, newInches); 
	}

	/*
	 * toString should return the String representation of this object in the
	 * form f'i" that is, a number of feet followed by a single quote followed
	 * by a number of inches less than 12 followed by a double quote (with no
	 * blanks).
	 */
	public String toString() {
		return new String(Integer.toString(this.feet) + "\'" + Integer.toString(this.inches) + "\""); 
	}
}

package day3;

public class Debug {
    String myString;

    public Debug (String s) {
        myString = s;
    }

    // Return true when myString is the result of inserting
    // exactly one character into s, and return false otherwise.
    public boolean contains1MoreThan (String s) {
        if (myString.length ( ) == 0) {
            return false;
        } else if (s.length ( ) == 0) {
            return myString.length ( ) == 1;
        } else if (myString.charAt(0) == s.charAt(0)) {
            Debug remainder = new Debug (myString.substring(1));
            return remainder.contains1MoreThan (s.substring(1));
        } else {
            return myString.substring(1) == s;
        }
    }

    public static void main (String [ ] args) {
        check ("abc", "def");  // should be false
        check ("abc2", "abc"); // should be true
        check ("abd", "abc"); // should be false
        String str = "abc"; 
        check (str + "d", str); // should be true
        check ("bc", "abc".substring(2,3)); // should be true
        check ("1abc", "abc"); // should be true
        check ("aabc", "abc"); // should be true
        check ("ab", "abc"); //should be false
        check ("b"+1, "b");
        check ("b"+31, "b"+3);
    }

    public static void check (String s1, String s2) {
        Debug d = new Debug (s1);
        if (d.contains1MoreThan (s2)) {
            System.out.println (s1 + " is the result of adding a single character to " + s2);
        } else {
            System.out.println (s1 + " is not the result of adding a single character to " + s2);
        }
    }

}
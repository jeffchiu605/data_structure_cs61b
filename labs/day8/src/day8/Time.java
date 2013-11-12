package day8;

public class Time {

    private int myHours;
    private int myMinutes;
    
    public Time (String s) {
        int colonPos = s.indexOf (":");
        myHours = Integer.parseInt (s.substring (0, colonPos));
        myMinutes = Integer.parseInt (s.substring (colonPos+1));
    }
    
    public Time (int hours, int minutes) {
        myHours = hours;
        myMinutes = minutes;
    }

    public boolean equals (Object obj) {
	Time t = (Time) obj;
	return myHours == t.myHours && myMinutes == t.myMinutes;
    }

    public String toString ( ) {
        return myHours + ":" + myMinutes;
    }
        
    }
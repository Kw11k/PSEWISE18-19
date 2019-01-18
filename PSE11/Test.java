/**
 * @author Valentin Martens, 3393170, valentin.martens2000@gmx.de
 * @author Jan Nabatian, 3404771, jan.nabatian@yahoo.de
 */


import static java.lang.Integer.parseInt;

import java.text.DateFormatSymbols;
import java.util.Calendar;

public class Test {
	
	
	/**
	 * changes the date to a given input
	 * @param cal - the calendar
	 * @param date - the date
	 * @param sep - the separator used to split the input string
	 */
    static void setCalendarDate(final Calendar cal, final String date, final String sep) {
        final String[] fs = date.split(sep);
        cal.set(parseInt(fs[0]), parseInt(fs[1]) - 1, parseInt(fs[2]));
    }

    
    

    
    /**
     * Checks which separator was used for the input, calls the setCalendarDate() function 
     * and prints the certain weekday
     * @param args - the date input of the user
     */
    public static void main(final String[] args) {
        
    	final Calendar cal = Calendar.getInstance();
        
        if (args.length >= 1) {
            if (args[0].indexOf("-") >= 0) {
                setCalendarDate(cal, args[0], "-");
            } else if (args[0].indexOf("/") >= 0) {
                setCalendarDate(cal, args[0], "/");
            } else if (args[0].indexOf(".") >= 0) {
                setCalendarDate(cal, args[0], "\\.");
            }
        }
        
        final int wd = cal.get(Calendar.DAY_OF_WEEK);
    	DateFormatSymbols dfs = new DateFormatSymbols();
	    System.out.println(dfs.getWeekdays()[wd]);
    }
	
}
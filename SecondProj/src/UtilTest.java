import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
//import java.time;

/**
 * 
 */

/**
 * @author User
 *
 */
public class UtilTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date dt = new Date();
		String currentDate = String.valueOf(dt.getDate()); //getDay= 2 - tuesday
		
		System.out.println("Current Date is :" + currentDate);
		System.out.println("Current Time is :" + dt.getTime());// unix time, negative less than jan 1 1970
		
		Calendar cal = Calendar.getInstance(); //current time zone
		String currentCalDate = cal.get(Calendar.DATE) + "/" + (cal.get(Calendar.MONTH)+1) + "/" + cal.get(Calendar.YEAR) +" " + cal.get(Calendar.HOUR) + ":" + cal.get(Calendar.MINUTE) + cal.get(Calendar.SECOND) + "" + cal.getTimeZone().getDisplayName();
		
		System.out.println("Current Date is :" + currentCalDate);
		
		
		//cal.set(year, month, date, hourOfDay, minute);
		
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int date = Integer.parseInt(args[2]);
		int hourOfDay = Integer.parseInt(args[3]);
		int minute = Integer.parseInt(args[4]);
		int second = Integer.parseInt(args[5]);
		
		cal.set(year, month-1, date, hourOfDay, minute, second);
		String yourDate = cal.get(Calendar.DATE) + "/" + (cal.get(Calendar.MONTH)+1) + "/" + cal.get(Calendar.YEAR) +" " + 
		cal.get(Calendar.HOUR) + ":" + cal.get(Calendar.MINUTE) + cal.get(Calendar.SECOND) + "" + cal.getTimeZone().getDisplayName();
		
		System.out.println("Your Date is :" + yourDate);
		
		LocalDateTime localDate = LocalDateTime.now();
		System.out.println("Current Date Before :" + localDate);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss a");
		//
		String text = date.format(formatter);
		System.out.println("Current Date formated :" + text);
		
		
		LocalDate parsedDate = LocalDate.parse(text, formatter);
		
		
		
	}

}

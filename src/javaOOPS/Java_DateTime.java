package javaOOPS;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Java_DateTime {

	int h;

	public static void main(String[] args) throws Exception {
		Java_DateTime o = new Java_DateTime();

		o.addDate_2Calendar("11/11/2018", -50);
		o.validateJavaDate("12,29,2016");
	}

	public String getDateAndTimeNow() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		return dtf.format(now).replace("/", "_").replace(" ", "_").replace(":", "_");
	}

	public void getSysDateTime_LocalDateTime() {

		LocalDateTime now = LocalDateTime.now();

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMMM/yyyy HH:mm:ss a");
		System.out.println(dtf.format(now));

	}

	public void getSysDateTime_calender() {

		System.out.println(Calendar.getInstance().get(Calendar.DATE));
		System.out.println(Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
		System.out.println(Calendar.getInstance().get(Calendar.MONTH));
		System.out.println(Calendar.getInstance().get(Calendar.YEAR));
		System.out.println(Calendar.getInstance().get(Calendar.HOUR));
		System.out.println(Calendar.getInstance().get(Calendar.MINUTE));
		System.out.println(Calendar.getInstance().get(Calendar.SECOND));

		SimpleDateFormat mmm = new SimpleDateFormat("MMMM");
		SimpleDateFormat dd = new SimpleDateFormat("dd");
		SimpleDateFormat yyyy = new SimpleDateFormat("yyyy");
		SimpleDateFormat hh = new SimpleDateFormat("hh");
		SimpleDateFormat mm = new SimpleDateFormat("mm");
		SimpleDateFormat ss = new SimpleDateFormat("ss");
		SimpleDateFormat ampm = new SimpleDateFormat("a");
		if (Calendar.getInstance().get(Calendar.HOUR) == 0)
			h = 12;
		else
			h = Calendar.getInstance().get(Calendar.HOUR);

		String d = dd.format(new Date()) + mmm.format(new Date()) + yyyy.format(new Date()) + " "
				+ hh.format(new Date()) + mm.format(new Date()) + ss.format(new Date()) + ampm.format(new Date());
		System.out.println(d);
	}

	public void getLocalDateTime_dateFormat() {

		// Create object of SimpleDateFormat class and decide the format
		DateFormat sdf = new SimpleDateFormat("dd/MMMM/yyyy HH:mm:ss a", Locale.US);

		// get current date time with Date()
		Date d = new Date();
		System.out.println(d.toString());

		System.out.println(sdf.format(d));
	}

	public void getSysDateTime_Date() {

		// get current date time with Date()
		Date d = new Date();

		// Create object of SimpleDateFormat class and decide the format
		DateFormat sdf = new SimpleDateFormat("dd/MMMM/yyyy HH:mm:ss a", Locale.US);

		System.out.println(d.toString());
		System.out.println(sdf.format(d));
	}

	public void getSysDateTime_GregorianCalendar() {

		// create a new calendar
		GregorianCalendar gc = new GregorianCalendar();

		// print the current date and time
		System.out.println("" + gc.getTime());

		DateFormat sdf = new SimpleDateFormat("dd/MMMM/yyyy HH:mm:ss a", Locale.US);
		System.out.println(sdf.format(gc.getTime()));

		// set a new year
		gc.set(GregorianCalendar.YEAR, 1992);
		System.out.println("" + gc.getTime());

		// compute time and print the date

	}

	public void addSysDateTime_Calendar() {
		int add = 1;

		Calendar c = Calendar.getInstance();

		System.out.println("Calendar getTime = " + c.getTime());
		System.out.println("Calendar getTimeZone = " + c.getTimeZone());

		DateFormat sdf = new SimpleDateFormat("dd/MMMM/yyyy HH:mm:ss a", Locale.US);
		System.out.println("Calendar SimpleDateFormat = " + sdf.format(c.getTime()));

		c.add(Calendar.YEAR, add);
		System.out.println("After Adding : " + add + " YEAR, Calendar =" + sdf.format(c.getTime()));
		System.out.println("After Adding : " + add + " YEAR, Calendar =" + c.getTime());
		c.add(Calendar.MONTH, add);
		System.out.println("After Adding : " + add + " MONTH, Calendar = " + sdf.format(c.getTime()));
		System.out.println("After Adding : " + add + " MONTH, Calendar =" + c.getTime());
		c.add(Calendar.DATE, add);
		System.out.println("After Adding : " + add + " DATE, Calendar = " + sdf.format(c.getTime()));
		System.out.println("After Adding : " + add + " DATE, Calendar =" + c.getTime());
		c.add(Calendar.HOUR, add);
		System.out.println("After Adding : " + add + " HOUR, Calendar =" + sdf.format(c.getTime()));
		System.out.println("After Adding : " + add + " HOUR, Calendar =" + c.getTime());
		c.add(Calendar.MINUTE, add);
		System.out.println("After Adding : " + add + " MINUTE, Calendar =" + sdf.format(c.getTime()));
		System.out.println("After Adding : " + add + " MINUTE, Calendar =" + c.getTime());
		c.add(Calendar.SECOND, add);
		System.out.println("After Adding : " + add + " SECOND, Calendar =" + sdf.format(c.getTime()));
		System.out.println("After Adding : " + add + " SECOND, Calendar =" + c.getTime());

	}

	public void addDate_2Calendar(String StrDate, int interval) throws ParseException {

		// String StrIntervalType = "MONTH";
		// String StrAdd = "Calendar."+StrIntervalType+","+"interval";
		Date strDate = null;
		Calendar c = Calendar.getInstance();
		DateFormat sdf = new SimpleDateFormat("dd/mm/yyyy", Locale.US);

		strDate = sdf.parse(StrDate);
		c.setTime(strDate);

		System.out.println("Calendar getTime format = " + sdf.format(c.getTime()));
		System.out.println("Calendar getTime = " + c.getTime());

		DateFormat sdf2 = new SimpleDateFormat("dd/MMMM/yyyy HH:mm:ss", Locale.US);
		System.out.println("Calendar SimpleDateFormat = " + sdf2.format(c.getTime()));

		c.add(Calendar.DATE, interval);

		System.out.println("getTime --> After Adding : " + interval + " DATE, Calendar =" + c.getTime());
		System.out.println("sdf ---> After Adding : " + interval + " DATE, Calendar = " + sdf.format(c.getTime()));
		System.out.println("sdf2 ---> After Adding : " + interval + " DATE, Calendar = " + sdf2.format(c.getTime()));

		c.roll(Calendar.DATE, interval);

		System.out.println("getTime --> After roll : " + interval + " DATE, Calendar =" + c.getTime());
		System.out.println("sdf ---> After roll : " + interval + " DATE, Calendar = " + sdf.format(c.getTime()));
		System.out.println("sdf2 ---> After roll : " + interval + " DATE, Calendar = " + sdf2.format(c.getTime()));

	}

	public void validateJavaDate(String strDate) {

		// Create object of SimpleDateFormat class and decide the format
		DateFormat sdf = new SimpleDateFormat("dd/MMMM/yyyy HH:mm:ss a", Locale.US);
		sdf.setLenient(false);

		try {
			Date javaDate = sdf.parse(strDate);
			System.out.println(strDate + " is valid date format");
		}
		/* Date format is invalid */
		catch (ParseException e) {
			System.out.println(strDate + " is Invalid Date format");
		}
	}

}

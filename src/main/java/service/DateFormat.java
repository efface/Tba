package service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	public static String FormatString(Date dateTime) {
		return sdf.format(dateTime);
	}
	
	public static Date FormatDate(String dateTime) throws ParseException {
		return sdf.parse(dateTime);
	}
}

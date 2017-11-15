import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.TimeZone;

import javax.swing.text.DateFormatter;

public class CalMain  {
	
	public static void main(String[] args) {
		
    	CSVWriter cSVWriter = new CSVWriter("beef.ical", false);
    	CSVReader cSVReader = new CSVReader();
    	
    	MyCalendar c = new MyCalendar();
    	Event e = new Event();
    	c.setprodid("-//Google Inc//Google Calendar 70.9054//EN");
    	c.setversion("2.0");
    	c.setCalscale("GREGORIAN");
    	c.setMethod("PUBLISH");
    	c.setTimeZone("Europe/Copenhagen");
    	e.setdtStart("2017", "11", "24", "140000");
    	e.setDtEnd("2017", "11", "24", "150000");
    	e.setLastModified(new Date());
    	
    	cSVWriter.writeLine(Arrays.asList(c.getBeginCalendar()  + 
    	c.getversion()+ c.getCalscale() + c.getMethod() + 
    			c.getTimeZone()));

    	cSVWriter.writeLine(Arrays.asList(e.getBegin() + e.getdtStart() + 
    			e.getdtend() + e.getdtStamp() + e.getCreated() + e.getDescription() + 
    			e.getLastModified() + e.getLocation() + e.getSequence() + e.getStatus() + 
    			e.getSummary() + e.getTransp() + e.getEnd()));
    	
    	cSVWriter.writeLine(Arrays.asList(c.getEnd()));
    	/*
    	BEGIN:VEVENT
    	DTSTART:20171124T140000Z
    	DTEND:20171124T150000Z
    	DTSTAMP:20171114T180833Z
    	UID:11o2oj7apld4louc33lo1sjsva@google.com
    	CREATED:20171114T134140Z
    	DESCRIPTION:
    	LAST-MODIFIED:20171114T134140Z
    	LOCATION:
    	SEQUENCE:0
    	STATUS:CONFIRMED
    	SUMMARY:b
    	TRANSP:OPAQUE
    	END:VEVENT
    	*/
    	cSVWriter.closeWriter();
    	
    

		Date date = new Date();
		SimpleDateFormat dt1 = new SimpleDateFormat("yyyyMMdd'T'hhmmss'Z'");
		System.out.println(dt1.format(date) +"  real real date"); 

		
	}
	
	/*
	BEGIN:VCALENDAR
	PRODID:-//Google Inc//Google Calendar 70.9054//EN
	VERSION:2.0
	CALSCALE:GREGORIAN
	METHOD:PUBLISH
	X-WR-TIMEZONE:Europe/Copenhagen
	END:VCALENDAR
	*/
}

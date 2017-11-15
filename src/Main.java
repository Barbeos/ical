import java.util.Arrays;

public class Main  {
	
	public static void main(String[] args) {
		
    	CSVWriter cSVWriter = new CSVWriter("beef.ical", false);
    	CSVReader cSVReader = new CSVReader();
    	
    	Calendar c = new Calendar();
    	Event e = new Event();
    	c.setprodid("-//Google Inc//Google Calendar 70.9054//EN");
    	c.setversion("2.0");
    	c.setCalscale("GREGORIAN");
    	c.setMethod("PUBLISH");
    	c.setTimeZone("Europe/Copenhagen");
    	e.setdtStart("2017", "11", "24", "140000");
    	e.setDtEnd("2017", "11", "24", "150000");
    	
    	cSVWriter.writeLine(Arrays.asList(c.getBeginCalendar()  + "\n" + 
    	c.getversion() + "\n" + c.getCalscale() + "\n" + c.getMethod() + "\n" + 
    			c.getTimeZone()));

    	cSVWriter.writeLine(Arrays.asList(e.getBegin() + "\n" + e.getdtStart() + "\n" + 
    			e.getdtend() + "\n" + e.getdtStamp() + "\n" + e.getCreated() + "\n" + 
    			e.getDescription() + "\n" + e.getLastModified() + "\n" + e.getLocation() + 
    			"\n" + e.getSequence() + "\n" + e.getStatus() + "\n" + e.getSummary() + 
    			"\n" + e.getTransp() + "\n" + e.getEnd()));
    	
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

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Event {
	private String begin = "BEGIN:VEVENT";
	private String dtStart;
	private String dtEnd;
	private String description;
	private String location;
	private int sequence;
	private String lastModified;
	
	
	
	public String getBegin() {
		return this.begin + "\n";
	}
	
	public void setdtStart(String sYear, String sMonth, String sDay, String sTime) {
		this.dtStart = "DTSTART:" + sYear + sMonth + sDay + "T" + sTime + "z"+ "\n";
	}
	
	public String getdtStart() {
		return this.dtStart;
	}
	
	public void setDtEnd(String eYear, String eMonth, String eDay, String eTime) {
		this.dtEnd = "DTEND:" + eYear + eMonth + eDay + "T" + eTime + "z"+ "\n";
	}
	
	public String getdtend() {
		return this.dtEnd;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return "DESCRIPTION:" + this.description + "\n";
	}
	
	public void setLocation(String location) {
		this.location = "LOCATION:" + location+ "\n";
	}
	
	public String getLocation() {
		return this.location;
	}
	
	public String getSequence() {// does this actually work
		this.sequence = this.sequence + 1;
		return "SEQUENCE:" + this.sequence+ "\n";
	}
	
	public String getdtStamp() {
		Date date = new Date();
		SimpleDateFormat dt1 = new SimpleDateFormat("yyyyMMdd'T'hhmmss'Z'");
		return "DTSTAMP:" + dt1.format(date)+ "\n";
	}
	
	
	
	
	
	public String getCreated() {
		return "CREATED:20171114T134140Z"+ "\n";
	}
	
	public void setLastModified(Date date) {
		SimpleDateFormat dt1 = new SimpleDateFormat("yyyyMMdd'T'hhmmss'Z'");
		this.lastModified = dt1.format(date);
	}
	
	public String getLastModified() {
		return "LAST-MODIFIED:"+ this.lastModified + "\n";
	}
	
	
	
	
	
	public String getStatus() {
		return "STATUS:CONFIRMED"+ "\n";
	}
	
	public String getSummary() {
		return "SUMMARY:b"+ "\n";
	}
	
	public String getTransp() {
		return "TRANSP:OPAQUE"+ "\n";
	}
	
	public String getEnd() {
		return "END:VEVENT";
	}
	
	

}

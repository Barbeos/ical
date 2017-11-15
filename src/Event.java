

public class Event {
	private String begin = "BEGIN:VEVENT";
	private String dtStart;
	private String dtEnd;
	private String description;
	private String location;
	private int sequence;
	
	
	
	public String getBegin() {
		return this.begin;
	}
	
	public void setdtStart(String sYear, String sMonth, String sDay, String sTime) {
		this.dtStart = "DTSTART:" + sYear + sMonth + sDay + "T" + sTime + "z";
	}
	
	public String getdtStart() {
		return this.dtStart;
	}
	
	public void setDtEnd(String eYear, String eMonth, String eDay, String eTime) {
		this.dtEnd = "DTEND:" + eYear + eMonth + eDay + "T" + eTime + "z";
	}
	
	public String getdtend() {
		return this.dtEnd;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return "DESCRIPTION:" + this.description;
	}
	
	public void setLocation(String location) {
		this.location = "LOCATION:" + location;
	}
	
	public String getLocation() {
		return "LOCATION:";
	}
	
	public String getSequence() {// does this actually work
		this.sequence = this.sequence + 1;
		return "SEQUENCE:" + this.sequence;
	}
	
	
	
	
	
	
	public String getdtStamp() {
		return "DTSTAMP:" + "20171114T180833Z";
	}
	
	public String getCreated() {
		return "CREATED:20171114T134140Z";
	}
	
	public String getLastModified() {
		return "LAST-MODIFIED:20171114T134140Z";
	}
	

	

	
	public String getStatus() {
		return "STATUS:CONFIRMED";
	}
	
	public String getSummary() {
		return "SUMMARY:b";
	}
	
	public String getTransp() {
		return "TRANSP:OPAQUE";
	}
	
	public String getEnd() {
		return "END:VEVENT";
	}
	
	

}

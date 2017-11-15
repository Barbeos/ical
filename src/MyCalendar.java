

public class MyCalendar {
	private String prodid;
	private String version;
	private String beginCalendar = "BEGIN:VCALENDAR" + "\n";
	private String calscale;
	private String method;
	private String timeZone;
	private String end = "END:VCALENDAR";
	
	public void setprodid(String prodid) {
		this.prodid = "PRODID:" + prodid+ "\n";
	}
	
	public void setversion(String version) {
		this.version = "VERSION:" + version+ "\n";
	}
	
	public String getversion() {
		return this.version;
	}
	
	public String getprodid() {
		return this.prodid;
	}
	
	public String getBeginCalendar() {
		return this.beginCalendar;
	}
	
	public void setCalscale(String calscale) {
		this.calscale = "CALSCALE:" + calscale+ "\n";
	}
	
	public String getCalscale() {
		return this.calscale;
	}
	
	public void setMethod(String method) {
		this.method = "METHOD:" + method+ "\n";
	}
	
	public String getMethod() {
		return this.method;
	}
	
	public void setTimeZone(String timeZone) {
		this.timeZone = "X-WR-TIMEZONE:" + timeZone;
	}
	
	public String getTimeZone() {
		return this.timeZone;
	}
	
	public String getEnd() {
		return this.end;
	}
	
}

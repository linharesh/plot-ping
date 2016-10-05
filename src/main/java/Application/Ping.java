package Application;

import java.sql.Date;

public class Ping {
	
	private long time;
	private Date date;
	private int sequenceNumber;
	private boolean successful;
	
	public Ping(long time, Date date, int sequenceNumber, boolean successful) {
		super();
		this.time = time;
		this.date = date;
		this.sequenceNumber = sequenceNumber;
		this.successful = successful;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(int sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	public boolean isSuccessful() {
		return successful;
	}

	public void setSuccessful(boolean successful) {
		this.successful = successful;
	}
	

}

package program;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Subtitle {

	private int index;
	private Date startTime;
	private Date endTime;
	private String text;
	public Subtitle(int index, Date startTime, Date endTime, String text) {
		super();
		this.index = index;
		this.startTime = startTime;
		this.endTime = endTime;
		this.text = text;
	}
	public int getIndex() {
		return index;
	}
	public Date getStartTime() {
		return startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public String getText() {
		return text;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public void setText(String text) {
		this.text = text;
	}
	@Override
	public String toString() {
		SimpleDateFormat ora = new SimpleDateFormat("HH:mm:ss,SSS");
		return index+" "+ora.format(startTime)+" ->"+ora.format(endTime)+" "+text;
	}
}

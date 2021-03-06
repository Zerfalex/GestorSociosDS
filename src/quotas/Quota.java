package quotas;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Date;

public class Quota implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Date date;
	public Double value;
	
	public Quota(double val) {
		date = new Date();
		value = new Double(val);
	}
	
	public void pay(double val) {
		value -= val;
	}
	
	
}

class sortByDateAsc implements Comparator<Quota> {
	
	@Override
	public int compare(Quota a, Quota b) {
		int r = a.date.compareTo(b.date);
		if ( r == 0) {
			return a.value.compareTo(b.value);
		}
		else 
			return r;
	}
}

class sortByDateDesc implements Comparator<Quota> {
	
	@Override
	public int compare(Quota a, Quota b) {
		int r = a.date.compareTo(b.date);
		if ( r == 0) {
			return -a.value.compareTo(b.value);
		}
		else 
			return -r;
	}
}

class sortByValueAsc implements Comparator<Quota> {
	
	@Override
	public int compare(Quota a, Quota b) {
		int r = a.value.compareTo(b.value);
		if ( r == 0) {
			return a.date.compareTo(b.date);
		}
		else 
			return r;
	}
}

class sortByValueDesc implements Comparator<Quota> {
	
	@Override
	public int compare(Quota a, Quota b) {
		int r = a.value.compareTo(b.value);
		if ( r == 0) {
			return -a.date.compareTo(b.date);
		}
		else 
			return -r;
	}
}

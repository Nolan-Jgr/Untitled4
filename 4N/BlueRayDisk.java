package lab14;
import java.util.*;

@SuppressWarnings("unused")
public class BlueRayDisk {
	public String title;
	public String director;
	public int yearOfRelease;
	public double cost;
	public BlueRayDisk(String t,String d,int y, double c) {
		title = t;
		director = d;
		yearOfRelease = y;
		cost = c;
	}
	@Override
	public String toString() {
		return "$" + this.cost + " " + this.yearOfRelease + " " + this.title + ", " + this.director;
	}
	

}

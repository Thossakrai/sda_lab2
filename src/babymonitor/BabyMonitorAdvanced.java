package babymonitor;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class BabyMonitorAdvanced implements Observer {
	private Baby mdata, cdata;
	private String babyname;
	private String name;
	private boolean crying;
	private int level;

	public BabyMonitorAdvanced(String name, Baby m, Baby c) {
		this.name=name; this.mdata=m; this.cdata=c;
		mdata.addObserver(this);cdata.addObserver(this);
	}

	public void display() {
		if (crying) {
			System.out.println("Monitor:"+ name + " baby: " + babyname + " is crying at level: " + level);
		}
	}

	@Override
	public void update(Observable o, Object arg) {
		Baby b = (Baby)arg;
		ArrayList data = b.getData();
		this.babyname = (String) data.get(0);
		this.crying = (boolean) data.get(1);
		this.level = (int) data.get(2);
		display();
	}
}

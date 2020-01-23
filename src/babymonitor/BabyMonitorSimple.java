package babymonitor;

import java.util.Observable;
import java.util.Observer;

public class BabyMonitorSimple implements Observer {
	Observable observable;
	private boolean crying;
	private int level;
	private String monitorName;
	private String babyName;

	public BabyMonitorSimple(String name,Observable observable) {
		this.monitorName = name;
		this.observable = observable;
		observable.addObserver(this);
	}


	@Override
	public void update(Observable obs, Object arg) {
		if (obs instanceof Baby) {
			Baby baby = (Baby)obs;
			this.babyName = baby.getName();
			this.crying = baby.getCrying();
			this.level = baby.getLevel();
			display();
		}
	}

	public void display() {
		if (crying) {
			System.out.println("Monitor:"+ monitorName + " baby: " + babyName + " is crying at level: " + level);
		}
	}
}
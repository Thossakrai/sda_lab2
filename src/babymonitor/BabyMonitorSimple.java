package babymonitor;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class BabyMonitorSimple implements Observer {

	public Baby baby;
	private String name;
	private boolean crying;
	private int level;
	
	public BabyMonitorSimple(String location, Baby d) {
		this.name=location;
		this.baby = d;
		baby.addObserver(this);
	}
		
	public void display() {
		if (crying) {
			System.out.println("Monitor:" + name + " baby is crying");
		}
	}
	
	public void turnOff() {
		baby.deleteObserver(this);
	}


	public void update(Observable o, Object arg) {
		Baby b = (Baby)arg;
		ArrayList data = b.getData();
		this.name = (String) data.get(0);
		this.crying = (boolean) data.get(1);
		this.level = (int) data.get(2);
		display();
	}

//	public void update(String name, boolean crying, int level) {
//
//	}
}

package babymonitor;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class BabyMonitorAdvanced implements Observer {
	Baby baby1, baby2;
    public String babyMonitor, babyName;
    public boolean crying;
    public int level;


    public BabyMonitorAdvanced(String name, Baby b1, Baby b2) {
    	this.baby1 = b1;
    	this.baby2 = b2;
        this.babyMonitor = name;
        b1.addObserver(this);
        b2.addObserver(this);
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
    	System.out.println("Monitor:"+ babyMonitor + " baby " + babyName + " is crying at level: " + level);
	}

}


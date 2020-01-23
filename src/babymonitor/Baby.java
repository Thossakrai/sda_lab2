package babymonitor;

import java.util.Observable;

public class Baby extends Observable {
    private boolean crying;
    private int level;
	private String name;

    public Baby(String name) {
    	this.name = name;
    }

    public void dataChanged() {
        setChanged();
        notifyObservers();
    }


    public void setData(boolean crying, int level) {
        this.crying = crying;
        this.level = level;
        dataChanged();
    }

    public int getLevel() {
        return level;
    }

    public boolean getCrying() {
        return crying;
    }

    public String getName() {
    	return name;
	}
}

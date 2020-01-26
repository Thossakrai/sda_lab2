package babymonitor;

import java.util.ArrayList;
import java.util.Observable;

public class Baby extends Observable {
    public String name;
    public boolean crying;
    public int level;

    public Baby(String name) {
        this.name = name;
    }

    public void setData(boolean crying, int level) {
        this.crying = crying;
        this.level = level;
        setChanged();
        notifyObservers(this);
    }

    public ArrayList getData(){
        ArrayList data = new ArrayList();
        data.add(this.name);
        data.add(this.crying);
        data.add(this.level);
        return data;
    }

}

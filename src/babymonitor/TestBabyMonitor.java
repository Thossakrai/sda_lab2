package babymonitor;

import java.util.ArrayList;

public class TestBabyMonitor {


	public static void main(String[] args) {
        Baby marla = new Baby("marla");
        // one monitor with one baby
        BabyMonitorSimple livingRoom = new BabyMonitorSimple("Kitchen ", marla);
        marla.setData(true, 1);
        // one monitor listening to two babies
        Baby charlie = new Baby("Charlie");
        BabyMonitorAdvanced kitchen = new BabyMonitorAdvanced("Living Room ", marla, charlie);
        marla.setData(true, 2);
        charlie.setData(true, 1);

    }
}

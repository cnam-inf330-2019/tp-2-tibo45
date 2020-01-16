package net.cnam.inf330;

import java.util.Comparator;

public class PlaneFuelComparator implements Comparator<Plane> {

    public int compare(Plane p1, Plane p2) {

        return p1.getFuelCapacity()-p2.getFuelCapacity();
    }
}

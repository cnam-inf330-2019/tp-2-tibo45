package net.cnam.inf330;

import org.junit.Test;
import org.junit.function.ThrowingRunnable;

import java.util.PriorityQueue;

import static org.junit.Assert.*;

/**
 * Class for testing Airport Simulator application.
 */
public class AirportSimulatorTest {

    //@Test
    /*public void testPriorityQueue(){
        PriorityQueue<Plane> PQPlane = new PriorityQueue<Plane>(new PlaneFuelComparator());
        PQPlane.add(new Plane(1,"toto",true,4));
        PQPlane.add(new Plane(2,"toto2",true,5));
        PQPlane.add(new Plane(3,"toto3",true,2));
        assertEquals(PQPlane

        // FIXME Test PriorityQueue ordering
    }*/
    //...

    /* TODO 5. Complete this method for testing the InvalidFuelCapacityException in the
        AirportSimulator::createPlane method
     */
    @Test
    public void testCreatePlane(){
        AirportSimulator ap = new AirportSimulator();

        assertThrows(InvalidFuelCapacityException.class,()->{
            ap.createPlane(-1,true);
        });
    }

    @Test
    public void testInvalidFuelCapacityException() {
        AirportSimulator simulator = new AirportSimulator();
        ThrowingRunnable tr = () -> simulator.simulateTurnWithNewPlanes(3, 3, new int[]{1, 1, -1});

        //assertThrows(...);
    }

    @Test
    public void testScenario1() throws InvalidFuelCapacityException {
        // Simulate scenario 1
        AirportSimulator simulator = new AirportSimulator();
        simulator.simulateTurnWithNewPlanes(3, 3, new int[]{1, 1, 1});
        simulator.simulateTurnWithNewPlanes(3, 3, new int[]{2, 2, 2});
        simulator.simulateTurnWithNewPlanes(0, 0, new int[]{0, 0, 0});
        simulator.simulateTurnWithNewPlanes(2, 3, new int[]{7, 5, 9});
        simulator.simulateTurnWithNewPlanes(2, 3, new int[]{6, 7, 5});
        simulator.simulateTurnWithNewPlanes(2, 3, new int[]{2, 9, 4});
        simulator.simulateTurnWithNewPlanes(3, 3, new int[]{1, 5, 0});
        simulator.simulateTurnWithNewPlanes(2, 3, new int[]{6, 2, 0});
        simulator.simulateTurnWithNewPlanes(1, 3, new int[]{0, 0, 0});

        // TODO 7. Test that scenario 1 does not cause any plane crashes
        // assert...
    }
}

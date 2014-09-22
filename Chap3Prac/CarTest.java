

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class CarTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarTest
{
    /**
     * Default constructor for objects of class CarTest
     */
    public CarTest()
    {
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before       
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testGetGasInTank()
    {
        Car testCar = new Car(50);
        double gallons = testCar.getGas();
        assertEquals(0.0, gallons, 1e-6);        
    }
    
    @Test
    public void testAddGas()
    {
        Car testCar = new Car(50);
        testCar.addGas(20);
        double gallons = testCar.getGas();
        assertEquals(20.0, gallons, 1e-6);
        
        testCar.addGas(5);
        gallons = testCar.getGas();
        assertEquals(25.0, gallons, 1e-6);
        
        testCar.addGas(40);
        gallons = testCar.getGas();
        assertEquals(50.0, gallons, 1e-6);
    }
    
    @Test
    public void testDrive()
    {
        Car testCar = new Car(50);
        testCar.addGas(20);
        testCar.drive(25);
        double gallons = testCar.getGas();
        assertEquals(19.5, gallons, 1e-6);
        
        testCar.drive(100);
        gallons = testCar.getGas();
        assertEquals(17.5, gallons, 1e-6);
    }
}

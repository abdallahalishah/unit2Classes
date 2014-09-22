

/**
 * The Car class tracks the fuel remaining in the car as it is driven
 * based on the fuel efficiency.
 * 
 * @author Abdallah Alishah
 * @version 12 September 2014
 */
public class Car
{
    /** the fuel efficiency of this car measured in mpg */
    private double fuelEfficiency;
    
    
    /** the number of gallons of fuel left in this car's tank */
    private double fuelInTank;
    
    /** the number of gallons if takes to fill this car's tank */
    private double tankCapacity;
    
    /**
     * Constructor for a car of the specified fuel efficiency.
     */
    public Car(double mpg)
    {           
        this.fuelEfficiency = mpg;
        this.tankCapacity = 50;
    }

    /**
     * Adds the specified number of gallons of fuel to this car's tank.
     *
     * @pre     specified number of gallons doesn't exceed this car's
     *              tank's capacity
     * @param   gallons     number of gallons of fuel to add to this car's tank
     * 
     */
    public void addGas(double gallons)
    {
        this.fuelInTank = this.fuelInTank + gallons;
        if (this.fuelInTank > this.tankCapacity)
        {
            this.fuelInTank = this.tankCapacity;
        }
    }
    

    /**
     * Updates the fuel in this car's tank based on the specified 
     * number of miles driven and this car's fuel efficiency
     *
     * @pre     the specified number oof miles doesn't consume more
     *              than the fuel in this car''s tank
     * @param   miles     number of miles this car has driven
     */
    public void drive(double miles)
    {
        this.fuelInTank = this.fuelInTank - (miles/this.fuelEfficiency);
    }
    

    /**
     * Returns the number of gallons of fuel left in this car's tank.
     *
     * @return  the number of gallons of fuel left in this car's tank.
     */
    public double getGas()
    {
        return this.fuelInTank;
    }

}

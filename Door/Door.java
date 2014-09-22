

/**
 * An everyday object
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door
{
    /** description of instance variable x (add comment for each instance variable) */
    
    private String state;
    private String name;
    

    /**
     * Default constructor for objects of class Door
     */
    public Door(String doorName, String doorState)
    {
        this.state = doorState;
        this.name = doorName;                
    }

    /**
     * This method sets the doorState into what the user passes into the parameter
     * 
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   doorState       parameter that is a string (either "open" or "closed") to 
     *                          change an instance variable.
     */
    public void setState(String doorState)
    {
        this.state = doorState;
    }
    


    /**
     * Gets the state of the door, which can either be "closed" or "open".
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @return  description of the return value
     */
    public String getState()
    {
        return this.state;
    }

    /**
     * Returns the name of the door.
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @return  returns a string 
     */
    public String getName()
    {
        return this.name;
    }


    /**
     * Changes the current name of the door into what the user sets it to.
     * 
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   y   description of parameter y
     */
    public void setName(String newName)
    {
        this.name = newName;
    }

}

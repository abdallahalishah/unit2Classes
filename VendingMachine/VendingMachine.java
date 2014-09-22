

/**
 * Creates a vending machine object that allows tokens to be put in and soda cans to come out
 * 
 * Abdallah Alishah
 * 18 September 2014
 */
public class VendingMachine
{
    /** makes token variable that is an int type */
    private int tokens;
    
    /** makes a variable to calculate the amount of cans left in the vending machine */
    private int cansLeft;
    
    /** makes a variable to initiate the total amount of cans that can be in the vending machine */
    private int maxCans;

    /**
     * Initializes the maximum amount of cans the vending can hold
     */
    public VendingMachine(int maxCans)
    {
        this.maxCans = maxCans;
    }

    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   y   description of parameter y
     * @return  description of the return value
     */
    public void fillUp(int cans)
    {
        this.cansLeft = this.cansLeft + cans;
        if (this.cansLeft > this.maxCans)
        {
            this.cansLeft = this.maxCans;
        }
    }

    
    /**
     * Inserts a token into the vending and adds 1 to token count but if the remaining cans left 
     * less than 0 then it adds one to token count but nobody gets a can :P
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     */
    public void insertToken()
    {
        this.tokens = this.tokens + 1;
        this.cansLeft = this.cansLeft - 1;
        if (this.cansLeft < 0)
        {
            this.cansLeft = 0;
        }
    }

    /**
     * Returns the amount of cans left in the vending machine
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @return  int value of the amount of cans left
     */
    public int getCans()
    {
        return this.cansLeft;
    }

    /**
     * Returns the amount of tokens that have been inserted into the vending machine
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @return  int value is returned of total tokens
     */
    public int getTokens()
    {
        return this.tokens;
    }

}

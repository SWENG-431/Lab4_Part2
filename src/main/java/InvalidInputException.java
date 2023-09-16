/**
 * Class InvalidInputException
 * Called for invalid triangle dimensions.
 * @author Brian Karimi, Nicole Vadillo, Katie Killian
 */
public class InvalidInputException extends Exception
{
    /**
     * Constructor for class InvalidInputException
     */
    public InvalidInputException()
    {
        super("Triangle Exception: Not a triangle");
    }
}

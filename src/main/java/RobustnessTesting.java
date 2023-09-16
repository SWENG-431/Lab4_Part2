/**
 * Class RobustnessTesting
 * @author Brian Karimi, Nicole Vadillo, Katie Killian
 */
public class RobustnessTesting
{
    /**
     * Method that checks if dimensions are
     * consistent with those of a triangle.
     * @param a takes in side a of the triangle
     * @param b takes in side b
     * @param c takes in side c
     * @return true if consistent else false
     */
    public boolean Foo(double a, double b, double c)
    {
        boolean verify = true;
        //Check if dimensions are consistent with a triangle
        //Call exception if not consistent
        try
        {
            verify = verifyIfTriangle(a, b, c);
        }
        catch(InvalidInputException ex)
        {
            System.out.println(ex.getMessage());
        }

        //Check boundary conditions for the various variables
        if (a < 1 || a > 100)
            verify = false;
        else if (b < 50 || b > 150)
            verify = false;
        else if (c < 100 || c > 200)
            verify = false;

        //Call the function that determines the triangle type
        //Print the type if the exception is not called
        Type(a, b, c);

        return verify;
    }

    /**
     * Method that checks if boundary
     * conditions are satisfied.
     * @param a takes in side a of the triangle
     * @param b takes in side b
     * @param c takes in side c
     * @return true if conditions are satisfied
     *  else false
     */
    public boolean verifyIfTriangle(double a, double b, double c) throws InvalidInputException
    {
        boolean verify = true;

        if ((a + b) <= c)
        {
            verify = false;
        }
        else if ((a + c) <= b)
        {
            verify = false;
        }
        else if ((b + c) <= a)
        {
            verify = false;
        }
        if(!verify)
            throw new InvalidInputException();

        return verify;
    }

    /**
     * Method that determines triangle type:
     * equilateral, isosceles or scalene.
     * @param A takes in side A of the triangle
     * @param B takes in side B
     * @param C takes in side C
     *  Prints the triangle type.
     */
    public  void Type(double A, double B, double C)
    {
        if (A == B && A == C)
        {
            System.out.println("Type: Equilateral");
        }
        else if (A == B || B == C || A == C)
        {
            System.out.println("Type: Isosceles");
        }
        else
            System.out.println("Type: Scalene");
    }
}

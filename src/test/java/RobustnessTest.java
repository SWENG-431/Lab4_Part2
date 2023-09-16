import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Class RobustnessTest
 * junit test class for class RobustnessTesting
 * @author Brian Karimi, Nicole Vadillo, Katie Killian
 */
class RobustnessTest
{
    //Set parameters for foo test function
    @ParameterizedTest
    @CsvSource({
            "0.0,    100.5,   150.5",   //Expected test failure
            "1.0,    100.5,   150.5",
            "2.0,    100.5,   150.5",
            "50.5,   100.5,   150.5",
            "99.0,   100.5,   150.5",
            "100.0,  100.5,   150.5",
            "101.0,  100.5,   150.5",   //Expected test failure
            "50.5,   49.0,    150.5",   //Expected test failure
            "50.5,   50.0,    150.5",
            "50.5,   51.0,    150.5",
            "50.5,   149.0,   150.5",
            "50.5,   150.0,   150.5",
            "50.5,   151.0,    150.5",  //Expected test failure
            "50.5,   100.5,   99.0",    //Expected test failure
            "50.5,   100.5,   100.0",
            "50.5,   100.5,   101.0",
            "50.5,   100.5,   199.0",
            "50.5,   100.5,   200.0",
            "50.5,   100.5,   201.0",   //Expected test failure
            "100.0,  100.0,   120.0",   //Expected result: Isosceles (additional test case)
            "100.0,  100.0,   100.0"   //Expected result: Equilateral (additional test case)
    })
    void foo(double first, double second, double third)
    {
        RobustnessTesting testing = new RobustnessTesting();
        assertTrue(testing.Foo(first, second, third));
    }
}
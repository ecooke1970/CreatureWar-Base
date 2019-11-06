import java.util.Random;

/**
 * Write a description of class Randomizer here.
 *
 * @author (Erik Cooke)
 * @version (2019.11.05)
 */
public class Randomizer
{
    private static Random rand;

    /**
     * Constructor for objects of class Randomizer
     */
    public Randomizer()
    {
        rand = new Random();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static int nextInt(int y)
    {
        if (rand == null) {
            rand = new Random();
        }
        return rand.nextInt(y);
    }
}

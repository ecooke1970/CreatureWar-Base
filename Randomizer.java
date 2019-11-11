import java.util.Random;

/**
 * Class to generate random numbers
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
     * Generate a random int
     *
     * @param y - Exclusive upper limit of random number range
     * @return int - The random number that was generated
     */
    public static int nextInt(int y)
    {
        if (rand == null) {
            rand = new Random();
        }
        return rand.nextInt(y);
    }
}
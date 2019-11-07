
/**
 * Cyberdemon, min strength 20-max strength 40, min hp 25-max hp 100.
 *
 * @author (Erik Cooke)
 * @version (2019.11.05)
 */
public class Cyberdemon extends Demon
{
    // instance variables - replace the example below with your own
    private static final int MIN_CYBERDEMON_STR = 20;
    private static final int MAX_CYBERDEMON_STR = 40;
    private static final int MIN_CYBERDEMON_HP = 25;
    private static final int MAX_CYBERDEMON_HP = 100;

    /**
     * Constructor for objects of class Cyberdemon
     */
    public Cyberdemon()
    {
        super(
            Randomizer.nextInt(MAX_CYBERDEMON_STR - MIN_CYBERDEMON_STR + 1) + MIN_CYBERDEMON_STR,
            Randomizer.nextInt(MAX_CYBERDEMON_HP - MIN_CYBERDEMON_HP + 1) + MIN_CYBERDEMON_HP
            );
    }
    
    // public boolean isAlive()
    // {
        // return super.isAlive();
    // }
}

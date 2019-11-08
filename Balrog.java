
/**
 * Balrog, min strength 50-max strength 100, min hp 80-max hp 200.
 *
 * @author (Erik Cooke)
 * @version (2019.11.05)
 */
public class Balrog extends Demon
{
    // instance variables - replace the example below with your own
    private static final int MIN_BALROG_STR = 50;
    private static final int MAX_BALROG_STR = 100;
    private static final int MIN_BALROG_HP = 80;
    private static final int MAX_BALROG_HP = 200;

    /**
     * Constructor for objects of class Balrog
     */
    public Balrog()
    {
        super(
            Randomizer.nextInt(MAX_BALROG_STR - MIN_BALROG_STR + 1) + MIN_BALROG_STR,
            Randomizer.nextInt(MAX_BALROG_HP - MIN_BALROG_HP + 1) + MIN_BALROG_HP
        );
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @return int The amount of damage inflicted
     */
    public int damage()
    {
        
        return (Randomizer.nextInt(strength) + 1) + (Randomizer.nextInt(strength) + 1);

    }
}

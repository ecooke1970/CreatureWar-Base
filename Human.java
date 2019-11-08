
/**
 * Human, min strength 5-max strength 18, min hp 5-max hp 30
 *
 * @author (Erik Cooke)
 * @version (2019.11.05)
 */
public class Human extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MIN_HUMAN_STR = 5;
    private static final int MAX_HUMAN_STR = 18;
    private static final int MIN_HUMAN_HP = 5;
    private static final int MAX_HUMAN_HP = 30;

    /**
     * Constructor for objects of class Human
     */
    public Human()
    {        
        super(
            Randomizer.nextInt(MAX_HUMAN_STR - MIN_HUMAN_STR + 1) + MIN_HUMAN_STR,
            Randomizer.nextInt(MAX_HUMAN_HP - MIN_HUMAN_HP + 1) + MIN_HUMAN_HP
        );            
    }
}

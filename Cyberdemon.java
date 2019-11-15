/**
 * Cyberdemon, min strength 20-max strength 40, min hp 25-max hp 100.
 *
 * @author (Erik Cooke)
 * @version (2019.11.05)
 */
public class Cyberdemon extends Demon
{
    private static final int MIN_CYBERDEMON_STR = 20;
    private static final int MAX_CYBERDEMON_STR = 40;
    private static final int MIN_CYBERDEMON_HP = 25;
    private static final int MAX_CYBERDEMON_HP = 100;
    
    /**
     * 
     */
    public Cyberdemon()
    {
        super(MIN_CYBERDEMON_STR, MAX_CYBERDEMON_STR, MIN_CYBERDEMON_HP, MAX_CYBERDEMON_HP);
    }
}
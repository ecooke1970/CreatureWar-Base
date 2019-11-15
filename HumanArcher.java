
/**
 * HumanArcher, min strength 5-max strength 18, min hp 5-max hp 30
 *
 * @author (Erik Cooke)
 * @version (2019.11.05)
 */
public class HumanArcher extends Human
{
    private static final int MIN_HUMAN_STR = 5;
    private static final int MAX_HUMAN_STR = 18;
    private static final int MIN_HUMAN_HP = 5;
    private static final int MAX_HUMAN_HP = 28;

    /**
     * 
     */
    public HumanArcher()
    {
        super(MIN_HUMAN_STR, MAX_HUMAN_STR, MIN_HUMAN_HP, MAX_HUMAN_HP);
    }
    
    /**
     * HumanArcher damage generator.
     * 20% chance to cause double damage
     */
    public int damage()
    {
        if(Randomizer.nextInt(5) == 0) {
            return super.damage() * 2;
        }
        else {
            return super.damage();
        }
    }
}

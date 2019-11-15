
/**
 * HumanSwordsman, min strength 5-max strength 18, min hp 5-max hp 30
 *
 * @author (Erik Cooke)
 * @version (2019.11.05)
 */
public class HumanSwordsman extends Human
{
    private static final int MIN_HUMAN_STR = 10;
    private static final int MAX_HUMAN_STR = 22;
    private static final int MIN_HUMAN_HP = 10;
    private static final int MAX_HUMAN_HP = 35;

    /**
     * 
     */
    public HumanSwordsman()
    {
        super(MIN_HUMAN_STR, MAX_HUMAN_STR, MIN_HUMAN_HP, MAX_HUMAN_HP);
    }
    
    /**
     * HumanSwordsman damage generator.
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

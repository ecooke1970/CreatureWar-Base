
/**
 * Human, min strength 5-max strength 18, min hp 5-max hp 30
 *
 * @author (Erik Cooke)
 * @version (2019.11.05)
 */
public abstract class Human extends Creature
{
    /**
     * 
     */
    public Human(int MIN_HUMAN_STR, int MAX_HUMAN_STR, int MIN_HUMAN_HP, int MAX_HUMAN_HP)
    {
        super(MIN_HUMAN_STR, MAX_HUMAN_STR, MIN_HUMAN_HP, MAX_HUMAN_HP);
    }
}

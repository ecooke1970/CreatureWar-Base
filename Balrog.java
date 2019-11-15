/**
 * Balrog, min strength 50-max strength 100, min hp 80-max hp 200.
 *
 * @author (Erik Cooke)
 * @version (2019.11.05)
 */
public class Balrog extends Demon
{
    private static final int MIN_BALROG_STR = 50;
    private static final int MAX_BALROG_STR = 100;
    private static final int MIN_BALROG_HP = 80;
    private static final int MAX_BALROG_HP = 200;
    
    /**
     * 
     */
    public Balrog()
    {
        super(MIN_BALROG_STR, MAX_BALROG_STR, MIN_BALROG_HP, MAX_BALROG_HP);
    }

    /**
     * Balrog damage generator. Attacks twice each round.
     *
     * @return int The amount of damage inflicted
     */
    public int damage()
    {
        return super.damage() + super.damage();
    }
}

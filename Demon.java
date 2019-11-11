
/**
 * Demon, 5% chance to do magic damage(+50)
 *
 * @author (Erik Cooke)
 * @version (2019.11.05)
 */
public class Demon extends Creature
{
    /**
     * Constructor for objects of class Demon
     */
    public Demon()
    {
        super();
    }
    
    /**
     * Constructor for objects of class Demon
     * @param str - number to set str to
     * @param hp - number to set hp to
     */
    public Demon(int str, int hp)
    {
        super(str, hp);
    }

    /**
     * Demon damage generator. 5% chance to do magical damage, +50 to damage.
     * 
     * @return int amount of damage inflicted.
     */
    public int damage()
    {
        if(Randomizer.nextInt(20) == 0)
        {
            return Randomizer.nextInt(strength) + 51;
        }
        else
        {
            return Randomizer.nextInt(strength) + 1;
        }
    }
}

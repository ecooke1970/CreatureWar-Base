
/**
 * Write a description of class Demon here.
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
     */
    public Demon(int str, int hp)
    {
        super(str, hp);
    }

    /**
     * An example of a method - replace this comment with your own
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

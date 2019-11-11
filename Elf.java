
/**
 * Elf, min strength 5-max strength 18, min hp 10-max hp 30.
 *
 * @author (Erik Cooke)
 * @version (2019.11.05)
 */
public class Elf extends Creature
{
    private static final int MIN_ELF_STR = 5;
    private static final int MAX_ELF_STR = 18;
    private static final int MIN_ELF_HP = 10;
    private static final int MAX_ELF_HP = 30;

    /**
     * Constructor for objects of class Elf
     */
    public Elf()
    {
        super(
            Randomizer.nextInt(MAX_ELF_STR - MIN_ELF_STR + 1) + MIN_ELF_STR,
            Randomizer.nextInt(MAX_ELF_HP - MIN_ELF_HP + 1) + MIN_ELF_HP
            );
    }
    
    /**
     * Elf damage generator. 10% change to do magical damage(2x damage)
     * @return int The amount of damage this creature inflicted
     */
    public int damage()
    {
        if(Randomizer.nextInt(10) == 0)
        {
            return (Randomizer.nextInt(strength) + 1) * 2;
        }
        else
        {
            return Randomizer.nextInt(strength) + 1;
        }
    }
}

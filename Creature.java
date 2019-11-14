import java.util.Random;

/**
 * A generic Creature, also the superclass for several different creatures
 * 
 * @author (Erik Cooke) 
 * @version (2019.11.05)
 */
public abstract class Creature
{
   private int hp;
   private int str;
   private Randomizer rand;
   
   /**
    * Constructor for the class Creature
    */
   public Creature(){
       hp = 10;
       str = 10;
   }   
   
   /**
    * Constructor for Creature taking int for strength and hit points
    * @param strength amount to set strength to
    * @param hp amount to set hp to
    */
   public Creature(int str, int hp)
   {
       if(str >= 5){
           this.str = str;
       }
       else{
            this.str = 5;
       }
       if(hp >= 5){
            this.hp = hp;
       }
       else{
            this.hp = 5;
       }
    }
    
    /**
     * Constuctor for Creature taking int for max str, min str, min hp, and max hp
     * @param minStr minimum strength for this creature
     * @param maxStr maximum strength for this creature
     * @param minHp minimum health points for this creature
     * @param maxHp maximum health points for this creature
     */
    public Creature(int minStr, int maxStr, int minHp, int maxHp)
    {
        rand = new Randomizer();
        this.str = rand.nextInt(maxStr - minStr + 1) + minStr;
        this.hp = rand.nextInt(maxHp - minHp + 1) + minHp;
    }
    
   /**
    * How much damage
    * @return int - the amount of damage this creature inflicted
    */
   public int damage(){
       return rand.nextInt(str) + 1;
   }
   
   /**
    * Is this creature still alive?
    * @return boolean
    */
   public boolean isAlive()
   {
       return hp > 0;
   }
   
   /**
    * How much has this creature been damaged
    * @param damage amount to inflict on this creature
    */
   public void takeDamage(int damage)
   {
       hp -= damage;
    }
    
    /**
     * Is this creature dead
     * @return boolean
     */
    public boolean isDead()
    {
        return hp <= 0;
    }
    
}

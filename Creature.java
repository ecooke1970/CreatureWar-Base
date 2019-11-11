import java.util.Random;

/**
 * A generic Creature, also the superclass for several different creatures
 * 
 * @author (Erik Cooke) 
 * @version (2019.11.05)
 */
public class Creature
{
   private int hp;
   protected int strength;
   
   /**
    * Constructor for the class Creature
    */
   public Creature(){
       hp = 10;
       strength = 10;
   }
   
   
   /**
    * Constructor for Creature taking int for strength and hit points
    * @param strength amount to set strength to
    * @param hp amount to set hp to
    */
   public Creature(int strength, int hp)
   {
       if(strength >= 5){
           this.strength = strength;
       }
       else{
            this.strength = 5;
       }
       if(hp >= 5){
            this.hp = hp;
       }
       else{
            this.hp = 5;
       }
    }
    
   /**
    * How much damage
    * @return int - the amount of damage this creature inflicted
    */
   public int damage(){
       return Randomizer.nextInt(strength) + 1;
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

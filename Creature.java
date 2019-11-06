import java.util.Random;

/**
 * Write a description of class Creature here.
 * 
 * @author (Erik Cooke) 
 * @version (2019.11.05)
 */
public class Creature
{
   private int hp;
   private int strength;
   
   public Creature(){
       hp = 10;
       strength = 10;
   }
   
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
    * @return int - the amount of damage this creature did
    */
   public int damage(){
       Random rand = new Random();
       return rand.nextInt(strength) + 1;
   }
   
   /**
    * Is this creature still alive?
    * @return boolean
    */
   public boolean isAlive()
   {
       return hp > 0;
   }
    
}

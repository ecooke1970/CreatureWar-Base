import java.util.ArrayList;

/**
 * Write a description of class BattleMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BattleMain
{
    // instance variables - replace the example below with your own
    private ArrayList<Creature> army1;
    private ArrayList<Creature> army2;
    private int armySize;

    /**
     * Constructor for objects of class BattleMain
     */
    public BattleMain()
    {
        armySize = 100;
        army1 = new ArrayList<Creature>(armySize);
        army2 = new ArrayList<Creature>(armySize);
    }
    
    public BattleMain(int armySize)
    {
        this.armySize = armySize;
        army1 = new ArrayList<Creature>(armySize);
        army2 = new ArrayList<Creature>(armySize);
    }
    
    public static void main(String args[])
    {
        BattleMain war = new BattleMain();        
        war.run();
    }
    
    public void run()
    {        
        createArmy(army1);
        createArmy(army2);
        System.out.println(battle(army1, army2));
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void createArmy(ArrayList army)
    {
        int i = 0;
        while(i < armySize)
        {
            int x = Randomizer.nextInt(5);
            switch(x){
                
                case 0:
                    army.add(new Human());
                    break;
                    
                case 1:
                    army.add(new Elf());
                    break;
                    
                case 2:
                    army.add(new Demon());
                    break;
                    
                case 3:
                    army.add(new Cyberdemon());
                    break;
                    
                case 4:
                    army.add(new Balrog());
                    break;
            }
            i++;
        }        
    }
    
    public String battle(ArrayList<Creature> army1, ArrayList<Creature> army2)
    {
        int index1 = 0;
        int index2 = 0;
        int army1BattlesWon = 0;
        int army2BattlesWon = 0;
        String winner = "";
        while(index1 < army1.size() && index2 < army2.size())
        {
            army1.get(index1).takeDamage(army2.get(index2).damage());
            if(army1.get(index1).isDead())
            {
                army2BattlesWon ++;
                if(index1 == army1.size() -1)
                {
                    winner = "Army 2 is the winner";
                    index1++;
                    continue;
                }
                index1 ++;
            }
            army2.get(index2).takeDamage(army1.get(index1).damage());
            if(army2.get(index2).isDead())
            {
                army1BattlesWon ++;
                if(index2 == army2.size() -1)
                {
                    winner = "Army 1 is the winner";
                }
                index2 ++;
            }
        }
        return "Army 1 battles won: " + army1BattlesWon + "\nArmy 2 battles won: " + army2BattlesWon + "\n" + winner;
    }
}

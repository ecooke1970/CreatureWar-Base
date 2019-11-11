import java.util.ArrayList;

/**
 * The main class for this program.  Responsible for creating two armies and then making them battle.
 *
 * @author (Erik Cooke)
 * @version (2019.11.7)
 */
public class BattleMain
{
    private ArrayList<Creature> army1;
    private ArrayList<Creature> army2;
    private int armySize;

    /**
     * Constructor for objects of class BattleMain. Defaults to 100 army size
     */
    public BattleMain()
    {
        armySize = 100;
        army1 = new ArrayList<Creature>(armySize);
        army2 = new ArrayList<Creature>(armySize);
    }
    
    /**
     * Constructor for objects of class BattleMain
     * @param armySize what size should the 2 armies be?
     */
    public BattleMain(int armySize)
    {
        this.armySize = armySize;
        army1 = new ArrayList<Creature>(armySize);
        army2 = new ArrayList<Creature>(armySize);
    }
    
    /**
     * main method
     * @param args
     */
    public static void main(String args[])
    {
        BattleMain war = new BattleMain();        
        war.run();
    }
    
    /**
     * Creates the 2 armies and then makes them battle.
     * Prints out battle results
     */
    public void run()
    {        
        createArmy(army1);
        createArmy(army2);
        System.out.println(battle(army1, army2));
    }

    /**
     * Populates the army ArraLists with random creatures
     *
     * @param army - which ArrayList to populate
     */
    public void createArmy(ArrayList army)
    {
        int i = 0;
        while(i < armySize)
        {
            int x = Randomizer.nextInt(4);
            switch(x){
                
                case 0:
                    army.add(new Human());
                    break;
                    
                case 1:
                    army.add(new Elf());
                    break;
                    
                case 2:
                    army.add(new Cyberdemon());
                    break;
                    
                case 3:
                    army.add(new Balrog());
                    break;
            }
            i++;
        }        
    }
    
    /**
     * Method for 2 armies to battle
     * @return String - The results of the battle
     * @param army1 - First army for battle
     * @param army2 - Second army for battle
     */
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
                    winner = "* Army 2 is the winner *";
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
                    winner = "* Army 1 is the winner *";
                }
                index2 ++;
            }
        }
        return "\nArmy 1 battles won: " + army1BattlesWon + "\nArmy 2 battles won: " + army2BattlesWon + "\n\n" +
               "************************\n" + winner + "\n************************";
    }
}

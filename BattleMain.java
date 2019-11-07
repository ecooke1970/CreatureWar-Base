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
        ArrayList<Creature> army1 = new ArrayList<Creature>(armySize);
        ArrayList<Creature> army2 = new ArrayList<Creature>(armySize);
    }
    
    public BattleMain(int armySize)
    {
        Creature[] army1 = new Creature[armySize];
        Creature[] army2 = new Creature[armySize];
    }
    
    // public static void main(String args[])
    // {
        // BattleMain war = new BattleMain();        
        // war.run();
    // }
    
    public void run()
    {
        //createArmy(army1);
        createArmy1();
        //createArmy(army2);
        System.out.println(battle(army1, army2));
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void createArmy1()
    {
        int i = 0;
        while(i < armySize)
        {
            int x = Randomizer.nextInt(5);
            switch(x){
                
                case 0:
                    Human human1 = new Human();
                    army1.add(human1);
                    break;
                    
                case 1:
                    Elf elf1 = new Elf();
                    army1.add(elf1);
                    break;
                    
                case 2:
                    Demon demon1 = new Demon();
                    army1.add(demon1);
                    break;
                    
                case 3:
                    Cyberdemon cyberdemon1 = new Cyberdemon();
                    army1.add(cyberdemon1);
                    break;
                    
                case 4:
                    Balrog balrog1 = new Balrog();
                    army1.add(balrog1);
                    break;
            }
            i++;
        }        
    }
    
    public String battle(ArrayList<Creature> army1, ArrayList<Creature> army2)
    {
        int index1 = 0;
        int index2 = 0;
        String winner = "";
        while(index1 < army1.size() && index2 < army2.size())
        {
            army1.get(index1).takeDamage(army2.get(index2).damage());
            if(army1.get(index1).isDead())
            {
                if(index1 == army1.size() -1)
                {
                    winner = "Army2 is the winner";
                }
                index1 ++;
                continue;
            }
            army2.get(index2).takeDamage(army1.get(index1).damage());
            if(army2.get(index2).isDead())
            {
                if(index2 == army2.size() -1)
                {
                    winner = "Army1 is the winner";
                }
                index2 ++;
            }
        }
        return winner;
    }
}

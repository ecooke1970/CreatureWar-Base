import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CreaturesTest.
 *
 * @author  (Erik Cooke)
 * @version (2019.11.7)
 */
public class CreaturesTest
{
    /**
     * Default constructor for test class CreaturesTest
     */
    public CreaturesTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void ConstructorTests()
    {
        Human human1 = new Human();
        Elf elf1 = new Elf();
        Demon demon1 = new Demon();
        Cyberdemon cyberdem1 = new Cyberdemon();
        Balrog balrog1 = new Balrog();
    }

    @Test
    public void TestDamage()
    {
        Human human1 = new Human();
        human1.damage();
    }

    @Test
    public void TestMain()
    {
        BattleMain battleMa2 = new BattleMain();
        battleMa2.run();
    }
}




import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CreaturesTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
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
        Creature creature1 = new Creature();
        Human human1 = new Human();
        Elf elf1 = new Elf();
        Demon demon1 = new Demon();
        Cyberdemon cyberdem1 = new Cyberdemon();
        Balrog balrog1 = new Balrog();
    }

    @Test
    public void TestDamage()
    {
        Creature creature1 = new Creature();
        creature1.damage();
        Human human1 = new Human();
        human1.damage();
    }
}



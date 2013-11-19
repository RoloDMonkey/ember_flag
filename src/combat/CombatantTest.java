/**
 * 
 */
package combat;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author rolo
 *
 */
public class CombatantTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link combat.Combatant#attackSpeed()}.
	 */
	@Test
	public final void testAttackSpeed() {
		Combatant peon = new Combatant();
		peon.speed = 2;
		peon.constitution = 15;
		Weapon axe = new Weapon();
		axe.weight = 16;
		peon.weapon = axe;
		assertEquals("a heavy weapon decreases attack speed", 1, peon.attackSpeed());
		peon.weapon.weight = 18;
		assertEquals("attack speed cannot be below zero", 0, peon.attackSpeed());
		peon.weapon.weight = 14;
		assertEquals("a light weapon does not effect attack speed", 2, peon.attackSpeed());
	}

}

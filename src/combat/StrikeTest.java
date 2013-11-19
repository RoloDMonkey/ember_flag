package combat;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StrikeTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testDoubleAttack() {
		Weapon axe = new Weapon();
		axe.weight = 1;
		Combatant attacker = new Combatant();
		Combatant defender = new Combatant();
		attacker.weapon = axe;
		defender.weapon = axe;
		attacker.constitution = 10;
		defender.constitution = 10;
		Strike strike = new Strike();
		strike.attacker = attacker;
		strike.defender = defender;
		attacker.speed = 10;
		defender.speed = 5;
		assertTrue("if attacker speed - defender speed is greater than 4, attacker has double attack",
				strike.doubleAttack());
		attacker.speed = 10;
		defender.speed = 6;
		assertTrue("if attacker speed - defender speed is 4, attacker has double attack",
				strike.doubleAttack());
		attacker.speed = 10;
		defender.speed = 7;
		assertFalse("if attacker speed - defender speed is less than 4, attacker cannot double attack",
				strike.doubleAttack());
	}

}

package combat;

public class Strike {
	
	Combatant attacker;
	Combatant defender;
	
	boolean doubleAttack() {
		int d = attacker.attackSpeed() - defender.attackSpeed();
		if (d >= 4) {
			return true;
		}
		return false;
	}

}

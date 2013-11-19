package combat;

public class Combatant {
	
	int speed = 0;
	int constitution = 0;
	Weapon weapon;
	
	int attackSpeed() {
		if (this.weapon.weight > this.constitution) {
			int aS = this.speed - (this.weapon.weight - this.constitution);
			if (aS > 0) {
				return aS; 
			}
			return 0;
		}
		return this.speed;
	}

}

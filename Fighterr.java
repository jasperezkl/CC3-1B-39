
public class Fighterr {

	public class Fighter extends Character { 
		int maxPower;
	    int currentPower;
		int skill1;
		int skill2;
	        int skill3;

	public Fighter(String n, int s, int d, int i) {
	    super(n,s,d,i);
	    maxPower = (die.roll() + dexterity)*3;
	    currentPower = maxPower;  
	}

	public int castJudgmentStrike() {
	    if (currentPower >= 5) {
	        currentPower -= 5;
			int JS =  (die.roll() + 10  * intelligence) + dexterity + Strength * 800;
			this.skill1 = JS;
	        return JS;
	    }
	    else
	        return 0;
	       
	}

	public int castBarrier() {
	    if (currentPower >= 8){
	        currentPower -= 8;
	        int b = (die.roll()*dexterity) + Strength + intelligence * 300;
			this.skill2 = b;
	        return b;
	    }
	    else
	        return 0;
	}

	public int castOneShotSkill() {
	    currentPower = 0;
	    int OSK = 999999999;
	    this.skill3 = OSK;
	    return OSK;
	}

	public int getMaxPower() {
	        return maxPower;
	}

	public int getCurrentPower() {
	        return currentPower;
	}
	}
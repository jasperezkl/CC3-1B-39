public class WizardAquino {

	public class Wizard extends Character { 
		int maxMagic;
	    int currentMagic;
		int skill1;
		int skill2;
	        int skill3;

	public Wizard(String n, int s, int d, int i) {
	    super(n,s,d,i);
	    maxMagic = (die.roll() + intelligence)* 3;
	    currentMagic = maxMagic;  
	}

	public int castLightningBolt() {
	    if (currentMagic >= 5) {
	        currentMagic -= 5;
			int LB = (die.roll() + 10  * intelligence) + dexterity + Strength * 700;
			this.skill1 = LB;
	        return LB;
	    }
	    else
	        return 0;
	       
	}

	public int castHeal() {
	    if (currentMagic >= 8){
	        currentMagic -= 8;
	        int h = (die.roll() * intelligence) + dexterity + Strength * 300;
			this.skill2 = h;
	        return h ;
	    }
	    else
	        return 0;
	}

	public int castOneShotSkill() {
	    currentMagic = 0;
	    int OSK2 = 999999999;
	    this.skill3 = OSK2;
	    return OSK2;
		}
		
	public int getMaxMagic() {
	        return maxMagic;
		}

	public int getCurrentMagic() {
	        return currentMagic;
	        
	}
}

package rpg;


public class Character {
    static Dice dice=new Dice();
    
    String name;
    int strength;   
    int dexterity;   
    int intellegence;   
    int currentLife;    
    int maxLife;
    public Character(String name,int strength,int dexterity,int intellegence){
    this.name=name;
    this.strength=strength;
    this.dexterity=dexterity;
    this.intellegence=intellegence;
    this.maxLife=dice.roll();
    this.currentLife=200;
    
    
    }
    
    public int attack(){
    return strength/(dice.roll()+1);
    
    }
    public void wound(int damage){
    currentLife-=damage;
    }
    public void heal(int heal){
    currentLife+=heal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getIntellegence() {
        return intellegence;
    }

    public void setIntellegence(int intellegence) {
        this.intellegence = intellegence;
    }

    public int getCurrentLife() {
        return currentLife;
    }

    public void setCurrentLife(int currentLife) {
        this.currentLife = currentLife;
    }

    public int getMaxLife() {
        return maxLife;
    }

    public void setMaxLife(int maxLife) {
        this.maxLife = maxLife;
    }
    
    
}

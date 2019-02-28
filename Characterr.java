import java.util.Scanner;
public class Characterr {

	public class Character {


	    static Dice dice = new Dice();
	    static Dice dice2 = new Dice();

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        Wizard mar = new Wizard("Mar", dice.roll() + 1, dice.roll() + 1, dice.roll() + 1);
	        Fighter brix = new Fighter("Brix", dice.roll() + 1, dice.roll() + 1, dice.roll() + 1);

	        boolean a = true;
	        int i = 1;
	        int choice;
	        int choice2;

	        while (a) {

	            System.out.println("_________________________________________");
	            System.out.println("Round " + i);
	            System.out.println("_________________________________________");
	            System.out.println("FIGHT!!!!!!!!!!!!!!!!!!!!!!!!!!! ");
	            System.out.println(brix.name + " HP = " + brix.currentLife + "\t        " + mar.name + " HP = " + mar.currentLife);
	            System.out.println(brix.name + " Energy = " + brix.currentPower + "\t" + mar.name + " Mana = " + mar.currentMagic);
	            System.out.println("");

	            //first attack
	            System.out.println("");
	            System.out.println(mar.name + " Turn: \n1. Normal Attack\t2. Lightning Bolt = 5 Mana\t3. Heal = 8 Mana");
	            choice = sc.nextInt();

	            if (choice == 1) {
	                System.out.println(mar.name + " attacks " + brix.name + " for " + mar.attack());

	                brix.currentLife -= mar.attack();
	                
	                if (brix.currentLife <= 0) {
	                    brix.currentLife = 0;
	                    System.out.println("");
	                    System.out.println(brix.name + " HP = " + brix.currentLife + "\t        " + mar.name + " HP = " + mar.currentLife);
	                    System.out.println("GG! Well Played");
	                    break;
	                }
	            } else if (choice == 2) {

	                if (mar.currentMagic >= 5) {
	                    System.out.println(mar.name + " strikes " + brix.name + " by " + mar.castLightningBolt() + " using Lightning Bolt.");
	                    brix.currentLife -= mar.skill1;
	                } else {
	                    System.out.println("Insufficient mana. Lightning Bolt dealt no damage.");

	                }
	                if (brix.currentLife <= 0) {
	                    brix.currentLife = 0;
	                    System.out.println("");
	                    System.out.println(brix.name + " HP = " + brix.currentLife + "\t        " + mar.name + " HP = " + mar.currentLife);
	                    System.out.println("GG! Well Played");
	                    break;
	                }
	            } else if (choice == 3) {

	                if (mar.currentMagic >= 8) {
	                    System.out.println(mar.name + " healed for: " + mar.castHeal());
	                    mar.currentLife += mar.skill2;
	                    if (mar.currentLife > mar.maxLife) {
	                        mar.currentLife = mar.maxLife;
	                    }
	                } else {
	                    System.out.println("Insufficient mana. Heal will not affect you.");
	                }
	            }

	            //second attack
	            System.out.println("");
	            System.out.println(brix.name + " Turn: \n1. Normal Attack\t2. Judgment Strike = 5 Energy\t3. Barrier = 8 Energy");
	            choice2 = sc.nextInt();

	            if (choice2 == 1) {
	                System.out.println(brix.name + " hits " + mar.name + " for " + brix.attack());
	                System.out.println("");

	                mar.currentLife -= brix.attack();

	                if (mar.currentLife <= 0) {
	                    mar.currentLife = 0;
	                    System.out.println(brix.name + " HP = " + brix.currentLife + "\t        " + mar.name + " HP = " + mar.currentLife);
	                    System.out.println("GG! Well Played");
	                    break;
	                }
	            } else if (choice2 == 2) {

	                if (brix.currentPower >= 5) {
	                    System.out.println(brix.name + " strikes " + mar.name + " by " + brix.castJudgmentStrike() + " using Judgment Strike.");
	                    System.out.println("");
	                    mar.currentLife -= brix.skill1;
	                } else {
	                    System.out.println("Insufficient energy. Judgment Strike dealt no damage.");
	                }

	                if (mar.currentLife <= 0) {
	                    mar.currentLife = 0;
	                    System.out.println(brix.name + " HP = " + brix.currentLife + "\t        " + mar.name + " HP = " + mar.currentLife);
	                    System.out.println("GG! Well Played");
	                    break;
	                }
	            } else if (choice2 == 3) {

	                if (brix.currentPower >= 8) {
	                    System.out.println(brix.name + " used barrier and shields himself for " + brix.castBarrier());
	                    System.out.println("");
	                    brix.currentLife += brix.skill2;
	                    if (brix.currentLife > brix.maxLife) {
	                        brix.currentLife = brix.maxLife;
	                    }
	                } else {
	                    System.out.println("Insufficient energy. Barrier will not affect you.");
	                }
	            }

	            System.out.println(brix.name + " HP = " + brix.currentLife + "\t        " + mar.name + " HP = " + mar.currentLife);
	            System.out.println(brix.name + " Energy = " + brix.currentPower + "\t" + mar.name + " Mana = " + mar.currentMagic);
	            System.out.println("");
	            System.out.println("");
	            System.out.println("");
	            System.out.println("");
	            i++;

	            if (brix.currentLife <= 0 || mar.currentLife <= 0) {
	                a = false;
	            }



	        }
	        if (brix.currentLife <= 0 && mar.currentLife > 0 || brix.currentLife < mar.currentLife) {
	            System.out.println(mar.name + " WINS ");
	        }
	        if (mar.currentLife <= 0 && brix.currentLife > 0 || mar.currentLife < brix.currentLife) {
	            System.out.println(brix.name + " WINS ");
	        }
	        if (brix.currentLife == 0 && mar.currentLife == 0) {
	            System.out.println("-------- DRAW ---------");
	        }
	        if (brix.currentLife == mar.currentLife && mar.currentLife == brix.currentLife) {
	            System.out.println("-------- DRAW ---------");
	        }

	    }
	}
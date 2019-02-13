
package rpg;


public class RPG {

    
    public static void main(String[] args) {
        Character john=new Character("John",23,24,27);
        Character paul=new Character("Paul",20,22,27);
        
        String winner="";
        int jDamage=0;
        int pDamage=0;
        int rounds=1;
        do{
            System.out.println("Round: "+rounds);
            System.out.println("=============================================================================================");
            System.out.println(" John's Health: "+john.getCurrentLife()+"\t\t\t\t\t\t"+"Paul's Health: "+paul.getCurrentLife());
            
            jDamage=john.attack();
            pDamage=paul.attack();
            
            System.out.println(" John's Damage: "+jDamage+"\t\t\t\t\t\t"+"Paul's Damage: "+pDamage);
            
            john.wound(pDamage);
            paul.wound(jDamage);
            
            if(john.getCurrentLife()>0&& paul.getCurrentLife()<=0){
                winner="John Wins!";
            }else if(paul.getCurrentLife()>0&& john.getCurrentLife()<=0){
                winner="Paul Wins!";
            }
            else{
                winner="Draw!";
            }
            rounds++;
            System.out.println("");
            System.out.println("=============================================================================================");
        }while(john.getCurrentLife()>0&& paul.getCurrentLife()>0);
        System.out.println("==================================="+winner+"===================================");
    }
    
}

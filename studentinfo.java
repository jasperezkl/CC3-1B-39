
package studentaccounts;


public class studentinfo {
    String university;
    String college;
    String term;
    
    private static String IdNum;
    private static String SecondName;
    private static String firstName;
    private static String acadProg;
    private static String track;
    
    //<constructor>(<public fields>)
    studentinfo( String college, String term){
    this.university="           University of the Cordilleras";
    this.college="College of Information Technology and Computer Science";
    this.term="           2ndtrimester 2018-2019";
    
    
    }

    public String getIdNum() {
        return IdNum;
    }

    public void setIdNum(String IdNum) {
        this.IdNum = IdNum;
    }

    public String getSecondName() {
        return SecondName;
    }

    public void setName(String lastName) {
        this.SecondName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAcadProg() {
        return acadProg;
    }

    public void setAcadProg(String acadProg) {
        this.acadProg = acadProg;
    }
    public String print(){
        
        System.out.println("");
        return this.university+"\n"+this.college+"\n"+ this.term;
    
    
    }
    
}

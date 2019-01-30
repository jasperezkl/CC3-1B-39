
package studentaccounts;

public class Studentaccounts {

    public static void main(String[] args) {
        studentinfo stud1=new studentinfo("CITCS", "2nd Term 2018-2019");
        
        
        stud1.setIdNum("18-1737-616, \n\t   18-6546-606");
        stud1.setFirstName("      Abedrei Mamaclay");
        stud1.setSecondName("Jasper Ezekiel Aquino\n");
        stud1.setAcadProg("Bacherlor of Science in Information Technology - Network Security, \n"
                + "         Bacherlor of Science in Computer Science");
        
        System.out.println(stud1.print());
        System.out.println("\nID Number: "+stud1.getIdNum());
        System.out.println("Name: "+stud1.getSecondName()+stud1.getFirstName());
        System.out.println("Academic Program: "+stud1.getAcadProg());
        
    }
    
}
 

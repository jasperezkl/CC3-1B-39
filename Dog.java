/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesandobjects;

/**
 *
 * @author m304user
 */
class Dog {
    String name;
    int age;
    String breed;
    char gender;
    
    public void setname(String dogname)
    {
        name = dogname;
    }
    
    public String getname()
    {
        return name;            
    }
    
    public void setage(int dogage)
    {
        age = dogage;
    }
    
    public int getage()
    {
        return age;
    }
    public void setbreed(String dogbreed)
    {
        breed = dogbreed;
    }
    
    public String getbreed()
    {
        return breed;
    }
    public void setgender(char doggender)
    {
        gender = doggender;
    }
    
    public char getgender()
    {
        return gender;
    }
  
    
}


                        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

public class User_bean {
    
    private String name;
    private int age;
    private  int password;
    private String skils;
    private String email;

    public User_bean(String name, int age, int password, String skils, String email) {
        this.name = name;
        this.age = age;
        this.password = password;
        this.skils = skils;
        this.email = email;
    }
    

    
    
    
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void setSkils(String skils) {
        this.skils = skils;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPassword() {
        return password;
    }

    public String getSkils() {
        return skils;
    }

    public String getEmail() {
        return email;
    }
    
    
    
    
    
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;


public class ServiceOffer_Bean {

    

    private int iduser;
    private int idservice;
    private String name;
    private String description;
    private int deadline;
    private String skillsrequired;
    
    
    public ServiceOffer_Bean(int iduser, int idservice, String name, String description, int deadline, String skillsrequired) {
        this.iduser = iduser;
        this.idservice = idservice;
        this.name = name;
        this.description = description;
        this.deadline = deadline;
        this.skillsrequired = skillsrequired;
    }
   
    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public int getIdservice() {
        return idservice;
    }

    public void setIdservice(int idservice) {
        this.idservice = idservice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDeadline() {
        return deadline;
    }

    public void setDeadline(int deadline) {
        this.deadline = deadline;
    }

    public String getSkillsrequired() {
        return skillsrequired;
    }

    public void setSkillsrequired(String skillsrequired) {
        this.skillsrequired = skillsrequired;
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BEAN;


public class ServiceOffer_Bean {

    

    private int iduser;//id do usuário. acrescentado no banco de dados
    private int idservice;//id do serviço. acrescentdo no banco de dados
    private String name;// nome do serviço
    private String description;//descrição do serviço
    private int deadline;//Prazo para conclusão do serviço
    private String skillsrequired;//Habilidades requeridas para execução do serviço
    
    //Método construtor da classe. Id do usuário e do serviço serão fornecidos pelo banco de dados
    public ServiceOffer_Bean(String name, String description, int deadline, String skillsrequired) {
        this.name = name;
        this.description = description;
        this.deadline = deadline;
        this.skillsrequired = skillsrequired;
    }
    
    
   //Métodos get e set para todos os atributos
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

                        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BEAN;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Rodrigo
 */
@Entity
@Table(name = "usuario")
public class UserBean implements Serializable{

    
    
    @Id
    private int idUser; //Atributo preenchido automaticamente no banco de dados
    @Column
    private String nick; //apelido do usuario para efetuar login
    @Column
    private String name; //nome do usuario
    @Column
    private int age; // idade do usuario
    @Column
    private  int password; // senha para realizar login
    @Column
    private String skils; // habilidades pertencentes ao usuário
    @Column
    private String email; // email do usuário

    public UserBean() {
    }

   


    //Método construtor para a formação do Objeto...A formação do objeto exige preenchimento 
    //de todos os atributos, com excessão so IdUser que será preenchido automaticamente no banco de
    //dados
    public UserBean(String nick,String name, int age, int password, String skils, String email) {
        this.nick = nick;
        this.name = name;
        this.age = age;
        this.password = password;
        this.skils = skils;
        this.email = email;
    }
    

    //Métodos de requisição e inserção de dados referentes aos atributos..
    //Fonece acesso a classe para a formação do objeto..
    
    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
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
    
   
     public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
    
    
    
    
    
}

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
 *está classe servirá como relacionamento entre o susuário proponente, o usuário executor e a oferta de
 * @author Dirgo Peres
 */
@Entity
@Table (name = "budget")
public class BudgetBean implements Serializable{
    @Id
    private int iDbudget; //guardará o ID desse relacionamento no banco de dados
    @Column
    private int iDuserproponent; //guardará o ID do user que criou a oferta, como chave estrangeira no BD
    @Column
    private int iDuserexecutor; //guardará o ID do usuário que executará o serviço
    @Column
    private int iDServiceOffer; //guardará o ID da oferta de serviço como chave estrangeira no BD
    @Column
    private int deadline; //o tempo de execução do serviço, fornecido pelo usuário
    @Column
    private float price; //o preço da oferta feita pelo usuário
    @Column
    private String description;//a descrição fornecida pelo usuário para este relacionamento entre oferta de serviço e requisição
    
    //construtor para quando o objeto for instanciado sem argumentos
    public BudgetBean (){
        
    }
    //formará o objeto Budget. É necessário informar todos os campos para formar este objeto
    public BudgetBean(int iDbudget, int iDuserproponent, int iDuserexecutor, int iDServiceOffer, int deadline, float price, String description) {
        this.iDbudget = iDbudget;
        this.iDuserproponent = iDuserproponent;
        this.iDuserexecutor = iDuserexecutor;
        this.iDServiceOffer = iDServiceOffer;
        this.deadline = deadline;
        this.price = price;
        this.description = description;
    }

    public int getiDuserexecutor() {
        return iDuserexecutor;
    }

    public void setiDuserexecutor(int iDuserexecutor) {
        this.iDuserexecutor = iDuserexecutor;
    }
    
    
    
    
    
    
    public int getiDbudget() {
        return iDbudget;
    }

    public void setiDbudget(int iDbudget) {
        this.iDbudget = iDbudget;
    }

    public int getiDuserproponent() {
        return iDuserproponent;
    }

    public void setiDuserproponent(int iDuserproponent) {
        this.iDuserproponent = iDuserproponent;
    }

    public int getiDServiceOffer() {
        return iDServiceOffer;
    }

    public void setiDServiceOffer(int iDServiceOffer) {
        this.iDServiceOffer = iDServiceOffer;
    }

    public int getDeadline() {
        return deadline;
    }

    public void setDeadline(int deadline) {
        this.deadline = deadline;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}

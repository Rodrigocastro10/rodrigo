/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BEAN;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.FetchMode;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;

/**
 *
 * @author Dirgo Peres
 */
@Entity
@Table (name = "message")
public class MessageBean implements Serializable{
    
    @Id @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name= "idmessage", unique = true, nullable = false)
    private int iDMessage; //a chave primária desta mensagem
    @ManyToOne
    @JoinColumn(name = "idsender",nullable = false)
    private UserBean iDusersender;//a chave estrangeira de usuário que enviou esta mensagem
    @ManyToOne
    @JoinColumn(name = "idreceiver", nullable = false) 
    private UserBean iDuserreceiver;//a chave estrangeira do usuário para qual essa mensagem foi enviada;
    @Column
    private String content; //o conteúdo propriamente dito desta mensagem
    @Column
    private String tempo;//guardará a tempo, hora, minutos e segundos de quando essa mendagem foi criada;
    
    //construtor vazio para caso o objeto seja instanciado sem parâmetros
    public MessageBean(){
        
    }

    public MessageBean(int iDMessage, UserBean iDusersender, String content, String data) {
        this.iDMessage = iDMessage;
        this.iDusersender = iDusersender;
        this.content = content;
        this.tempo = data;
    }

    public int getiDMessage() {
        return iDMessage;
    }

    public void setiDMessage(int iDMessage) {
        this.iDMessage = iDMessage;
    }

    public UserBean getiDusersender() {
        return iDusersender;
    }

    public void setUserSender(UserBean iDusersender) {
        this.iDusersender = iDusersender;
    }

    public UserBean getiDuserreceiver() {
        return iDuserreceiver;
    }

    public void setUserreceiver(UserBean userreceiver) {
        this.iDuserreceiver = userreceiver;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }
    
    
    
    
    
}

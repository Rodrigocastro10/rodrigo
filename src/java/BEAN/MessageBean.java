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
 * @author Dirgo Peres
 */
@Entity
@Table (name = "message")
public class MessageBean implements Serializable{
    @Id
    private int iDMessage; //a chave primária desta mensagem
    @Column
    private int iDusersender;//a chave estrangeira de usuário que enviou esta mensagem
    @Column
    private int iDuserreceiver;//a chave estrangeira do usuário para qual essa mensagem foi enviada;
    @Column
    private String content; //o conteúdo propriamente dito desta mensagem
    @Column
    private String tempo;//guardará a tempo, hora, minutos e segundos de quando essa mendagem foi criada;
    
    //construtor vazio para caso o objeto seja instanciado sem parâmetros
    public MessageBean(){
        
    }

    public MessageBean(int iDMessage, int iDusersender, String content, String data) {
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

    public int getiDusersender() {
        return iDusersender;
    }

    public void setiDusersender(int iDusersender) {
        this.iDusersender = iDusersender;
    }

    public int getiDuserreceiver() {
        return iDuserreceiver;
    }

    public void setiDuserreceiver(int iDuserreceiver) {
        this.iDuserreceiver = iDuserreceiver;
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BEAN;
/**
 *
 * @author Dirgo Peres
 */
public class Message_Bean {
    private int iDMessage; //a chave primária desta mensagem
    private int iDusersender;//a chave estrangeira de usuário que enviou esta mensagem
    private int iDuserreceiver;//a chave estrangeira do usuário para qual essa mensagem foi enviada;
    private String content; //o conteúdo propriamente dito desta mensagem
    private String data;//guardará a data, hora, minutos e segundos de quando essa mendagem foi criada;

    public Message_Bean(int iDMessage, int iDusersender, String content, String data) {
        this.iDMessage = iDMessage;
        this.iDusersender = iDusersender;
        this.content = content;
        this.data = data;
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    
    
    
    
}

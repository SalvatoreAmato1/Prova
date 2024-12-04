/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rubrica;


/**
 *
 * @author super
 */
public class Contatto {
    private String nome;
    private String cognome;
    private String[] numeri;
    private String[] mail;
    private static final int MAX_NUMERI = 3;
    private static final int MAX_EMAIL = 3;
    
    
    public Contatto(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
        this.numeri = new String[MAX_NUMERI];
        this.mail = new String[MAX_EMAIL];
}

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String[] getNumeri() {
        return numeri;
    }

    public String[] getMail() {
        return mail;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setNumeri(String[] numeri) {
        this.numeri = numeri;
    }

    public void setMail(String[] mail) {
        this.mail = mail;
    }
    
    
}

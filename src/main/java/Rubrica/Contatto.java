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
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setNumeroAt(int index, String numero) {
        if (!validaNumero(numero)) {
            throw new RuntimeException("Numero non valido!");
        }
        if (index >= 0 && index < MAX_NUMERI) {
            numeri[index] = numero;
        } else {
            throw new IndexOutOfBoundsException("Indice fuori dal range!");
        }
    }

    public String getNumeroAt(int index) {
        if (index >= 0 && index < MAX_NUMERI) {
            return numeri[index];
        } else {
            throw new IndexOutOfBoundsException("Indice fuori dal range!");
        }
    }

    public void setMailAt(int index, String email) {
        if (!validaMail(email)) {
            throw new RuntimeException("Email non valida!");
        }
        if (index >= 0 && index < MAX_EMAIL) {
            mail[index] = email;
        } else {
            throw new IndexOutOfBoundsException("Indice fuori dal range!");
        }
    }

    public String getMailAt(int index) {
        if (index >= 0 && index < MAX_EMAIL) {
            return mail[index];
        } else {
            throw new IndexOutOfBoundsException("Indice fuori dal range!");
        }
    }
    private boolean validaNumero(String numero) {
        return numero.matches("\\d{10}"); // Es.: numero di 10 cifre
    }

    private boolean validaMail(String email) {
        return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"); // Pattern per una mail valida
    }
    
    
}

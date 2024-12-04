/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rubrica;

import javafx.collections.ObservableList;
import javafx.collections.transformation.SortedList;

/**
 *
 * @author claud
 */
public class ElencoContatti {
    private ObservableList<Contatto> lista;
    private SortedList<Contatto> listaordinata;
    
    public void add(Contatto c){
        lista.add(c);
    }

    public Contatto get(int index){
       return listaordinata.get(index);
    }

    public SortedList<Contatto> getListaordinata() {
        return listaordinata;
    }
    
    public Contatto delete(int index){
        return listaordinata.remove(index);
    }
     
    //public SortedList<Contatto> ricerca(String str){
    //    listaordinata.
    //}
    
}

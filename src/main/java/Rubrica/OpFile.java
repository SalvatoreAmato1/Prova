/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rubrica;
import Rubrica.ElencoContatti;
/**
 *
 * @author mario
 */
public class OpFile {
    private String filename ;

    public OpFile(String filename) {
        this.filename = filename;
    }
            
    public void scrivi(ElencoContatti c, String filename){
        
    }
    
    public ElencoContatti leggi(String filename){
        ElencoContatti lista  = new ElencoContatti();
        return lista;
    }
}

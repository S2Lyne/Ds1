/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misturatintas;

/**
 *
 * @author fran
 */
public class Tinta {
    String marca;
    String cor;
    float preco;
    
    public boolean verificarTinta(String nomeTinta){
        if(nomeTinta.equalsIgnoreCase("coral") || nomeTinta.equalsIgnoreCase("renner") || nomeTinta.equalsIgnoreCase("eucatex")){
            this.marca = nomeTinta;
            return true;
        }else{
            return false;
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campeonatosurf;

/**
 *
 * @author aaa_l
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           System.out.println("Olá mundo!");
           int x;
           Atleta atleta1;
           atleta1 = new Atleta();
           atleta1.altura = 1.8f;
           atleta1.idade = 15;
           atleta1.peso = 45f;
           atleta1.nome = "Potira";

           Atleta atleta2 = new Atleta();
           atleta2.altura = 1.4f;
           atleta2.nome = "Maria Eduarda";
           atleta2.peso = 35f;
           atleta.idade = 11;

           atleta1.atribuiCategoria();

           System.out.println("Atleta: "+ atleta1.nome);

    }
    
}

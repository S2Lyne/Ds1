/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campeonatosurf;

import javax.swing.JOptionPane;

/**
 *
 * @author aaa_l
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           int x;
           x = 10;
           System.out.println("Olá mundo!"+x+"Valor de X");

           
           Atleta atleta3 = new Atleta();
           atleta3.nome = JOptionPane.showInputDialog("Informe o nome do Atleta");
           atleta3.idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do Atleta")); 
           atleta3.peso = Float.parseFloat(JOptionPane.showInputDialog("Informe o peso do Atleta"));
           atleta3.altura = Float.parseFloat(JOptionPane.showInputDialog("Informe o altura do Atleta"));
           
          
           Atleta atleta1;
           atleta1 = new Atleta();
           atleta1.altura = 1.8f;
           atleta1.idade = 15;
           atleta1.pontuacao = 1000;
           atleta1.peso = 45f;
           atleta1.nome = "Potira";

           Atleta atleta2 = new Atleta();
           atleta2.altura = 1.4f;
           atleta2.nome = "Maria Eduarda";
           atleta2.peso = 35f;
           atleta2.idade = 11;

           
           atleta1.atribuiCategoria();
           atleta3.atribuiCategoria();
           atleta1.doarPontos(100, atleta2);
           
           System.out.println("Nome do Atleta: "+ atleta3.nome + "\n "+" idade do atleta: "+atleta3.idade+"\n"
                   +"Peso do atleta:"+atleta3.peso+"\n"+
                   "altura do atleta:"+atleta3.altura+"\n"+"Categoria:"+atleta1.categoria);

           System.out.println("Atleta: "+ atleta1.nome +"\n"+atleta1.idade+"\n"+"Categoria:"+atleta1.categoria);

           System.out.println("Pontuação de "+atleta1.nome+ ":"+atleta1.pontuacao);
           System.out.println("Pontuação de "+atleta2.nome+ ":"+atleta2.pontuacao);
           
    }
    
}

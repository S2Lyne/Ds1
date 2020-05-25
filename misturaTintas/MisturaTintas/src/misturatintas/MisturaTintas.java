/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misturatintas;

import javax.swing.JOptionPane;

/**
 *
 * @author fran
 */
public class MisturaTintas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("Seja bem vindo - MisturaTintas\n");
        System.out.println("Nossas opções de tinta: ");
        System.out.println("coral - eucatex - renner");
        System.out.println("");
        
        Tinta tinta1 = new Tinta();
        
        tinta1.cor = JOptionPane.showInputDialog("Informa o nome da cor: ");
        if(tinta1.verificarTinta(JOptionPane.showInputDialog("Informe a marca da tinha: "))){
            System.out.println("Valor Cadastrado!");
        }else{
            System.out.println("Marca de Tinta não cadastrada \n!");
        }
        tinta1.preco = Float.parseFloat(JOptionPane.showInputDialog("Informa o preço da tinta: "));
        
        System.out.println("Segue as informações solicitadas: \n"+"Cor: "+tinta1.cor+"\nMarca: "+tinta1.marca+"\nPreço: "+tinta1.preco);
        
        
    
    }
    
}

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
public class Atleta {
    String nome;
    float altura;
    float peso;
    int idade;
    String categoria;
    int pontuacao;
    
    public void doarPontos(int qPontos, Atleta atletaReceptor){
       this.pontuacao = this.pontuacao - qPontos;
       atletaReceptor.pontuacao = atletaReceptor.pontuacao + qPontos;
    }

/*
    6-10: infantil
    11-18: juvenil
    18>: adulto
*/
    public void atribuiCategoria(){
        
        if(this.idade>=6 && this.idade <=10){
            this.categoria = "Infantil";
        }else if(this.idade>10 && this.idade<=18){
            this.categoria = "Juvenil";
        }else if(this.idade>18){
            this.categoria = "Adulto";
        }
}
}

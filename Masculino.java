/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agencia_rh;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author rdsmachado
 */
public class Masculino {
    Erros_Excessoes erro = new Erros_Excessoes();
    
 Scanner candidatos = new Scanner( System.in);
 
 /* variaveis */
     int num_masculino = 0;
     int idade = 0;
     double soma_idade = 0;
     
     
     /*get e set */
      public int getNum_masculino() {
        return num_masculino;
    }

    public void setNum_masculino(int num_masculino) {
        this.num_masculino = num_masculino;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
    
    
     /*função */
    public void candidato_masculino(){
        
        System.out.println("  \nDigite o numero de candidatos masculinos ");
       num_masculino = candidatos.nextInt();
        
        
             for (int i = 1; i <= num_masculino; i++) {
                 
              idade_masculino();
                  
              soma_idade +=  idade;
             }
              
    } 
 
/* Função */
    public int idade_masculino(){
       
         System.out.println("\n Digite a idade do candidato Masculino ,por favor ");  
        idade = candidatos.nextInt();
                  
         if( idade <= 0){
              erro.erros(this);
              
                
                }        
       
      return idade;         
    }
            public double media_candidato( Masculino media_masc ){
         double media ;
 media = soma_idade / num_masculino;
  
 return media;
}
}
    
   


 
 

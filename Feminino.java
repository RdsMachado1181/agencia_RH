/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agencia_rh;

import java.util.Scanner;
 

/**
 *
 * @author rdsmachado
 */
public class Feminino {
    Erros_Excessoes erro = new Erros_Excessoes();
    
    Scanner candidatos = new Scanner( System.in);
 
 /* variaveis */
     int num_feminino = 0;
     int idade = 0;
     double soma_idade = 0;
     
     
     /*get e set */

        public int getNum_feminino() {
            return num_feminino;
        }

        public void setNum_feminino(int num_feminino) {
            this.num_feminino = num_feminino;
        }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
    
    
     /*função */
    public void  candidato_feminino(){
        
        System.out.println("\n Digite o numero de candidatas femininas ");
       num_feminino = candidatos.nextInt();
        
        
             for (int i = 1; i <= num_feminino; i++) {
              idade_feminino();
            
              soma_idade +=  idade;
             }
    } 
 
/* Função */
    public int  idade_feminino(){
      
          System.out.println("\n Digite a idade da  candidata feminina  ,por favor ");  
            idade = candidatos.nextInt();
           
      
       
          if( idade <= 0){
          erro.erros( this);
            
            }
                
   return idade;
}
    
    /**
     *
     * @param media_masc
     * @return
     */
    public double media_candidato( Feminino media_masc ){
         double media ;
 media = soma_idade / num_feminino;
  
 return media;
}
}

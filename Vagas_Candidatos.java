/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agencia_rh;

/**
 *
 * @author rdsmachado
 */
public class Vagas_Candidatos {
    
    public void respostas( Masculino masc  ){
        
        System.out.println(" Foram " + masc.getNum_masculino()+ " pessoas  do sexo masculino que se candidataram a vaga ");  
        
         
    }
     public void respostas( Feminino masc  ){
        
        System.out.println(" Foram " + masc.getNum_feminino()+ " pessoas  do sexo Feminino que se candidataram a vaga ");  
        
         
    }
    
     
    /*
     public void resposta_media( Feminino fem){
        
        System.out.println(" A media dos candidatos que se candidataram foi  " + );
         
    }
     */
     public void resposta_media( Masculino fem){
        
        System.out.println(" A media dos candidatos que se candidataram foi  " + fem.media_candidato(fem) );
         
    }
     
     public void resposta_media( Feminino fem){
        
        System.out.println(" A media dos candidatos que se candidataram foi  " + fem.media_candidato(fem) );
         
    }
     
}

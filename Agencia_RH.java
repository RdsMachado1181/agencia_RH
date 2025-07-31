/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agencia_rh;

/**
 *
 * @author rdsmachado
 */
public class Agencia_RH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
      Masculino masc = new Masculino();
      Feminino fem = new Feminino();
      Vagas_Candidatos candit =  new Vagas_Candidatos();
      
      
      
      fem.candidato_feminino();
      masc.candidato_masculino();
      
      /* chamada da resposta da função resposta */
      candit.respostas(masc);
      candit.respostas(fem);
      
      /* chamada da resposta_media da função resposta */      
      candit.resposta_media(masc);
      candit.resposta_media(fem);
    }
    
}

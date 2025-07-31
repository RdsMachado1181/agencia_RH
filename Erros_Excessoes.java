/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agencia_rh;

/**
 *
 * @author rdsmachado
 */
public class Erros_Excessoes {
    
    
    public void erros( Masculino idade){
        
        System.out.println("  idade do candidato digitada está incorreta  ,por favor digite uma data maior que 0 "   );
        idade.idade_masculino();
    }
    
    
      public void erros( Feminino idade){
        
        System.out.println("  idade do candidato digitada está incorreta  ,por favor digite uma data maior que 0 "   );
        idade.idade_feminino();
    }
}

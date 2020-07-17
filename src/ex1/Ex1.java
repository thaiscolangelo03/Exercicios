
package ex1;

public class Ex1 {

    public static void main(String[] args) {
        Adminis adminis = new Adminis();
        Tec tecEtec = new Tec();

       adminis.setNome("Willian");
       adminis.setSalario(7000);
       adminis.setCod(1);
       adminis.setIdade(57);
       adminis.setPeriodo("Manhã");
       adminis.mostraDados();  
        
       tecEtec.setNome("Bertoldo");
       tecEtec.setSalario(4000);
       tecEtec.setCod(2);
       tecEtec.setIdade(40);       
       tecEtec.setCresce(500);
       tecEtec.remuneracao();
       tecEtec.mostraDados(); 
    }
    
}

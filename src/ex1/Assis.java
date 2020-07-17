
package ex1;

public class Assis extends FuncaoCom{
    
    public void mostraDados(){
        System.out.println("Dados do assistente " + "\n --------------------------" + "\n nome: " + getNome() + 
                "\n salario: " + getSalario() + "\n número de matricula: " + getCod() + "\n idade: " + getIdade());
}
}
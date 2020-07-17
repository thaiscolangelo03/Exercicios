
package ex1;

public class Tec extends Assis {
     public double cresce;
    
     public double remuneracao(){
        this.salario = cresce + salario;
        return salario;
    }
    
    public double getCresce() {
        return cresce;
    }

    public void setCresce(double cresce) {
        this.cresce = cresce;
    }
   
    @Override
    public void mostraDados() {
        
        System.out.println("Tecnico " +
                
                "\n nome: " + getNome() + "\n dalario: " + getSalario() + "\n n° da matricula: " + getCod() +
                "\n idade: " + getIdade() + "\n --------------------");
                
                
    }
}


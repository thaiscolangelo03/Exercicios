
package ex1;

public class Adminis extends Assis {
    public String periodo;

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    
    @Override
    public void mostraDados(){
                System.out.println("ADM " + "\n nome: " + getNome() + 
                "\n salario: " + getSalario() + "\n n° da matricula: " + getCod() +
                "\n idade: " + getIdade() + "\n setor: Administração" + 
                "\n periodo: " + periodo + "\n -----------------------------");
                
    }
    }



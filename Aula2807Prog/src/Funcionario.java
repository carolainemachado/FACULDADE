import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Funcionario {
    protected String nome;
    protected String cargo;
    protected double salario;

    Scanner teclado=new Scanner(System.in);

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void infoFuncionario(){
        System.out.printf("*** FUNCIONARIO ***" + "\n");
        System.out.println("Nome: " + this.nome);
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Salario: " + this.salario + "\n");
    }

    public void novoSalario(double NovoSalario){
        System.out.println("Digite o novo salario");
        NovoSalario=teclado.nextInt();
        salario=NovoSalario+salario;
        System.out.println(salario);
    }
}

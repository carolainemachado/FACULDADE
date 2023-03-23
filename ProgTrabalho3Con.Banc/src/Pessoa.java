import java.util.ArrayList;
public class Pessoa {
    public String nome;
    public String sobrenome;
    public int idade;
    private String CPF;
    private ArrayList<ContaBancaria> Bancaria = new ArrayList<>();

    public Pessoa(String nome, String sobrenome, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }
   public void info(){
       System.out.println("+++++ PESSOA +++++");
       System.out.println("Nome: " + this.nome);
       System.out.println("Sobrenome: " + this.sobrenome);
       System.out.println("Idade: " + this.idade + "\n");
   }
    public void CadastrarCPF(String CPF) {
        this.CPF= CPF;
        System.out.println("CPF Cadastrado ");
        System.out.println("\n");
    }

    public void infoContas (String ContasBancarias){
        this.Bancaria=Bancaria;
        System.out.println("Contas Bancarias");

   }
}

import java.util.ArrayList;

public class Banco {
    private String nome;
    private String CNPJ;
    private int NroBanco;


    private ArrayList<ContaBancaria> Bancaria = new ArrayList<>();
    int NumAgencia;
    double NumConta;
    String NomeUsuario;
    String CPF;

    public Banco(String nome, String CNPJ, int nroBanco) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.NroBanco = nroBanco;
    }
    public void infoBanco(){
        System.out.println("++++ BANCO +++++");
        System.out.println("Nome: " + this.nome);
        System.out.println("CNPJ: " + this.CNPJ);
        System.out.println("Numero do BANCO " + this.NroBanco + "\n");
    }
    public void CriarConta(int NumAgencia,double NumConta,String NomeUsuario,String CPF){
    this.NumAgencia = NumAgencia;
    this.NumConta=NumConta;
    this.NomeUsuario=NomeUsuario;
    this.CPF=CPF;
    }
    public void infoContas(){
        System.out.println("+++++ CONTAS +++++");
        System.out.println("N° da Agencia:" + this.NumAgencia);
        System.out.println("N° da Conta:" + this.NumConta);
        System.out.println("Nome do usuario:" + this.NomeUsuario);
        System.out.println("CPF:" + this.CPF);
    }
    public void FecharConta(){

    }

}

import java.util.ArrayList;

public class ProgramacaoBanco {
    public static void main(String[] args){
        ArrayList<ContaBancaria> Bancaria = new ArrayList<>();

        Pessoa p1;
        p1 =new Pessoa("Aurea","Brito",37);
        p1.info();
        //p1.infoContas(String ContaBancaria);
        p1.CadastrarCPF("45609871279");

        Banco b1;
        b1 = new Banco("Banrisul","67530578682",041);
        b1.infoBanco();
        b1.infoContas();

        /*ContaBancaria cb1;
        cb1 = new ContaBancaria("Alfredo","Bradesco",35372830,5000,"333");
        cb1.Saque();
        cb1.Deposito();
        cb1.VerificarSenha();

        ContaPoupanca cp1;
        cp1 = new ContaPoupanca(300,2);
        *cb1.info();*
        /*/
    }
}

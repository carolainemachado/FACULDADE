/*
NÃO PODE ESTANCIAR UMA CLASSE ABSTRATA,
MAS ELA PODE TER FILHOS
 */
public class ContaBancaria {
    protected String Titular,Banco,Senha;
    protected int NroConta;
    protected double Saldo;

    public ContaBancaria(String titular, String Banco, int nroConta, double saldo, String senha) {
        this.Titular = titular;
        this.Banco = Banco;
        this.NroConta = nroConta;
        this.Saldo = saldo;
        this.Senha = senha;
    }
    public void Saque (double valorParaSacar) {
         double saques = 0;
        if (Saldo >= valorParaSacar) {
            Saldo -= valorParaSacar;
            saques++;
            System.out.println("Valor sacado: " + valorParaSacar);
            System.out.println("Novo saldo: " + Saldo + "\n");
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
    public void Deposito(double valorParaDepositar) {
        Saldo += valorParaDepositar;
        System.out.println("Valor depositado");
        System.out.println("Novo saldo" + Saldo + "\n");
    }

    public boolean VerificarSenha(int senha){
        if (this.Senha == Senha){
            System.out.println("Senha correta");
            return true;
        }else {
            System.out.println("Senha incorreta");
            return false;
        }
    }
}






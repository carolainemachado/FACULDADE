public class ContaPoupanca {
    private double rendimentos;
    private int SaquesMensais;

    public ContaPoupanca(double rendimentos, int saquesMensais) {
        this.rendimentos = rendimentos;
        this.SaquesMensais = saquesMensais;
    }
    public void info(){
        System.out.println("+++++ CONTA POUPANÇA:");
        System.out.println("Rendimentos: " + this.rendimentos);
        System.out.println("Saques Mensais: " + this.SaquesMensais);

    }
    public void NovoMes(){

    }
    public void Saque(){

    }
}

public class ContaCorrente {   // queria estnder para a criaçao de contas
    private double TaxasMensais;

    public ContaCorrente(double taxasMensais) {
        TaxasMensais = taxasMensais;
    }
    public void info(){
        System.out.println("++++ CONTA CORRENTE");
        System.out.println("Taxas Mensais: " + this.TaxasMensais);
    }
    public void NovoMes(){
    }
}

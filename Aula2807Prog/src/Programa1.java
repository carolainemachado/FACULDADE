public class Programa1 {
    public static void main(String[]args){

        Funcionario funcionario1;
        funcionario1 = new Funcionario("Jamile","Aereomoça",1700);
        funcionario1.infoFuncionario();
        funcionario1.novoSalario(2000);

        Piloto piloto1;
        piloto1 = new Piloto("Vanderlei",8500,"DL25131",10000);
        piloto1.infoPiloto();
        piloto1.novoSalario(6350);
    }
}

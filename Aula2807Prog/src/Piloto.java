public class Piloto extends Funcionario{
    protected String Brevet;
    protected int HorasVoo;

    public Piloto(String nome, double salario,String Brevet, int HorasVoo) {
        super(nome, "Piloto", salario);
        this.Brevet=Brevet;
        this.HorasVoo=3500 + (HorasVoo/2);
    }

    public void infoPiloto(){
        System.out.println("*** PILOTO ***");
        System.out.println("Nome: " + this.nome);
        System.out.println("Salario: " + this.salario);
        System.out.println("Brevet: " + this.Brevet);
        System.out.println("Horas Vooo" + this.HorasVoo);
    }

    public void salarioPiloto(double NovoSalario){
        System.out.println("Digite o salario do piloto");
        HorasVoo=teclado.nextInt();
        salario=HorasVoo /2 +salario;
        System.out.println(salario);
    }

}

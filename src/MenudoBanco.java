import java.util.Scanner;
public class MenudoBanco {
        public static void main(String [] args){
            Scanner teclado = new Scanner(System.in);

            int menu=0;
            double valorParaSacar;
            //protected double Saldo;

            do {
                System.out.println(" Escolha a opção desejada");
                System.out.println("1 - Sacar");
                System.out.println("2 - Depositar");
                System.out.println("0 - Sair");
                System.out.println("-------------------------------");

                menu = teclado.nextInt();

                if (menu == 1) {
                    System.out.print("Quanto deseja sacar: ");
                   valorParaSacar = teclado.nextDouble();
                   // Saque(valorParaSacar);
                } else{
                    System.out.println("Limite de saques diários atingidos.\n");
                    break;
                }

                if (menu == 2) {
                    System.out.print("Quanto deseja depositar: ");
                    valorParaSacar = teclado.nextDouble();
                    //Depositar(valorParaDepositar);
                    break;
                }

            } while (menu != 0);
            System.out.println("Encerrar atividades");
        }
}

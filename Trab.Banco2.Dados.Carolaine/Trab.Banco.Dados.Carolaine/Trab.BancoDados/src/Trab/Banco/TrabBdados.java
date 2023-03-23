package Trab.Banco;
import java.util.Scanner;

public class TrabBdados {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int acom= 0;

        do {
            System.out.println("   ============ Menu ===========  ");
            System.out.println(" | 1 - Inserir Acompanhantes      |");
            System.out.println(" | 2 - Atualizar Acompanhantes    |");
            System.out.println(" | 3 - Excluir Acompanhantes      |");
            System.out.println(" | 4 - Visualizar Acompanhantes   |");
            System.out.println(" | 5 - Sair                       |");
            System.out.println(" | Digite sua opção:              |");

            acom = teclado.nextInt();

            switch (acom) {
                case 1: {
                    Acompanhantes acompanhantes = new Acompanhantes();
                    try {
                        System.out.println("Digite o RG: ");
                        acompanhantes.setRG(teclado.next());

                        System.out.println("Digite o Acompanhantes: ");
                        acompanhantes.setNome_acompanhante(teclado.next());

                        acompanhantes.inserir();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                case 2: {
                    Acompanhantes acompanhantes = new Acompanhantes();
                    try {
                        System.out.println("Digite o RG: ");
                        acompanhantes.setRG(teclado.next());

                        System.out.println("Digite o nome dos acompanhantes ");
                        acompanhantes.setNome_acompanhante(teclado.next());

                        acompanhantes.atualizar();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                case 3: {
                    Acompanhantes acompanhantes = new Acompanhantes();
                    try {
                        System.out.println("Digite o RG: ");
                        acompanhantes.setRG(teclado.next());

                        acompanhantes.excluir();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                }
                case 4: {
                    Acompanhantes acompanhantes = new Acompanhantes();
                    try {
                        System.out.println("Acompanhantes : ");
                        acompanhantes.consultar();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                case 5: {
                    System.out.println("Voce saiu do programa");
                }
                default: {
                    System.out.println("Digite uma opção válida!!!");
                }
            }
        } while (acom != 5);
    }
}
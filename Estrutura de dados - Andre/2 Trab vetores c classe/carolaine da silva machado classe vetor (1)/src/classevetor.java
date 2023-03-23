import java.util.Scanner;
class Main{
    public static void main (String [] args) {
        Scanner teclado = new Scanner(System.in);
        classevetor vetor = new classevetor(20);
        int menu = 0;

        do {
            System.out.println("-------------MENU-------------");
            System.out.println("1- Criar ou zerar");
            System.out.println("2- Inserir");
            System.out.println("3- Apagar");
            System.out.println("4- Consultar");
            System.out.println("5- Consultar quantos valores");
            System.out.println("6- Consultar o maior");
            System.out.println("7- Consultar o menor");
            System.out.println("8- Listagem");
            System.out.println("0- Sair do programa");

            System.out.println("-------------------------------");

            menu = teclado.nextInt();

            if (menu == 1) {
                vetor.criarouZerar();
            }
            if (menu == 2) {
                vetor.inserir();
            }
            if (menu == 3) {
                vetor.apagar();
            }
            if (menu == 4) {
                vetor.consultar();
            }
            if (menu == 5) {
                vetor.quantValOcupam();
            }
            if (menu == 6) {
                vetor.maiorValor();
            }
            if (menu == 7) {
                vetor.menorValor();
            }
            if (menu == 8) {
                vetor.listagem();
            }
        } while (menu != 0);
        System.out.println("Voce saiu do programa");
    }
}
public class classevetor {
    Scanner teclado = new Scanner (System.in);
   public classevetor(int tamanho){
           vetor = new int[tamanho];
           this.tamanho = tamanho;
       }
       // ATRIBUTOS
       int tamanho,menor=0,maior=0;
       int vetor[];

       // METODOS
       // METODO 1 CRIAR
       public void criarouZerar() {
           for (int i = 0; i < 20; i++) { //iniciar vetor com zero
               vetor[i] = 0; //i= posiçao do vetor
               System.out.println(vetor[i]);
           }
           System.out.println("1 - Criar ou zerar:");
           System.out.println("Seu vetor foi criado ou zerado");

       }
       //METODO 2 INSERIR
       public void inserir() {
           System.out.println("2- Insira um valor");
           int novovalor=teclado.nextInt();
           for (int i=0; i<20; i++){
               if (vetor[i]==0){
                   vetor[i]=novovalor;
                   break;
               }
           }
           for (int i=0; i<20; i++){ //iniciar vetor com zero
               //System.out.println(vetor[i]);
           }
       }
       // METODO 3 APAGAR
       public void apagar() {
           System.out.println("3 - Apagar:");
           System.out.println("Qual posiçao voce deseja apagar ?");
           int novovalor=teclado.nextInt(); // Para ler valores do teclado
           for (int i=0; i<20; i++){
               if ( i == novovalor);
               vetor[i]=0;
           }
       }
       // METODO 4 CONSULTAR
       public void consultar() {
           boolean busca = false; // chamado de busca
               System.out.println("4 - Qual valor voce deseja consultar ?");
               int x =teclado.nextInt();

               for  (int i=0; i< vetor.length; i++){ // percorrendo o vetor
                   if (vetor[i] == x){ // se a posiçao I do vetor = a x se sim retornar true
                       busca = true;
                   }
               }
               if (busca == true) {
                   System.out.println("Sim");
               }
               if (busca == false) {
                   System.out.println("Nao"); // caso percorer o vetor e nao encontrar o valor return false
               }
           }
       int ocupam = 0;
       // METODO 5 QUANTOS VAL.OCUPAM O VETOR
       public void quantValOcupam() {
           System.out.println("5 - Consultar quantos valores já ocupam o vetor:");
           for (int i=0; i<vetor.length; i++){
               if (vetor[i] !=0 ){
                   ocupam++;
               }
           }
           System.out.println(ocupam);
       }

       // METODO 6 CONSULTAR MAIOR VALOR
       public void maiorValor() {
           System.out.println("6 - Consultar o maior valor armazenado no vetor:");
           for (int i=0; i<vetor.length; i++){
           }

           maior = vetor[0];
           for (int i=0; i<vetor.length; i++){
               if (vetor[i] > maior){
                   maior = vetor[i];
               }
           }
           System.out.println("Maior valor é:"+maior);
       }
       // METODO 7 CONSULTAR MENOR VALOR
       public void menorValor() {
           System.out.println("7 - Consultar o menor valor armazenado no vetor :");
           // para inicializar a variavel menor, percorendo o vetor
           // para ver se tem algun numero diferente de zero
           for (int i=0; i<vetor.length; i++){
               if (vetor[i] !=0){
                   menor=vetor[i];
                   i=vetor.length;

               }
           }
           for (int i=0; i<vetor.length; i++){
               if ( menor > vetor[i] && vetor[i] !=0 ){
               }
           }
           System.out.println("Maior valor é:"+menor);
       }
       // METODO 8 LISTAGEM
       public void listagem() {
           System.out.println("8 - Listagem");
           for (int i=0; i<vetor.length; i++){
               System.out.println(vetor[i]);
           }
       }
   }

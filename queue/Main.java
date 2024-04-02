import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue fila = new Queue();


        int item;
        int opcao;

        do {
            System.out.println("Digite 0 para encerrar o programa");
            System.out.println("Digite 1 para inserir na fila");
            System.out.println("Digite 2 para remover da fila");
            System.out.println("Digite 3 para imprimir a fila");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Insira o elemento na fila");
                item = sc.nextInt();
                fila.inserir(item);
            }

            if (opcao == 2) {
                System.out.println("Remova o elemento da fila");
                fila.remover();
            }
            if (opcao == 3) {
                fila.imprimir();
            }



        } while (opcao != 0);



        sc.close();
    }

}

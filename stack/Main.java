import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pilha pilha = new Pilha();


        int item;
        int opcao;

        do {
            System.out.println("Digite 0 para encerrar o programa");
            System.out.println("Digite 1 para inserir na pilha");
            System.out.println("Digite 2 para remover da pilha");
            System.out.println("Digite 3 para imprimir a pilha");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Insira o elemento na pilha");
                item = sc.nextInt();
                pilha.inserir(item);
            }

            if (opcao == 2) {
                System.out.println("Remova o elemento da pilha");
                pilha.remover();
            }
            if (opcao == 3) {
                pilha.imprimir();
            }



        } while (opcao != 0);



        sc.close();
    }
}

public class Queue {

    private int primeiro, ultimo = 0;
    private int maxItem = 100;
    private int vetor[];

    public Queue() {
        this.primeiro = primeiro;
        this.ultimo = ultimo;
        this.vetor = new int[maxItem];
    }

    public boolean estacheia() {
        return (ultimo - primeiro == maxItem);
    }

    public boolean estavazia (){
        return (primeiro == ultimo);
    }

    public void inserir(int item){
        if (estacheia()) {
            System.out.println("A fila está cheia!");
        } else {
            vetor[ultimo % maxItem] = item;
            ultimo++;
        }
    }

    public int remover() {
        if (estavazia()) {
            System.out.println("A fila está vazia!");
            return 0;
        } else {
            primeiro++;
            return vetor[(primeiro -1) % maxItem];
        }
    }

    public void imprimir(){
        System.out.println("Fila atual:");
        System.out.println('[');
        for (int i = primeiro; i < ultimo; i++) {
            System.out.println(vetor[i % maxItem]);
        }
        System.out.println(']');
    }

}



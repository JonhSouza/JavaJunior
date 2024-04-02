public class Pilha {

    private int tamanho = 0;
    private int maxItem = 100;
    private int vetor[];

    public Pilha() {
        this.vetor = new int[maxItem];
        this.tamanho = tamanho;
    }

    public boolean estacheia() {
        return (tamanho == maxItem);
    }

    public boolean estavazia (){
        return (tamanho == 0);
    }

    public void inserir(int item){
        if (estacheia()) {
            System.out.println("A pilha está cheia!");
        } else {
            vetor[tamanho] = item;
            tamanho++;
        }
    }

    public int remover() {
        if (estavazia()) {
            System.out.println("A pilha está vazia!");
            return 0;
        } else {
            return tamanho--;
        }
    }

    public void imprimir(){
        System.out.println("Pilha atual:");
        System.out.println('[');
        for (int i = 0; i < tamanho; i++) {
            System.out.println(vetor[i]);
        }
        System.out.println(']');
    }

}

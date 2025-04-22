public class Pilha {
    private String[] elementos;
    private int topo;

    // Construtor: define o tamanho da pilha
    public Pilha(int capacidade) {
        elementos = new String[capacidade];
        topo = -1; // começa vazia
    }

    // Empilha um novo elemento no topo
    public void empilhar(String item) {
        if (topo < elementos.length - 1) {
            topo++;
            elementos[topo] = item;
        } else {
            System.out.println("Pilha cheia! Não é possível empilhar.");
        }
    }

    // Desempilha o elemento do topo
    public String desempilhar() {
        if (!estaVazia()) {
            String item = elementos[topo];
            topo--;
            return item;
        } else {
            System.out.println("Pilha vazia! Não é possível desempilhar.");
            return null;
        }
    }

    // Verifica se a pilha está vazia
    public boolean estaVazia() {
        return topo == -1;
    }

    // Retorna o elemento no topo sem remover (opcional)
    public String verTopo() {
        if (!estaVazia()) {
            return elementos[topo];
        } else {
            return null;
        }
    }
    
}

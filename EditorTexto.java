public class EditorTexto {
    private String textoAtual;
    private Pilha pilhaDesfazer;
    private Pilha pilhaRefazer;

    public EditorTexto(int capacidade) {
        this.textoAtual = "";
        this.pilhaDesfazer = new Pilha(capacidade);
        this.pilhaRefazer = new Pilha(capacidade);
    }

    public void inserirTexto(String novoTexto) {
        pilhaDesfazer.empilhar(textoAtual);
        textoAtual += (textoAtual.isEmpty() ? "" : " ") + novoTexto;
        pilhaRefazer = new Pilha(pilhaRefazerCapacidade());
    }    

    public void desfazer() {
        if (!pilhaDesfazer.estaVazia()) {
            pilhaRefazer.empilhar(textoAtual); // Salva estado atual
            textoAtual = pilhaDesfazer.desempilhar(); // Recupera estado anterior
        } else {
            System.out.println("Nada para desfazer.");
        }
    }

    public void refazer() {
        if (!pilhaRefazer.estaVazia()) {
            pilhaDesfazer.empilhar(textoAtual); // Salva estado atual
            textoAtual = pilhaRefazer.desempilhar(); // Recupera estado futuro
        } else {
            System.out.println("Nada para refazer.");
        }
    }

    public void mostrarTexto() {
        System.out.println("Texto atual: " + textoAtual);
    }

    // Método auxiliar para manter capacidade da pilhaRefazer
    private int pilhaRefazerCapacidade() {
        return 10; // Pode ajustar se quiser uma capacidade diferente
    }
}

public class MainImpressao {
    public static void main(String[] args) {
        System.out.println("====== FILA DE IMPRESSÃO ======");

        FilaImpressao fila = new FilaImpressao(5);

        fila.adicionarDocumento(new Documento("Trabalho.pdf", 1500));
        fila.adicionarDocumento(new Documento("Relatorio.docx", 800));
        fila.adicionarDocumento(new Documento("Imagem.png", 350));

        fila.mostrarFila();

        fila.imprimirProximo();
        fila.imprimirProximo();

        fila.mostrarFila();
    }
}

import java.util.Scanner;

public class MainEditor{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EditorTexto editor = new EditorTexto(10);

        int opcao;
        do {
            System.out.println("\n--- EDITOR DE TEXTO ---");
            System.out.println("1 - Inserir texto");
            System.out.println("2 - Desfazer");
            System.out.println("3 - Refazer");
            System.out.println("4 - Mostrar texto atual");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o texto a adicionar: ");
                    String texto = scanner.nextLine();
                    editor.inserirTexto(texto);
                    break;
                case 2:
                    editor.desfazer();
                    break;
                case 3:
                    editor.refazer();
                    break;
                case 4:
                    editor.mostrarTexto();
                    break;
                case 0:
                    System.out.println("Encerrando editor...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}

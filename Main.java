package biblioteca;

import java.util.Scanner;

/**
 * Classe principal do sistema.
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Biblioteca biblioteca = new Biblioteca();

    public static void main(String[] args) {
        int opcao;
        do {
            exibirMenu();
            opcao = lerInteiro("Escolha uma opção: ");

            switch (opcao) {
                case 1: cadastrarLivro(); break;
                case 2: editarLivro(); break;
                case 3: removerLivro(); break;
                case 4: biblioteca.listarLivros(); break;
                case 5: cadastrarMembro(); break;
                case 6: editarMembro(); break;
                case 7: biblioteca.listarUsuarios(); break;
                case 8: realizarEmprestimo(); break;
                case 9: encerrarEmprestimo(); break;
                case 10: biblioteca.listarEmprestimos(); break;
                case 0: System.out.println("Sistema encerrado."); break;
                default: System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n==============================");
        System.out.println("       SISTEMA BIBLIOTECA");
        System.out.println("==============================");
        System.out.println("1 - Cadastrar livro");
        System.out.println("2 - Editar livro");
        System.out.println("3 - Remover livro");
        System.out.println("4 - Listar livros");
        System.out.println("5 - Cadastrar membro");
        System.out.println("6 - Editar membro");
        System.out.println("7 - Listar usuários");
        System.out.println("8 - Realizar empréstimo");
        System.out.println("9 - Encerrar empréstimo");
        System.out.println("10 - Listar empréstimos");
        System.out.println("0 - Sair");
        System.out.println("==============================");
    }

    private static void cadastrarLivro() {
        int id = lerInteiro("ID do livro: ");
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        System.out.print("ISBN: ");
        String isbn = scanner.nextLine();
        biblioteca.adicionarLivro(new Livro(id, titulo, autor, isbn));
    }

    private static void editarLivro() {
        int id = lerInteiro("ID do livro que deseja editar: ");
        System.out.print("Novo título: ");
        String titulo = scanner.nextLine();
        System.out.print("Novo autor: ");
        String autor = scanner.nextLine();
        System.out.print("Novo ISBN: ");
        String isbn = scanner.nextLine();
        biblioteca.editarLivro(id, titulo, autor, isbn);
    }

    private static void removerLivro() {
        int id = lerInteiro("ID do livro que deseja remover: ");
        biblioteca.removerLivro(id);
    }

    private static void cadastrarMembro() {
        int id = lerInteiro("ID do membro: ");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        biblioteca.adicionarUsuario(new Membro(id, nome, cpf, telefone));
    }

    private static void editarMembro() {
        int id = lerInteiro("ID do membro que deseja editar: ");
        System.out.print("Novo nome: ");
        String nome = scanner.nextLine();
        System.out.print("Novo CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Novo telefone: ");
        String telefone = scanner.nextLine();
        biblioteca.editarMembro(id, nome, cpf, telefone);
    }

    private static void realizarEmprestimo() {
        int idEmprestimo = lerInteiro("ID do empréstimo: ");
        int idLivro = lerInteiro("ID do livro: ");
        int idMembro = lerInteiro("ID do membro: ");
        try {
            biblioteca.realizarEmprestimo(idEmprestimo, idLivro, idMembro);
        } catch (BibliotecaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
    }

    private static void encerrarEmprestimo() {
        int id = lerInteiro("ID do empréstimo: ");
        try {
            biblioteca.encerrarEmprestimo(id);
        } catch (BibliotecaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
    }

    private static int lerInteiro(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Digite um número válido.");
            }
        }
    }
}

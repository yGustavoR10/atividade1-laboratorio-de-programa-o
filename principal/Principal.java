package principal;

public class Principal {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        LivroFisico livro1 = new LivroFisico(
                "Dom Casmurro",
                "Machado de Assis",
                256,
                0.5
        );

        Ebook livro2 = new Ebook(
                "O Pequeno Príncipe",
                "Antoine de Saint-Exupéry",
                310,
                4.8
        );

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        System.out.println("=== LIVROS DA BIBLIOTECA ===");

        biblioteca.listarLivros();

        System.out.println("=== BUSCA POR TITULO ===");

        Livro encontrado = biblioteca.buscarLivroPorTitulo("O Hobbit");

        if (encontrado != null) {
            encontrado.descricao();
        } else {
            System.out.println("Livro não encontrado.");
        }
    }
}
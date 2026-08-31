package biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsável pelo gerenciamento geral da biblioteca.
 */
public class Biblioteca {
    private List<Livro> livros;
    private List<Usuario> usuarios;
    private List<Emprestimo> emprestimos;

    public Biblioteca() {
        livros = new ArrayList<>();
        usuarios = new ArrayList<>();
        emprestimos = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro cadastrado com sucesso!");
    }

    public Livro buscarLivro(int id) {
        for (Livro livro : livros)
            if (livro.getId() == id) return livro;
        return null;
    }

    public void editarLivro(int id, String titulo, String autor, String isbn) {
        Livro livro = buscarLivro(id);
        if (livro == null) {
            System.out.println("Livro não encontrado.");
            return;
        }
        livro.setTitulo(titulo);
        livro.setAutor(autor);
        livro.setIsbn(isbn);
        System.out.println("Livro atualizado com sucesso!");
    }

    public void removerLivro(int id) {
        Livro livro = buscarLivro(id);
        if (livro == null) {
            System.out.println("Livro não encontrado.");
            return;
        }
        livros.remove(livro);
        System.out.println("Livro removido com sucesso!");
    }

    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }
        System.out.println("\n===== LIVROS =====");
        for (Livro livro : livros) livro.exibirInformacoes();
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuário cadastrado com sucesso!");
    }

    public Usuario buscarUsuario(int id) {
        for (Usuario usuario : usuarios)
            if (usuario.getId() == id) return usuario;
        return null;
    }

    public void editarMembro(int id, String nome, String cpf, String telefone) {
        Usuario usuario = buscarUsuario(id);
        if (!(usuario instanceof Membro)) {
            System.out.println("Membro não encontrado.");
            return;
        }
        Membro membro = (Membro) usuario;
        membro.setNome(nome);
        membro.setCpf(cpf);
        membro.setTelefone(telefone);
        System.out.println("Membro atualizado com sucesso!");
    }

    public void listarUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
            return;
        }
        System.out.println("\n===== USUÁRIOS =====");
        for (Usuario usuario : usuarios) {
            usuario.exibirInformacoes();
            System.out.println("----------------------------");
        }
    }

    public void realizarEmprestimo(int idEmprestimo, int idLivro, int idMembro)
            throws BibliotecaException {
        Livro livro = buscarLivro(idLivro);
        Usuario usuario = buscarUsuario(idMembro);

        if (livro == null)
            throw new BibliotecaException("Livro não encontrado.");
        if (usuario == null || !(usuario instanceof Membro))
            throw new BibliotecaException("Membro não encontrado.");
        if (!livro.isDisponivel())
            throw new LivroIndisponivelException("O livro não está disponível.");

        Membro membro = (Membro) usuario;
        Emprestimo emprestimo = new Emprestimo(idEmprestimo, livro, membro);
        emprestimos.add(emprestimo);
        livro.setDisponivel(false);
        System.out.println("Empréstimo realizado com sucesso!");
    }

    public Emprestimo buscarEmprestimo(int id) {
        for (Emprestimo emprestimo : emprestimos)
            if (emprestimo.getId() == id) return emprestimo;
        return null;
    }

    public void encerrarEmprestimo(int id) throws BibliotecaException {
        Emprestimo emprestimo = buscarEmprestimo(id);
        if (emprestimo == null)
            throw new BibliotecaException("Empréstimo não encontrado.");
        if (!emprestimo.isAtivo())
            throw new BibliotecaException("Este empréstimo já foi encerrado.");
        emprestimo.encerrar();
        System.out.println("Empréstimo encerrado com sucesso!");
    }

    public void listarEmprestimos() {
        if (emprestimos.isEmpty()) {
            System.out.println("Nenhum empréstimo cadastrado.");
            return;
        }
        System.out.println("\n===== EMPRÉSTIMOS =====");
        for (Emprestimo emprestimo : emprestimos)
            emprestimo.exibirInformacoes();
    }
}

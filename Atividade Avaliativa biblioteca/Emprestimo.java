package biblioteca;

import java.time.LocalDate;

/**
 * Classe responsável pelo gerenciamento dos empréstimos.
 */
public class Emprestimo implements Listavel {
    private int id;
    private Livro livro;
    private Membro membro;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private boolean ativo;

    public Emprestimo(int id, Livro livro, Membro membro) {
        this.id = id;
        this.livro = livro;
        this.membro = membro;
        this.dataEmprestimo = LocalDate.now();
        this.ativo = true;
    }

    public int getId() { return id; }
    public Livro getLivro() { return livro; }
    public Membro getMembro() { return membro; }
    public LocalDate getDataEmprestimo() { return dataEmprestimo; }
    public LocalDate getDataDevolucao() { return dataDevolucao; }
    public boolean isAtivo() { return ativo; }

    public void encerrar() {
        if (!ativo) return;
        ativo = false;
        dataDevolucao = LocalDate.now();
        livro.setDisponivel(true);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("ID do empréstimo: " + id);
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Membro: " + membro.getNome());
        System.out.println("Data do empréstimo: " + dataEmprestimo);
        if (dataDevolucao != null)
            System.out.println("Data da devolução: " + dataDevolucao);
        System.out.println("Status: " + (ativo ? "Ativo" : "Encerrado"));
        System.out.println("----------------------------");
    }
}

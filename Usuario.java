package biblioteca;

/**
 * Classe abstrata que representa um usuário da biblioteca.
 * Demonstra o conceito de ABSTRAÇÃO.
 */
public abstract class Usuario implements Listavel {
    private int id;
    private String nome;
    private String cpf;

    public Usuario(int id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public abstract String getTipo();
}

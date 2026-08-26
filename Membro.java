package biblioteca;

/**
 * Representa um membro comum da biblioteca.
 * Demonstra HERANÇA.
 */
public class Membro extends Usuario {
    private String telefone;

    public Membro(int id, String nome, String cpf, String telefone) {
        super(id, nome, cpf);
        this.telefone = telefone;
    }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    @Override
    public String getTipo() { return "Membro"; }

    @Override
    public void exibirInformacoes() {
        System.out.println("ID: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Telefone: " + telefone);
        System.out.println("Tipo: " + getTipo());
    }
}

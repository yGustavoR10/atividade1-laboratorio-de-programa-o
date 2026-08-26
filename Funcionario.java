package biblioteca;

/**
 * Representa um funcionário da biblioteca.
 * Demonstra HERANÇA.
 */
public class Funcionario extends Usuario {
    private String cargo;

    public Funcionario(int id, String nome, String cpf, String cargo) {
        super(id, nome, cpf);
        this.cargo = cargo;
    }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    @Override
    public String getTipo() { return "Funcionário"; }

    @Override
    public void exibirInformacoes() {
        System.out.println("ID: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Cargo: " + cargo);
        System.out.println("Tipo: " + getTipo());
    }
}

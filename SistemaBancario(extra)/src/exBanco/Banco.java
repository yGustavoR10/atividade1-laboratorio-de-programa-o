package exBanco;

public class Banco {

    private int numero;
    private int agNumero;
    private String agNome;
    private int bancoNumero;
    private String bancoNome;
    private int tipo;
    private double saldo;

    // Construtor padrão
    public Banco() {
    }

    // Construtor personalizado com saldo inicial igual a zero
    public Banco(int numero, int agNumero, String agNome, int tipo) {
        this.numero = numero;
        this.agNumero = agNumero;
        this.agNome = agNome;
        this.tipo = tipo;
        this.saldo = 0.0;

        // Dados padrão do banco, pois o enunciado pede banco com nome e número,
        // mas não informa valores específicos para a conta de teste.
        this.bancoNumero = 1;
        this.bancoNome = "Banco Exemplo";
    }

    // Construtor completo opcional
    public Banco(int numero, int agNumero, String agNome,
                 int bancoNumero, String bancoNome, int tipo) {
        this.numero = numero;
        this.agNumero = agNumero;
        this.agNome = agNome;
        this.bancoNumero = bancoNumero;
        this.bancoNome = bancoNome;
        this.tipo = tipo;
        this.saldo = 0.0;
    }

    public int getNumero() {
        return numero;
    }

    public int getAgNumero() {
        return agNumero;
    }

    public String getAgNome() {
        return agNome;
    }

    public int getBancoNumero() {
        return bancoNumero;
    }

    public String getBancoNome() {
        return bancoNome;
    }

    public int getTipo() {
        return tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void creditar(double valor) {
        if (tipo == 4) {
            throw new IllegalStateException("A conta está encerrada.");
        }

        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do crédito deve ser maior que zero.");
        }

        saldo += valor;
    }

    public void debitar(double valor) {
        if (tipo == 4) {
            throw new IllegalStateException("A conta está encerrada.");
        }

        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do débito deve ser maior que zero.");
        }

        saldo -= valor;
    }

    public String consultarSaldo() {
        return String.format("Conta nº %d - Saldo atual: R$ %.2f", numero, saldo);
    }

    public int encerrarConta() {
        if (saldo < 0) {
            throw new IllegalStateException(
                "Não é possível encerrar uma conta com saldo negativo."
            );
        }

        tipo = 4;
        saldo = 0.0;
        return numero;
    }

    public String textoEncerrar(double saldoEncerrado) {
        return String.format(
            "Conta nº %d encerrada com sucesso.%nTipo da conta: %d%nSaldo devolvido ao cliente: R$ %.2f%nSaldo atual: R$ %.2f",
            numero, tipo, saldoEncerrado, saldo
        );
    }
}

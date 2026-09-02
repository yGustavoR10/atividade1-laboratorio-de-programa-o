package exBanco;

/*
 * A atividade menciona a classe Banco, mas também pede que seja
 * instanciado um objeto Conta. Por isso, Conta herda de Banco.
 * Dessa forma, os métodos e atributos bancários ficam centralizados
 * na classe Banco e a Application pode criar uma Conta normalmente.
 */
public class Conta extends Banco {

    public Conta() {
        super();
    }

    public Conta(int numero, int agNumero, String agNome, int tipo) {
        super(numero, agNumero, agNome, tipo);
    }

    public Conta(int numero, int agNumero, String agNome,
                 int bancoNumero, String bancoNome, int tipo) {
        super(numero, agNumero, agNome, bancoNumero, bancoNome, tipo);
    }
}

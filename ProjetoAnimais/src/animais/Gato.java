package animais;

// Gato também é uma especialização de Animal.
public class Gato extends Animal {

    public Gato(String nome, int idade, String cor) {
        super(nome, idade, cor, "Miau!");
    }

    // Implementação específica do som do gato.
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " emitiu o som: " + getSom());
    }
}

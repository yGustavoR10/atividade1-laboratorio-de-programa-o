package animais;

// Cachorro herda as características da classe Animal.
public class Cachorro extends Animal {

    // O construtor define os dados do cachorro e seu som inicial.
    public Cachorro(String nome, int idade, String cor) {
        super(nome, idade, cor, "Au au!");
    }

    // Cada animal implementa emitirSom() de sua própria maneira.
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " emitiu o som: " + getSom());
    }
}

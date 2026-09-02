package animais;

// Cavalo herda os atributos e métodos da classe Animal.
public class Cavalo extends Animal {

    public Cavalo(String nome, int idade, String cor) {
        super(nome, idade, cor, "Relincho!");
    }

    // Implementação específica do método emitirSom().
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " emitiu o som: " + getSom());
    }
}

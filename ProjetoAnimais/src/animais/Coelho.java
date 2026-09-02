package animais;

// Coelho foi incluído porque o item 5 da atividade pede um Coelho na lista.
public class Coelho extends Animal {

    public Coelho(String nome, int idade, String cor) {
        super(nome, idade, cor, "Som de coelho!");
    }

    // Implementação do som do coelho.
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " emitiu o som: " + getSom());
    }
}

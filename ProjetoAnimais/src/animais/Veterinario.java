package animais;

import java.util.ArrayList;

// Classe responsável por controlar os animais atendidos pelo veterinário.
public class Veterinario {

    // ArrayList<Animal> permite armazenar objetos de diferentes subclasses,
    // como Cachorro, Gato, Cavalo e Coelho.
    private ArrayList<Animal> animais;
    private ArrayList<Animal> carrocinha;

    public Veterinario() {
        animais = new ArrayList<>();
        carrocinha = new ArrayList<>();
    }

    // Adiciona um animal à lista de animais atendidos.
    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }

    // Percorre a lista e chama emitirSom().
    // Como Animal é a classe pai, o Java executa a versão correta
    // do método de acordo com o tipo real do objeto (polimorfismo).
    // Depois, o animal é colocado na carrocinha.
    public void atenderAnimais() {
        System.out.println("\n===== ANIMAIS NO VETERINARIO =====");

        for (Animal animal : animais) {
            System.out.println("\n----------------------------");
            animal.exibirDados();
            animal.emitirSom();

            carrocinha.add(animal);
            System.out.println(animal.getNome() + " foi adicionado(a) na carrocinha.");
        }
    }

    // Exibe todos os animais que foram colocados na carrocinha.
    public void listarCarrocinha() {
        System.out.println("\n===== CARROCINHA =====");

        for (Animal animal : carrocinha) {
            System.out.println(animal.getNome() + " - " + animal.getClass().getSimpleName());
        }
    }
}

package animais;

// Classe principal do projeto. É onde o programa começa a ser executado.
public class Application {

    public static void main(String[] args) {

        // Criação de objetos das diferentes subclasses de Animal.
        Cachorro cachorro = new Cachorro("Rex", 5, "Marrom");
        Gato gato = new Gato("Mimi", 3, "Branco");
        Cavalo cavalo = new Cavalo("Trovao", 7, "Preto");
        Coelho coelho = new Coelho("Pipoca", 2, "Cinza");

        // Teste do método que permite alterar o som de um animal.
        System.out.println("===== TESTE DE ALTERACAO DE SOM =====");
        cachorro.emitirSom();

        cachorro.modificarSom("Au au au!");
        System.out.println("Depois de modificar o som:");
        cachorro.emitirSom();

        // Criação do veterinário, que possui as listas de animais.
        Veterinario veterinario = new Veterinario();

        // Adicionamos objetos de subclasses diferentes em uma lista de Animal.
        // Isso demonstra polimorfismo.
        veterinario.adicionarAnimal(cachorro);
        veterinario.adicionarAnimal(gato);
        veterinario.adicionarAnimal(cavalo);
        veterinario.adicionarAnimal(coelho);

        // O veterinário percorre os animais, emite seus sons e os coloca na carrocinha.
        veterinario.atenderAnimais();

        // Mostra os animais que foram adicionados à carrocinha.
        veterinario.listarCarrocinha();
    }
}

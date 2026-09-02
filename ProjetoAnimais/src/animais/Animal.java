package animais;

// Classe abstrata que representa um animal de forma genérica.
// Ela concentra os dados e comportamentos que todos os animais possuem.
public abstract class Animal {

    // Atributos privados: usamos encapsulamento para proteger os dados.
    private String nome;
    private int idade;
    private String cor;
    private String som;

    // Construtor padrão.
    public Animal() {
    }

    // Construtor que recebe os dados iniciais do animal.
    public Animal(String nome, int idade, String cor, String som) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
        this.som = som;
    }

    // Getters permitem consultar os atributos privados.
    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public String getCor() { return cor; }
    public String getSom() { return som; }

    // Setters permitem alterar alguns dados de forma controlada.
    public void setNome(String nome) { this.nome = nome; }
    public void setIdade(int idade) { this.idade = idade; }
    public void setCor(String cor) { this.cor = cor; }

    // Permite modificar o som do animal, conforme solicitado na atividade.
    public void modificarSom(String novoSom) {
        this.som = novoSom;
    }

    // Método abstrato: cada subclasse deverá implementar seu próprio som.
    // Isso demonstra abstração e polimorfismo.
    public abstract void emitirSom();

    // Mostra as informações básicas do animal.
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cor: " + cor);
    }
}

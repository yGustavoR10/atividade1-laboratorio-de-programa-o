package principal;

public class LivroFisico extends Livro {

    private double peso;

    public LivroFisico(String titulo, String autor, int numeroPaginas, double peso) {
        super(titulo, autor, numeroPaginas);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public void descricao() {
        System.out.println("Livro Fisico");
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Numero de paginas: " + getNumeroPaginas());
        System.out.println("Peso: " + peso + " kg");
    }
}
package principal;

public class Ebook extends Livro {

    private double tamanhoArquivo;

    public Ebook(String titulo, String autor, int numeroPaginas, double tamanhoArquivo) {
        super(titulo, autor, numeroPaginas);
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(double tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }

    @Override
    public void descricao() {
        System.out.println("E-book");
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Numero de paginas: " + getNumeroPaginas());
        System.out.println("Tamanho do arquivo: " + tamanhoArquivo + " MB");
    }
}
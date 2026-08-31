package biblioteca;

/** Exceção para livro indisponível. */
public class LivroIndisponivelException extends BibliotecaException {
    public LivroIndisponivelException(String mensagem) {
        super(mensagem);
    }
}

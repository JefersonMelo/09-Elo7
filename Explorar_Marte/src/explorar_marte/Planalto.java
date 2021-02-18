package explorar_marte;

/**
 * @author JefMelo
 */
public class Planalto { // Não Está Sendo Utilizada

    private int largura;
    private int altura;
    char[][] malha2D;

    public Planalto() {
    }

    public Planalto(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;

    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public char[][] getMalha2D() {
        return malha2D;
    }

    public void setMalha2D(char[][] malha2D) {
        this.malha2D = malha2D;
    }
}

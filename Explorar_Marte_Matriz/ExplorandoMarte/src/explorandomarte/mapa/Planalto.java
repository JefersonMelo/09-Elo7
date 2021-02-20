package explorandomarte.mapa;

public class Planalto {

    private int linhas;
    private int colunas;
    private char[][] plano;

    public Planalto() {
    }

    public void Malha(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.plano = new char[linhas][colunas];
    }

    public String posicao(int linhas, int colunas) {

        this.linhas = linhas;
        this.colunas = colunas;
        this.plano = new char[linhas][colunas];
        return plano[linhas++][colunas++] + " | ";
    }

    public int getLinhas() {
        return linhas;
    }

    public void setLinhas(int linhas) {
        this.linhas = linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public void setColunas(int colunas) {
        this.colunas = colunas;
    }

    public char[][] getPlano() {
        return plano;
    }

    public void setPlano(char[][] plano) {
        this.plano = plano;
    }

}

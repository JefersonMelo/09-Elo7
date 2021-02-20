package explorandomarte.mapa;

/*
    O planalto é divido numa malha para simplificar a navegação. 
    Um exemplo de posição seria (0, 0, N), que indica que a sonda 
    está no canto inferior esquerdo e apontando para o Norte.
*/

public class PontosCardeais {

    private char ponto;
    Planalto p = new Planalto();
    public char getPonto() {
        return ponto;
    }

    public void setPonto(char ponto) {
        this.ponto = ponto;
    }

    public PontosCardeais(char ponto) {
        this.ponto = ponto;

        switch (this.ponto) {
            case 'N':
                
                break;
            case 'S':

                break;
            case 'E':
                
                break;
            case 'W':              
                
                break;
            default:
                throw new AssertionError();
        }
    }
}

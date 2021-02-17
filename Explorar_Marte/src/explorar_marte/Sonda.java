package explorar_marte;

/**
 * @author JefMelo
 */
public class Sonda {

    private int eixo_X;
    private int eixo_Y;
    private int largura;
    private int altura;
    private String pontoCardeal;
    private String move;

    public Sonda() {
    }

    public Sonda(int altura, int largura, int eixo_X, int eixo_Y, String card, String mover) {

        this.altura = altura;
        this.largura = largura;
        this.eixo_X = eixo_X;
        this.eixo_Y = eixo_Y;
        this.pontoCardeal = card.toUpperCase();
        this.move = mover.toUpperCase();

        char moveInd;

        for (int i = 0; i < this.move.length(); i++) {

            moveInd = this.move.charAt(i);

            switch (moveInd) {

                case 'L'://Esquerda -90º  <--

                    switch (this.pontoCardeal) {
                        case "N":

                            this.pontoCardeal = "W";
                            break;
                        case "W":

                            this.pontoCardeal = "S";
                            break;
                        case "S":

                            this.pontoCardeal = "E";
                            break;
                        case "E":

                            this.pontoCardeal = "N";
                            break;
                    }
                    break;

                case 'R'://Direita +90º  -->

                    switch (this.pontoCardeal) {
                        case "N":

                            this.pontoCardeal = "E";
                            break;
                        case "E":

                            this.pontoCardeal = "S";
                            break;
                        case "S":

                            this.pontoCardeal = "W";
                            break;
                        case "W":

                            this.pontoCardeal = "N";
                            break;
                    }
                    break;

                case 'M'://Movimenta -->                 

                    if (this.pontoCardeal.equals("N") && this.largura > this.eixo_Y) {
                        this.eixo_Y += 1;

                    } else if (this.pontoCardeal.equals("S") && this.largura > this.eixo_Y) {
                        this.eixo_Y -= 1;

                    } else if (this.pontoCardeal.equals("E") && this.altura > this.eixo_X) {
                        this.eixo_X += 1;

                    } else if (this.pontoCardeal.equals("W") && this.altura > this.eixo_Y) {
                        this.eixo_X -= 1;

                    }
                    break;
            }
        }

    }

    @Override
    public String toString() {

        return this.eixo_X + " " + this.eixo_Y + " " + this.pontoCardeal;

    }

    public int getEixo_X() {
        return eixo_X;
    }

    public void setEixo_X(int eixo_X) {
        this.eixo_X = eixo_X;
    }

    public int getEixo_Y() {
        return eixo_Y;
    }

    public void setEixo_Y(int eixo_Y) {
        this.eixo_Y = eixo_Y;
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

    public String getPontoCardeal() {
        return pontoCardeal;
    }

    public void setPontoCardeal(String movimento) {
        this.pontoCardeal = movimento;
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }

}

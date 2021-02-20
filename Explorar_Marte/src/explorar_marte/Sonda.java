package explorar_marte;

/**
 * @author JefMelo
 */
public class Sonda extends PontosCardeais {

    private int eixo_X;
    private int eixo_Y;
    private int largura;
    private int altura;
    private String pontoCardeal;
    private String move;

    public Sonda() {
    }

    @SuppressWarnings("OverridableMethodCallInConstructor")
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
                // Lógica movida para Pontos Cardeais
                case 'L'://Esquerda -90º  <--
                    this.pontoCardeal = SondaParaEsquerda(this.pontoCardeal);
                    break;

                // Lógica movida para Pontos Cardeais
                case 'R'://Direita +90º  -->
                    this.pontoCardeal = SondaParaDireita(this.pontoCardeal);
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
}

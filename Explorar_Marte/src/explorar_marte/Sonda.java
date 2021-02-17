/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package explorar_marte;

/**
 * @author JefMelo
 */
public class Sonda extends Planalto{

    private int eixo_X;
    private int eixo_Y;
    private String pontoCardeal;
    private String move;

    //PontosCardeais pc = new PontosCardeais();
    Planalto plano;// = new Planalto();
    PontosCardeais pc;// = new PontosCardeais();
    
    public Sonda() {
    }

    public void Posicao(int eixo_X, int eixo_Y, String card) {
        this.eixo_X = eixo_X;
        this.eixo_Y = eixo_Y;
        this.pontoCardeal = card;
    }

    public void MovimentarSonda(String mover) {
        int contE = 0, contD = 0, contM = 0, larg, alt;
        larg = plano.getLargura();
        alt  = plano.getAltura();
        this.move = mover.toUpperCase();
        String card = this.pontoCardeal;//pc.getCard().toUpperCase();
        String novoPonto = "";
        char moveInd;

        for (int i = 0; i < this.move.length(); i++) {

            moveInd = this.move.charAt(i);

            switch (moveInd) {

                case 'L'://Esquerda -90º
                    contE++;
                    switch (card) {
                        case "N":
                            novoPonto = "W";
                            //pc.PontoCardeal("W");
                            break;
                        case "W":
                            novoPonto = "S";
                            //pc.PontoCardeal("S");
                            break;
                        case "S":
                            novoPonto = "E";
                            //pc.PontoCardeal("E");
                            break;
                        case "E":
                            novoPonto = "N";
                            //pc.PontoCardeal("N");
                            break;
                    }
                    break;

                case 'R'://Direita +90º
                    contD++;
                    switch (card) {
                        case "N":
                            novoPonto = "E";
                            //pc.PontoCardeal("E");
                            break;
                        case "E":
                            novoPonto = "S";
                            //pc.PontoCardeal("S");
                            break;
                        case "S":
                            novoPonto = "W";
                            //pc.PontoCardeal("W");
                            break;
                        case "W":
                            novoPonto = "N";
                            //pc.PontoCardeal("N");
                            break;
                    }
                    break;

                case 'M'://Movimenta                  
                    contM++;
                    if (novoPonto.equals("N") && larg > this.eixo_Y) {
                        this.eixo_Y += 1;
                        this.pontoCardeal = novoPonto;
                    } else if (novoPonto.equals("S") && larg > this.eixo_Y) {
                        this.eixo_Y -= 1;
                        this.pontoCardeal = novoPonto;
                    } else if (novoPonto.equals("E") && alt > this.eixo_X) {
                        this.eixo_X += 1;
                        this.pontoCardeal = novoPonto;
                    } else if (novoPonto.equals("W") && alt > this.eixo_Y) {
                        this.eixo_X -= 1;
                        this.pontoCardeal = novoPonto;
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

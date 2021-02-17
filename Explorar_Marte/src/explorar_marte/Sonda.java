/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package explorar_marte;

/**
 * @author JefMelo
 */
public class Sonda {

    private int eixo_X;
    private int eixo_Y;
    private String pontoCardeal;
    private String move;

    PontosCardeais pc = new PontosCardeais();

    public Sonda() {
    }

    public void posicao(int eixo_X, int eixo_Y, String ponto) {
        this.eixo_X = eixo_X;
        this.eixo_Y = eixo_Y;
        this.pontoCardeal = ponto;
    }

    public void MovimentarSonda(String move) {
        int contE = 0, contD = 0, contM = 0;
        this.move = move.toUpperCase();
        String card = this.pontoCardeal;
        char moveInd;

        for (int i = 0; i < this.move.length(); i++) {

            moveInd = this.move.charAt(i);

            switch (moveInd) {

                case 'L'://Esquerda -90º
                    contE++;
                    switch (card) {
                        case "N":
                            pc.PontoCardeal("W");
                            break;
                        case "W":
                            pc.PontoCardeal("S");
                            break;
                        case "S":
                            pc.PontoCardeal("E");
                            break;
                        case "E":
                            pc.PontoCardeal("N");
                            break;
                        default:
                            break;
                    }
                    break;

                case 'R'://Direita +90º
                    contD++;
                    switch (card) {
                        case "N":
                            pc.PontoCardeal("E");
                            break;
                        case "E":
                            pc.PontoCardeal("S");
                            break;
                        case "S":
                            pc.PontoCardeal("W");
                            break;
                        case "W":
                            pc.PontoCardeal("N");
                            break;
                        default:
                            break;
                    }
                    break;

                case 'M'://Movimenta
                    
                    contM++;
                    break;

                default:
                    throw new AssertionError();
            }
        }
    }

    @Override
    public String toString() {

        return this.eixo_X + " " + this.eixo_Y + " " + pc;

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

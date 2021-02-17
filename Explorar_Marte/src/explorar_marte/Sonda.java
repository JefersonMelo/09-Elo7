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
    private int largura;
    private int altura;
    private String pontoCardeal;
    private String move;

    //PontosCardeais pc = new PontosCardeais();
//    Planalto plano;// = new Planalto();
//    PontosCardeais pc;// = new PontosCardeais();

    public Sonda() {
    }

//    public void Posicao(int eixo_X, int eixo_Y, String card) {
//        this.eixo_X = eixo_X;
//        this.eixo_Y = eixo_Y;
//        this.pontoCardeal = card;
//    }
//    
//     public void Planalto(int largura, int altura) {
//        this.largura = largura;
//        this.altura = altura;
//        
//    }

    public void MovimentarSonda(int altura, int largura, int eixo_X, int eixo_Y, String card, String mover) {
        int contE = 0, contD = 0, contM = 0;
        this.altura = altura;
        this.largura = largura;
        this.eixo_X = eixo_X;
        this.eixo_Y = eixo_Y;
        this.pontoCardeal = card.toUpperCase();
        this.move = mover.toUpperCase();
        //this.move = mover.toUpperCase();
        //String card = this.pontoCardeal;//pc.getCard().toUpperCase();
        //String novoPonto = "";
        char moveInd;

        for (int i = 0; i < this.move.length(); i++) {

            moveInd = this.move.charAt(i);

            switch (moveInd) {

                case 'L'://Esquerda -90º
                    contE++;
                    switch (this.pontoCardeal) {
                        case "N":
                            //novoPonto = "W";
                            this.pontoCardeal = "W";
                            break;
                        case "W":
                            //novoPonto = "S";
                            this.pontoCardeal = "S";
                            break;
                        case "S":
                            //novoPonto = "E";
                            this.pontoCardeal = "E";
                            break;
                        case "E":
                            //novoPonto = "N";
                            this.pontoCardeal = "N";
                            break;
                    }
                    break;

                case 'R'://Direita +90º
                    contD++;
                    switch (this.pontoCardeal) {
                        case "N":
                            //novoPonto = "E";
                            this.pontoCardeal = "E";
                            break;
                        case "E":
                            //novoPonto = "S";
                            this.pontoCardeal = "S";
                            break;
                        case "S":
                            //novoPonto = "W";
                            this.pontoCardeal = "W";
                            break;
                        case "W":
                            //novoPonto = "N";
                            this.pontoCardeal = "N";
                            break;
                    }
                    break;

                case 'M'://Movimenta                  
                    contM++;
                    if (this.pontoCardeal.equals("N") && this.largura > this.eixo_Y) {
                        this.eixo_Y += 1;
                        //this.pontoCardeal = novoPonto;
                    } else if (this.pontoCardeal.equals("S") && this.largura > this.eixo_Y) {
                        this.eixo_Y -= 1;
                        //this.pontoCardeal = novoPonto;
                    } else if (this.pontoCardeal.equals("E") && this.altura > this.eixo_X) {
                        this.eixo_X += 1;
                        //this.pontoCardeal = novoPonto;
                    } else if (this.pontoCardeal.equals("W") && this.altura > this.eixo_Y) {
                        this.eixo_X -= 1;
                        //this.pontoCardeal = novoPonto;
                    }
                    break;
            }
        }
        //return this.eixo_X + " " + this.eixo_Y + " " + this.pontoCardeal;
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

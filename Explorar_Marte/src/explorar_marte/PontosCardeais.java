/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package explorar_marte;

/**
 * @author JefMelo
 */
public class PontosCardeais {

    private String card;

    public PontosCardeais() {

    }

    public String PontoCardeal(String card) {
        this.card = card;
        switch (card.toUpperCase()) {
            case "N":// Norte
                this.card = "N";
                break;
            case "S":// Sul
                this.card = "S";
                break;
            case "E":// Leste
                this.card = "E";
                break;
            case "W":// Oeste
                this.card = "W";
                break;

            default:
                throw new AssertionError();
        }
        return this.card;
    }

//     @Override
//    public String toString() {
//        return this.card;
//    }
//    
    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

}
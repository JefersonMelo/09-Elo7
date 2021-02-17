package explorar_marte;

/**
 * @author JefMelo
 */
public class PontosCardeais {

    private String card;

    public String PontoCardeal(String ponto) {
        this.card = ponto;
        switch (this.card.toUpperCase()) {
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
        }
        return this.card;
    }

     @Override
    public String toString() {
        return this.card;
    }
    
    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

}

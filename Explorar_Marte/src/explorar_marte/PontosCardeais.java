package explorar_marte;

/**
 * @author JefMelo
 */

/*PontosCardeais com dois métodos. SondaParaDireita
e SondaParaEsquerda. Classes que executam o movimento da posição dos
pontos cardeais
*/
public class PontosCardeais {

    private String card;

    public String SondaParaDireita(String ponto) {

        switch (ponto) {
            case "N":
                card = "E";
                break;
            case "E":
                card = "S";
                break;
            case "S":
                card = "W";
                break;
            case "W":
                card = "N";
                break;

        }
        return card;
    }

    public String SondaParaEsquerda(String ponto) {

        switch (ponto) {
            case "N":

                card = "W";
                break;
            case "W":

                card = "S";
                break;
            case "S":

                card = "E";
                break;
            case "E":

                card = "N";
                break;
        }
        return card;
    }

}

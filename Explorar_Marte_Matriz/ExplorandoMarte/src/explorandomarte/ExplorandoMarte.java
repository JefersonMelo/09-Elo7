package explorandomarte;
import explorandomarte.mapa.Planalto;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author JefMelo
 */
/*
https://www.italoinfo.com.br/cg/rotacao-2d/index.php
 */
public class ExplorandoMarte {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.ENGLISH);
        Planalto p = new Planalto();

        System.out.println("Entre com os Valores X e Y do Planalto");
        String[] s = scan.nextLine().split(" ");
        p.Malha(Integer.parseInt(s[0]), Integer.parseInt(s[1]));

        
    }

}

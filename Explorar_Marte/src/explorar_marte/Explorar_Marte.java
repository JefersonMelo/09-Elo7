/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package explorar_marte;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author JefMelo
 */
//https://www.discoduroderoer.es/arrays-de-objetos-en-java/
public class Explorar_Marte {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.ENGLISH);
        
        Planalto p = new Planalto();
        Sonda sonda[] =  new Sonda[2];
        int cont = 0;
        
        do {
            
            System.out.println("Entre com os valores X e Y do Planalto");
            String[] valor = scan.nextLine().split(" ");
            p.Malha(Integer.parseInt(valor[0]), Integer.parseInt(valor[1]));
            
            System.out.println("Entre com a posição inicial da sonda. Eixo X, Y e "
                    + "\n um Ponto Cardeal: N, S, E, W");
            valor = scan.nextLine().split(" ");
            sonda[cont].posicao(Integer.parseInt(valor[0]), Integer.parseInt(valor[1]), valor[2]);
            
            System.out.println("Controles: R - Right, L - Left e M - Move");
            String mover = scan.nextLine();
            sonda[cont].MovimentarSonda(mover);
            
        } while (cont < 2);
        
        for (var item : sonda) {
            
            System.out.println(item);
        }
        
    }

}

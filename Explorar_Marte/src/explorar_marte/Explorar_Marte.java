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

        //Planalto p = new Planalto();
        //PontosCardeais pc = new PontosCardeais();
        Sonda sonda = new Sonda();
        Sonda[] sondas = new Sonda[2];
        int cont = 0;

        System.out.println("Entre com os valores X e Y do Planalto");
        String[] plano = scan.nextLine().split(" ");
        Planalto p = new Planalto(Integer.parseInt(plano[0]), Integer.parseInt(plano[1]));
        //5 5 scan.close();
        do {

            System.out.println("Entre com a posição inicial da sonda.\n"
                    + "Eixo X, Y e um dos Pontos Cardeais: N, S, E, W");
            String[] valor = scan.nextLine().split(" ");
            sonda.Posicao(Integer.parseInt(valor[0]), Integer.parseInt(valor[1]), valor[2]);
            //pc.PontoCardeal(valor[2].toUpperCase().toString());
            System.out.println("Controles: R - Right, L - Left e M - Move");
            String mover = scan.nextLine();
            sonda.MovimentarSonda(mover);

            sondas[cont] = sonda;
            cont++;
            //scan.close();
            
        } while (cont < 2);

        for (var item : sondas) {

            System.out.println(item);
        }

    }

}

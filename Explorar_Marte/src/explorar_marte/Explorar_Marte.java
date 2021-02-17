/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package explorar_marte;

import java.util.ArrayList;
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

        ArrayList<Sonda> list = new ArrayList<>();
        Sonda sonda = new Sonda();
        Sonda sondas[] = new Sonda[2];
        int cont = 0, x, y;
        String c, mover;

        System.out.print("Entre com os valores X e Y do Planalto: ");
        String[] plano = scan.nextLine().split(" ");
        int a = Integer.parseInt(plano[0]);
        int l = Integer.parseInt(plano[1]);
//        sonda.setAltura(Integer.parseInt(plano[0]));
//        sonda.setLargura(Integer.parseInt(plano[1]));
        //Planalto p = new Planalto(Integer.parseInt(plano[0]), Integer.parseInt(plano[1]));
        //5 5 scan.close();
        do {


            System.out.print("Posição sonda.\n"
                    + "Eixo X, Y e um dos Pontos Cardeais: N, S, E, W: ");
            String[] valor = scan.nextLine().split(" ");
            x = Integer.parseInt(valor[0]);
            y = Integer.parseInt(valor[1]);
            c = valor[2];
//            sonda.setEixo_X(Integer.parseInt(valor[0]));
//            sonda.setEixo_Y(Integer.parseInt(valor[1]));
//            sonda.setPontoCardeal(valor[2].toUpperCase());
            //sonda.Posicao(Integer.parseInt(valor[0]), Integer.parseInt(valor[1]), valor[2]);
            //pc.PontoCardeal(valor[2].toUpperCase().toString());
            System.out.print("Controles: R - Right, L - Left e M - Move: ");
            mover = scan.nextLine().toUpperCase();
            //sonda.setMove(mover);
            //sonda.MovimentarSonda(mover);
            sonda.MovimentarSonda(a, l, x, y, c, mover);
            sondas[cont] = sonda;
            list.add(sondas[cont]);// = sonda.MovimentarSonda(a, l, x, y, c, mover);
            cont++;
            //scan.close();

        } while (cont < 2);
        
        System.out.println(sonda.toString());
        for (var item : list) {

            System.out.println(item);
        }

    }

}

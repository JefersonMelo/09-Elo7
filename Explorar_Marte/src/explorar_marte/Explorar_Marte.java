package explorar_marte;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author JefMelo
 */
public class Explorar_Marte {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Sonda> list = new ArrayList<>();
        int cont = 0, x, y;
        String c, mover;

        System.out.print("Valores do Planalto, Inteiros X e Y: ");
        String[] plano = scan.nextLine().split(" ");
        int a = Integer.parseInt(plano[0]);
        int l = Integer.parseInt(plano[1]);

        do {

            System.out.print("Posição: Inteiro X, Y e Uma String como Ponto Cardeal: N, S, E, W: ");
            String[] valor = scan.nextLine().split(" ");
            x = Integer.parseInt(valor[0]);
            y = Integer.parseInt(valor[1]);
            c = valor[2].toUpperCase();

            System.out.print("Controles: R - Right, L - Left e M - Move: ");
            mover = scan.nextLine().toUpperCase();

            if (cont == 1) {// Cria Sonda Um e Adiciona na Lista
                Sonda s1 = new Sonda(a, l, x, y, c, mover);
                list.add(s1);
            } else {// Cria Sonda Dois e Adiciona na Lista
                Sonda s2 = new Sonda(a, l, x, y, c, mover);
                list.add(s2);
            }
            cont++;
        } while (cont < 2);

        // Forech
        list.forEach(item -> {
            System.out.println(item);
        });

    }

}

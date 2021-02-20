package explorar_marte;

import java.util.Scanner;

/**
 * @author JefMelo
 */
public class Explorar_Marte {

    static RepositorioSondas repSondas = new RepositorioSondas();
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

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

            Sonda s = new Sonda(a, l, x, y, c, mover);
            
            repSondas.Adicionar(s);// repositório de sondas, inserir para listar no forEach
            //trecho de POG removido
            cont++;
        } while (cont < 2);

        // Forech
        repSondas.Lista().forEach(item -> {
            System.out.println(item);
        });

    }

}

package Repositorio;

import explorar_marte.Sonda;
import java.util.ArrayList;

/**
 * @author JefMelo
 */
public class RepositorioSondas {

    private final ArrayList<Sonda> listaSonda = new ArrayList<>();

    // adiciona na lista
    public void Adicionar(Sonda s) {

        listaSonda.add(s);

    }

    public ArrayList<Sonda> Lista() {
        return listaSonda;
    }

}

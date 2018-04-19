package mundialdefutbol;

import java.util.ArrayList;
import java.util.List;

public abstract class EtapaMundial {//clase abstracta por el metodo getEquiposQueAvanzan()

    //variables
    private String descripcionEtapa;
    private List<Partido> partidos;

    //constructor
    public EtapaMundial(String descripcionEtapa) {
        this.partidos = new ArrayList<>();//inicializo lista partidos en el constructor
        this.descripcionEtapa = descripcionEtapa;
    }

    //metodos de descripcion de etapa y lista de partidos
    public void setDescripcionEtapa(String descripcionEtapa) {
        this.descripcionEtapa = descripcionEtapa;
    }

    public String getDescripcionEtapa() {
        return this.descripcionEtapa;
    }

    public void setPartidos(Partido partidos) {
        this.partidos.add(partidos);
    }

    public List<Partido> getPartidos() {
        return this.partidos;
    }

    //metodo abstracto
    public abstract List<Equipo> getEquiposQueAvanzan();
}

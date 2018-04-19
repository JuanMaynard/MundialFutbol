package mundialdefutbol;

import java.util.ArrayList;
import java.util.List;

public class Llave extends EtapaMundial {

    //constructor
    public Llave(String descripcionEtapa) {
        super(descripcionEtapa);
    }

    //sobre-escribo el metodo getEquiposQueAvanzan de la clase padre EtapaMundial
    //y muestro los equipos que avanzan (sin empatar)
    @Override
    public List<Equipo> getEquiposQueAvanzan() {
        List<Equipo> equiposAvanzan = new ArrayList<>();
        //pl: partidos llave
        for (Partido pl : super.getPartidos()) {
            if (pl.getResultado().ganoLocal()) {
                equiposAvanzan.add(pl.getLocal());
            } else {
                if (!pl.getResultado().ganoLocal() && !pl.getResultado().empate()) {
                    equiposAvanzan.add(pl.getVisitante());
                }
            }
        }
        return equiposAvanzan;
    }
}
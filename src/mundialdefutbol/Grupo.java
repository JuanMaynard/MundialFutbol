package mundialdefutbol;

import java.util.ArrayList;
import java.util.List;

public class Grupo extends EtapaMundial {

    //constructor
    public Grupo(String descripcionEtapa) {
        super(descripcionEtapa);
    }

    //con este metodo el equipo ganador suma de a 3 y los que empaten 1
    private int getPuntos(Equipo e) {
        int puntos = 0;//inicializo puntos
        for (Partido p : e.getPartidosJugados()) {
            if (p.getResultado().ganoLocal() && (e.getNombre().equals(p.getLocal()))) {
                puntos += 3;
            }
            if (!p.getResultado().empate() && !p.getResultado().ganoLocal() && e.getNombre().equals(p.getVisitante())) {
                puntos += 3;
            }
            if (p.getResultado().empate()) {
                puntos += 1;
            }
        }
        return puntos;
    }

    //sobre-escribo el metodo getEquiposQueAvanzan de la clase padre EtapaMundial
    //y muestro los equipos que avanzan de ronda con mayor contidad de puntos
    @Override
    public List<Equipo> getEquiposQueAvanzan() {
        List<Equipo> equiposQueAvanzan = new ArrayList<>();
        //isEmpty: Devuelve un valor de tipo booleano que indica si se ha inicializado una variable
        if (super.getPartidos().isEmpty()) {
            System.out.println("esta vacio");
        } else {
            System.out.println("esta lleno");
        }
        //pg: partido grupo
        for (Partido pg : super.getPartidos()) {
            if (getPuntos(pg.getLocal()) > getPuntos(pg.getVisitante())) {
                equiposQueAvanzan.add(pg.getLocal());
            }
            if (getPuntos(pg.getVisitante()) > getPuntos(pg.getLocal())) {
                equiposQueAvanzan.add(pg.getVisitante());
            }
        }
        return equiposQueAvanzan;
    }
}
package mundialdefutbol;

import java.util.Date;

public class Partido {

    //variables
    private Date fecha;
    private Equipo local;
    private Equipo visitante;
    private Resultado resultado;

    //constructor
    public Partido(Date fecha, Equipo local, Equipo visitante) {
        this.fecha = fecha;
        this.local = local;
        this.visitante = visitante;
    }

    //metodos fecha del partido, equipo local, visitante y resultado
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setLocal(Equipo local) {
        this.local = local;
    }

    public Equipo getLocal() {
        return this.local;
    }

    public void setVisitante(Equipo visitante) {
        this.visitante = visitante;
    }

    public Equipo getVisitante() {
        return this.visitante;
    }

    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }

    public Resultado getResultado() {
        return this.resultado;
    }
}
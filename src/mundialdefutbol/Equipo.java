package mundialdefutbol;

import java.util.List;

public class Equipo {

    //variables ejercicio 2 (goles)
    private String nombre;
    private List<Partido> partidosJugados;
    private int golesConvertidos;
    private int golesResibidos;

    //constructor por defecto
    public Equipo() {

    }

    //metodos nombre del equipo, partidos jugados y goles
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setPartidosJugados(List<Partido> partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public List<Partido> getPartidosJugados() {
        return this.partidosJugados;
    }

    public void setGolesConvertidos(int golesConvertidos) {
        this.golesConvertidos = golesConvertidos;
    }

    public int getGolesConvertidos() {
        return this.golesConvertidos;
    }

    public void setGolesResibidos(int golesResibidos) {
        this.golesResibidos = golesResibidos;
    }

    public int getGolesResibidos() {
        return this.golesResibidos;
    }

    //ejercicio 2 (direfencia de goles)
    public int getDiferenciaDeGoles() {
        return (this.golesResibidos - this.golesConvertidos);
    }
}

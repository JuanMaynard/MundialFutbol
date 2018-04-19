package mundialdefutbol;

public class Resultado {

    //variables
    private int golesLocal;
    private int golesVisitante;

    //constructor por defecto
    public Resultado() {

    }

    //constructor con parametros
    public Resultado(int golesLocal, int golesVisitante) {
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
    }

    //metodos goles local y visitante
    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesLocal() {
        return this.golesLocal;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

    public int getGolesVisitante() {
        return this.golesVisitante;
    }

    //comparo si gano equipo local o visitante
    public boolean ganoLocal() {
        if (this.golesLocal > this.golesVisitante) {
            return true;
        } else {
            return false;
        }
    }

    //comparo si hubo empate entre los equipos
    public boolean empate() {
        if (this.golesLocal == this.golesVisitante) {
            return true;
        } else {
            return false;
        }
    }
}

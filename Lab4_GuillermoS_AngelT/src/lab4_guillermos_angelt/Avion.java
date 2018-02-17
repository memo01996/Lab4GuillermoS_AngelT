package lab4_guillermos_angelt;

public class Avion extends Aereo {

    private int nPasajeros;
    private String funcion;

    public Avion() {
        super();
    }

    public Avion(int nPasajeros, String funcion, String pais_in, String pais_out, String Gaso, int tanque, int distancia, int altitud) {
        super(pais_in, pais_out, Gaso, tanque, distancia, altitud);
        this.nPasajeros = nPasajeros;
        this.funcion = funcion;
    }

    public int getnPasajeros() {
        return nPasajeros;
    }

    public void setnPasajeros(int nPasajeros) {
        this.nPasajeros = nPasajeros;
    }

    public String isFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    @Override
    public String toString() {
        return "Avion{" + "nPasajeros=" + nPasajeros + ", funcion=" + funcion + '}';
    }

}

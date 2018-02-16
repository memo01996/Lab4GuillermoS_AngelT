package lab4_guillermos_angelt;

public class Avion extends Aereo {

    private int nPasajeros;
    private boolean funcion;

    public Avion() {
        super();
    }

    public Avion(int nPasajeros, boolean funcion, int gasolina, String pais_in, String pais_out, int tanque, int distancia, int altitud) {
        super(gasolina, pais_in, pais_out, tanque, distancia, altitud);
        this.nPasajeros = nPasajeros;
        this.funcion = funcion;
    }

    public int getnPasajeros() {
        return nPasajeros;
    }

    public void setnPasajeros(int nPasajeros) {
        this.nPasajeros = nPasajeros;
    }

    public boolean isFuncion() {
        return funcion;
    }

    public void setFuncion(boolean funcion) {
        this.funcion = funcion;
    }

    @Override
    public String toString() {
        return "Avion{" + "nPasajeros=" + nPasajeros + ", funcion=" + funcion + '}';
    }

}

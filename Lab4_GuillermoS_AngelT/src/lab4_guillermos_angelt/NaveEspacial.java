package lab4_guillermos_angelt;

public class NaveEspacial extends Espacial {

    private int nPropulsores;

    public NaveEspacial() {
        super();
    }

    public NaveEspacial(int nPropulsores, int combustible, String planeta_partida, String planeta_llegada, int tanque, int distancia, int altitud) {
        super(combustible, planeta_partida, planeta_llegada, tanque, distancia, altitud);
        this.nPropulsores = nPropulsores;
    }

    public int getnPropulsores() {
        return nPropulsores;
    }

    public void setnPropulsores(int nPropulsores) {
        this.nPropulsores = nPropulsores;
    }

    @Override
    public String toString() {
        return "NaveEspacial{" + "nPropulsores=" + nPropulsores + '}';
    }

}

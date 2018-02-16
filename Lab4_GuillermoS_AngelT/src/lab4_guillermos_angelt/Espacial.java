package lab4_guillermos_angelt;

public class Espacial extends MediosTransporte {

    protected int combustible;
    protected String planeta_partida, planeta_llegada;

    public Espacial() {
        super();
    }

    public Espacial(int combustible, String planeta_partida, String planeta_llegada, int tanque, int distancia, int altitud) {
        super(tanque, distancia, altitud);
        this.combustible = combustible;
        this.planeta_partida = planeta_partida;
        this.planeta_llegada = planeta_llegada;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    public String getPlaneta_partida() {
        return planeta_partida;
    }

    public void setPlaneta_partida(String planeta_partida) {
        this.planeta_partida = planeta_partida;
    }

    public String getPlaneta_llegada() {
        return planeta_llegada;
    }

    public void setPlaneta_llegada(String planeta_llegada) {
        this.planeta_llegada = planeta_llegada;
    }

    @Override
    public String toString() {
        return "Espacial{" + "combustible=" + combustible + ", planeta_partida=" + planeta_partida + ", planeta_llegada=" + planeta_llegada + '}';
    }

}

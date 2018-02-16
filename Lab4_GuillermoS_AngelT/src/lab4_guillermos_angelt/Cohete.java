

package lab4_guillermos_angelt;


public class Cohete extends Espacial{
    
    private int num_separaciones;

    public Cohete() {
        super();
    }

    public Cohete(int num_separaciones, int combustible, String planeta_partida, String planeta_llegada, int tanque, int distancia, int altitud) {
        super(combustible, planeta_partida, planeta_llegada, tanque, distancia, altitud);
        this.num_separaciones = num_separaciones;
    }

    public Cohete(int num_separaciones) {
        this.num_separaciones = num_separaciones;
    }

    @Override
    public String toString() {
        return "Cohete{" + "num_separaciones=" + num_separaciones + '}';
    }

    

    
    

}

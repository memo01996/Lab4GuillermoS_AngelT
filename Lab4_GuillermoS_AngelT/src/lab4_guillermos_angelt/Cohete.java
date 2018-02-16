

package lab4_guillermos_angelt;


public class Cohete {
    
    private int num_separaciones;

    public Cohete(int num_separaciones) {
        this.num_separaciones = num_separaciones;
    }

    public int getNum_separaciones() {
        return num_separaciones;
    }

    public void setNum_separaciones(int num_separaciones) {
        this.num_separaciones = num_separaciones;
    }

    @Override
    public String toString() {
        return "Cohete{" + "num_separaciones=" + num_separaciones + '}';
    }

    
    

}

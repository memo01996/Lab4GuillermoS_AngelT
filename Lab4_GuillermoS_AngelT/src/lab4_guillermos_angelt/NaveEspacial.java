

package lab4_guillermos_angelt;


public class NaveEspacial {
    
    private int nPropulsores;

    public NaveEspacial(int nPropulsores) {
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

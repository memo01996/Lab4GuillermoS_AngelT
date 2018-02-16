

package lab4_guillermos_angelt;

import java.util.ArrayList;


public class MediosTransporte {
    
    protected int tanque, distancia, altitud;
    protected ArrayList<Primates> primates = new ArrayList();

    public MediosTransporte() {
    }

    public MediosTransporte(int tanque, int distancia, int altitud) {
        this.tanque = tanque;
        this.distancia = distancia;
        this.altitud = altitud;
    }

    public int getTanque() {
        return tanque;
    }

    public void setTanque(int tanque) {
        this.tanque = tanque;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getAltitud() {
        return altitud;
    }

    public void setAltitud(int altitud) {
        this.altitud = altitud;
    }

    public ArrayList<Primates> getPrimates() {
        return primates;
    }

    public void setPrimates(ArrayList<Primates> primates) {
        this.primates = primates;
    }

    @Override
    public String toString() {
        return "MediosTransporte{" + "tanque=" + tanque + ", distancia=" + distancia + ", altitud=" + altitud + ", primates=" + primates + '}';
    }
    
    

}

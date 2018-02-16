package lab4_guillermos_angelt;

public class Helicoptero extends Aereo {

    private int nHelices, patas;

    public Helicoptero() {
        super();
    }

    public Helicoptero(int nHelices, int patas, String pais_in, String pais_out, String Gaso, int tanque, int distancia, int altitud) {
        super(pais_in, pais_out, Gaso, tanque, distancia, altitud);
        this.nHelices = nHelices;
        this.patas = patas;
    }

    public int getnHelices() {
        return nHelices;
    }

    public void setnHelices(int nHelices) {
        this.nHelices = nHelices;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    @Override
    public String toString() {
        return "Helicoptero{" + "nHelices=" + nHelices + ", patas=" + patas + '}';
    }

}

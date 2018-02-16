package lab4_guillermos_angelt;

public class Aereo extends MediosTransporte {

    protected int gasolina;
    protected String pais_in, pais_out;

    public Aereo() {
        super();
    }

    public Aereo(int gasolina, String pais_in, String pais_out, int tanque, int distancia, int altitud) {
        super(tanque, distancia, altitud);
        this.gasolina = gasolina;
        this.pais_in = pais_in;
        this.pais_out = pais_out;
    }

    public int getGasolina() {
        return gasolina;
    }

    public void setGasolina(int gasolina) {
        this.gasolina = gasolina;
    }

    public String getPais_in() {
        return pais_in;
    }

    public void setPais_in(String pais_in) {
        this.pais_in = pais_in;
    }

    public String getPais_out() {
        return pais_out;
    }

    public void setPais_out(String pais_out) {
        this.pais_out = pais_out;
    }

    @Override
    public String toString() {
        return "Aereo{" + "gasolina=" + gasolina + ", pais_in=" + pais_in + ", pais_out=" + pais_out + '}';
    }

}

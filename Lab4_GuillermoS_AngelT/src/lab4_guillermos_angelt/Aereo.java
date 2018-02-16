package lab4_guillermos_angelt;

public class Aereo extends MediosTransporte {

    protected String pais_in, pais_out, Gaso;

    public Aereo() {
        super();
    }

    public Aereo(String pais_in, String pais_out, String Gaso, int tanque, int distancia, int altitud) {
        super(tanque, distancia, altitud);

        this.pais_in = pais_in;
        this.pais_out = pais_out;
        this.Gaso = Gaso;
    }

    public String getGaso() {
        return Gaso;
    }

    public String setGaso() {
        return Gaso;
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
        return "Aereo{" + "pais_in=" + pais_in + ", pais_out=" + pais_out + ", Gaso=" + Gaso + '}';
    }

}

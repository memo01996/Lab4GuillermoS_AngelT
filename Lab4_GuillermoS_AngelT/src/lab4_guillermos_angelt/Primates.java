/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_guillermos_angelt;

/**
 *
 * @author Memo
 */
public class Primates extends SeresVivos {

    private Aereo aereo;
    private Espacial espacial;
    private double comida;
    private String planeta;
    private String lugarnacimiento;

    public Primates() {
        super();
    }

    public Primates(Aereo aereo, Espacial espacial, double comida, String planeta, String lugarnacimiento, String Nombre, String GrupoSanguineo, String Sexo, double altura, double peso) {
        super(Nombre, GrupoSanguineo, Sexo, altura, peso);
        this.aereo = aereo;
        this.espacial = espacial;
        this.comida = comida;
        this.planeta = planeta;
        this.lugarnacimiento = lugarnacimiento;
    }

    public Aereo getAereo() {
        return aereo;
    }

    public void setAereo(Aereo aereo) {
        this.aereo = aereo;
    }

    public Espacial getEspacial() {
        return espacial;
    }

    public void setEspacial(Espacial espacial) {
        this.espacial = espacial;
    }

    public double getComida() {
        return comida;
    }

    public void setComida(double comida) {
        this.comida = comida;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    public String getLugarnacimiento() {
        return lugarnacimiento;
    }

    public void setLugarnacimiento(String lugarnacimiento) {
        this.lugarnacimiento = lugarnacimiento;
    }

    @Override
    public String toString() {
        return "Primates{" + "aereo=" + aereo + ", espacial=" + espacial + ", comida=" + comida + ", planeta=" + planeta + ", lugarnacimiento=" + lugarnacimiento + '}';
    }

}

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

    private String tipo;
    private double comida;
    private String planeta;
    private String lugarnacimiento;

    public Primates() {
        super();
    }

    public Primates(String tipo, double comida, String planeta, String lugarnacimiento, String Nombre, String GrupoSanguineo, String Sexo, double altura, double peso) {
        super(Nombre, GrupoSanguineo, Sexo, altura, peso);
        this.tipo = tipo;
        this.comida = comida;
        this.planeta = planeta;
        this.lugarnacimiento = lugarnacimiento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
        if (tipo.equalsIgnoreCase("espacial")) {
            tipo = "espacial";
        } else {
            tipo = "normal";
        }
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
        return "Primates{" + "tipo=" + tipo + ", comida=" + comida + ", planeta=" + planeta + ", lugarnacimiento=" + lugarnacimiento + '}';
    }

}

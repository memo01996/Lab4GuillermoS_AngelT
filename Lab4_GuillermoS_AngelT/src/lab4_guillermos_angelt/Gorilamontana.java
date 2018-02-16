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
public class Gorilamontana extends Primates {

    private int IQ;

    public Gorilamontana() {
        super();
    }

    public Gorilamontana(int IQ, String tipo, double comida, String planeta, String lugarnacimiento, String Nombre, String GrupoSanguineo, String Sexo, double altura, double peso) {
        super(tipo, comida, planeta, lugarnacimiento, Nombre, GrupoSanguineo, Sexo, altura, peso);
        this.IQ = IQ;
    }

    public void setIQ(int IQ) {
        if (IQ > 129 && IQ < 140) {
            this.IQ = IQ;
        } else {
            System.out.println("IQ no en el rango > 129 Y < 140");
        }

    }

    @Override
    public String toString() {
        return "Gorilamontana{" + "IQ=" + IQ + '}';
    }

}

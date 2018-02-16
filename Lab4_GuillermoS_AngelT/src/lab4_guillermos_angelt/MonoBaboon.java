/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_guillermos_angelt;

import java.awt.Color;

/**
 *
 * @author Memo
 */
public class MonoBaboon extends Primates {

    private Color color;

    public MonoBaboon() {
    }

    public MonoBaboon(Color color, Aereo aereo, Espacial espacial, double comida, String planeta, String lugarnacimiento, String Nombre, String GrupoSanguineo, String Sexo, double altura, double peso) {
        super(aereo, espacial, comida, planeta, lugarnacimiento, Nombre, GrupoSanguineo, Sexo, altura, peso);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "MonoBaboon{" + "color=" + color + '}';
    }

}

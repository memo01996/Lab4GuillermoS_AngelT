/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_guillermos_angelt;

import java.util.ArrayList;

/**
 *
 * @author Memo
 */
public class Ingenieros extends SeresVivos {

    private String correo;
    private String usuario;
    private String contrasena;
    private ArrayList<String> listaidiomas;
    private int cafe;
    private String fechanacimiento;

    public Ingenieros() {
        super();
    }

    public Ingenieros(String correo, String usuario, String contrasena, ArrayList<String> listaidiomas, int cafe, String fechanacimiento, String Nombre, String GrupoSanguineo, String Sexo, double altura, double peso) {
        super(Nombre, GrupoSanguineo, Sexo, altura, peso);
        this.correo = correo;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.listaidiomas = listaidiomas;
        this.cafe = cafe;
        this.fechanacimiento = fechanacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public ArrayList<String> getListaidiomas() {
        return listaidiomas;
    }

    public void setListaidiomas(ArrayList<String> listaidiomas) {
        this.listaidiomas = listaidiomas;
    }

    public int getCafe() {
        return cafe;
    }

    public void setCafe(int cafe) {
        this.cafe = cafe;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    @Override
    public String toString() {
        return "Ingenieros{" + "correo=" + correo + ", usuario=" + usuario + ", contrasena=" + contrasena + ", listaidiomas=" + listaidiomas + ", cafe=" + cafe + ", fechanacimiento=" + fechanacimiento + '}';
    }

}

package lab4_guillermos_angelt;

public class SeresVivos {

    private String Nombre;
    private String GrupoSanguineo;
    private String Sexo;
    private double altura;
    private double peso;

    public void cafe(int cafe) {
    }

    public SeresVivos() {
        super();
    }

    public SeresVivos(String Nombre, String GrupoSanguineo, String Sexo, double altura, double peso) {
        this.Nombre = Nombre;
        this.GrupoSanguineo = GrupoSanguineo;
        this.Sexo = Sexo;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getGrupoSanguineo() {
        return GrupoSanguineo;
    }

    public void setGrupoSanguineo(String GrupoSanguineo) {
        this.GrupoSanguineo = GrupoSanguineo;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "SeresVivos{" + "Nombre=" + Nombre + ", GrupoSanguineo=" + GrupoSanguineo + ", Sexo=" + Sexo + ", altura=" + altura + ", peso=" + peso + '}';
    }

}

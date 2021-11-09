package classroom;

public class Asignatura {

    public String nombre;
    private int codigoInterno;
    public int codigoExterno;

    public Asignatura() {
        this(0);
    }

    public Asignatura(int codigoExterno) {
        this("Sin nombre", 0, codigoExterno);
    }

    public Asignatura(String nombre) {
        this(nombre, 0, 0);
    }

    public Asignatura(String nombre, int codigoInterno, int codigoExterno) {
        this.nombre = nombre;
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
    }

    public void cambiarDatos(int codigoInterno, int codigoExterno, String nombre) {
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.nombre = nombre;
    }

    public void cambiarDatos(int codigoExterno) {
        this.codigoExterno = codigoExterno;
    }

    public void cambiarDatos(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public int getCodigoInterno() {
        return this.codigoInterno;
    }
}

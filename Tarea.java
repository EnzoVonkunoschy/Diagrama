public class Tarea {


    private int duracion;
    private String nombre;
    private String descripcion;
    private Tarea antecesora;
    private Tarea sucesora;

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Tarea getAntecesora() {
        return antecesora;
    }

    public void setAntecesora(Tarea antecesora) {
        this.antecesora = antecesora;
    }

    public Tarea getSucesora() {
        return sucesora;
    }

    public void setSucesora(Tarea sucesora) {
        this.sucesora = sucesora;
    }
}

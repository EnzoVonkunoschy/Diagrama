public class Tarea {
    private int duracion;
    private String nombre;
    private String descripcion;
    private Tarea Antecesora;
    private Tarea Sucesora;

    public Tarea() {
    }

    public Tarea(int duracion, String nombre, String descripcion, Tarea antecesora, Tarea sucesora) {
        this.duracion = duracion;
        this.nombre = nombre;
        this.descripcion = descripcion;
        Antecesora = antecesora;
        Sucesora = sucesora;
    }

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
        return Antecesora;
    }

    public void setAntecesora(Tarea antecesora) {
        Antecesora = antecesora;
    }

    public Tarea getSucesora() {
        return Sucesora;
    }

    public void setSucesora(Tarea sucesora) {
        Sucesora = sucesora;
    }
}

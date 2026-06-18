import java.util.ArrayList;
import java.util.UUID;

public class Tarea {
    private final String id ;
    private int duracion;
    private String nombre;
    private String descripcion;
    private ArrayList <Tarea> Antecesora;
    private ArrayList <Tarea> Sucesora;

    public Tarea() {
        this.id = UUID.randomUUID().toString();
        this.Antecesora = new ArrayList<>();
        this.Sucesora = new ArrayList<>();
    }
    public Tarea(int duracion, String nombre, String descripcion, ArrayList<Tarea> antecesora, ArrayList<Tarea> sucesora) {
        this.id = UUID.randomUUID().toString();
        this.duracion = duracion;
        this.nombre = nombre;
        this.descripcion = descripcion;
        if (antecesora != null) {
            this.Antecesora = antecesora;
        }else {
            this.Antecesora = new ArrayList<>();
        }

        if (sucesora != null) {
            this.Sucesora = sucesora;
        }else {
            this.Sucesora = new ArrayList<>();
        }
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

    public ArrayList<Tarea> getAntecesora() {
        return Antecesora;
    }

    public void setAntecesora(ArrayList<Tarea> antecesora) {
        Antecesora = antecesora;
    }

    public ArrayList<Tarea> getSucesora() {
        return Sucesora;
    }

    public void setSucesora(ArrayList<Tarea> sucesora) {
        Sucesora = sucesora;
    }

    public void addAntecesora (Tarea tarea){
        this.Antecesora.add (tarea);
    }

    public void addSucesora (Tarea tarea){
        this.Sucesora.add (tarea);
    }

    @Override
    public String toString() {
        return mostrarConIndentacion(0);
    }
    private String mostrarConIndentacion(int nivel){
        String margen = " ";
        for (int i = 0; i < nivel; i++){
            margen += " ";
        }
    String contenido = "\n" + margen + "Nombre:" + nombre +
            "\n" + margen + "Duración: " + duracion +
            "\n" + margen + "Descripción: " + descripcion;
    if (!Antecesora.isEmpty()){
        for (Tarea tarea : Antecesora){
            contenido += tarea.mostrarConIndentacion(nivel + 1);
        }
    }
    return contenido;
}
}
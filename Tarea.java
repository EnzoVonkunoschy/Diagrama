import java.io.Serializable;
import java.util.ArrayList;
import java.util.UUID;

public class Tarea implements Serializable {
    private final String id ;
    private int duracion;
    private String nombre;
    private String descripcion;
    private ArrayList <Tarea> Antecesora;
    private ArrayList <Tarea> Sucesora;

    public Tarea() {
        this.id = UUID.randomUUID().toString();
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

    @Override
    public String toString() {
        String contenido = "\nNombre: "      + nombre +
                           "\nDuración: "    + duracion +
                           "\nDescripción: " + descripcion ;

        if (Antecesora != null){
            for (int i = 0; i < Antecesora.size(); i++) {

                Tarea tarea = Antecesora.get(i);

                String tareaIndentada = tarea.toString().replace("\n","\n            ");
                contenido = contenido + "\nAntecesora: " + tareaIndentada;
            }
        }


        return contenido;
    }

    public void addAntecesora(Tarea tarea02) {
        if (getAntecesora() == null){
            ArrayList<Tarea> tareas = new ArrayList<>();
            tareas.add(tarea02);
            setAntecesora(tareas);
        }else {
            ArrayList<Tarea> tareas2 = getAntecesora();
            tareas2.add(tarea02);
            setAntecesora(tareas2);
        }



    }
}
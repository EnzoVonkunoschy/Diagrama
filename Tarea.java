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
        this.Antecesora= new ArrayList<>();
        this.Sucesora= new ArrayList<>();
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
    public void addAntecesora(Tarea tarea){
        Antecesora.add(tarea);

        if (!tarea.Sucesora.contains(this)) {
            tarea.Sucesora.add(this);
        }
    }

    public void addSucesora(Tarea tarea){
        Sucesora.add(tarea);

        if (!tarea.Antecesora.contains(this)) {
            tarea.Antecesora.add(this);
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
        String contenido = "\nNombre: " + nombre +
                "\nDuración: " + duracion +
                "\nDescripción: " + descripcion ;

        if (Antecesora != null && ! Antecesora.isEmpty()){
            for (int i = 0; i < Antecesora.size(); i++) {
                Tarea tarea = Antecesora.get(i);
                contenido += "\nAntecesora: " + tarea.getNombre();
            }
        }else{
            contenido +=  "\nNo existe antecesora";
        }

        if (Sucesora != null && !Sucesora.isEmpty()){
            for (int i = 0; i < Sucesora.size(); i++) {
                Tarea tarea = Sucesora.get(i);
                contenido = contenido + "\nSucesora: " + tarea.getNombre();
            }
        }else{
            contenido = contenido + "\nNo existe sucesora";
        }
        return contenido;

    }

    private String listarAntecesoras() {
        String contenido = "";

        for (Tarea tarea : Antecesora) {
            contenido += "\nAntecesora: " + tarea.getNombre();
            contenido += tarea.listarAntecesoras();
        }

        return contenido;
    }

        }

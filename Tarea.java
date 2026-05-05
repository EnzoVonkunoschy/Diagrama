import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Tarea> tareas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENU DE TAREAS ---");
            System.out.println("1. Crear y almacenar tarea");
            System.out.println("2. Enlazar tareas (Antecesora/Sucesora)");
            System.out.println("3. Listar tareas");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    Tarea nuevaTarea = new Tarea();
                    System.out.print("Nombre: ");
                    nuevaTarea.setNombre(sc.nextLine());
                    System.out.print("Descripcion: ");
                    nuevaTarea.setDescripcion(sc.nextLine());
                    System.out.print("Duracion (minutos): ");
                    nuevaTarea.setDuracion(sc.nextInt());
                    sc.nextLine();
                    
                    tareas.add(nuevaTarea);
                    System.out.println("Tarea guardada exitosamente.");
                    break;

                case 2:
                    if (tareas.size() < 2) {
                        System.out.println("Se necesitan al menos 2 tareas para enlazar.");
                        break;
                    }
                    
                    for (int i = 0; i < tareas.size(); i++) {
                        System.out.println(i + ". " + tareas.get(i).getNombre());
                    }

                    System.out.print("Indice de la tarea antecesora: ");
                    int idxAnt = sc.nextInt();
                    System.out.print("Indice de la tarea sucesora: ");
                    int idxSuc = sc.nextInt();

                    if (idxAnt >= 0 && idxAnt < tareas.size() && idxSuc >= 0 && idxSuc < tareas.size()) {
                        tareas.get(idxAnt).setSucesora(tareas.get(idxSuc));
                        tareas.get(idxSuc).setAntecesora(tareas.get(idxAnt));
                        System.out.println("Tareas enlazadas correctamente.");
                    } else {
                        System.out.println("Indices invalidos.");
                    }
                    break;

                case 3:
                    for (Tarea t : tareas) {
                        String ant = (t.getAntecesora() != null) ? t.getAntecesora().getNombre() : "Ninguna";
                        String suc = (t.getSucesora() != null) ? t.getSucesora().getNombre() : "Ninguna";
                        System.out.println("Tarea: " + t.getNombre() + " | Ant: " + ant + " | Suc: " + suc);
                    }
                    break;
            }
        } while (opcion != 4);
    }
}

class Tarea {
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
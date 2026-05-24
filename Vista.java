import java.util.ArrayList;
import java.util.Scanner;

public class Vista {

    public static int menu(){
        Scanner scanner = new Scanner(System.in);
                System.out.println("--- MENU ---");
                System.out.println("1. Crear tarea");
                System.out.println("2. Listar tareas");
                System.out.println("3. Enlazar tareas");
                System.out.println("0. Salir");
                System.out.print("Opción: ");

        int opcion = scanner.nextInt();
        return opcion;
    }

    /** Pide al usuario el valor de los atributos
     * devuelve un objeto de la clase Tarea*/
    public static Tarea nuevaTarea(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombreTarea = scanner.nextLine();

        System.out.print("Duración: ");
        int duracionTarea = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Descripción: ");
        String descripcionTarea = scanner.nextLine();

        Tarea nuevaTarea = new Tarea();
        nuevaTarea.setNombre(nombreTarea);
        nuevaTarea.setDuracion(duracionTarea);
        nuevaTarea.setDescripcion(descripcionTarea);
        System.out.println("¡Tarea creada!");
        return new Tarea();

    }

    /** Recibe un ArrayList de objetos Tarea y muestra sus atributos
     * por pantalla
     * @param misTareas
     */
    public static void listarTareas(ArrayList<Tarea> misTareas){
        System.out.println("\n Lista de tareas -------------------");
        if (misTareas.isEmpty()) {
            System.out.println("No hay tareas cargadas.");
        } else {
            for (int indice = 0; indice < misTareas.size(); indice++) {
               System.out.println(misTareas.get(indice));
            }
        }
    }
}

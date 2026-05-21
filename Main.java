import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Prueba de menú*/
        int opt = Vista.menu();
        System.out.println("La opción elegida fue "+opt);

        /* Prueba de vista */
        Tarea unaTarea = Vista.nuevaTarea();


        /* Prueba listarTareas(...) */
        ArrayList<Tarea> misTareas = new ArrayList<>();
        misTareas.add(new Tarea(3, "Programación ", " práctico 1 ", null, null ));
        misTareas.add(new Tarea(4, "Práctica ", " practico 2 ", null, null));
        misTareas.add(new Tarea(5, "Sistema Operativo ", " práctico 3 ", null, null));
        Vista.listarTareas(misTareas);

        /*
        Scanner scanner = new Scanner(System.in);

        ArrayList<Tarea> listaTareas = new ArrayList<>();

        int opcion;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Crear tarea");
            System.out.println("2. Listar tareas");
            System.out.println("3. Enlazar tareas");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    // crear tarea
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

                    listaTareas.add(nuevaTarea);

                    System.out.println("Tarea creada!");
                    break;

                case 2:
                    // listar tareas
                    if (listaTareas.isEmpty()) {
                        System.out.println("No hay tareas cargadas.");
                    } else {
                        for (int indice = 0; indice < listaTareas.size(); indice++) {
                            Tarea tareaActual = listaTareas.get(indice);

                            System.out.println("\n[" + indice + "] " + tareaActual.getNombre());
                            System.out.println("Duración: " + tareaActual.getDuracion());
                            System.out.println("Descripción: " + tareaActual.getDescripcion());

                            if (tareaActual.getAntecesora() != null) {
                                System.out.println("Antecesora: " + tareaActual.getAntecesora().getNombre());
                            }

                            if (tareaActual.getSucesora() != null) {
                                System.out.println("Sucesora: " + tareaActual.getSucesora().getNombre());
                            }
                        }
                    }
                    break;

                case 3:
                    // enlazar tareas
                    if (listaTareas.size() < 2) {
                        System.out.println("Necesitás al menos 2 tareas para enlazar.");
                    } else {
                        System.out.println("Lista de tareas:");
                        for (int indice = 0; indice < listaTareas.size(); indice++) {
                            System.out.println("[" + indice + "] " + listaTareas.get(indice).getNombre());
                        }

                        System.out.print("Seleccione índice de la tarea actual: ");
                        int indiceActual = scanner.nextInt();

                        System.out.print("Seleccione índice de la tarea anterior: ");
                        int indiceAnterior = scanner.nextInt();

                        if (indiceActual < listaTareas.size() && indiceAnterior < listaTareas.size()) {

                            Tarea tareaActual = listaTareas.get(indiceActual);
                            Tarea tareaAnterior = listaTareas.get(indiceAnterior);

                            tareaActual.setAntecesora(tareaAnterior);
                            tareaAnterior.setSucesora(tareaActual);

                            System.out.println("Tareas enlazadas correctamente!");
                        } else {
                            System.out.println("Índices inválidos");
                        }
                    }
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 0);

         */
    }
}
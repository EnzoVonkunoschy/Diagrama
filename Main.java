import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Tarea> lista = new ArrayList<>();

        int opcion = 0;

        while (opcion != 4) {

            System.out.println("\n1- Crear tarea");
            System.out.println("2- Mostrar tareas");
            System.out.println("3- Enlazar tareas");
            System.out.println("4- Salir");
            System.out.print("Elegir: ");

            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {

                System.out.print("Nombre: ");
                String nom = sc.nextLine();

                System.out.print("Duracion: ");
                int dur = sc.nextInt();
                sc.nextLine();

                System.out.print("Descripcion: ");
                String desc = sc.nextLine();

                Tarea t = new Tarea(dur, nom, desc);
                lista.add(t);

                System.out.println("Tarea agregada");

            } else if (opcion == 2) {

                for (int i = 0; i < lista.size(); i++) {
                    System.out.println(i + ": " + lista.get(i).mostrar());
                }

            } else if (opcion == 3) {

                if (lista.size() < 2) {
                    System.out.println("Faltan tareas");
                } else {

                    System.out.print("Indice tarea anterior: ");
                    int a = sc.nextInt();

                    System.out.print("Indice tarea siguiente: ");
                    int b = sc.nextInt();

                    lista.get(a).setSucesora(lista.get(b));
                    lista.get(b).setAntecesora(lista.get(a));

                    System.out.println("Enlazadas");
                }
            }
        }

        sc.close();
    }
}
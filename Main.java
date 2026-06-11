import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean production = false;

        if(production){
            Controlador.inicio();
        }else{
            Test.tests();
        }



        // no descomentar los siguientes comentarios

        /* Prueba de menú
        int opt = Vista.menu();
        System.out.println("La opción elegida fue "+opt);*/

        /* Prueba de vista
        Tarea unaTarea = Vista.nuevaTarea();*/


        /* Prueba listarTareas(...)
        ArrayList<Tarea> misTareas = new ArrayList<>();
        misTareas.add(new Tarea(3, "Programación ", " práctico 1 ",  new ArrayList<>(), new ArrayList<>()));
        misTareas.add(new Tarea(4, "Práctica ", " practico 2 ", new ArrayList<>(), new ArrayList<>()));
        misTareas.add(new Tarea(5, "Sistema Operativo ", " práctico 3 ",new ArrayList<>(), new ArrayList<>()));
        Vista.listarTareas(misTareas);*/


    }
}
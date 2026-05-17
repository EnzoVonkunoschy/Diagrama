import java.util.ArrayList;

public class Vista {
    public static int menu(){
        System.out.println("[---> Aquí se mostrará un menú \n numérico <---]");
        return 3;
    }

    /** Pide al usuario el valor de los atributos
     * devuelve un objeto de la clase Tarea*/
    public static Tarea nuevaTarea(){
        return new Tarea();
    }

    /** Recibe un ArrayList de objetos Tarea y muestra sus atributos
     * por pantalla
     * @param misTareas
     */
    public static void listarTareas(ArrayList<Tarea> misTareas){
        System.out.println("[ ---> Aquí se mostrará un \n listado de tareas <---]");
    }
}

public class Test {

    public static void tests(){

        System.out.println("running tests");

        Tarea tarea03 = new Tarea();
        tarea03.setNombre("Guardar herraminetas");

        Tarea tarea02 = new Tarea();
        tarea02.setNombre("Cortar el pasto");

        Tarea tarea01 = new Tarea();
        tarea01.setNombre("Sacar herramientas");

        tarea03.addAntecesora(tarea02);
        tarea02.addAntecesora(tarea01);

        System.out.println(tarea03);
    }
}

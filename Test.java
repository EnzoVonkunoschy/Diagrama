public class Test {

    public static void tests(){

        System.out.println("running tests");

        Tarea tarea03 = new Tarea();
        tarea03.setNombre("Guardar herraminetas");
        System.out.println(tarea03);

        Tarea tarea02 = new Tarea();
        tarea02.setNombre("Cortar el pasto");
        tarea03.addAntecesora(tarea02);
        System.out.print(tarea03);

        Tarea tarea01 = new Tarea();
        tarea01.setNombre("Sacar herramientas");
        tarea02.addAntecesora(tarea01);
    }
}

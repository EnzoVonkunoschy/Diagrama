public class Test {

    public static void tests() {

        Tarea tarea01 = new Tarea();
        tarea01.setNombre("Sacar herramientas");

        Tarea tarea02 = new Tarea();
        tarea02.setNombre("Cortar el pasto");
        tarea02.addAntecesora(tarea01);

        Tarea tarea03 = new Tarea();
        tarea03.setNombre("Guardar herramientas");
        tarea03.addAntecesora(tarea02);

        System.out.println(tarea01);
        System.out.println(tarea02);
        System.out.println(tarea03);
}}

public class Main {
    public static void main(String[] args) throws Exception {
        Persona persona = new Persona();

        persona.setEdad(29);
        persona.setNombre("Eliana");
        persona.setTelefono(351333333);

        System.out.println(persona.getEdad() + " años");
        System.out.println(persona.getNombre());
        System.out.println(persona.getTelefono());
    }
}

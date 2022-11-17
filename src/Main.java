public class Main {
    public static void main(String[] args) throws Exception {
        Persona persona = new Persona();

        persona.setNombre("Eliana");
        System.out.println("Mi nombre es " + persona.getNombre());
       
        persona.setEdad(29);
        System.out.println("Tengo " + persona.getEdad() + " años");
        
        persona.setTelefono(351333333);
        System.out.println("Mi telefono es " + persona.getTelefono());
    }
}

package ejercicio1;

public class MainEjercicio1_a {

	public static void main(String[] args) {
        Persona personaDniInvalido = new Persona();
        personaDniInvalido.setDni("AA202020");

        Persona personaDniValido = new Persona();
        personaDniValido.setDni("20202020");
		
		try {
                Persona.verificarDNI(personaDniInvalido.getDni());
            System.out.println("Persona agregada correctamente");
        } catch (ExVerificarDNI e) {
            System.out.println("Persona no agregada por no verificar el DNI");
        }
		
		try {
                Persona.verificarDNI(personaDniValido.getDni());
            System.out.println("Persona agregada correctamente");
        } catch (ExVerificarDNI e) {
            System.out.println("Persona no agregada por no verificar el DNI");
        }
	}

}

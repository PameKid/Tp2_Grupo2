package ejercicio1;

public class MainEjercicio1_a {

	public static void main(String[] args) {
		
		try {
            Persona.verificarDNI("AA202020");
            System.out.println("Persona agregada correctamente");
        } catch (ExVerificarDNI e) {
            System.out.println("Persona no agregada por no verificar el DNI");
        }
		
		try {
            Persona.verificarDNI("20202020");
            System.out.println("Persona agregada correctamente");
        } catch (ExVerificarDNI e) {
            System.out.println("Persona no agregada por no verificar el DNI");
        }
	}

}

package ejercicio1;

import java.time.LocalDate;

public class Empleado extends Persona implements Comparable<Empleado>{

	// class counter
	private static int contadorLegajo = 1000;

	// Attributes
	private String puesto;
	private final int legajo;

	// Getters y Setters
	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public int getLegajo() {
		return this.legajo;
	}

	// Constructors
	public Empleado() {
		super();
		puesto = "nuevo ingreso";
		legajo = generarLegajo();
	}

	// Constructor con parámetros
	public Empleado(String dni, String nombre, String apellido, LocalDate fechaNacimiento, String genero,
			String direccion, String telefono, String email, String puesto) {
		super(dni, nombre, apellido, fechaNacimiento, genero, direccion, telefono, email);
		this.puesto = puesto;
		this.legajo = generarLegajo();
	}

	public static int devuelveProximoLegajo() {
		return contadorLegajo;
	}

	private static int generarLegajo() {
		return contadorLegajo++;
	}

	@Override
	public String toString() {
		return super.toString() + " -> Empleado [Legajo=" + legajo + ", Puesto=" + puesto + "]";
	}

	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public int compareTo(Empleado o) {
		// si el dni es menor se ubica a la izquierda del tree
		if(Integer.parseInt(this.getDni()) < Integer.parseInt(o.getDni()))
			return -1;
		// si el dni es mayor se ubica a la derecha del tree
		if(Integer.parseInt(this.getDni()) > Integer.parseInt(o.getDni()))
			return 1;
		// si el dni es duplicado se retorna 0
		return 0;
	}

	public int hashCode() {
      int resultado = super.hashCode();
      resultado += this.puesto == null ? 0 : this.puesto.hashCode();
      resultado += this.legajo;
      return resultado;
   }
}

package ejercicio1;

import java.time.LocalDate;
import java.time.Period;

public class Persona {

	// atributos

	private String dni;
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	private String genero;
	private String direccion;
	private String telefono;
	private String email;

	// constructor vacío

	public Persona() {

		nombre = "sin nombre";
		fechaNacimiento = LocalDate.of(2025, 1, 1);
	}

	// Constructor con parámetros
	public Persona(String dni, String nombre, String apellido, LocalDate fechaNacimiento, String genero,
			String direccion, String telefono, String email) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.genero = genero;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
	}

	// getters and setters

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		if (dni != null && !dni.isEmpty()) {
			this.dni = dni;
		} else {
			System.out.println("DNI inválido");
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre == null || nombre.isEmpty()) {
			throw new IllegalArgumentException("El nombre no puede estar vacío");
		} else if (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
			throw new IllegalArgumentException("El nombre no puede contener números");
		} else {
			this.nombre = nombre;
		}
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		if (apellido == null || apellido.isEmpty()) {
			throw new IllegalArgumentException("El apellido no puede estar vacío");
		} else if (!apellido.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
			throw new IllegalArgumentException("El apellido no puede contener números");
		} else {
			this.apellido = apellido;
		}
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		if (fechaNacimiento == null) {
			throw new IllegalArgumentException("La fecha de nacimiento no puede ser nula");
		}

		LocalDate hoy = LocalDate.now();
		if (fechaNacimiento.isAfter(hoy)) {
			throw new IllegalArgumentException("La fecha de nacimiento no puede ser futura");
		}

		int edad = Period.between(fechaNacimiento, hoy).getYears();
		if (edad < 16 || edad > 100) {
			throw new IllegalArgumentException("La edad debe estar entre 16 y 100 años");
		}

		this.fechaNacimiento = fechaNacimiento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
			throw new IllegalArgumentException("El formato del email es inválido.");
		}
		this.email = email;
	}

	// override toString
	@Override
	public String toString() {
		return "Persona [DNI:" + dni + ", Nombre:" + nombre + ", Apellido:" + apellido + ", FechaNacimiento: "
				+ fechaNacimiento + ", Genero: " + genero + ", Direccion: " + direccion + ", Telefono: " + telefono
				+ ", Email: " + email + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || !(obj instanceof Persona)) {
			return false;
		}
		Persona otraPersona = (Persona) obj;
		if (dni == null) {
			return otraPersona.dni == null;
		}
		return dni.equals(otraPersona.dni);
	}
	
	//método verificar DNI
	
	public static void verificarDNI(String dni) {

		boolean esNumerico = true; //el booleano asumimos que son todos numeros.
		
		try {
	        	Integer.parseInt(dni); 
	        	
	    } catch (NumberFormatException e) {
	    	esNumerico = false;
	    }

	    if  (dni.length() != 8 || !esNumerico) {  
	    		throw new ExVerificarDNI();
	    }
	}
	
	@Override
	public int hashCode() {
		return (dni == null) ? 0 : dni.hashCode();
	}

}

package ejercicio2;

public class Polideportivo implements Edificio, InstalacionDeportiva {

	private String nombre;
	private double superficie;
	private int tipoDeInstalacion;
	
	
	public Polideportivo() {
		nombre = "Sin nombre";
		superficie = 0.0;
		tipoDeInstalacion = 0;
	}

	
	public Polideportivo(String nombre, double superficie, int tipoDeInstalacion) {
		this.nombre = nombre;
		this.superficie = superficie;
		this.tipoDeInstalacion = tipoDeInstalacion;
	}

	public void setNombre(String nombre) {
		if (nombre == null || nombre.trim().isEmpty()) {
			throw new IllegalArgumentException("El nombre no puede ser nulo ni vacío.");
		}
		this.nombre = nombre;
	}

	public void setSuperficie(double superficie) {
		if (superficie <= 0) {
			throw new IllegalArgumentException("La superficie debe ser mayor a 0.");
		}
		this.superficie = superficie;
	}

	public void setTipoDeInstalacion(int tipoDeInstalacion) {
		if (tipoDeInstalacion <= 0) {
			throw new IllegalArgumentException("El tipo de instalación debe ser mayor a 0.");
		}
		this.tipoDeInstalacion = tipoDeInstalacion;
	}

	
	// Se dejan las estructuras de los métodos de interfaces porque sino Java se queja
	@Override
	public int getTipoDeInstalacion() {
		// TODO
		return 0;
	}

	@Override
	public double getSuperficieEdificio() {
		// TODO 
		return 0;
	}

}

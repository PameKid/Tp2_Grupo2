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

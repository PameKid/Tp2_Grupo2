package ejercicio2;

public class EdificioDeOficinas implements Edificio {
	private double superficie;
	private int numeroDeOficinas;
	
	public EdificioDeOficinas() {
		superficie = 0;
		numeroDeOficinas = 0;
	}
	
	public EdificioDeOficinas(double superficie, int numeroDeOficinas) {
		this.superficie = superficie;
		this.numeroDeOficinas = numeroDeOficinas;
	}

	
	@Override
	public double getSuperficieEdificio() {
		// TODO
		return 0;
	}
	
}

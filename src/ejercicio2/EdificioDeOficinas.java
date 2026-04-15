package ejercicio2;

public class EdificioDeOficinas implements Edificio {
	private double superficieOficina;
	private int numeroDeOficinas;
	
	public EdificioDeOficinas() {
		superficieOficina = 0;
		numeroDeOficinas = 0;
	}
	
	public EdificioDeOficinas(double superficie, int numeroDeOficinas) {
		this.superficieOficina = superficie;
		this.numeroDeOficinas = numeroDeOficinas;
	}
	
	public int getNumeroDeOficinas() {
		return numeroDeOficinas;
	}

	@Override
	public double getSuperficieEdificio() {
		return superficieOficina*numeroDeOficinas;
	}
	
}

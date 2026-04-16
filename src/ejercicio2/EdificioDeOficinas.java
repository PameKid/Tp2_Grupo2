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
	
	public void setNumeroDeOficinas(int numeroDeOficinas) {
		
		if(numeroDeOficinas > 0 ) {
			this.numeroDeOficinas = numeroDeOficinas;
		}
		else {
			throw new IllegalArgumentException("El numero de oficinas debe ser mayor a 0");
		}
	}
	
	public void setSuperficie(double superficie) {
		
		if (superficie > 0) {
			this.superficieOficina = superficie;
		}
		
		else {
		    throw new IllegalArgumentException("La superficie debe ser mayor a 0");
		}

	}
	
	public int getNumeroDeOficinas() {
		return numeroDeOficinas;
	}
	
	@Override
	public double getSuperficieEdificio() {
		return superficieOficina*numeroDeOficinas;
	}
	
	@Override
	public String toString() {
		return "Superficie:" + getSuperficieEdificio() + ",Oficinas;" + numeroDeOficinas;
	} 
	
	
	
}

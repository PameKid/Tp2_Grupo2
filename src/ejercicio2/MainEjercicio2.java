package ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;

public class MainEjercicio2 {

	public static void main(String[] args) {
		ArrayList<Edificio> edificios = new ArrayList<Edificio>();

		Polideportivo polideportivo1 = new Polideportivo("Polideportivo Norte", 1200.5, 1);
		Polideportivo polideportivo2 = new Polideportivo("Polideportivo Sur", 980.0, 2);
		Polideportivo polideportivo3 = new Polideportivo("Polideportivo Central", 1500.75, 3);

		EdificioDeOficinas edificio1 = new EdificioDeOficinas(45.5, 10);
		EdificioDeOficinas edificio2 = new EdificioDeOficinas(60.0, 8);

		edificios.add(polideportivo1);
		edificios.add(polideportivo2);
		edificios.add(polideportivo3);
		edificios.add(edificio1);
		edificios.add(edificio2);

		Iterator<Edificio> iterator = edificios.iterator();
		while (iterator.hasNext()) {
			Edificio edificio = iterator.next();

			if (edificio instanceof Polideportivo) {
				Polideportivo polideportivo = (Polideportivo) edificio;
				System.out.println(polideportivo);
			} else if (edificio instanceof EdificioDeOficinas) {
				EdificioDeOficinas edificioDeOficinas = (EdificioDeOficinas) edificio;
				System.out.println("EdificioDeOficinas [superficie=" + edificioDeOficinas.getSuperficieEdificio()
						+ ", numeroDeOficinas=" + edificioDeOficinas.getNumeroDeOficinas() + "]");
			}
		}
	}
}
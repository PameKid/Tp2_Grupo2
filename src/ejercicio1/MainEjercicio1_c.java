package ejercicio1;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.TreeSet;

public class MainEjercicio1_c {

	public static void main(String[] args) {

		
		Empleado emp1 = new Empleado(
				"12345678", "Ana", "Garcia", LocalDate.of(1990, 5, 15),
				"Femenino", "Calle Mayor 10", "600111222", "ana.garcia@gmail.com", "Senior Dev"
		);

		Empleado emp2 = new Empleado(
				"87654321", "Carlos", "Sanchez", LocalDate.of(1985, 11, 2),
				"Masculino", "Av. Libertad 45", "655333444", "carlos.s@gmail.com", "Analista"
		);

		Empleado emp3 = new Empleado(
				"45678912", "Elena", "Rodriguez", LocalDate.of(1982, 3, 20),
				"Femenino", "Plaza España 5", "688555666", "e.rodriguez@gmail.com", "Manager"
		);

		Empleado emp4 = new Empleado(
				"23456789", "Luis", "Martinez", LocalDate.of(2000, 7, 10),
				"Masculino", "Calle Luna 12", "677888999", "l.martinez@gmail.com", "QA"
		);

		Empleado emp5 = new Empleado(
				"34567890", "Sofia", "Lopez", LocalDate.of(1998, 1, 30),
				"Femenino", "Paseo del Prado 22", "611000111", "sofia.ux@gmail.com", "UX Designer"
		);

		
		TreeSet<Empleado> empleados = new TreeSet<Empleado>();
		empleados.add(emp1);
		empleados.add(emp2);
		empleados.add(emp3);
		empleados.add(emp4);
		empleados.add(emp5);

		Iterator<Empleado> iterator = empleados.iterator();
		while (iterator.hasNext()) {
			Empleado empleado = iterator.next();
			System.out.println(empleado.toString());
		}
	}
}
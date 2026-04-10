package ejercicio1;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ListIterator;

public class MainEjercicio1_b {
    public static void main(String[] args) {
        
    	// crear 5 objetos de clase empleados con datos válidos
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
        
        // guardarlos en una estructura Arraylist
        ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
        listaEmpleados.add(emp1);
        listaEmpleados.add(emp2);
        listaEmpleados.add(emp3);
        listaEmpleados.add(emp4);
        listaEmpleados.add(emp5);
        
        // mostrar información de cada empleado a través de un iterator
        ListIterator<Empleado> iterator = listaEmpleados.listIterator();
        while(iterator.hasNext()) {
        	Empleado empleado = iterator.next();
        	System.out.println(empleado.toString());
        }
    }
}
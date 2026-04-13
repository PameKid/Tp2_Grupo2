package ejercicio1;

import java.util.HashSet;
import java.util.Iterator;
import java.time.LocalDate;

public class MainEjercicio1_d {

    public static void main(String[] args) {

        // Creo HashSet
        HashSet<Persona> listaPersonas = new HashSet<>();

        //  5 personas con datos válidos
        Persona p1 = new Persona(
                "12345678", "Juan", "Perez",
                LocalDate.of(1998, 5, 10),
                "Masculino", "Calle 1", "11111111", "juan@gmail.com"
        );

        Persona p2 = new Persona(
                "87654321", "Ana", "Gomez",
                LocalDate.of(1995, 3, 22),
                "Femenino", "Calle 2", "22222222", "ana@gmail.com"
        );

        Persona p3 = new Persona(
                "11111111", "Luis", "Lopez",
                LocalDate.of(1990, 7, 15),
                "Masculino", "Calle 3", "33333333", "luis@gmail.com"
        );

        Persona p4 = new Persona(
                "22222222", "Maria", "Diaz",
                LocalDate.of(1988, 1, 30),
                "Femenino", "Calle 4", "44444444", "maria@gmail.com"
        );

        Persona p5 = new Persona(
                "33333333", "Carlos", "Sosa",
                LocalDate.of(2000, 9, 5),
                "Masculino", "Calle 5", "55555555", "carlos@gmail.com"
        );

        // Agregar al HashSet
        listaPersonas.add(p1);
        listaPersonas.add(p2);
        listaPersonas.add(p3);
        listaPersonas.add(p4);
        listaPersonas.add(p5);

        // Recorrer con Iterator
        Iterator<Persona> it = listaPersonas.iterator();

        while (it.hasNext()) {
            Persona p = it.next();
            System.out.println(p);
        }
    }
}
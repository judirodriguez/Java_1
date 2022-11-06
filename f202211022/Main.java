package cl.generation.f202211022;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// Instanciando objetos

		ArrayList<ProfesoresClase> listaProfesores = new ArrayList<ProfesoresClase>();

		ProfesoresClase profesor1 = new ProfesoresClase();
		profesor1.setNombre("Israel");
		profesor1.setApellido("Caceres");
		profesor1.setEdad(40);
		profesor1.setRamo("java");
		profesor1.setEspecialidad("TI");

		listaProfesores.add(profesor1);// agregando objetos a la lista

		ProfesoresClase profesor2 = new ProfesoresClase();
		profesor2.setNombre("Ale");
		profesor2.setApellido("Heredia");
		profesor2.setEdad(30);
		profesor2.setRamo("css");
		profesor2.setEspecialidad("TI");

		listaProfesores.add(profesor2);

		ProfesoresClase profesor3 = new ProfesoresClase();
		profesor3.setNombre("Andrea");
		profesor3.setApellido("Montecinos");
		profesor3.setEdad(35);
		profesor3.setRamo("Habilidades blandas");
		profesor3.setEspecialidad("Sicologia");

		listaProfesores.add(profesor3);

		for (ProfesoresClase profesoresClase : listaProfesores) {
			System.out.println(profesoresClase.toString());

		}

		ArrayList<Alumnoss> listaAlumnos = new ArrayList<Alumnoss>();

		Alumnoss alumno1 = new Alumnoss();
		alumno1.setNombre("Judi");
		alumno1.setApellido("Rodriguez");
		alumno1.setEdad(29);
		alumno1.setGenero("femenino");
		alumno1.setNumerodelista(20);

		listaAlumnos.add(alumno1);

		Alumnoss alumno2 = new Alumnoss();
		alumno2.setNombre("Maria");
		alumno2.setApellido("Perez");
		alumno2.setEdad(28);
		alumno2.setGenero("femenino");
		alumno2.setNumerodelista(4);

		listaAlumnos.add(alumno2);

		Alumnoss alumno3 = new Alumnoss();
		alumno3.setNombre("Adolfo");
		alumno3.setApellido("Gonzalez");
		alumno3.setEdad(23);
		alumno3.setGenero("masculino");
		alumno3.setNumerodelista(17);

		listaAlumnos.add(alumno3);

		for (Alumnoss alumnoss : listaAlumnos) {
			System.out.println(alumnoss.toString());
		}

		ArrayList<Administrativos> listaadministrativos = new ArrayList<Administrativos>();

		Administrativos administrativo1 = new Administrativos();
		administrativo1.setNombre("Ana");
		administrativo1.setApellido("Apablaza");
		administrativo1.setEdad(36);
		administrativo1.setAniosDeExperiencia(4);
		administrativo1.setCargo("Secretaria");

		listaadministrativos.add(administrativo1);

		Administrativos administrativo2 = new Administrativos();
		administrativo2.setNombre("Camila");
		administrativo2.setApellido("Osses");
		administrativo2.setEdad(48);
		administrativo2.setAniosDeExperiencia(10);
		administrativo2.setCargo("Jefa RRHH");

		listaadministrativos.add(administrativo2);

		Administrativos administrativo3 = new Administrativos();
		administrativo3.setNombre("Alexis");
		administrativo3.setApellido("Rodriguez");
		administrativo3.setEdad(38);
		administrativo3.setAniosDeExperiencia(12);
		administrativo3.setCargo("Coordinador");

		listaadministrativos.add(administrativo3);

		for (Administrativos administrativos : listaadministrativos) {
			System.out.println(administrativos.toString());
		}

	}

}

package cl.generation.f20221025;

import java.util.ArrayList;

public class arregloDinamico {

	public static void main(String[] args) {
		// ArrayList
		// ArrayList<TIPODATO> nombre_array = new ArrayList<TIPODATO>();
		ArrayList<String> grupo1 = new ArrayList<String>();
		// 2. agragar valores al arreglo
		grupo1.add("adolfo");
		grupo1.add("mari");
		grupo1.add("nico");
		grupo1.add("judi");
		grupo1.add("alexander");
		System.out.println(grupo1);
		// 3. tamaño del arraylist?
		System.out.println(grupo1.size());// size = cantidad de elementos en el array

		// System.out.println(grupo1.get(7));// fuere de indice
		grupo1.remove(2);// remove borra una posicion y los demas se desplazan en las posiciones.
		System.out.println(grupo1);
		grupo1.add("nico");
		// 6.- recorrer el ArrayList
		for (int i = 0; i < grupo1.size(); i++) {
			System.out.println("Estudiante: " + grupo1.get(i));
		}
		System.out.println("*************");
		
        //for iterador o for de objeto
		for(String estudiante: grupo1){
		System.out.println(estudiante);
		}
		
		
	}

}

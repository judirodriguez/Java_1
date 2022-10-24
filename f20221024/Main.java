package cl.generation.f20221024;

public class Main {

	public static void main(String[] args) {
		//las variables
        // var nombre_variable
		
		//variables primitivas = caracter estatico-todas son escritas con minuscula.- no nos permite trabajar con algunas funciones.
		int numero1 = 2;//El tipo de dato int es un entero de 32 bits complemento a dos. Su valor mínimo es -2,147,483,648 y el máximo 2,147,483,647 (inclusive).
		long numero2 = 2147483648l; //es el tipo entero de mayor tamaño, 8 bytes (64 bits), con un rango de valores desde -263 a 263-1.
		float decimal= 2.5f; //float trabaja con decimal. pero no es el unico.- variable tipo flotante
		float decimal2= (float) 2.5;//castear
		double decimal3= 9.8d;//decimal mss extenso
		
		char caracter= '4';//siempre debe ir en comillas simples
		
		boolean respuesta= true;//false - verdadero o falso
		
		//investigar las variables short y byte
		System.out.println(numero1+" "+decimal+" "+decimal2);
		
		float decimal7 =(float) numero1;
		System.out.println(decimal7);
		System.out.println(numero1);
		System.out.println(decimal7);
		//variables tipo objeto
		String palabra= "qwerty";//palabra
		
		Long numero4 = 1232344556L; 
		Float numero5 = 74638940F; 
		Double numero6 = 123456789098765D;
	}

}

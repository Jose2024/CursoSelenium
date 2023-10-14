package ejemplo_java;

public class Ejemplo_Arreglo_unidimensional {

	public static void main(String[] args) {
		
		int intArray[];
		int[] intArray2;
		
		String[] arr;
		arr = new String[5];
		
		arr[0]= "cero";
		arr[1]= "uno";
		arr[2]= "dos";
		arr[3]= "tres";
		arr[4]= "cuatro";
		System.out.println("El valor de la posicion dos en el arreglo es:" + arr[2]);
		for(int i = 0; i< arr.length; i++) {
			System.out.println("Elemento en la posicion " +i+ ":" + arr[i]);
		}

	}

}

package ejemplo_java;

public class DemoVehiculo {

	public static void main(String[] args) {
		Vehiculo minivan = new Vehiculo();
		int rango;
		minivan.pasajeros = 9;
		minivan.capacidad = 15;
		minivan.kmh =20;
	
		rango = minivan.capacidad * minivan.kmh;
		
		System.out.println("la minivan pueda llevar " +  minivan.pasajeros  +  " pasajeros con rango de :"  + rango + "kilometros");
		
		Vehiculo carro = new Vehiculo();
		carro.pasajeros = 4;
		System.out.println("numero de pasajero por carro es :" + carro.pasajeros);
		

	}

}

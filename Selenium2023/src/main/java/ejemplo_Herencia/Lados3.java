package ejemplo_Herencia;

public class Lados3 {

	public static void main(String[] args) {
		Triangulo t1 = new Triangulo();
		t1.base = 4.0;
		t1.altura = 4.0;
		t1.estilo = "Estilo 1";
		
		System.out.println("informacion pata T1: ");
		t1.mostrarEstilo();
		t1.mostrarDimension();
		System.out.println("Su area es: " + t1.area());
		
		
		Triangulo t2 = new Triangulo();
		System.out.println();
		
		
		t2.base = 2.0;
		t2.altura = 6.0;
		t2.estilo = "Estilo 2";
		
		System.out.println("informacion pata T2: ");
		t2.mostrarEstilo();
		t2.mostrarDimension();
		System.out.println("Su area es: " + t2.area());
		
		
		
		

	}

}
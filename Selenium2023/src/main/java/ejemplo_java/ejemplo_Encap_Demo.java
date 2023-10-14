package ejemplo_java;

public class ejemplo_Encap_Demo {

	public static void main(String[] args) {

ejemplo_Encap encap = new ejemplo_Encap();
//encap.tipo =10;
encap.setTipo(5);
		System.out.println("El tipo es:  " + encap.getTipo());

	}

}

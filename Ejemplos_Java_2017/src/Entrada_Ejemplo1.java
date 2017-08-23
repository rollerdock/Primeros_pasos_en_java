import java.util.Scanner;

public class Entrada_Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);

		System.out.println("introduce tu nombre:\n");
		
		String nombre_usuario=entrada.nextLine();
		
		System.out.println("introduce tu edad:\n");
		
		int edad=entrada.nextInt();
		
		System.out.println("\n hola " + nombre_usuario + " el año que viene tendrás " + (edad+1));
	}

}

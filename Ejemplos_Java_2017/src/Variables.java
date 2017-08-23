import java.io.InputStream;
import java.util.Scanner;

public class Variables {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resto;
		double total;
		InputStream stream = System.in;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Cuantos capitulos tiene ?\n");
		int Capitulos = scanner.nextInt();
		System.out.println("Cuantos capitulos has visto ?\n");
		int Vistos = scanner.nextInt();
		
		scanner.close();
		resto= (Capitulos*Vistos);
		total =  resto/100;
		total=Math.abs(total);
		//System.out.println("Son un", resto);
		
		//System.out.printf("Total: %.0f", total ); 
		
		System.out.println(" ");
		System.out.println("El valor de capitulos es:" + Capitulos);
		System.out.println("El valor de vistos es: " + Vistos);
		System.out.println("El valor de resto es: " + resto);
		System.out.println("El valor de total es: " + total);
		System.out.println(total);
		
	}

}
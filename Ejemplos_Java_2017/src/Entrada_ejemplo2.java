import javax.swing.*;
public class Entrada_ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String nombre_usuario=JOptionPane.showInputDialog("Introduce tu nombre");//input 
 String edad=JOptionPane.showInputDialog("Introduce la edad por favor");

	 	int edad_usuario=Integer.parseInt(edad); 
 
 //con la clase Integer (estatica) y el método parseInt(string) 
 //convertimos un string en un int
 
 System.out.println("Hola " + nombre_usuario + ", El año que viene tendrás " + (edad_usuario+1) + " Años");

 
	}

}

import javax.swing.JOptionPane;

public class Verificaci�n_email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arroba=0;
		int i=0;
		String mail=JOptionPane.showInputDialog("Introduce E_mail");
		
		for ( i=0;i<mail.length();i++) {
				
				
				
					if (mail.charAt(i)=='@'){
				
							System.out.println("La @ est� en la posici�n : " + (i+1));
							arroba++;
				
		}//if
				

}//for
	
		if (arroba==1 ) {
			
			System.out.println("El email es correcto");
			
			
		}
		
		else {
			
			System.out.println("El email es INcorrecto");
		
	}
		
}//void
	
}//class

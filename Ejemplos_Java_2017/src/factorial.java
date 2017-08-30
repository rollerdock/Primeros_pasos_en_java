import javax.swing.JOptionPane;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i;
int factorial=0;
Long Resultado=1L;
		String numero= JOptionPane.showInputDialog("intruduce numero");
		
		
		int numEntero = Integer.parseInt(numero);
		
		for (i=numEntero;i>0;i--) {
			
			
			
			Resultado=Resultado*i;
			
		}
		
		//System.out.println("El factorial de " + numEntero + " es : " + Resultado);
		
		JOptionPane.showMessageDialog(null, "El factorial de " + numEntero + " es : " + Resultado);
	}


	
	
	

}

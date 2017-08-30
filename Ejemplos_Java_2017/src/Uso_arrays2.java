import javax.swing.JOptionPane;

public class Uso_arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String paises[]= new String[8];
		paises[0]="España";
		paises[1]="México";
		paises[2]="Colombia";
		paises[3]="Perú";
		paises[4]="Chile";
		paises[5]="Argentina";
		paises[6]="Ecuador";
		paises[7]="Venezuela";
		
		/*for(int i=0;i<paises.length;i++) {
			
			
			
			System.out.println("País " + (i+1) + " " + paises[i]);
		}*/
		int i=0;
		for(String elemento:paises) {
			
			if(elemento!=null)
			{
				i++;
			}
			System.out.println("País " + i + " " + elemento);
			//JOptionPane.showMessageDialog(null, "País " + i + " " + elemento);
		}
		
		 JOptionPane.showMessageDialog(null, "Operación correcta", "soy el titulo", JOptionPane.DEFAULT_OPTION);

	}

}

import javax.swing.JOptionPane;

public class LLenado_Matriz {

	public static void main(String args[]) {
		
		//Variables
		String  Fila, Columna, Num;
	
		int i, j, Suma_Col;
		
		//Petici�n de datos y convertirlos a int
		Fila = JOptionPane.showInputDialog("Ingresa el n�mero de Filas: ");
		int Num_Fila = Integer.parseInt(Fila);
		
		Columna = JOptionPane.showInputDialog("Ingresa el n�mero de Columnas");
		int Num_Col = Integer.parseInt(Columna);
		
		//Matriz
		int Matriz [][] = new int[Num_Fila][Num_Col];
		
		for(i=0; i<Num_Fila; i++) {
		
			  
			for(j=0; j<Num_Col; j++) {
				
				Num = JOptionPane.showInputDialog("Escribe un n�mero en la posici�n " +"["+i+","+j+"]" );
				int Digito_Fila = Integer.parseInt(Num);
				
				System.out.print(" "+"["+i+","+j+"] = "+ Matriz[i][j]);
			}
			System.out.println("");
		}
	}
}

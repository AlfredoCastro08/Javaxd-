
public class SumaMatrices {

	public static void main (String args[]) {
		
		int i; //Columnas
		int j; //Filas
		int k=0; // Acumulador
		
		//Matriz 
		int Matriz [][]= new int[3][3];
		
		int Suma_Col=0;
		
		
		for(i=0; i<3;i++) {
			k++;
			
			
			for(j=0; j<3; j++) {
				Matriz[i][j]+=k;
				
				System.out.println("["+i+","+j+"] = " +Matriz[i][j]);
				
				Suma_Col = i+k;
				
				System.out.println(i);
			}
		}
		
		
	}
}

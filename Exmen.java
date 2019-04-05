import java.util.Arrays;
/* Matriz de 100x100, rango del 1 al 100, ordenado de menor a mayor y de menor a mayor
 * 
 * 
 * 
 * */

public class Exmen {

	public static void main(String args []) {
		
		int i, j = 0, x, y; //i = Filas j = Columnas

		int Matriz [][]= new int[5][5];

		//Matriz desoredenada
		System.out.println("Matriz Desordenada");
		for(i=0; i<Matriz.length; i++) {

			for(j=0; j<Matriz.length; j++) {

			//Llenado de la matriz del 1 al 100 de forma random 
				 Matriz[i][j] = (int) (Math.random()*100+1);

				 System.out.print(" ["+i+","+j+"] = "+ Matriz[i][j]);
			}
			System.out.println("");
		}

		System.out.println("");

		//Matriz ordenada
		System.out.println("Matriz Ordenada");


		//Ordenar la matriz
		
		for(i=0; i<Matriz.length; i++) {
			for(j=0; j<Matriz.length; j++) {
				for(x=0; x<Matriz.length; x++) {
					for(y=0; y<Matriz.length; y++) {

						if(Matriz[i][j]<Matriz[x][y]) {
							int Temp = Matriz[i][j];
							Matriz[i][j] = Matriz[x][y];
							Matriz[x][y]= Temp;
							
					   }
					}
				}
			}
		}
		
		for(i =0; i<Matriz.length; i++) {
			for( j=0; j<Matriz.length; j++) {
				System.out.print(" ["+i+","+j+"] = "+Matriz[i][j]);
			}
			System.out.println("");
		}
	 }		
}


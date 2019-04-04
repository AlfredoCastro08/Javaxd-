import java.util.Arrays;
/* Arreglo de una columna con 20 numeros de manera desordenada, y ordenarlos de mayor y menor, 
 * que se muestre de forma 
 * original y desordenada
 */

public class Ordenar_Matriz {

	public static void main(String[] args) {

		int i, j, Menor=0; //i = Filas j = Columnas

		int Matriz []= new int[5];

		//Matriz desoredenada
		System.out.println("Matriz Desordenada");
		for(i=0; i<5; i++) {

			for(j=0; j<1; j++) {

			//Llenado de la matriz del 100 al 1 de forma random 
				 Matriz[i] = (int) (Math.random()*100+1);

				 System.out.print("["+i+"] = "+ Matriz[i]);
			}
			System.out.println("");
		}

		System.out.println("");

		//Matriz ordenada
		System.out.println("Matriz Ordenada");

		//Ordenar la matriz
	
		/*Se cambió de 5 a 1 para hacer un solo vector y no una matriz 5x5 
		 * corregir para que sea una columna y no 5
		 * */
		for(i=0; i<1; i++){

			  for(j=0; j<1; j++) {
				/*int Temp=0;
				  if(Matriz[i]<Matriz[j]) {
					  Matriz[j+1] = Matriz[j];
					  Matriz[j]=Temp;*/
				  Arrays.sort(Matriz);
				  System.out.print(Arrays.toString(Matriz)); 
				  }
		   }
		}	
	}


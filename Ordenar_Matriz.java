
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
		for(i=0; i<5; i++){
		
		  for(j=0; j<1; j++) {
			int temp=0;
			  if(Matriz[i]>Matriz[j]) {
				  Menor=Matriz[j+1];
				  Menor=Matriz[temp];
				  
				
			  }
				
			 System.out.print("["+i+"] = "+ Menor);
		  
				}
		  
		  System.out.println("");	
				
		}
			
     }		
}

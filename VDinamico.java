import java.util.Scanner;

public class VDinamico{

  public static void main(String args[]){
	
	//Objeto Entrada
	Scanner Entrada = new Scanner(System.in);
	//Tamaño del vector
	int Tamaño = 0;
	
	//Petición al usuario
	System.out.print("Ingresa el tamaño del vector: ");
	Tamaño = Entrada.nextInt();

	//Vector
	int Numeros[] = new int[Tamaño];
	
	

	for(int i=0; i<Numeros.length; i++){

	//Petición de numeros
	System.out.println("Ingresa el valor #" + (i+1));
	Numeros[i] = Entrada.nextInt();
	
      }
	//Para imprimir al final los números ingresados
	for(int i=0; i<Numeros.length; i++){
	System.out.print("["+Numeros[i]+"]");
      }
  }

}
import java.util.Scanner;

public class VDinamico{

  public static void main(String args[]){
	
	//Objeto Entrada
	Scanner Entrada = new Scanner(System.in);
	//Tama�o del vector
	int Tama�o = 0;
	
	//Petici�n al usuario
	System.out.print("Ingresa el tama�o del vector: ");
	Tama�o = Entrada.nextInt();

	//Vector
	int Numeros[] = new int[Tama�o];
	
	

	for(int i=0; i<Numeros.length; i++){

	//Petici�n de numeros
	System.out.println("Ingresa el valor #" + (i+1));
	Numeros[i] = Entrada.nextInt();
	
      }
	//Para imprimir al final los n�meros ingresados
	for(int i=0; i<Numeros.length; i++){
	System.out.print("["+Numeros[i]+"]");
      }
  }

}
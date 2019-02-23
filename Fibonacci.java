
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
	
		//Objeto Entrada
		Scanner Entrada = new Scanner(System.in);
		
		//Variables
		int Num1 = 0, Num2 = 1, Temp = 0;
		int Contador =0 , Limite = 0, Incremento = 0;
		
		//Perición de datos
		System.out.println("Ingresa tu contador");
		Contador = Entrada.nextInt();
		System.out.println("Ingresa tu limite");
		Limite = Entrada.nextInt();
		System.out.println("Ingresa tu incremento");
		Incremento = Entrada.nextInt();
				
		
		//Condicones
		
		for (int i=Contador; i<=Limite; i+=Incremento) {
		 
			if(Num1<i) {
				System.out.print(Num1 + ",");
				Temp = Num1+Num2;
				Num1 = Num2;
				Num2 = Temp;
			}
				
		}
  
	}

}

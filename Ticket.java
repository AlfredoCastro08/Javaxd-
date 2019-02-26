import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ticket {

	public static void main(String[] args) {
	 
		//Objeto entrada
		Scanner Entrada = new Scanner(System.in);
		
		//Variables
		String Producto, Cantidad, Precio; 
		int Cantidad1 = 0, Precio2=0, j=0, i=0, Total=0, Subtotal=0, IVA=0, Pago=0, Cambio=0, TotalaPagar=0;

		System.out.println("GRACIAS POR SU COMPRA. VUELVA PRONTO.");
	    System.out.println("--------------------------------------------");
	    System.out.println("");
	    System.out.println("Prodcuto"+"      "+"Cantidad"+"      "+"Precio"+"     "+"Total");
	    System.out.println("");
		
	    //Petición de datos con JOptionPane
	    Producto = JOptionPane.showInputDialog("Ingresa el nombre del producto");
	    System.out.print(Producto);
	    Cantidad = JOptionPane.showInputDialog("Ingresa la cantidad del producto");
	    System.out.print("            "+Cantidad);
	    Precio = JOptionPane.showInputDialog("Ingresa el precio del producto");
	    System.out.print("            "+Precio);
	   
	   //Converción de las cadenas a enteros 
	    Cantidad1 = Integer.parseInt(Cantidad);
	    Precio2 = Integer.parseInt(Precio);
	    
	    Total = Cantidad1*Precio2;
	    System.out.print("          "+Total);
	    System.out.println("");
	    
	  
           
	}

}

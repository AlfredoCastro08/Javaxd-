import javax.swing.JOptionPane;

public class Ticket {

	public static void main(String[] args) {
	 
		
		
	    //Variables
	    String Producto, Cantidad, Precio; 
	    double Cantidad1=0, Precio1=0, j=0, i=0, Total=0, Subtotal=0, IVA=0, Pago=0, Cambio=0, SubTotal=0, TotalaPagar=0;

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
	   
	    //Conversión de las cadenas a double 
	    Cantidad1 = Double.parseDouble(Cantidad);
	    Precio1 = Double.parseDouble(Precio);
	    
	    Total = Cantidad1*Precio1;
	    System.out.print("          "+Total);
	    System.out.println("");
	    
	  
           
	}

}

import javax.swing.*;
import java.awt.*;

public class Ventanas extends JFrame{
	
	
	public JLabel Bienvenida;
	public JLabel Alfredo;
	public JLabel Indicar_Nombre;
	public JTextField Mi_Nombre;
	public JButton Boton_Color; 
	public JTextArea Caja_Text;
	public JLabel Mi_Texto;
	
	//Constructor de ventanas
	public Ventanas() {
		
	//Poner titulo siempre con super
	super("Ventana");
	
	//Definir el tamaño de la ventana
	this.setSize(600,400);
	
	//Para cerrar la ventana
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	//Se agrega distribuidro de componentes
	FlowLayout Distribucion = new FlowLayout();
	this.setLayout(Distribucion);
	
	//Agreag texto a la ventana
	this.Bienvenida = new JLabel("Primer JLabel (Etiquieta)");
	this.add(this.Bienvenida);
	
	FlowLayout Salto = new FlowLayout();
	this.setLayout(Salto);

	//Segundo texto
	this.Alfredo = new JLabel("Alfredo xd");
	this.add(this.Alfredo);
	
	
	//Petición de nombre
	this.Indicar_Nombre = new JLabel("Ingresa tu nombre");
	this.add(this.Indicar_Nombre);
	this.Mi_Nombre = new JTextField("Su nombre");
	this.add(this.Mi_Nombre);
	
	//Botón 
	this.Boton_Color = new JButton("Naranja");
	this.Boton_Color.setBackground(Color.red);
	this.add(Boton_Color);
	
	this.Mi_Texto = new JLabel();
	this.Mi_Nombre.setText("Ingresa tu nombre");
	this.add(this.Mi_Texto);
	
	
	//Área de texto
	this.Caja_Text = new JTextArea(10,20);
	this.add(Caja_Text);
	
	}
	
	
	//Main
	
	public static void main(String args[]) {
		//Inicializar la ventana
		Ventanas Interfaz = new Ventanas();
		//Havcer visible la ventana
		Interfaz.setVisible(true);
	}
	
}

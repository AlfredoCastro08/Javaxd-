
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Romanos extends JFrame implements ActionListener {
	
	public JTextField Texto;
	public JLabel Ingresar, Ingresar2, Res, Mostrar;
	public JButton Boton;
	
	public Romanos(){
		super ("Números Decimales a Números Romanos");
		setLayout(null);
		
		Ingresar2 = new JLabel("Ingresa el Número");
		Ingresar2.setBounds(100,10,150,30);
		add(Ingresar2);
		Texto = new JTextField();
		Texto.setBounds(100,40,100,30);
		add(Texto);
		
		Ingresar = new JLabel();
		Ingresar.setBounds(100,80,100,30);
		add(Ingresar);
		
		Boton = new JButton("Conversión");
		Boton.setBounds(100,90,100,30);
		add(Boton);
		
		Mostrar = new JLabel("Tu resultado es: ");
		Mostrar.setBounds(100, 120,100,30);
		add(Mostrar);
		
		Res = new JLabel();
		Res.setBounds(100, 160, 100, 30);
		add(Res);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	
	public void actionPerformed(ActionEvent f) {
		  if (f.getSource()==Boton) {
			  
	          String Num=Texto.getText();
	         
	          int Conver=Integer.parseInt(Num);
	           
	          int Unidades=0, Decenas=0, Residuo=0;
	         
	          
	         Decenas = Conver%10; 
	         Residuo =Unidades/=10;
	         Residuo = Decenas;
	         
	          Unidades = Conver%10; 
	          Residuo = Unidades/=10;
	          Residuo = Unidades;
	    	  
	    		//Condiciones	
	    		switch(Decenas) {
	    			case 1: System.out.print("X"); 
	    		    break;	
	    			case 2: System.out.print("XX"); 
	    			break;
	    			case 3: System.out.print("XXX"); 
	    			break;
	    			case 4: System.out.print("XL"); 
	    			break;	
	    			case 5: System.out.print("L"); 
	    			break;
	    			case 6: System.out.print("LX"); 
	    			break;
	    			case 7: System.out.print("LXX"); 
	    			break;	
	    			case 8: System.out.print("LXXX"); 
	    			break;
	    			case 9: System.out.print("XC"); 
	    			break;
	    	}
	    		switch(Unidades) {
	    	        case 1: System.out.print("I"); 
	    	        break;	
	    		    case 2: System.out.print("II"); 
	    		    break;
	    		    case 3: System.out.print("III"); 
	    		    break;
	    		    case 4: System.out.print("IV"); 
	    		    break;	
	    		    case 5: System.out.print("V"); 
	    		    break;
	    		    case 6: System.out.print("VI"); 
	    		    break;
	    		    case 7: System.out.print("VII"); 
	    		    break;	
	    		    case 8: System.out.print("VIII"); 
	    		    break;
	    		    case 9: System.out.print("IX"); 
	    		    break;

	               }
	            Res.setText(String.valueOf(Num));
	        }
		
	}
	public static void main(String[] args) {
	
		Romanos Form = new Romanos();
		Form.setBounds(10, 80, 350, 250);
		Form.setVisible(true);

	}
}
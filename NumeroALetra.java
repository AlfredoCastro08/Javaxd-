
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class NumeroALetra extends JFrame implements ActionListener {
	
	public JTextField NumeroText;
	public JLabel Ingresar, Ingresar2, Res, Mostrar;
	public JButton Boton;
	
	
	public NumeroALetra(){
		
		super ("Números Decimales a Letra");
		setLayout(null);
		
		Ingresar2 = new JLabel("Ingresa el Número");
		Ingresar2.setBounds(50,10,150,30);
		add(Ingresar2);
		
		NumeroText = new JTextField();
		NumeroText.setBounds(50,40,100,30);
		add(NumeroText);
		
		Ingresar = new JLabel();
		Ingresar.setBounds(50,80,100,30);
		add(Ingresar);
		
		Boton = new JButton("Conversión");
		Boton.setBounds(50,90,100,30);
		add(Boton);
		Boton.addActionListener(this);//Indispensable
		
		Mostrar = new JLabel("Tu resultado es: ");
		Mostrar.setBounds(50, 120,100,30);
		add(Mostrar);
		
		Res = new JLabel();
		Res.setBounds(50, 160, 100, 30);
		add(Res);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	
	public void actionPerformed(ActionEvent e) {
		  if (e.getSource()==Boton) {
			  		  
			  String Num = NumeroText.getText();
	           	            
	          int Conver = Integer.parseInt(Num);
	          int Unidades, Decenas,Centenas, Millar;
	         
	          
	          //Unidades
		      Unidades=Conver%10;
		      Conver = Unidades/10;
	          
	        //Millares
	          Millar = Conver%10;
	          Conver = Millar/10;
	          
	        //Centenas 
		     Centenas = Conver%10;
		     Conver = Centenas/10;
    
	        //Decenas
		     Decenas = Conver%10;
		     Conver = Decenas/10;
		                         
	        switch (Centenas) {
	        case 1: Res.setText(String.valueOf("Cien")); break;
	        case 2: Res.setText("Doscientos "); break;
            case 3: Res.setText("Trescientos "); break;
            case 4: Res.setText("Cuatrocientos "); break;
            case 5: Res.setText("Quinientos "); break;
            case 6: Res.setText("Seiscientos "); break;
            case 7: Res.setText("Setecientos "); break;
            case 8: Res.setText("Ochocientos "); break;
            case 9: Res.setText("Novecientos "); break;
	        }
	        
	         switch(Decenas) {
	          
	         	case 1: Res.setText(String.valueOf("Diez")); break;
	         	case 2: Res.setText(String.valueOf("Once")); break;
	         	case 3: Res.setText(String.valueOf("Doce")); break;
	         	case 4: Res.setText(String.valueOf("Trece")); break;
	         	case 5: Res.setText(String.valueOf("Catorce")); break;
	         	case 6: Res.setText(String.valueOf("Quince")); break;
	         	
          
	         }
	        
	          switch(Unidades){         
	          	case 1: Res.setText(String.valueOf("Uno ")); break;      		        		
	          	case 2: Res.setText(String.valueOf("Dos ")); break;	          		   		
	          	case 3: Res.setText(String.valueOf("Tres ")); break;	          		
	          	case 4: Res.setText(String.valueOf("Cuatro ")); break;	          		         		
	          	case 5: Res.setText(String.valueOf("Cinco ")); break;	          			          		
	          	case 6: Res.setText(String.valueOf("Sesis ")); break;	          			          		
	          	case 7: Res.setText(String.valueOf("Siete ")); break;	          			          		
	          	case 8: Res.setText(String.valueOf("Ocho ")); break;	          		
	          	case 9:	Res.setText(String.valueOf("Nueve ")); break;     		
	         }
	          	            
	     }	
	}
	public static void main(String[] args) {
	
		NumeroALetra Form = new NumeroALetra();
		Form.setBounds(10, 80, 250, 250);
		Form.setVisible(true);

	}
}
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class DiezNumeros extends JFrame implements ActionListener {	
	
	public JTextField Num_Texto;
	public JLabel Ingresar, Res_Suma, Res_Promedio, Res_Menor, Res_Mayor;
	public JLabel Promedio, Menor, Mayor, Suma, Ingresados, Num_Ingre; 
	public JButton Boton;
	int Numeros [] = new int[3];
    int i=0, j=0, k=0, Suma_Num=0;
    
	
	public DiezNumeros(){
		super("Diez Números");
		setLayout(null);
		
		Ingresar = new JLabel("Ingresa los Números");
		Ingresar.setBounds(120,5,150,30);
		add(Ingresar);
		
		Num_Texto = new JTextField();
		Num_Texto.setBounds(100,40,150,30);
		add(Num_Texto);
		
		Boton = new JButton("Ingresa");
		Boton.setBounds(100,80,150,30);
		add(Boton);
        Boton.addActionListener(this);
        
        //Suma
        Res_Suma = new JLabel("EL Total es: ");
        Res_Suma.setBounds(300, 10, 150, 30);
        add(Res_Suma);
        
        Suma = new JLabel("");
        Suma.setBounds(300, 35, 150,30);
        add(Suma);
        //Fin Suma
        
        //Promedio
        Res_Promedio = new JLabel("El Promedio es: ");
        Res_Promedio.setBounds(300, 60, 150, 30);
        add(Res_Promedio);
        
        Promedio = new JLabel("");
        Promedio.setBounds(300, 85, 150, 30);
        add(Promedio);
        //Fin Promedio
        
        //Número Mayor
        Res_Mayor = new JLabel("El Número Mayor es:");
        Res_Mayor.setBounds(300, 105, 150, 30);
        add(Res_Mayor);
        
        Mayor = new JLabel("");
        Mayor.setBounds(300, 130, 150, 30);
        add(Mayor);
        //Fin Número Mayor 
        
        //Número Menor
        Res_Menor = new JLabel("EL Número Menor es: ");
        Res_Menor.setBounds(300, 155, 150, 30);
        add(Res_Menor);
        
        Menor= new JLabel("");
        Menor.setBounds(300, 180, 150, 30);
        add(Menor);
        
        ///Fin Número Menor
        
       /* //Números ingresados
        Ingresados= new JLabel("Números Ingresados");
        Ingresados.setBounds(300, 200, 150, 30);
        add(Ingresados);
        
        Num_Ingre= new JLabel();
        Num_Ingre.setBounds(300, 235, 150, 30);
        add(Num_Ingre);*/
        //Exit
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public void actionPerformed(ActionEvent h) {
		if(h.getSource()==Boton) {
			 //Tamaño del arreglo
			
	  //J será el acumulador para hacer la suma	          
	          if(j<Numeros.length) {
	        	  
	        	  Numeros[j]=Integer.parseInt(Num_Texto.getText()); 
	        	  j++;
	        	  
	        	  //Borra el num text y no guarda nada
	        	  Num_Texto.setText(null);
	        	//  Num_Ingre.setText(Numeros[j]+", ");
	        
	          }else {
	        	 JOptionPane.showMessageDialog(null, "El arreglo está lleno");
	          }
	         
	          
	          for(i=0; i<Numeros.length; i++) {
	        	  //Suma de 3 en e xd
	        		Suma_Num += Numeros[i];
	        	String 	Conver = Integer.toString(Suma_Num); 
	        		Suma.setText(Conver);
	          }
	          	          
	      }
	}	
	public static void main(String[] args) {
		DiezNumeros JFrame = new DiezNumeros();
		JFrame.setBounds(10, 80, 550, 350);
		JFrame.setVisible(true);	
	}
}
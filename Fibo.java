
public class Fibo{

  public static void main(String args[]){

    //Variables 
    int a = 0, b = 1, c = 0, i = 0;
    	     
    System.out.println("Serie con For: ");
    
    for(i=0; i<10; i++){
     if(i<9){
  	
	System.out.print(a + ",");
	c = a + b;
	a = b;
	b = c;
      
      }//<-Fin if  
      else{
       System.out.print(a);
      }//<- Fin else 
    }//<- Fin for

    System.out.println("");
    i=0; 
    a=0;   //Regresar todas las variables a su inicio para evitar errores
    b=1;
    c=0; 
    
    System.out.println("Serie con while");
    
    while(i<10){
     if(i<9){
       
	System.out.print(a + ",");
	c = a + b;
	a = b;
	b = c;
      
     }//<-Fin if
      else{
       System.out.print(a);
      }//<- Fin else
       i++;
    }//<- Fin while	

    System.out.println("");
    i=0;
    a=0;
    b=1;
    c=0;
    System.out.println("Serie con do-while");

   do{
       if(i<9){
       
	System.out.print(a + ",");
	c = a + b;
	a = b;
	b = c;
      
     }//<-Fin if
      else{
       System.out.print(a);
      }//<- Fin else
       i++;
	 	
   }while(i<10); //Fin do-while
  }

}
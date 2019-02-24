
public class Fibo{

  public static void main(String args[]){

    //Variables 
    int Num1 = 0, Num2 = 1, Temp = 0, i = 0;
    	     
    System.out.println("Serie con for: ");
    
    for(i=0; i<10; i++){
     if(i<9){
  	
	System.out.print(Num1 + ",");
	Temp = Num1 + Num2;
	Num1 = Num2;
	Num2 = Temp;
      
      }//<-Fin if  
      else{
       System.out.print(Num1);
      }//<- Fin else 
    }//<- Fin for

    System.out.println("");
    i=0; 
    Num1=0;   //Regresar todas las variables a su inicio para evitar errores
    Num2=1;
    Temp=0; 
    
    System.out.println("Serie con while");
    
    while(i<10){
     if(i<9){
       
	System.out.print(Num1 + ",");
	Temp = Num1 + Num2;
	Num1 = Num2;
	Num2 = Temp;
      
     }//<-Fin if
      else{
       System.out.print(Num1);
      }//<- Fin else
       i++;
    }//<- Fin while	

    System.out.println("");
    i=0; 
    Num1=0;   //Regresar todas las variables a su inicio para evitar errores
    Num2=1;
    Temp=0; 
    
    System.out.println("Serie con do-while");

   do{
       if(i<9){
       
	System.out.print(Num1 + ",");
	Temp = Num1 + Num2;
	Num1 = Num2;
	Num2 = Temp;
      
     }//<-Fin if
      else{
       System.out.print(Nun1);
      }//<- Fin else
       i++;
	 	
   }while(i<10); //Fin do-while
  }

}

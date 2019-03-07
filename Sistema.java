import java.util.Scanner;

public class Sistema{
    public static void main(String args[]){
         
     Scanner entrada = new Scanner(System.in);
      String nombre= "";
      int clave = 0, antiguedad = 0;

     System.out.println("********************************************************");
     System.out.println("*Bienvenido al sistema vacional de CiberKAFE S.A de C.V*");
     System.out.println("********************************************************");
     System.out.println("");
     System.out.println("");
     
     System.out.print("Ingresa Nombre Completo del Trabajador: ");
     nombre = entrada.nextLine();
     System.out.println("");

     System.out.print("Ingresa el tiempo de servicio que tiene el trabajador: ");
     antiguedad = entrada.nextInt();
     System.out.println("");

     System.out.print("Ingresa Clave del Trabajador: ");
     clave = entrada.nextInt();
     System.out.println("");


    if(clave == 1){
             if(antiguedad == 1){
                     System.out.println("Trabajador " + nombre + " tiene derecho a 6 dias de vacaciones.");
                 } else if(antiguedad >= 2 && antiguedad <= 6){
                     System.out.println("Trabajador " + nombre + " tiene derecho a 14 dias de vacaciones.");
                       } else if(antiguedad >= 7){
                     System.out.println("Trabajador " + nombre + " tiene derecho a 20 dias de vacaciones.");
                               }
         } else if(clave ==2){
              if(antiguedad == 1){
                     System.out.println("Trabajador " + nombre + " tiene derecho a 7 dias de vacaciones.");
                 } else if(antiguedad >= 2 && antiguedad <= 6){
                     System.out.println("Trabajador " + nombre + " tiene derecho a 15 dias de vacaciones.");
                       } else if(antiguedad >= 7){
                     System.out.println("Trabajador " + nombre + " tiene derecho a 22 dias de vacaciones.");
                               }
               } else if(clave == 3){
                    if(antiguedad == 1){
                       System.out.println("Trabajador " + nombre + " tiene derecho a 10 dias de vacaciones.");
                    } else if(antiguedad >= 2 && antiguedad <= 6){
                        System.out.println("Trabajador " + nombre + " tiene derecho a 20 dias de vacaciones.");
                            } else if(antiguedad >= 7){
                          System.out.println("Trabajador " + nombre + " tiene derecho a 30 dias de vacaciones.");
                               }
                       } else {
                             System.out.println("Clave de Departamento es Incorrecta!!!");
                               }
  }
}
//Sirve para organizar y agrupar paquetes de manera lógica, desde un código hasta elementos físicos y datos de red.
package views.landing;
//Sirve para importar funcionalidades, datos o código de un lugar de tu programa o sistema.
import java.util.Scanner;
// define si una clase es publica o privada para ser vista o extraida desde otro archivo.
public class LandingView {
    //define el acceso que restringe la visibilidad de un miembro a un archivo o a una clase.
      private int menu;
    //permite capturar textos, numeros u otros tipos de entrada durante la ejecucion.
       private Scanner sc = new Scanner(System.in);
   //constructor publico de la clase LandingView.                        
  public LandingView() {
//menu interactivo que se repite hasta que el ususario seleccione la opcion necesaria para cerrar sesión "0".
  do {
          //Sirve para mostrar información en la consola o terminal, ya sea texto         
        System.out.println("\n|-------------------------------------------------------------------|");
        System.out.println("|----------------------------- EMPRESA -----------------------------|");
        System.out.println("|-------------------------------------------------------------------|");
        System.out.println("    1. Iniciar SesiÃ³n");
        System.out.println("    2. Registrarse");
        System.out.println("    0. Salir");
        System.out.println("|-------------------------------------------------------------------|");
        System.out.print("|----- Seleccione una opciÃ³n: ");
       //Hace referencia a la opción del menú de la aplicación de desarrollo de software
         menu = sc.nextInt();            
        System.out.println("|-------------------------------------------------------------------|");
            
   //Sirve para iniciar programas (juegos y aplicaciones)
switch (menu) {
               
   //Sirve para especificar una condición dentro de una estructura de control de flujo                     
case 1:
        System.out.println("\n|-------------------------------------------------------------------|");
        System.out.println("|------------------------- INICIAR SESIÃ?N --------------------------|");
        System.out.println("|-------------------------------------------------------------------|");
//sirve para interrumpir y salir inmediatamente de un bucle
break;
case 2:                    
         System.out.println("\n|-------------------------------------------------------------------|");
         System.out.println("|--------------------------- REGISTRARSE ---------------------------|");
         System.out.println("|-------------------------------------------------------------------|");
break;
case 0:
         System.out.println("|----- Â¡Hasta Pronto! ...");
         System.out.println("|-------------------------------------------------------------------|");        
 break;
 // Es para indicar una opcion, un valor o comportamiento estandar 
 default:
         System.out.println("|----- Â¡OpciÃ³n No VÃ¡lida!");
         System.out.println("|-------------------------------------------------------------------|");
                    
    }
   //Sirve para crear un bucle que se ejecutará repetidamente mientras la variable menu no sea igual a cero                    
  } while (menu != 0);
 }
                          
    
}
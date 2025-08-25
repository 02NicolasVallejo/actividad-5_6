//Sirve para organizar y agrupar paquetes de manera lógica, desde un código hasta elementos físicos y datos de red.
package Views.dashboard;
//Sirve para importar funcionalidades, datos o código de un lugar de tu programa o sistema.
import java.util.Scanner;
// define si una clase es publica o privada para ser vista o extraida desde otro archivo.
public class DashboardView {
    //define el acceso que restringe la visibilidad de un miembro a un archivo o a una clase.
     private int menu;
     //permite capturar textos, numeros u otros tipos de entrada durante la ejecucion.
     private Scanner sc = new Scanner(System.in);
     //constructor publico de la clase DashboardView
     public DashboardView() {
         //menu interactivo que se repite hasta que el ususario seleccione la opcion necesaria para cerrar sesión "0".
         do {            
             //imprime el encabezado del menú
             System.out.println("\n|-------------------------------------------------------------------|");
             System.out.println("|---------------------------- DASHBOARD ----------------------------|");
             System.out.println("|-------------------------------------------------------------------|");
             System.out.println("    1. Gestión de Roles");
             System.out.println("    2. Gestión de Usuarios");
             System.out.println("    0. Cerrar Sesión");
             System.out.println("|-------------------------------------------------------------------|");
             System.out.print("|----- Seleccione una opción : ");
             //recibe la opción ingresada por el usuario.
             menu = sc.nextInt();            
             System.out.println("|-------------------------------------------------------------------|");
              //evalua la opción.         
             switch (menu) {
                 //especifica una condición dentro de la estructura de control de flujo.
                 case 1:
                     System.out.println("\n|-------------------------------------------------------------------|");
                     System.out.println("|------------------------ GESTIÓN DE ROLES -------------------------|");
                     System.out.println("|-------------------------------------------------------------------|");
                     //sirve para interrumpir y salir del bucle.
                     break;
                 case 2:
                     System.out.println("\n|-------------------------------------------------------------------|");
                     System.out.println("|---------------------- GESTIÓN DE USUARIOS ------------------------|");
                     System.out.println("|-------------------------------------------------------------------|");
                     break;
                 case 0:
                     System.out.println("|----- ¡Sesión Cerrada! ...");
                     System.out.println("|-------------------------------------------------------------------|");        
                     break;
                 //sirve para indicar un valor, opción o comportamiento.    
                 default:
                     System.out.println("|----- ¡Opción No Válida!");
                     System.out.println("|-------------------------------------------------------------------|");
             }
             //sirve para ejecutar el bucle hasta que su valor ingresado sea 0.
             
         } while (menu != 0);
        
     }
        
}


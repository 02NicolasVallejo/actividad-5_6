//Sirve para organizar y agrupar paquetes de manera l�gica, desde un c�digo hasta elementos f�sicos y datos de red.
package Views.dashboard;
//Sirve para importar funcionalidades, datos o c�digo de un lugar de tu programa o sistema.
import java.util.Scanner;
// define si una clase es publica o privada para ser vista o extraida desde otro archivo.
public class DashboardView {
    //define el acceso que restringe la visibilidad de un miembro a un archivo o a una clase.
     private int menu;
     //permite capturar textos, numeros u otros tipos de entrada durante la ejecucion.
     private Scanner sc = new Scanner(System.in);
     //constructor publico de la clase DashboardView
     public DashboardView() {
         //menu interactivo que se repite hasta que el ususario seleccione la opcion necesaria para cerrar sesi�n "0".
         do {            
             //imprime el encabezado del men�
             System.out.println("\n|-------------------------------------------------------------------|");
             System.out.println("|---------------------------- DASHBOARD ----------------------------|");
             System.out.println("|-------------------------------------------------------------------|");
             System.out.println("    1. Gesti�n de Roles");
             System.out.println("    2. Gesti�n de Usuarios");
             System.out.println("    0. Cerrar Sesi�n");
             System.out.println("|-------------------------------------------------------------------|");
             System.out.print("|----- Seleccione una opci�n : ");
             //recibe la opci�n ingresada por el usuario.
             menu = sc.nextInt();            
             System.out.println("|-------------------------------------------------------------------|");
              //evalua la opci�n.         
             switch (menu) {
                 //especifica una condici�n dentro de la estructura de control de flujo.
                 case 1:
                     System.out.println("\n|-------------------------------------------------------------------|");
                     System.out.println("|------------------------ GESTI�N DE ROLES -------------------------|");
                     System.out.println("|-------------------------------------------------------------------|");
                     //sirve para interrumpir y salir del bucle.
                     break;
                 case 2:
                     System.out.println("\n|-------------------------------------------------------------------|");
                     System.out.println("|---------------------- GESTI�N DE USUARIOS ------------------------|");
                     System.out.println("|-------------------------------------------------------------------|");
                     break;
                 case 0:
                     System.out.println("|----- �Sesi�n Cerrada! ...");
                     System.out.println("|-------------------------------------------------------------------|");        
                     break;
                 //sirve para indicar un valor, opci�n o comportamiento.    
                 default:
                     System.out.println("|----- �Opci�n No V�lida!");
                     System.out.println("|-------------------------------------------------------------------|");
             }
             //sirve para ejecutar el bucle hasta que su valor ingresado sea 0.
             
         } while (menu != 0);
        
     }
        
}


//Sirve para organizar y agrupar elementos de manera l�gica, desde c�digo en programaci�n hasta productos f�sicos y datos en redes
package views.modules.roles;
  //Sirve para traer o incorporar funcionalidades, datos o c�digo de un lugar externo a tu programa o sistema.
import java.util.Scanner;
//Sirve para definir una clase p�blica
public class RolesView {
             //Es un modificador de acceso que restringe la visibilidad de un miembro de una clase
    private int menu;
    //Sirve en Java para crear un objeto de la clase Scanner llamado sc que permite leer datos del teclado
private Scanner sc = new Scanner(System.in);
                
public RolesView() {

    //Se ejecuta un bloque de c�digo al menos una vez antes de evaluar una condici�n para determinar si debe repetirse                                              
do {
         //Sirve para mostrar informaci�n en la consola o terminal, ya sea texto                     
            System.out.println("\n|-------------------------------------------------------------------|");
            System.out.println("|------------------------ GESTI�N DE ROLES -------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("    1. Registrar Rol");
            System.out.println("    2. Listar Roles");
            System.out.println("    3. Actualizar Rol");
            System.out.println("    4. Eliminar Rol");
            System.out.println("    0. Cerrar Sesi�n");
            System.out.println("|-------------------------------------------------------------------|");
            System.out.print("|----- Seleccione una opci�n : ");
            //Hace referencia a la opci�n del men� de la aplicaci�n de desarrollo de software
            menu = sc.nextInt();            
            System.out.println("|-------------------------------------------------------------------|");
               
               //Sirve para iniciar programas (juegos y aplicaciones)
            switch (menu) {
    //Sirve para especificar una condici�n dentro de una estructura de control de flujo                                  
case 1:
            System.out.println("\n|-------------------------------------------------------------------|");
            System.out.println("|------------------------- REGISTRAR ROL ---------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
//Sirve para interrumpir y salir inmediatamente de un bucle
break;
case 2:
            System.out.println("\n|-------------------------------------------------------------------|");
            System.out.println("|------------------------- LISTAR ROLES ----------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
break;
case 3:
            System.out.println("\n|-------------------------------------------------------------------|");
            System.out.println("|------------------------- ACTUALIZAR ROL --------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
break;
case 4:
            System.out.println("\n|-------------------------------------------------------------------|");
            System.out.println("|-------------------------- ELIMINAR ROL ---------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
break;
case 0:
            System.out.println("|----- �Sesi�n Cerrada! ...");
            System.out.println("|-------------------------------------------------------------------|");        
break;
 // Es para indicar una opcion, un valor o comportamiento estandar 
default:
            System.out.println("|----- �Opci�n No V�lida!");
            System.out.println("|-------------------------------------------------------------------|");
                         
       }
       //Sirve para crear un bucle que se ejecutar� repetidamente mientras la variable menu no sea igual a cero                              
    } while (menu != 0);
                    
  }
     
    
}
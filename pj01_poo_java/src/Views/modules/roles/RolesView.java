//Sirve para organizar y agrupar elementos de manera lógica, desde código en programación hasta productos físicos y datos en redes
package views.modules.roles;
  //Sirve para traer o incorporar funcionalidades, datos o código de un lugar externo a tu programa o sistema.
import java.util.Scanner;
//Sirve para definir una clase pública
public class RolesView {
             //Es un modificador de acceso que restringe la visibilidad de un miembro de una clase
    private int menu;
    //Sirve en Java para crear un objeto de la clase Scanner llamado sc que permite leer datos del teclado
private Scanner sc = new Scanner(System.in);
                
public RolesView() {

    //Se ejecuta un bloque de código al menos una vez antes de evaluar una condición para determinar si debe repetirse                                              
do {
         //Sirve para mostrar información en la consola o terminal, ya sea texto                     
            System.out.println("\n|-------------------------------------------------------------------|");
            System.out.println("|------------------------ GESTIÓN DE ROLES -------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("    1. Registrar Rol");
            System.out.println("    2. Listar Roles");
            System.out.println("    3. Actualizar Rol");
            System.out.println("    4. Eliminar Rol");
            System.out.println("    0. Cerrar Sesión");
            System.out.println("|-------------------------------------------------------------------|");
            System.out.print("|----- Seleccione una opción : ");
            //Hace referencia a la opción del menú de la aplicación de desarrollo de software
            menu = sc.nextInt();            
            System.out.println("|-------------------------------------------------------------------|");
               
               //Sirve para iniciar programas (juegos y aplicaciones)
            switch (menu) {
    //Sirve para especificar una condición dentro de una estructura de control de flujo                                  
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
            System.out.println("|----- ¡Sesión Cerrada! ...");
            System.out.println("|-------------------------------------------------------------------|");        
break;
 // Es para indicar una opcion, un valor o comportamiento estandar 
default:
            System.out.println("|----- ¡Opción No Válida!");
            System.out.println("|-------------------------------------------------------------------|");
                         
       }
       //Sirve para crear un bucle que se ejecutará repetidamente mientras la variable menu no sea igual a cero                              
    } while (menu != 0);
                    
  }
     
    
}
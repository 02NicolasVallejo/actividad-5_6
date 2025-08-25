//Sirve para organizar y agrupar paquetes de manera lógica, desde un código hasta elementos físicos y datos de red.
package Routes;
//Sirve para importar funcionalidades, datos o código de un lugar de tu programa o sistema.
import Controllers.DashboardController;
// define si una clase es publica o privada para ser vista o extraida desde otro archivo.
public class RouterControllers {
    //define el acceso que restringe la visibilidad de un miembro a un archivo o a una clase.
     private DashboardController dashboardController;
     //define el acceso que permite la visibilidad a un miembro al archivo o a una clase.   
     public RouterControllers() {
         //Se crea una nueva instancia de la clase DashboardController, que representa la vista del panel principal.
     dashboardController = new DashboardController();
     
     }
    
}

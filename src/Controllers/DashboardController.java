//Sirve para organizar y agrupar paquetes de manera l�gica, desde un c�digo hasta elementos f�sicos y datos de red.
package Controllers;
//Sirve para importar funcionalidades, datos o c�digo de un lugar de tu programa o sistema.
import Views.dashboard.DashboardView;
// define si una clase es publica o privada para ser vista o extraida desde otro archivo.
public class DashboardController {
    //define el acceso que restringe la visibilidad de un miembro a un archivo o a una clase.
    private DashboardView dashboardView;
    //define el acceso que permite la visibilidad a un miembro al archivo o a una clase.
    public DashboardController() {
         //Se crea una nueva instancia de la clase DashboardView, que representa la vista del panel principal.
        dashboardView = new DashboardView();
        
    }
    
}

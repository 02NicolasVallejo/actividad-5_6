//Sirve para organizar y agrupar paquetes de manera lógica, desde un código hasta elementos físicos y datos de red.
package controllers;
//Sirve para importar funcionalidades, datos o código de un lugar de tu programa o sistema.
 import views.landing.LandingView;
// define si una clase es publica o privada para ser vista o extraida desde otro archivo.
public class LandingController {
        //define el acceso que restringe la visibilidad de un miembro a un archivo o a una clase.
     private LandingView landingView;
     //define el acceso que permite la visibilidad a un miembro al archivo o a una clase.
     public LandingController() {
    //Se crea una nueva instancia de la clase LandingView, que representa la vista del panel principal.
  landingView = new LandingView();
       
  }
    
}

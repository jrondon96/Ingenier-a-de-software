
package Controlador; 
import Modelo.Obra;
import Modelo.PuntoDeInteres;
import Vista.IAdministracion;
import Vista.IBienvenida;
import java.util.ArrayList; 
import javax.swing.JFrame;
import Vista.*;

    /* Clase CtrlControladora su funcion es administrar todas las interfaces del programa*/

public class CtrlControlador {  
    
    private IBienvenida bienvenida;      
    private IBienvenidaVisitante bienvenidavisitante;
    private IAdministracion administracion;  
    private IAdministracionO administracionO;
    private IAdministracionTV administraciontv; 
    private IAdministracionPI administracionpi;  
    private IAgregarO agregarO; 
    private IModificarO modificarO;
    private IEliminarO eliminarO;
    private ICrearTV creartv; 
    private IModificarTV modificartv; 
    private IEliminarTV eliminartv; 
    private ICrearPI crearpi; 
    private IModificarPI modificarpi; 
    private IEliminarPI eliminarpi;
       
    
    private CtrlControlador() {
    } 
    
    private static final CtrlControlador unicaInstancia = new CtrlControlador();

     
    public static CtrlControlador getInstancia() {              /*Implementacion de la unica instancia del singlenton*/
        return unicaInstancia;                        
    }
    
    public void comenzar(){                                     /*Se inicializa y se muestra la interfaz de la Bienvenida*/                             
       bienvenida = new IBienvenida();
       bienvenida.setVisible(true);
    } 
    
    public void opcionSeleccionada(String proximaInterfaz,JFrame interfazActual){
        
        switch(proximaInterfaz){                                /*Switch para el manejo de todos las interfaces*/
            
            case "bienvenida":                                  /*Caso para activar la interfaz de bienvenida*/
                interfazActual.setVisible(false);
                bienvenida = new IBienvenida();
                bienvenida.setVisible(true);
                break;
            
                
            case "Administracion":                              /*Caso para activar la interfaz del Panel de Administracion*/
                
               interfazActual.setVisible(false);
               administracion = new IAdministracion();
               administracion.setVisible(true); 
               break; 
                
            case "AdministracionO":                             /*Caso para activar la interfaz de la administracion de Obras*/
               interfazActual.setVisible(false);
               administracionO = new IAdministracionO();
               administracionO.setVisible(true); 
               break;
                
            case "AdministracionTV":                            /*Caso para activar la interfaz de administracion de Tours Viruales*/
               interfazActual.setVisible(false);
               administraciontv = new IAdministracionTV();
               administraciontv.setVisible(true); 
               break; 
               
                
            case "AdministracionPI":  
               interfazActual.setVisible(false);
               administracionpi = new IAdministracionPI();      /*Caso para activar la interfaz de administracion de Punto de Interes*/
               administracionpi.setVisible(true); 
               break;
                
            case "CrearTV": 
               interfazActual.setVisible(false);                /*Caso para activar la interfaz de Crear Tour Virtual*/
               creartv = new ICrearTV();
               creartv.setVisible(true);
               break; 
                
            case "ModificarTV":                                 /*Caso para activar la interfaz de Modificar Tour Virtual*/
               interfazActual.setVisible(false);
               modificartv = new IModificarTV();
               modificartv.setVisible(true);
               break; 
                
            case "EliminarTV":                                  /*Caso para activar la interfaz de Eliminar Tour Virtual*/
               interfazActual.setVisible(false);
               eliminartv = new IEliminarTV();
               eliminartv.setVisible(true);
                
                
                break; 
                
            case "CrearPI":                                     /*Caso para activar la interfaz de Crear Punto de Interes*/ 
               interfazActual.setVisible(false);
               crearpi = new ICrearPI();
               crearpi.setVisible(true);
                
                break; 
            
            case "ModificarPI":                                 /*Caso para activar la interfaz de Modificar Punto de Interes*/
               interfazActual.setVisible(false);
               modificarpi = new IModificarPI();
               modificarpi.setVisible(true);
                
                break;  
                
            case "EliminarPI":                                  /*Caso para activar la interfaz de Eliminar Punto de Interes*/
                interfazActual.setVisible(false);
                eliminarpi = new IEliminarPI();
                eliminarpi.setVisible(true);
                
                break;
            
            case "agregarO":                                    /*Caso para activar la interfaz de Agregar Obra*/ 
               interfazActual.setVisible(false);
               agregarO = new IAgregarO();
               agregarO.setVisible(true);
                
                break; 
            
            case "ModificarO":                                  /*Caso para activar la interfaz de Modificar Obra*/  
               interfazActual.setVisible(false);
               modificarO= new IModificarO();
               modificarO.setVisible(true);
                
               break; 
                 
            case "EliminarO":                                   /*Caso para activar la interfaz de Eliminar Obra*/ 
                interfazActual.setVisible(false);
                eliminarO= new IEliminarO();
                eliminarO.setVisible(true);
                
                break; 
                       
            case "Visitante":    /* INTERFACES DEL VISITANTE DESAHABILITADAS POR QUE NO SE TRABAJARA CON ELLAS*/                                 
                interfazActual.setVisible(false);
                bienvenidavisitante= new IBienvenidaVisitante();
                bienvenidavisitante.setVisible(true);
                
                break;  
                   
                
            default:  
                
                break;
    }
                   
        
    }
    
    public void finalizar(int s){
        System.exit(s);
    }
    
   public static void main(String[] args) {  
       unicaInstancia.comenzar(); 
       
    }
}

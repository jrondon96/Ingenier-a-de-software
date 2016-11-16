
package Controlador; 
import Modelo.Obra;
import Modelo.PuntoDeInteres;
import Vista.IAdministracion;
import Vista.IBienvenida;
import java.util.ArrayList; 
import javax.swing.JFrame;
import Vista.*;


public class CtrlControlador {  
    
    private IBienvenida bienvenida; 
    private IAdministracion administracion;  
    private IAdministracionO administracionO;
    private IAdministracionTV administraciontv; 
    private IAdministracionPI administracionpi;  
    private IAgregarO crearO; 
    private IModificarO modificarO;
    private ICrearTV creartv; 
    private IModificarTV modificartv; 
    private ICrearPI crearpi; 
    private IModificarPI modificarpi; 
       
    
    
    
    
    private CtrlControlador() {
    } 
    
    private static final CtrlControlador unicaInstancia = new CtrlControlador();

    private ArrayList <Obra> obrasArray= new ArrayList <Obra> ();  
    private ArrayList <PuntoDeInteres> puntoDeInteresArray= new ArrayList <PuntoDeInteres> (); 

    public ArrayList<PuntoDeInteres> getPuntoDeInteresArray() {
        return puntoDeInteresArray;
    }

    public static CtrlControlador getInstancia() {
        return unicaInstancia;
    }

    public ArrayList<Obra> getObrasArray() {
        return obrasArray;
    } 

      
    public void comenzar(){
       bienvenida = new IBienvenida();
       bienvenida.setVisible(true);
    } 
    
    public void opcionSeleccionada(String proximaInterfaz,JFrame interfazActual){
        
        switch(proximaInterfaz){
            
            case "bienvenida": 
                interfazActual.setVisible(false);
                bienvenida = new IBienvenida();
                bienvenida.setVisible(true);
                break;
            
         
            case "Administracion":  
                
               interfazActual.setVisible(false);
               administracion = new IAdministracion();
               administracion.setVisible(true); 
              
                
                break; 
                
            case "AdministracionO": 
               interfazActual.setVisible(false);
               administracionO = new IAdministracionO();
               administracionO.setVisible(true); 
             
                break;
                
            case "AdministracionTV": 
               interfazActual.setVisible(false);
               administraciontv = new IAdministracionTV();
               administraciontv.setVisible(true); 
             
                break; 
               
                
            case "AdministracionPI":  
               interfazActual.setVisible(false);
               administracionpi = new IAdministracionPI();
               administracionpi.setVisible(true); 

                break;
                
            case "CrearTV": 
               interfazActual.setVisible(false);
               creartv = new ICrearTV();
               creartv.setVisible(true);
                
                break; 
                
            case "ModificarTV": 
               interfazActual.setVisible(false);
               modificartv = new IModificarTV();
               modificartv.setVisible(true);
                
                break; 
                
            case "EliminarTV":
                
                break; 
                
            case "CrearPI": 
               interfazActual.setVisible(false);
               crearpi = new ICrearPI();
               crearpi.setVisible(true);
                
                break; 
            
            case "ModificarPI": 
               interfazActual.setVisible(false);
               modificarpi = new IModificarPI();
               modificarpi.setVisible(true);
                
                break;  
                
            case "EliminarPI":
                
                break;
            
            case "CrearO": 
               interfazActual.setVisible(false);
               crearO = new IAgregarO();
               crearO.setVisible(true);
                
                break; 
            
            case "ModificarO": 
               interfazActual.setVisible(false);
               modificarO= new IModificarO();
               modificarO.setVisible(true);
                
               break; 
                 
            case "EliminarO":
                
                break; 
                       
            case "Visitante":
               break;  
                
            case "ConsultarTV":
                
                break; 
                
            case "Recorrer":
                
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

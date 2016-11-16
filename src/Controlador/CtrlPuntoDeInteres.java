
package Controlador;

import Modelo.PuntoDeInteres;
import java.util.ArrayList;


public class CtrlPuntoDeInteres {
     
    private static final CtrlPuntoDeInteres unicaInstancia = new CtrlPuntoDeInteres();
    
    private ArrayList <PuntoDeInteres> puntoDeInteresArray= new ArrayList <PuntoDeInteres> (); 

    public ArrayList<PuntoDeInteres> getPuntoDeInteresArray() {
        return puntoDeInteresArray;
    } 
    
     public static CtrlPuntoDeInteres getInstancia() {
        return unicaInstancia;
    }
    
}

package Controlador;

import Modelo.PuntoDeInteres;
import java.util.ArrayList;

/*Clase CtrlPuntoDeInteres se encarga de controlar lo referente a los puntos de interes*/

public class CtrlPuntoDeInteres{
     
    private static final CtrlPuntoDeInteres unicaInstancia = new CtrlPuntoDeInteres(); /*Singlenton*/
    
    private ArrayList <PuntoDeInteres> puntoDeInteresArray= new ArrayList <PuntoDeInteres> (); /*Array donde se almacenan los puntos de interes existente*/

    public ArrayList<PuntoDeInteres> getPuntoDeInteresArray(){     
        return puntoDeInteresArray;
    } 
    
     public static CtrlPuntoDeInteres getInstancia() {
        return unicaInstancia;
    }
    
}

package Controlador;

import Modelo.Obra;
import java.util.ArrayList;

    /* Clase CtrlObras se encarga de hacer la unica instancia del arreglo de obras. */ 

public class CtrlObras { 
    private static final CtrlObras unicaInstancia = new CtrlObras();
    
    private ArrayList <Obra> obrasArray= new ArrayList <Obra> ();   /*Array que contiene todas las obras del programa*/
    
    public ArrayList<Obra> getObrasArray() {
        return obrasArray;
    } 
    
    public static CtrlObras getInstancia() {    /*Implementacion de la unica instancia del singlenton para las obras*/
        return unicaInstancia;
    }
    
}

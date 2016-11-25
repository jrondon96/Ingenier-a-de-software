package Controlador;


import Modelo.TourVirtual;
import java.util.ArrayList;

/*Se encarga de implementar la unica instancia y contralar el arreglo de Tours Virtuales*/
public class CtrlTourVirtual { 
    
    private static final CtrlTourVirtual unicaInstancia = new CtrlTourVirtual(); /*Singleton*/
    
    
    private ArrayList <TourVirtual> toursVirtualesArray= new ArrayList <TourVirtual>();    /*Array para los tours virutales */ 

    public static CtrlTourVirtual getInstancia() {
        return unicaInstancia;
    }

    public ArrayList<TourVirtual> getToursVirtualesArray() {
        return toursVirtualesArray;
    }  
}

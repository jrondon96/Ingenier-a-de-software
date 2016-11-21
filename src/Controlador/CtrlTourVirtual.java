package Controlador;


import Modelo.TourVirtual;
import java.util.ArrayList;


public class CtrlTourVirtual { 
    
    private static final CtrlTourVirtual unicaInstancia = new CtrlTourVirtual(); 
    
    
    private ArrayList <TourVirtual> toursVirtualesArray= new ArrayList <TourVirtual>(); 

    public static CtrlTourVirtual getInstancia() {
        return unicaInstancia;
    }

    public ArrayList<TourVirtual> getToursVirtualesArray() {
        return toursVirtualesArray;
    }  
}

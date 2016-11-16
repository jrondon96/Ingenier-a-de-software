package Controlador;

import Modelo.Obra;
import java.util.ArrayList;

public class CtrlObras { 
    private static final CtrlObras unicaInstancia = new CtrlObras();
    
    private ArrayList <Obra> obrasArray= new ArrayList <Obra> (); 
    
    public ArrayList<Obra> getObrasArray() {
        return obrasArray;
    } 
    
    public static CtrlObras getInstancia() {
        return unicaInstancia;
    }
    
}

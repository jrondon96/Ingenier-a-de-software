package Modelo; 

import java.util.ArrayList;

/*Clase contiene los atributos metodos set y get a utilizar para los puntos de interes*/

public class PuntoDeInteres {
    
    private String identificador;
    private String nombre; 
    private String disponibilidad; 
    private ArrayList <Obra> obrasPuntoDeInteresArray = new ArrayList <Obra> ();  /*Array donde se guardan las obras asociadas a cada punto de interes*/
    
   /*Constructor de la clase*/
    
    public PuntoDeInteres(String identificador, String nombre, String disponibilidad, ArrayList<Obra> obrasPuntoDeInteresArray) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.disponibilidad = disponibilidad;
        this.obrasPuntoDeInteresArray = obrasPuntoDeInteresArray;
    } 
    /*--------------------------------------------------------Metodos set y get----------------------------------------------------*/
    
    public ArrayList<Obra> getObrasPuntoDeInteresArray() {
        return obrasPuntoDeInteresArray;
    }
    
    public void setObrasPuntoDeInteresArray(ArrayList<Obra> ObrasPuntoDeInteresArray){
       this.obrasPuntoDeInteresArray = ObrasPuntoDeInteresArray;
    }

    public String getIdentificador() {
        return identificador;
    }
    
    public void setIdentificador(String Identificador){
      this.identificador = Identificador;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String Nombre){
        this.nombre = Nombre;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }
    
    public void setDisponibilidad(String Disponibilidad){
       this.disponibilidad = Disponibilidad;
    }
}
    
    


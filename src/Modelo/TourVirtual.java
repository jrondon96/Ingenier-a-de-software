package Modelo;

import java.util.ArrayList;


public class TourVirtual { 
    
    private String identificador;
    private String nombre; 
    private String disponibilidad; 
    private ArrayList <PuntoDeInteres> TourspuntoDeInteresArray= new ArrayList <PuntoDeInteres>();   

    public TourVirtual(String identificador, String nombre, String disponibilidad, ArrayList<PuntoDeInteres> TourspuntoDeInteresArray) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.disponibilidad = disponibilidad;
        this.TourspuntoDeInteresArray = TourspuntoDeInteresArray;
    } 

    public String getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public ArrayList<PuntoDeInteres> getTourspuntoDeInteresArray() {
        return TourspuntoDeInteresArray;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }   
    public void setTourspuntoDeInteresArray(ArrayList <PuntoDeInteres> tourspuntoDeInteresArray) {
        this.TourspuntoDeInteresArray = tourspuntoDeInteresArray;
    }
}

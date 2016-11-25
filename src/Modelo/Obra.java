/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Jesus Antonio
 */

/*Clase obra contiene todos los atributos metodos set y get de las obra*/

public class Obra { 
    
    private String idObra;                       
    private String tituloObra;  
    private String autorObra; 
    private String añoCreacionObra; 
    private String ubicacionObra; 
    private String descripcionObra;
    private String imagenObra;  
    
    /*Constructor de la clase Obra*/
    
    public Obra(String idObra, String autorObra, String tituloObra, String añoCreacionObra, String ubicacionObra, String descripcionObra) {
        this.idObra = idObra;
        this.autorObra = autorObra;
        this.tituloObra = tituloObra;
        this.añoCreacionObra = añoCreacionObra;
        this.ubicacionObra = ubicacionObra;
        this.descripcionObra = descripcionObra;
       
    }
    
   /*................................................ Metodos set y get .............................................................*/ 
    public String getImagenObra() {
        return imagenObra;
    }

    public void setImagenObra(String imagenObra) {
        this.imagenObra = "/imagenes/"+idObra+".jpg";;
    }
   
    public void setIdObra(String IdObra){
        this.idObra = IdObra; 
    }
    public String getIdObra() {
        return idObra;
    }
    
    public void setTituloObra(String TituloObra){
       this.tituloObra = TituloObra; 
    }
   
    public String getTituloObra() {
        return tituloObra;
    }
    
    public void setAutorObra(String AutorObra){
        this.autorObra = AutorObra;
    }

    public String getAutorObra() {
        return autorObra;
    }
    
    public void setAñoCreacionObra(String AñoCreacionObra){
        this.añoCreacionObra =  AñoCreacionObra;
    }
    public String getAñoCreacionObra() {
        return añoCreacionObra;
    }
    public void setUbicacionObra(String UbicacionObra){
        this.ubicacionObra = UbicacionObra;
    }
    public String getUbicacionObra() {
        return ubicacionObra;
    }
    public void setDescripcionObra(String DescripcionObra){
        this.descripcionObra = DescripcionObra;
    }
    
    public String getDescripcionObra() {
        return descripcionObra;
    }
}

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
public class Obra { 
    
    private String idObra; 
    private String tituloObra;  
    private String autorObra; 
    private String añoCreacionObra; 
    private String ubicacionObra; 
    private String descripcionObra;
    private String imagenObra;  

    public Obra(String idObra, String autorObra, String tituloObra, String añoCreacionObra, String ubicacionObra, String descripcionObra) {
        this.idObra = idObra;
        this.autorObra = autorObra;
        this.tituloObra = tituloObra;
        this.añoCreacionObra = añoCreacionObra;
        this.ubicacionObra = ubicacionObra;
        this.descripcionObra = descripcionObra;
       
    }
    
    public String getImagenObra() {
        return imagenObra;
    }

    public void setImagenObra(String imagenObra) {
        this.imagenObra = "/imagenes/"+idObra+".jpg";;
    }
   

    public String getIdObra() {
        return idObra;
    }

    public String getTituloObra() {
        return tituloObra;
    }

    public String getAutorObra() {
        return autorObra;
    }

    public String getAñoCreacionObra() {
        return añoCreacionObra;
    }

    public String getUbicacionObra() {
        return ubicacionObra;
    }

    public String getDescripcionObra() {
        return descripcionObra;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Andrés Ospina
 */
public class C_Valoracion {
    
    private String Fecha;
    private String MedidadeUsabilidad;
    
    //Constructores

    public C_Valoracion(String Fecha, String MedidadeUsabilidad) {
        this.Fecha = Fecha;
        this.MedidadeUsabilidad = MedidadeUsabilidad;
    }

    public C_Valoracion() {
    }
    
    //Get y Set

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getMedidadeUsabilidad() {
        return MedidadeUsabilidad;
    }

    public void setMedidadeUsabilidad(String MedidadeUsabilidad) {
        this.MedidadeUsabilidad = MedidadeUsabilidad;
    }
    
    // To String

    @Override
    public String toString() {
        return "C_Valoraciones{" + "Fecha=" + Fecha + ", MedidadeUsabilidad=" + MedidadeUsabilidad + '}';
    }
    
    
    
    
    
        

}// Fin de la clase valoraciones

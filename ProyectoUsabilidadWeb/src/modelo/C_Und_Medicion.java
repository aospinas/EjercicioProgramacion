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
public class C_Und_Medicion {

    String id_und;
    String Descripcion;
    double Valoracion;
//-----------------------------------------------------------------------------
// Constructores

    public C_Und_Medicion(String id_und, String Descripcion, double Valoracion) {
        this.id_und = id_und;
        this.Descripcion = Descripcion;
        this.Valoracion = Valoracion;
    }

    public C_Und_Medicion() {
    }

//----------------------------------------------------------------------------------
// Get y Set    
    public String getId_und() {
        return id_und;
    }

    public void setId_und(String id_und) {
        this.id_und = id_und;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public double getValoracion() {
        return Valoracion;
    }

    public void setValoracion(double Valoracion) {
        this.Valoracion = Valoracion;
    }

//---------------------------------------------------------------------
// To string    
    @Override
    public String toString() {
        return "C_Und_Medicion{" + "id_und=" + id_und + ", Descripcion=" + Descripcion + ", Valoracion=" + Valoracion + '}';
    }
}//Fin de clase de unidad de medicion

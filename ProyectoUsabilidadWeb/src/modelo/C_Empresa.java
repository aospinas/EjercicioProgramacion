/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Andrés Ospina
 */
public class C_Empresa {

    String Nombre;
    String RepLegal;
    String Direccion;
    String Telefono;
    ArrayList <C_SitioWeb> sitiosWeb;

    //Constructor

    public C_Empresa(String Nombre, String RepLegal, String Direccion, String Telefono, ArrayList<C_SitioWeb> sitiosWeb) {
        this.Nombre = Nombre;
        this.RepLegal = RepLegal;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.sitiosWeb = sitiosWeb;
    }

  


    // Constructor vacio
    public C_Empresa() {
    }

    // Metodos Get y Set
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getRepLegal() {
        return RepLegal;
    }

    public void setRepLegal(String RepLegal) {
        this.RepLegal = RepLegal;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
//-----------------------------------------------------------------------------
    // To string

    @Override
    public String toString() {
        return "C_Empresa{" + "Nombre=" + Nombre + ", RepLegal=" + RepLegal + ", Direccion=" + Direccion + ", Telefono=" + Telefono + '}';
    }

}// Fin de la clase Empresa

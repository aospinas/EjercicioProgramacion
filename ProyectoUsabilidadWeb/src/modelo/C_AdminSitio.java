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
public class C_AdminSitio {

    String Nombre;
    String Telefono;
    String correo;
// Constructores

    public C_AdminSitio(String Nombre, String Telefono, String correo) {
        this.Nombre = Nombre;
        this.Telefono = Telefono;
        this.correo = correo;
    }
// Constructor vacio

    public C_AdminSitio() {
    }
// Metodos get y set

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    // To string
    @Override
    public String toString() {
        return "C_AdminSitio{" + "Nombre=" + Nombre + ", Telefono=" + Telefono + ", correo=" + correo + '}';
    }
}//Fin de la clase Admin Sitio

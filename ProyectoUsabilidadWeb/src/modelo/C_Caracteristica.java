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
public class C_Caracteristica extends C_Und_Medicion{
    
    private C_Componente componente;

    public C_Caracteristica(String id_und, String Descripcion, double Valoracion) {
        super(id_und, Descripcion, Valoracion);
    }

    public C_Caracteristica() {
    }
    
    
    
    
}

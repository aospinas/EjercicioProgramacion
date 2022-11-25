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
public class C_Componente extends C_Und_Medicion {

    ArrayList<C_ElemMedic> elementos;

// Constructores
    public C_Componente(String id_und, String Descripcion, double Valoracion) {
        super(id_und, Descripcion, Valoracion);
        elementos = new ArrayList<>();
    }

    public C_Componente() {
        elementos = new ArrayList();
    }

    public C_Componente(ArrayList<C_ElemMedic> elementos, String id_und, String Descripcion, double Valoracion) {
        super(id_und, Descripcion, Valoracion);
        this.elementos = elementos;
    }

    // get y set
    public ArrayList<C_ElemMedic> getElementos() {
        return elementos;
    }

    public void setElementos(ArrayList<C_ElemMedic> elementos) {
        this.elementos = elementos;
    }

    // CRUD
    // Buscar
    public int buscar(String idBuscar) {

        int pos = -1, i = 0;

        if (!getElementos().isEmpty()) {

            while (((i < getElementos().size()))
                    && (!idBuscar.equals(getElementos().get(i).id_und))) {
                i++;
            }
            pos = i;
            if (pos == getElementos().size()) {
                pos = -1;

            }
        }

        return pos;

    }

    public boolean InsertarNoRepetidos(C_ElemMedic nObjElem) {
        //precondicion: Objeto de tipo empleado
        // poscondicion: Retorna verdadero si se puede insertar  
        //               Retorna falso si existe uno repetido
        boolean exito = false;

        if (getElementos().isEmpty()) {
            getElementos().add(nObjElem);
            exito = true;

        } else {//que el arreglo posee datos
            int pos = buscar(nObjElem.id_und);
            if (pos == 1) {
                getElementos().add(nObjElem);
                exito = true;
            }//fin de verificar si el elemento existe
        }//fin de verificar si el arreglo tiene datos

        return exito;

    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectousabilidadweb;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.C_Empresa;

/**
 *
 * @author Andrés Ospina
 */
public class ProyectoUsabilidadWeb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JOptionPane.showConfirmDialog(null, "Bienvenido al sistema para calificar pàginas web \n ¿Desea continuar?");
        
        //Variables de entrada empresa
        String NombreEmpresa;
        String RepLegalEmpresa;
        String DireccionEmpresa;
        String TelefonoEmpresa;
        
        //Salida desde emprsa ANtiguo terminal People  Julian 8888888
                
        
        //Variables de entrada pàgina web
        String URLPaginaWebEmpresa="";
        String CUIPaginaWebEmpresa;
        String DescripPaginaWebEmpresa;
        String EmpresaPaginaWebEmpresa;
        int CantidadDePaginas;
        
        //Variables de entrada administrador
        ArrayList Admin_Sitio = new ArrayList();
        
        
        
        //Pedimos datos de ingreso 
//        NombreEmpresa = JOptionPane.showInputDialog("Por favor ingrese el nombre de la empresa: ");
//        RepLegalEmpresa = JOptionPane.showInputDialog("Por favor ingrese el nombre del representante legal de la empresa: ");
//        DireccionEmpresa = JOptionPane.showInputDialog("Por favor ingrese la dirección de la empresa: ");
//        TelefonoEmpresa = JOptionPane.showInputDialog("Por favor ingrese el nuero de la empresa de la empresa: ");
        CantidadDePaginas = Integer.parseInt(JOptionPane.showInputDialog("Cuantas páginas va a calificar:"));
        for (int i = 0; i < CantidadDePaginas; i++) {
            
            URLPaginaWebEmpresa = JOptionPane.showInputDialog("Ingrese la url de la web: ");
            
        };
        System.out.println(" "+URLPaginaWebEmpresa);
        
//        C_Empresa c_empresa = new C_Empresa(NombreEmpresa, RepLegalEmpresa, DireccionEmpresa, TelefonoEmpresa);
//        
//        C_Sitio c_empresa = new C_Empresa(NombreEmpresa, RepLegalEmpresa, DireccionEmpresa, TelefonoEmpresa);
//        
//        C_Empresa c_empresa = new C_Empresa(NombreEmpresa, RepLegalEmpresa, DireccionEmpresa, TelefonoEmpresa);
    }// Fin del main
    
}//Fin del proyecto

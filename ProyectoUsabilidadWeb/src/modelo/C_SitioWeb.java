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
public class C_SitioWeb {

    private String URL;
    private String CUI;
    private String Descrip;
    private String Empresa;
    private C_AdminSitio Administrador;
    private C_Valoracion valoraciones;

    //---------------------------------------------------------------------
    // Constructores

    public C_SitioWeb(String URL, String CUI, String Descrip, String Empresa, C_AdminSitio Administrador, C_Valoracion valoraciones) {
        this.URL = URL;
        this.CUI = CUI;
        this.Descrip = Descrip;
        this.Empresa = Empresa;
        this.Administrador = Administrador;
        this.valoraciones = valoraciones;
    }
 

    public C_SitioWeb() {
    }

    //---------------------------------------------------------------------
    // set y get
    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getCUI() {
        return CUI;
    }

    public void setCUI(String CUI) {
        this.CUI = CUI;
    }

    public String getDescrip() {
        return Descrip;
    }

    public void setDescrip(String Descrip) {
        this.Descrip = Descrip;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
    }

    //-----------------------------------------------------------------------
    // To string 
    @Override
    public String toString() {
        return "C_SitioWeb{" + "URL=" + URL + ", CUI=" + CUI + ", Descrip=" + Descrip + ", Empresa=" + Empresa + '}';
    }

}// Fin de la clase Sitio Web

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sena
 */
public class persona {
    public int edad;
    public String nombre;
    public String id;
    public String tipoDocumento;
    
    public void setEdad (int edadParametro){
    this.edad=edadParametro;
    }
    public int getEdad(){
    return this.edad;
    }
    public void setNombre (String nombreParametro){
        this.nombre=nombreParametro;
    }   
    public String getNombre(){
        return this.nombre;
    }
    public void setId ( String idParametro){
        this.id=idParametro;
    }
    public String getId(){
        return this.id;
    }
    public void settipoDocumento (String tipoDocumentoParametro){
        this.tipoDocumento=tipoDocumentoParametro;
    }
    public String gettipoDocumento (){
        return this.tipoDocumento;
    }
}
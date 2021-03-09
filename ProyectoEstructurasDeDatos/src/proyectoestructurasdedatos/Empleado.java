/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoestructurasdedatos;

/**
 *
 * @author santiago
 */
public class Empleado {
    private String codigo;
    private final String nombres;
    private final String apellidos;
    private String direccion;
    private String correo;
    private String numTelf;
    
    public Empleado(String codigo, String nombres, String apellidos, String direccion, String correo, String numTelf){
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.correo = correo;
        this.numTelf = numTelf;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumTelf() {
        return numTelf;
    }

    public void setNumTelf(String numTelf) {
        this.numTelf = numTelf;
    }
    
    public static boolean esCodigoValido(String codigo) {
        return codigo.matches("[1-5][0-4]\\-([0-9]{4})");
    }


    // Método para cambiar el segundo dígito del código cuando haya cambio
    // de sucursal
    
    public void cambiarCodigoSucursal(String num){
        
    }

    @Override
    public String toString() {
        return "Empleado: "+nombres+" "+apellidos+"\n"+
               "Código: "+codigo+"\n"+
               "Dirección: "+direccion+"\n"+
               "Correo: "+correo+"\n"+
               "Número de teléfono: "+numTelf+"\n";
    }
    
    
}

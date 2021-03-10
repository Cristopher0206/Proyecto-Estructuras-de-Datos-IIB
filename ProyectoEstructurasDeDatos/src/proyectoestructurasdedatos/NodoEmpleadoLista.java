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
public class NodoEmpleadoLista {
    private Empleado info;
    private NodoEmpleadoLista adelante;
    private NodoEmpleadoLista atras;
    
    public NodoEmpleadoLista(Empleado empleado){
        this.info = empleado;
        this.adelante = null;
        this.atras = null;
    }
    
    public NodoEmpleadoLista(Empleado empleado, NodoEmpleadoLista adelante, NodoEmpleadoLista atras){
        this.info = empleado;
        this.adelante = adelante;
        this.atras = atras;
    }

    public Empleado getInfo() {
        return info;
    }

    public void setInfo(Empleado info) {
        this.info = info;
    }

    public NodoEmpleadoLista getAdelante() {
        return adelante;
    }

    public void setAdelante(NodoEmpleadoLista adelante) {
        this.adelante = adelante;
    }

    public NodoEmpleadoLista getAtras() {
        return atras;
    }

    public void setAtras(NodoEmpleadoLista atras) {
        this.atras = atras;
    }

    
    
    
}

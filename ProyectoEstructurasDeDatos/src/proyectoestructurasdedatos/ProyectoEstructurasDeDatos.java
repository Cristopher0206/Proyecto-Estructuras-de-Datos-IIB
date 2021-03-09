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
public class ProyectoEstructurasDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        String codigo = "10-0001";
        String nombres = "Cristopher Santiago";
        String apellidos = "Pérez Nieto";
        String direccion = "Pepito Delgado xd";
        String correo = "cristopher.perez@epn.edu.ec";
        String numTelf = "0998516975";
        
        
        Empleado emp = new Empleado(codigo, nombres, apellidos, direccion, correo, numTelf);
        
        boolean esCodigoValido = Empleado.esCodigoValido(emp.getCodigo());
        if(esCodigoValido){
            System.out.println("El código es válido");
        }else{
            System.out.println("El código no es válido");
        }
*/
        /*
        ArregloEmpleados sucursal1 = new ArregloEmpleados(1);
        
        sucursal1.insertarEmpleado("Cristopher Santiago Pérez Nieto");
        sucursal1.insertarEmpleado("Ariel Thomás Rosero Peñaherrera");
        sucursal1.insertarEmpleado("Bryan Fernando Cedeño Mendoza");
        
        sucursal1.mostrarEstructura();
*/
        TablaHashEnlazadaEmpleados tabla = new TablaHashEnlazadaEmpleados();
        
        tabla.insertar(1, "10-0001");
        tabla.insertar(2, "10-0002");
        tabla.insertar(3, "10-0003");
        tabla.insertar(4, "10-0004");
        
        System.out.println(tabla.getNodoEmpleado(0));
        
        TablaHashEnlazadaEmpleados tablaAuxiliar = new TablaHashEnlazadaEmpleados();
        
        for(int i = 0; i < 4; i++){
            NodoEmpleado aux = tabla.getNodoEmpleado(i);
            int salida = 1;
            do{
                if(aux.enlace != null){
                    String codAux = aux.getCodigo();
                    int posicion = i+1;
                    tablaAuxiliar.insertar(posicion, codAux);
                    aux = aux.getEnlace();
                }else{
                    String codAux = aux.getCodigo();
                    int posicion = i+1;
                    tablaAuxiliar.insertar(posicion, codAux);
                    aux = aux.getEnlace();
                    salida = 0;
                }
                
            }while(salida == 1);
            
        }
        
        System.out.println(tablaAuxiliar.mostrarEstructura());
        
        tabla.vaciarTabla();
        
        System.out.println(tabla.mostrarEstructura());
        
        System.out.println(tablaAuxiliar.mostrarEstructura());
        
        /*
        System.out.println(tabla.mostrarEstructura());
        
        System.out.println(tabla.getNodoEmpleado(0));
        
        tabla.vaciarTabla();
        
        System.out.println(tabla.mostrarEstructura());
        
        
        
        System.out.println("Tabla2: \n"+tabla.mostrarEstructura());
*/
    }
    
}

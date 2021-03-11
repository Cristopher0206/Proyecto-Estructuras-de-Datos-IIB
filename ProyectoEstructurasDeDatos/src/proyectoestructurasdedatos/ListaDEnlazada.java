package proyectoestructurasdedatos;

import javax.lang.model.SourceVersion;

/**
 *
 * @author User
 */
public class ListaDEnlazada {

    private NodoEmpleadoLista cabecera; // Este es el nodo inicial de la lista

    public ListaDEnlazada() {
        this.cabecera = null;
    }
    

    public NodoEmpleadoLista getCabecera() {
        return cabecera;
    }

    public void setCabecera(NodoEmpleadoLista cabecera) {
        this.cabecera = cabecera;
    }

    public String mostrar() {
        String texto = "";
        if (this.cabecera == null) {
            return null;
        }
        texto += null + " <--- ";
        NodoEmpleadoLista actual = this.cabecera;
        while (actual.getAdelante() != null) {
            texto += actual.getInfo() + " <---> ";
            actual = actual.getAdelante();
        }
        texto += actual.getInfo() + " ---> " + null;
        return texto;
    }

    public void insertarOrdenado(Empleado empleado) {
        NodoEmpleadoLista insertObject = new NodoEmpleadoLista();
        insertObject.crearNodo(empleado);
        if (this.cabecera == null) {
            this.cabecera = insertObject;
            this.cabecera.setAtras(null);
            this.cabecera.setAdelante(null);
        }else{
            NodoEmpleadoLista temp = this.cabecera;
            if (empleado.getCodigo().compareTo(temp.getInfo().getCodigo()) < 0) {
                insertObject.setAdelante(temp);
                temp.setAtras(insertObject);
                insertObject.setAtras(null);
                this.cabecera = insertObject;
            } else {
                NodoEmpleadoLista tempIzq = temp;
                NodoEmpleadoLista tempDer = temp.getAdelante();
                while (tempIzq.getAdelante() != null) {
                    if (empleado.getCodigo().compareTo(tempDer.getInfo().getCodigo()) < 0) {
                        insertObject.setAdelante(tempDer);
                        insertObject.setAtras(tempIzq);
                        tempIzq.setAdelante(insertObject);
                        tempDer.setAtras(insertObject);
                        break;
                    } else {
                        tempIzq = tempIzq.getAdelante();
                        tempDer = tempDer.getAdelante();
                    }
                }
                if (tempIzq.getAdelante() == null) {
                    insertObject.setAtras(tempIzq);
                    tempIzq.setAdelante(insertObject);
                    insertObject.setAdelante(null);
                }
            
            }
        }
    }

    
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latest();
    }

}

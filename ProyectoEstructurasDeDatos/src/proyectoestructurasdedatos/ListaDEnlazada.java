
package proyectoestructurasdedatos;
/**
 *
 * @author User
 */
public class ListaDEnlazada {
    private Empleado info; // Utilizar otro constructor.
    private ListaDEnlazada siguiente;
    private ListaDEnlazada anterior;
   
        

    public ListaDEnlazada (Empleado empleado){
        this.anterior = null;  
        this.info = empleado;
        this.siguiente = null;
    }
    
    
    public void mostrar(ListaDEnlazada head){
        if (head == null){
            return;
        }
        System.out.print(null + " <--- ");
        ListaDEnlazada actual = head;
        while (actual.siguiente !=null){
            System.out.print(actual.info + " <---> ");
            actual= actual.siguiente;
        }
        System.out.println(actual.info + " ---> " + null);
    }
    
    public ListaDEnlazada insertarAlInicio(ListaDEnlazada head, Empleado empleado) {
        ListaDEnlazada newNode = new ListaDEnlazada(empleado);
        if (head ==null){
            return newNode;
        }  
        newNode.siguiente = head;
        head.anterior = newNode;
        head = newNode;
        return head;
    }
    
    public ListaDEnlazada insertarOrdenado(ListaDEnlazada head, Empleado empleado){
        ListaDEnlazada temp;
        ListaDEnlazada insertObject = new ListaDEnlazada(empleado);
        if (head ==null){
            return insertObject;
        }
        
        if(empleado.getCodigo().compareTo(head.info.getCodigo()) < 0){
            temp = head;
            temp.siguiente = head.siguiente;
            head = insertObject;
            temp.anterior = insertObject;
            insertObject.siguiente = temp;
        } else {
            ListaDEnlazada current = head;
            while (current.siguiente != null ) {
                current = current.siguiente;
                if(current.siguiente.info.getCodigo().compareTo(empleado.getCodigo()) > 0){
                    temp = current.siguiente;
                    temp.siguiente = current.siguiente.siguiente;
                    current.siguiente = insertObject;
                    insertObject.anterior = current;
                    insertObject.siguiente = temp;
                    temp.anterior = insertObject;
                    return head;
                }       
            }
        }
        return head;
    }
    
    
}

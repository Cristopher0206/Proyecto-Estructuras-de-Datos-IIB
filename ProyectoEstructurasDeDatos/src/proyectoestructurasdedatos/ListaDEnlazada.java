
package proyectoestructurasdedatos;
/**
 *
 * @author User
 */
public class ListaDEnlazada {
    
    private static class ListNode {
        private int info;
        private ListNode siguiente;
        private ListNode anterior;

         public ListNode (int data){
            this.anterior = null;  
            this.info = data;
            this.siguiente = null;
        }
    }
    
    public static void mostrar(ListNode head){
        if (head == null){
            return;
        }
        System.out.print(null + " <--- ");
        ListNode current = head;
        while (current.siguiente !=null){
            System.out.print(current.info + " <---> ");
            current= current.siguiente;
        }
        System.out.println(current.info + " ---> " + null);
    }
    
    public static ListNode insertarAlInicio(ListNode head, int data) {
        ListNode newNode = new ListNode(data);
        if (head ==null){
            return newNode;
        }  
        newNode.siguiente = head;
        head.anterior = newNode;
        head = newNode;
        return head;
    }
    
    public static ListNode insertarOrdenado(ListNode head, int objeto){
        ListNode temp;
        ListNode insertObject = new ListNode(objeto);
        if (head ==null){
            return insertObject;
        }
        
        if(objeto < head.info){
            temp = head;
            temp.siguiente = head.siguiente;
            head = insertObject;
            temp.anterior = insertObject;
            insertObject.siguiente = temp;
        } else {
            ListNode current = head;
            while (current.siguiente != null ) {
                current = current.siguiente;
                if(current.siguiente.info > objeto){
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

package implementationoflinkedlists;

public class ImplementationOfLinkedLists {

    public static void main(String[] args) {
        
        LinkedList lista = new LinkedList();
        
        lista.insertFirst(-1);
        
        lista.insertLast(1);
        lista.insertLast(2);
        lista.insertLast(3);
        lista.insertLast(4);
        lista.insertLast(5);
        
        lista.insertFirst(0);
        
        lista.insertAtIndex(500, 8);
        
        lista.indexOf(500);
        lista.size();
        lista.atIndex(8);
        
        lista.printList();
        
//        ------------------------------------------------------------------

        lista.deleteAtIndex(3);
        
        lista.printList();
        
        
        
    }
    
}

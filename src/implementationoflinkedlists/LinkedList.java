package implementationoflinkedlists;

public class LinkedList {
    //creating nodes
    Point first = null;
    Point last  = null;
    
    //----insert functions----//
    //insert last
    public void insertLast(int data){
        Point node = new Point();
        node.data = data;
        
        if(this.first == null){
            first = node;
            first.point = last;
        }else{
            Point temp;
            temp = first;
            
            while(temp.point != null){
                temp = temp.point;
            }
            
            temp.point = node;
            node.point = last;
            
        }
    }
    
    //insert first
    public void insertFirst(int data){
        Point node = new Point();
        node.data = data;
        
        Point temp = first;
        
        first = node;
        
        node.point = temp;
    }
    
    //insert at index
    public void insertAtIndex(int data, int index){
        Point node = new Point();
        node.data = data;
        
        Point temp = first;
        Point temp2;
        
        int i = 0;
        while(i < index -1){
            if(temp.point == null){
                System.out.println("There is not enough elements. Element will be placed on the end of list");
                break;
            }
            
            temp = temp.point;            
            
            i++;
        }
        
        temp2 = temp.point;
        temp.point = node;
        node.point = temp2;
        
    }
    

    //----delet element of list----//
    //delete last
    public void deleteLastElement(){
        Point temp = first;
        Point previousTemp = first;
        while(temp.point != null){
            previousTemp = temp;
            temp = temp.point;
        }
        
        previousTemp.point= last;
    }
    
    //delete first
    public void deleteFirstElement(){
        first = first.point;
    }
    

    //delete at index
    public void deleteAtIndex(int index){        
        Point temp = first;
        Point temp2 = first;
        
        int i = 0;
        while(i < index){
            if(temp.point == null){
                System.out.println("There is not enough elements. Element will be placed on the end of list");
                break;
            }
            temp2 = temp;
            temp = temp.point;            
            
            i++;
        }
        
        temp2.point = temp.point;
        
    }


    //----additional functionality of linked list----//

    //first index of specific data if it is in the list
    public void indexOf(int data){
        Point temp = first;
        int i = 0;
        while(temp.point != null){
            if(temp.data == data){
                System.out.println("Index is : " + i);
                break;
            }
            temp = temp.point;
            i++;
        }
    }
    
    //print data on specific index
    public void atIndex(int index){
        Point temp = first;
        int i = 0;
        
        while(i < index){
            
            temp = temp.point;
            
            i++;
        }
        
        if(temp == null){
            System.out.println("No such index");
        }else{
            System.out.println("data is : "+temp.data);        
        }
                
        
    }
    
    //printing the number of elements in list    
    public void size(){
        Point temp = first;
        int i = 1;
        while(temp.point != null){
            i++;
            temp = temp.point;
        }
        
        System.out.println("Velicina je: " + i );
    }


    //printing data of every element in list in sequence
    public void printList(){
        Point temp = first;
        
        do{
            System.out.println(temp.data);
            temp = temp.point;
        }while(temp.point != null);
        
        System.out.println(temp.data);
    }
}

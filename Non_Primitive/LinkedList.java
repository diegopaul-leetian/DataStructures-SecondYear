package Non_Primitive;

public class LinkedList {
    public static void main(String[] args){
        java.util.LinkedList<String> linked_list = new java.util.LinkedList<String>();

        // Adding elements to the linked list 
        linked_list.add("A"); 
        linked_list.add("B"); 
        linked_list.addLast("C"); 
        linked_list.addFirst("D"); 
        linked_list.add(2, "E"); 
  
        System.out.println(linked_list); 
  
        linked_list.remove("B"); 
        linked_list.remove(3); 
        linked_list.removeFirst(); 
        linked_list.removeLast(); 
  
        System.out.println(linked_list); 
    }
}

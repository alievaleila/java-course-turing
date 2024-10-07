package az.edu.turing.customLinkedListImpl;

import java.util.Arrays;

public class MyLinkedListMain {

    public static void main(String[] args) {

        MyLinkedList obj = new MyLinkedList();

        obj.addHead(11);
        obj.addTail(22);
        obj.insert(1, 1);
        obj.insert(2, 33);
        obj.insert(2, 44);

        System.out.println("Linked List after adding elements: " + obj);

        System.out.println("Array: " + Arrays.toString(obj.toArray()));


        obj.removeHead();
        System.out.println("After removing head: " + obj);


        obj.removeTail();
        System.out.println("After removing tail: " + obj);


        obj.update(0, 4);
        System.out.println("After updating index 1: " + obj);

        obj.delete(1);
        System.out.println("After deleting index 1: " + obj);

        obj.delete(Integer.valueOf(4));
        System.out.println("After deleting value 4: " + obj);


        System.out.println("After deleting all elements: " + obj.deleteAll());


    }

}

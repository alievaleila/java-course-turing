package az.edu.turing.customLinkedListImpl;

import java.util.Objects;

public class MyLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    int size;

    private class Node<T> {

        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }

    public MyLinkedList<T> addHead(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = head;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;

        return this;
    }

    public MyLinkedList<T> addTail(T data) {
        Node<T> newNode = new Node<>(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;


        return this;
    }

    public T removeHead() {
        if (head == null) {
            tail = null;
            return null;
        }
        T data = head.data;
        head = head.next;
        size--;

        return data;
    }

    public T removeTail() {

        if (tail == null) {
            return null;
        }
        if (head == tail) {
            T data = tail.data;
            head = null;
            tail = null;
            size--;
            return data;
        }
        Node<T> current = head;
        while (current.next != tail) {
            current = current.next;
        }
        T data = tail.data;
        tail = current;
        tail.next = null;
        size--;
        return data;
    }


    public void insert(int index, T item) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        if (index == 0) {
            addHead(item);
        } else if (index == size) {
            addTail(item);
        } else {
            Node<T> newNode = new Node<>(item);
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            size++;
        }
    }


    public void update(int index, T item) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.data = item;
    }

    public void delete(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        if (index == 0) {
            removeHead();
        } else if (index == size - 1) {
            removeTail();
        } else {
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
            size--;
        }
    }

    public boolean delete(T item) {
        if (item == null || head == null) {
            return false;
        }
        if (head.data.equals(item)) {
            removeHead();
            return true;
        }
        Node<T> current = head;
        while (current.next != null && !current.next.data.equals(item)) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
            size--;
            return true;
        }
        return false;
    }

    public MyLinkedList<T> deleteAll() {
        head = null;
        size = 0;
        return this;
    }

    public Object[] toArray() {
        Object[] array = new Object[size];
        Node<T> current = head;
        for (int i = 0; i < size; i++) {
            array[i] = current.data;
            current = current.next;
        }
        return array;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyLinkedList<?> that = (MyLinkedList<?>) o;
        return size == that.size && Objects.equals(head, that.head) && Objects.equals(tail, that.tail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(head, tail, size);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> current = head;
        while (current != null) {
            sb.append(current.data).append(" -> ");
            current = current.next;
        }
        return sb.append("null").toString();

    }
}
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        MyLinkedList<?> that = (MyLinkedList<?>) o;
//
//        if (size != that.size) return false;
//        Node<T> currentThis = this.head;
//        Node<?> currentThat = (Node<?>) that.head;
//
//        while (currentThis != null && currentThat != null) {
//            if (!Objects.equals(currentThis.getData(), currentThat.getData())) {
//                return false;
//            }
//            currentThis = currentThis.getNext();
//            currentThat = currentThat.getNext();
//        }
//
//        return currentThis == null && currentThat == null;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(head, size);
//    }
//}






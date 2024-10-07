package az.edu.turing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListTest {

    LinkedList<String> list = new LinkedList<>();

    @BeforeEach
    void setUp() {
        list.add("Harry");
        list.add("Harmonie");
        list.add("Ron");
    }


    @Test
    void addLinkedList_Should_ReturnSuccess() {
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Harry");
        list1.add("Harmonie");
        list1.add("Ron");

        assertEquals(list, list1);
    }

}


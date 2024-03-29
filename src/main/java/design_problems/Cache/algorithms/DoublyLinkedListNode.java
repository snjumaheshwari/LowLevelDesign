package design_problems.Cache.algorithms;

public class DoublyLinkedListNode<E> {
    DoublyLinkedListNode<E> next;
    DoublyLinkedListNode prev;

    E element;

    public  DoublyLinkedListNode(E element) {
        this.element = element;
        this.next = null;
        this.prev = null;
    }

    public E getElement() {
        return this.element;
    }
}

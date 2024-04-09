package opgave03.models;

import opgave01.models.StackEaaa;

public class DropOutStack<E> implements StackEaaa<E> {

    private int maxSize;
    private Node<E> top;
    private Node<E> bottom;

    public DropOutStack(int maxSize) {
        this.maxSize = maxSize;
    }

    @Override
    public void push(E element) {
        Node<E> node = new Node<>(element);
        node.previous = top;
        top.next = node;
        top = node;
    }

    @Override
    public E pop() {
        E element = top.element;
        top = top.previous;
        top.next = null;
        return element;
    }

    @Override
    public E peek() {
        return top.element;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public void clear() {
        top = null;
        bottom = null;
    }

    @Override
    public int size() {
        int count = 0;
        Node<E> current = bottom;
        while(current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    private class Node<T> {
        T element;
        Node<T> next;
        Node<T> previous;

        public Node(T element) {
            this.element = element;
        }
    }
}

package opgave03.models;

import opgave01.models.StackEaaa;

public class DropOutStack<E> implements StackEaaa<E> {

    private int maxSize;

    public DropOutStack(int maxSize) {
        this.maxSize = maxSize;
    }

    @Override
    public void push(E element) {

    }

    @Override
    public E pop() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return 0;
    }

    private class Node<T> {
        T element;
        Node<T> next;
        Node<T> previous;
    }
}

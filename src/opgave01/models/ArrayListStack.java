package opgave01.models;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ArrayListStack<E> implements StackEaaa<E> {
    ArrayList<E> stack = new ArrayList<>();
    @Override
    public void push(E element) {
        stack.add(element);
    }

    @Override
    public E pop() {
        throwIfEmpty();
        E element = stack.getLast();
        stack.removeLast();
        return element;
    }

    @Override
    public E peek() {
        throwIfEmpty();
        return stack.getLast();
    }

    @Override
    public boolean isEmpty() {
        return stack.size() == 0;
    }

    @Override
    public void clear() {
        stack.clear();
    }

    @Override
    public int size() {
        return stack.size();
    }

    private void throwIfEmpty() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
    }

    public String toString() {
        return stack.toString();
    }
}

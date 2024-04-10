package opgave02;

import opgave01.models.ArrayListStack;

import java.util.ArrayList;

public class Opgave02 {
    public static void main(String[] args) {

    }

    public static boolean checkParantes(String s) {
        char[] chararray = s.toCharArray();
        ArrayListStack<Character> stack = new ArrayListStack<>();
        for (char c : chararray) {
            if (c == '[' || c == '(' || c == '{') stack.push(c);
            if (c == ']') {
                if (stack.peek() == '[') stack.pop();
                else return false;
            }
            if (c == ')') {
                if (stack.peek() == '(') stack.pop();
                else return false;
            }
            if (c == '}') {
                if (stack.peek() == '{') stack.pop();
                else return false;
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}

package opgave02;

import java.util.ArrayList;

public class Opgave02 {
    public static void main(String[] args) {

    }

    public static boolean checkParantes(String s) {
        char[] chararray = s.toCharArray();
        ArrayList<Character> stack = new ArrayList<>();
        for (char c : chararray) {
            if (c == '[' || c == '(' || c == '{') stack.add(c);
            if (c == ']') {
                if (stack.getLast() == '[') stack.removeLast();
                else return false;
            }
            if (c == ')') {
                if (stack.getLast() == '(') stack.removeLast();
                else return false;
            }
            if (c == '}') {
                if (stack.getLast() == '{') stack.removeLast();
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

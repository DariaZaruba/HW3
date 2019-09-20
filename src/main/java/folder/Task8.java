package folder;

import java.util.ArrayList;

public class Task8 {
    public static void main(String[] args) {

        //write your code here

    }

    private static ArrayList<Character> transformIntToChar(int... values) {
        String str = "abcd";
        char c = "c";
        int i = 1;
        boolean add = true;
        ArrayList<Character> buffer = new ArrayList<Character>();
        for (int i : values) {
            boolean add = buffer.add(((char) i));
        }
        return buffer;
    }

    private static void printList(ArrayList<Character> characters) {
        for (char c : characters) {
            System.out.print(c);
        }
    }
}
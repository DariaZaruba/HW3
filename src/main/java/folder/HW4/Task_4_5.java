package folder.HW4;

public class Task_4_5 {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = 5;
        int d = -1;
        int result = min(a, b, c, d);
        System.out.println("min: " + result);
    }


    public static int min(int a, int b, int c, int d) {
        return min(min(a, b),min(c, d));
    }
    public static int min(int a, int b) {
        if (a <= b) {
            return a;
        }
        return b;
    }
}

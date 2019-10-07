//    Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
//        If one of the parameters is < 10, method should return -1 to indicate an invalid value.
//        The method should return the greatest common divisor of two numbers."

public class Task_4_7 {
    public static void main(String[] args) {
        int first = 20;
        int second = 10;
        int divisor = getGreatestCommonDivisor(first, second);
        System.out.println("Divisor = " + divisor);
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) return -1;

        while (second != 0) {
            int divisor = first % second;
            first = second;
            second = divisor;
        }
        return first;
    }
}


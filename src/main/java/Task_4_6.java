public class Task_4_6 {
        public static void main(String args[]) {

            int r, s = 0;
            int n = 258365;

            while (n > 0) {
                r = n % 10;
                if (r % 2 == 0) {
                    s = s + r;
                }
                n = n / 10;
            }
            {if (n < 0)
                System.out.print("-1");}

            System.out.print("\nSum of Even Digits :" + s);

        }
    }








package folder.HW4;//10*. Write a program which prints the next figure to the console:
//**********
//*        *
//*        *
//*        *
//**********

public class Task_4_10 {
    public static void main(String args[]) {

        for (int i = 0; i <= 5; i++) {
            if (i == 0 || i == 5)
            System.out.println("**********");
            else System.out.println("*        *");

        }
    }
}


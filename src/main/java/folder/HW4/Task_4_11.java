package folder.HW4;//11*. Write a program which prints the next figure to the console:
//          *
//         ***
//        *****
//       *******
//      *********
//     ***********

public class Task_4_11 {
    public static void main(String[] args) {
//        loop for lines
                for (int i = 0; i < 6; i++) {
//                    look for spaces
                    for (int j = 0; j < 6 - i; j++)
                        System.out.print(" ");
//                    loop for *
                    for (int k = 0; k < (2 * i + 1); k++)
                        System.out.print("*");
                    System.out.println();
                }
            }
        }

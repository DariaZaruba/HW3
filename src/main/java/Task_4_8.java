//8. Write a program which prints the next figure to the console:
//**********
//**********
//**********
//**********
import java.io.IOException;

public class Task_4_8
{
    private  static String TEXT = "TASK 4_8";

    public static void main(String[] args) throws IOException
    {
        System.out.println(TEXT);
        String s =  "**********";
        printTextMoreTimes (s, 4);
        }

    public static void printTextMoreTimes(String s, int count)
    {
        for (int i = 0; i <=3; i++)
        {
            System.out.println(s);
        }

    }
}

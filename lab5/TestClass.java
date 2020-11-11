package lab5_1_pac;

import java.util.Scanner;

public class TestClass
{
    public static void main(String[] args)
    {
        System.out.print("number exercise [7-10] : ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x == 7)
            Exercise.exercise7();
        else if (x == 8)
            Exercise.exercise8();
        else if (x == 9)
            Exercise.exercise9();
    }
}

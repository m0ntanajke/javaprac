package lab5_1_pac;
import java.util.*;
public class Exercise
{
    static public void exercise7()
    {
        System.out.print("\nexercise7, number : ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        exercise7_answer_prost_del(x, 2);
        System.out.println("\n");

    }

    static int exercise7_answer_prost_del(int n1,  int n)
    {
        int t;
        t= exercise7_answer_prost_c(n, 2);
        if(n1%t==0||n1==1)
        {
            System.out.print(t + " ");
            n1=n1/t;
            if(n1==1)
                return 0;
            return exercise7_answer_prost_del(n1,  2);
        }
        else
            return exercise7_answer_prost_del(n1, t+1);
        //return n;

    }

    static int exercise7_answer_prost_c(int n, int k)
    {
        if( n==2|| n % k != 0 &&k >= Math.sqrt(n))
            return n;
        else if(k < Math.sqrt(n))
            return exercise7_answer_prost_c(n,k+1);
        else
            return exercise7_answer_prost_c(n+1,2);
        //return n;
    }


    static public void exercise8()
    {
        System.out.print("\nexercise7, str : ");
        Scanner in = new Scanner(System.in);
        String str = in.next();
        if(exercise8_answer(str, 0, str.length() - 1))
            System.out.println("YES");
        else
            System.out.println("NO");

    }

    static public boolean exercise8_answer(String str ,int min, int max)
    {
        //System.out.println(str.charAt(min) + " " + str.charAt(max) + " " + min + " " + max);
        if (min >= max)
            return true;
        if (str.charAt(min) == str.charAt(max))
        {
            return exercise8_answer(str, min + 1, max - 1);
        }
        else
            return false;
    }

    static public void exercise9()
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("count = " + exercise9_answer(a, b));

    }



    static int exercise9_answer(int a,int b) {
        if (a > b + 1)
            return 0;
        if (a == 0 || b == 0)
            return 1;
        return exercise9_answer(a, b - 1) +
                exercise9_answer(a - 1, b - 1);
    }


}

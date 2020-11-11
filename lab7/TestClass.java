package lab_pac;
import java.util.*;
public class TestClass
{
    public static void main(String arg[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("type collection: ");
        int typeCollection = in.nextInt();
        GameItem gameItem = new GameItem(typeCollection % 3);
        int answer = 0;
        while (true)
        {
            System.out.println(answer);
            if (gameItem.empty1())
            {
                System.out.println("second " + answer);
                return;
            }
            else if (gameItem.empty2())
            {
                System.out.println("first " + answer);
                return;
            }

            if (gameItem.getLast1() < gameItem.getLast2())
                gameItem.replaceCard(1);
            else
                gameItem.replaceCard(2);
            ++answer;
        }

    }
}

package lab2;

public class TestBall
{
    public static void main(String[] arg)
    {
        Ball ball1 = new Ball(10, 10);
        System.out.println(ball1.toString());
        ball1.move(5.6, -6.8);
        System.out.println(ball1.toString());
        return;
    }
}

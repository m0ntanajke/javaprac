package lab2;

public class Ball
{
    private double x = 0;
    private double y = 0;

    public Ball(int in_x, int in_y)
    {
        x = in_x;
        y = in_y;
    }

    public Ball()
    {
        ;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public void setX(double in_x)
    {
        x = in_x;
    }

    public void setY(double in_y)
    {
        y = in_y;
    }

    public void setXY(double in_x, double in_y)
    {
        x = in_x;
        y = in_y;
    }

    public void move(double xDisp, double yDisp)
    {
        x += xDisp;
        y += yDisp;
    }

    public String toString()
    {
        return "Ball @ (" + x + " , " + y + ")";
    }

}

package lab3_3_pac;

import java.util.Vector;

public class MovablePoint implements Movable
{
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint(int in_x, int in_y, int in_xSpeed, int in_ySpeed)
    {
        x = in_x;
        y = in_y;
        xSpeed = in_xSpeed;
        ySpeed = in_ySpeed;
    }

    public String toString()
    {
        return "x = " + x + ", y = " + y + ", xSpeed = " + xSpeed +
                ", ySpeed = " + ySpeed;
    }

    public Vector getSpeed()
    {
        Vector temp = new Vector();
        temp.add(xSpeed);
        temp.add(ySpeed);
        return temp;
    }

    public void moveUp()
    {
        y += ySpeed;
    }
    public void moveDown()
    {
        y -= ySpeed;
    }
    public void moveLeft()
    {
        x -= xSpeed;
    }
    public void moveRight()
    {
        x += xSpeed;
    }
}

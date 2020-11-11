package lab3_3_pac;

public class MovableRectangle implements Movable
{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(
            int in_x1, int in_y1, int in_x2, int in_y2, int in_xSpeed,
            int in_ySpeed)
    {
        topLeft = new MovablePoint(in_x1, in_y1, in_xSpeed, in_ySpeed);
        bottomRight = new MovablePoint(in_x2, in_y2, in_xSpeed, in_ySpeed);
    }

    public String toString()
    {
        return  "MovableRectangle, topLeft: " + topLeft.toString() +
                "\nbottomRight: " + bottomRight.toString();
    }

    public boolean SpeedPointEquals()
    {
        return topLeft.getSpeed().equals(bottomRight.getSpeed());
    }

    public void moveUp()
    {
        topLeft.moveUp();
        bottomRight.moveUp();
    }
    public void moveDown()
    {
        topLeft.moveDown();
        bottomRight.moveDown();
    }
    public void moveLeft()
    {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }
    public void moveRight()
    {
        topLeft.moveRight();
        bottomRight.moveRight();
    }
}
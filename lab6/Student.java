package lab6_pac;

public class Student implements Comparable<Student> {
    private int number;
    private int point;
    Student(int in_a, int in_point)
    {
        number = in_a;
        point = in_point;
    }

    public int getA()
    {
        return number;
    }
    public int getPoint()
    {
        return point;
    }

    public String toString()
    {
        return "number: " + number + ", point: " + point;
    }

    @Override
    public int compareTo(Student o) {
        return number - o.getA();
    }
}

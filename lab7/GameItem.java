package lab_pac;
import java.util.*;

public class GameItem
{

    int type;

    Stack<Integer> s_player1;
    Stack<Integer> s_player2;

    PriorityQueue<Integer> q_player1;
    PriorityQueue<Integer> q_player2;

    ArrayDeque<Integer> d_player1;
    ArrayDeque<Integer> d_player2;

    public int getLast1()
    {
        int last = -1;
        if (type == 0)
            for (int c : s_player1)
                last = c;
        else if (type == 1)
            for (int c : q_player1)
                last = c;
        else if (type == 2)
            for (int c : d_player1)
                last = c;
        return last;
        /*
        if (type == 0)
            return s_player1.peek();
        else if (type == 1)
            return q_player1.peek();
        else if (type == 2)
            return d_player1.peekLast();
        return 0;*/
    }

    public int getLast2()
    {
        int last = -1;
        if (type == 0)
            for (int c : s_player1)
                last = c;
        else if (type == 1)
            for (int c : q_player1)
                last = c;
        else if (type == 2)
            for (int c : d_player1)
                last = c;
       return last;
    }

    public boolean empty1()
    {
        if (type == 0)
            return s_player1.isEmpty();
        else if (type == 1)
            return q_player1.isEmpty();
        else if (type == 2)
            return d_player1.isEmpty();
        return true;
    }
    public boolean empty2()
    {
        if (type == 0)
            return s_player2.isEmpty();
        else if (type == 1)
            return q_player2.isEmpty();
        else if (type == 2)
            return d_player2.isEmpty();
        return true;
    }

    public void replaceCard(int toPlace)
    {
        if (toPlace == 1)
        {
            if (type == 0)
            {
                Stack<Integer> temp = new Stack<Integer>();
                temp.push(s_player1.pop());
                temp.push(s_player2.pop());
                temp.addAll(s_player1);
                s_player1 = temp;

            }
            if (type == 1)
            {
                PriorityQueue<Integer> temp = new PriorityQueue<Integer>();
                temp.add(q_player1.poll());
                temp.add(q_player2.poll());
                temp.addAll(q_player1);
                q_player1 = temp;
            }
            if (type == 2)
            {
                ArrayDeque<Integer> temp = new ArrayDeque<Integer>();
                temp.add(d_player1.pollLast());
                temp.add(d_player2.pollLast());
                temp.addAll(d_player1);
                d_player1 = temp;
            }
        }
        else if (toPlace == 2)
        {
            if (type == 0)
            {
                Stack<Integer> temp = new Stack<Integer>();
                temp.push(s_player2.pop());
                temp.push(s_player1.pop());
                temp.addAll(s_player2);
                s_player2 = temp;

            }
            if (type == 1)
            {
                PriorityQueue<Integer> temp = new PriorityQueue<Integer>();
                temp.add(q_player2.poll());
                temp.add(q_player1.poll());
                temp.addAll(q_player2);
                q_player2 = temp;
            }
            if (type == 2)
            {
                ArrayDeque<Integer> temp = new ArrayDeque<Integer>();
                temp.add(d_player2.pollLast());
                temp.add(d_player1.pollLast());
                temp.addAll(d_player2);
                d_player2 = temp;
            }
        }

    }

    GameItem(int in_type)
    {
        Scanner in = new Scanner(System.in);
        type = in_type;
        Vector<Integer> inVector = new Vector<Integer>();
        for (int i = 0; i < 10; ++i)
            inVector.add(in.nextInt());
        System.out.println(inVector);

        s_player1 = new Stack<Integer>();
        s_player2 = new Stack<Integer>();
        q_player1 = new PriorityQueue<Integer>();
        q_player2 = new PriorityQueue<Integer>();
        d_player1 = new ArrayDeque<Integer>();
        d_player2 = new ArrayDeque<Integer>();

        if (type == 0)
        {
            for (int i = 0; i < 5; ++i)
            {
                s_player1.push(inVector.get(i));
            }
            for (int i = 5; i < 10; ++i)
            {
                s_player2.push(inVector.get(i));
            }
        }
        else if (type == 1)
        {
            for (int i = 4; i >= 0 ; --i)
            {
                q_player1.add(inVector.get(i));
            }
            for (int i = 9; i >= 5; --i)
            {
                q_player2.add(inVector.get(i));
            }
        }
        else if (type == 2)
        {
            for (int i = 0; i < 5; ++i)
            {
                d_player1.addLast(inVector.get(i));
            }
            for (int i = 5; i < 10; ++i)
            {
                d_player2.addLast(inVector.get(i));
            }
        }
        //in.close();
    }




}

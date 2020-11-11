package lab4_1_pac;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JFrameProgram extends JFrame
{
    protected int milanPoint;
    protected int madridPoint;

    protected JButton milanButton;
    protected JButton madridButton;
    protected JLabel resultLabel;
    protected JLabel lastScoreLabel;
    protected JLabel winnerLabel;

    public void updateLabel(String lastCom)
    {
        resultLabel.setText("Result: " + milanPoint +
                " X " + madridPoint);
        lastScoreLabel.setText("Last Scorer: " + lastCom);
        if (milanPoint > madridPoint)
            winnerLabel.setText("Winner: " + milanButton.getText());
        else if (milanPoint < madridPoint)
            winnerLabel.setText("Winner: " + madridButton.getText());
        else
            winnerLabel.setText("Winner: DRAW");
    }

    public JFrameProgram()
    {
        milanPoint = 0;
        madridPoint = 0;

        milanButton = new JButton("AC Milan");
        madridButton = new JButton("Real Madrid");
        resultLabel = new JLabel("Result: 0 X 0");
        lastScoreLabel = new JLabel("Last Scorer: N/A");
        winnerLabel = new JLabel("Winner: DRAW");
        JPanel grid = new JPanel();
        GridLayout layout = new GridLayout(5, 1);
        grid.setLayout(layout);

        milanButton.addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent a) {}
            public void mouseClicked(MouseEvent a)
            {
                ++milanPoint;
                updateLabel("AC Milan");

            }
            public void mouseEntered(MouseEvent a) {}
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });

        madridButton.addMouseListener(new MouseListener()
    {
        public void mouseExited(MouseEvent a) {}
        public void mouseClicked(MouseEvent a)
        {
            ++madridPoint;
            updateLabel("Real Madrid");

        }
        public void mouseEntered(MouseEvent a) {}
        public void mouseReleased(MouseEvent a) {}
        public void mousePressed(MouseEvent a) {}
    });

        grid.add(milanButton);
        grid.add(madridButton);
        grid.add(resultLabel);
        grid.add(lastScoreLabel);
        grid.add(winnerLabel);
        setContentPane(grid);
        setSize(800, 500);
        setVisible(true);
    }


    public static void main(String [] args)
    {
        new JFrameProgram();
    }

}

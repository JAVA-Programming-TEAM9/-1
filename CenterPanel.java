import javax.swing.*;
import java.awt.*;

/**
 * BorderLayout의 Center UI를 설정해주는 클래스
 * 
 * @author (2019315020 오성빈, 2018210032 김태영) 
 * @version (2020.11.03)
 */
public class CenterPanel extends JPanel
{
    public CenterPanel(){
        this.setLayout(new GridLayout(4, 4, 5, 5));
        JButton b0 = new JButton("0");
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton bCE = new JButton("CE");
        JButton bCal = new JButton("계산");
        JButton bAdd = new JButton("+");
        JButton bSub = new JButton("-");
        JButton bMul = new JButton("x");
        JButton bDiv = new JButton("/");
        
        
        this.add(b0);
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.add(b5);
        this.add(b6);
        this.add(b7);
        this.add(b8);
        this.add(b9);
        this.add(bCE);
        this.add(bCal);
        this.add(bAdd);
        this.add(bSub);
        this.add(bMul);
        this.add(bDiv);
        
        bAdd.setBackground(Color.cyan);
        bSub.setBackground(Color.cyan);
        bMul.setBackground(Color.cyan);
        bDiv.setBackground(Color.cyan);
    }
}

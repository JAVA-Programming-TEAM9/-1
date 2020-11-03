import javax.swing.*;
import java.awt.*;

/**
 * 여기에 CalculatorFrame 클래스 설명을 작성하십시오.
 * 
 * @author (2019315020 오성빈, 2018210032 김태영) 
 * @version (2020.11.03)
 */
public class CalculatorFrame extends JFrame
{
    public CalculatorFrame(){
        this.setTitle("계산기");
        this.setSize(300,300);   
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        NorthPanel np = new NorthPanel();
        CenterPanel cp =new CenterPanel();
        SouthPanel sp = new SouthPanel();
        
        
        this.add(np, BorderLayout.NORTH);
        this.add(cp, BorderLayout.CENTER);
        this.add(sp, BorderLayout.SOUTH);
        
        
        np.setBackground(Color.lightGray);
        sp.setBackground(Color.yellow);
    }
}

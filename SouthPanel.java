import javax.swing.*;
import java.awt.*;

/**
 * BorderLayout의 South UI를 설정해주는 클래스
 * 
 * @author (2019315020 오성빈, 2018210032 김태영) 
 * @version (2020.11.03)
 */
public class SouthPanel extends JPanel
{
    public SouthPanel(){
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        JLabel lcal = new JLabel("계산결과");
        this.add(lcal);
        JTextField tfoutput = new JTextField("", 16);
        this.add(tfoutput);
    }
}

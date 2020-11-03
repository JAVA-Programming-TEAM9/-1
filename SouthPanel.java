import javax.swing.*;
import java.awt.*;

/**
 * 여기에 SouthPanel 클래스 설명을 작성하십시오.
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

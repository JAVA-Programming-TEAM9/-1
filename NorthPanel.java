import javax.swing.*;
import java.awt.*;

/**
 * 여기에 NorthPanel 클래스 설명을 작성하십시오.
 * 
 * @author (2019315020 오성빈, 2018210032 김태영) 
 * @version (2020.11.03)
 */
public class NorthPanel extends JPanel
{
    public NorthPanel(){
        JLabel lnum = new JLabel("수식입력");

        JTextField tfinput = new JTextField("", 16);

        this.add(lnum);
        this.add(tfinput);
    }
}

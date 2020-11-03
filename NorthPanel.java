import javax.swing.*;
import java.awt.*;

/**
 * BorderLayout의 North UI를 설정해주는 클래스
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

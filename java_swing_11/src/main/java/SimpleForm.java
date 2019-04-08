import sun.dc.pr.PRError;

import javax.swing.*;
import java.awt.*;

public class SimpleForm extends JFrame {
    private JTextField [] textFields=new JTextField[3];
    private SimpleListener listener;

    public SimpleForm()
    {
        //GUI部分
        setLayout(new FlowLayout());
        textFields[0]=new JTextField(6);
        textFields[1]=new JTextField(6);
        textFields[2]=new JTextField(6);
        add(textFields[0]);
        add(textFields[1]);
        add(textFields[2]);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setBounds(10,10,460,360);
        setTitle("模拟序列号");
        //设置监听器
        listener=new SimpleListener();
        for(JTextField textField:textFields)
        {

            textField.addKeyListener(listener);
            textField.addFocusListener(listener);
        }
    }
}

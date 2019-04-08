import sun.dc.pr.PRError;

import javax.swing.*;
import java.awt.*;

public class SimpleForm extends JFrame {
    private JTextField textField;
    private JButton button;
    private JTextArea textArea;

    private MousePushListener listener;
    public SimpleForm()
    {
        //GUI部分
        setLayout(new FlowLayout());
        textField=new JTextField(8);
        button=new JButton("按钮");
        textArea=new JTextArea(5,28);
        add(textField);
        add(button);
        add(new JScrollPane(textArea));
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setBounds(10,10,460,360);
        //设置监听器
        listener=new MousePushListener();
        listener.setOutPut(textArea);
        //添加监听器
        addMouseListener(listener);//为窗体本身添加
        button.addMouseListener(listener);
        textField.addMouseListener(listener);
    }
}

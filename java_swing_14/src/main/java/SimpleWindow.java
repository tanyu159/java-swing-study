import sun.java2d.jules.JulesPathBuf;

import javax.swing.*;
import java.awt.*;

public class SimpleWindow extends JFrame {
    private JButton button;
    private SimpleListener listener;
    private MyDialog myDialog;
    public SimpleWindow()
    {
        //GUI部分
        setLayout(new FlowLayout());
        button=new JButton("打开自定义窗口");
        add(button);
        setVisible(true);
        setBounds(100,100,200,300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        myDialog=new MyDialog(this,"这是一个自定义对话框");//实例化这个自定义对话框，虽然还未显示
        //设置监听器
        listener=new SimpleListener();
        listener.setMyDialog(myDialog);
        //添加监听器
        button.addActionListener(listener);
    }
}

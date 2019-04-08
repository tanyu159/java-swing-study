import org.omg.PortableInterceptor.INACTIVE;

import javax.swing.*;
import java.awt.*;

public class SimpleForm extends JFrame {
    private JButton spawnBtn;
    private JButton enterBtn;
    private JLabel tipLabel;
    private JTextField input;
    //Listener
    private SimpleListener listener;

    public SimpleForm()
    {
        //GUI部分
        setLayout(new FlowLayout());
        spawnBtn=new JButton("生成数");
        enterBtn=new JButton("确定");
        spawnBtn.setActionCommand("spawnButton");//注意。十分重要，ActionEvent区分按钮的根据
        enterBtn.setActionCommand("enterButton");//注意。十分重要，ActionEvent区分按钮的根据
        tipLabel=new JLabel("猜数字",JLabel.CENTER);
        input=new JTextField("0",10);
        add(spawnBtn);
        add(tipLabel);
        add(input);
        add(enterBtn);
        setVisible(true);
        setTitle("猜数字");
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//默认就是这个，可以不写
        setBounds(100,100,150,150);

        //设置监听器
        listener=new SimpleListener();
        listener.setInput(input);
        listener.setTipLabel(tipLabel);
        //添加监听器
        addWindowListener(listener);//本窗口添加
        //为两个按钮添加
        spawnBtn.addActionListener(listener);
        enterBtn.addActionListener(listener);
    }
}

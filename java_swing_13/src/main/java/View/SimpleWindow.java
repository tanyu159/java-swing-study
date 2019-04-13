package View;

import Controller.SimpleListener;

import javax.swing.*;
import java.awt.*;
import java.security.UnresolvedPermission;

public class SimpleWindow extends JFrame {
    private JTextField textFieldA;
    private JTextField textFieldB;
    private JTextField textFieldC;
    private JTextArea resultArea;
    private JButton caculateBtn;
    //Listener
    private SimpleListener simpleListener;

    public SimpleWindow()
    {
        //GUI部分
        setLayout(new BorderLayout());//使用东南西北中布局
        textFieldA=new JTextField(5);
        textFieldB=new JTextField(5);
        textFieldC=new JTextField(5);
        resultArea=new JTextArea();//
        caculateBtn=new JButton("计算");
        JPanel upPanel=new JPanel();//上面板
        upPanel.add(new JLabel("边A"));
        upPanel.add(textFieldA);
        upPanel.add(new JLabel("边B"));
        upPanel.add(textFieldB);
        upPanel.add(new JLabel("边C"));
        upPanel.add(textFieldC);
        upPanel.add(caculateBtn);
        add(upPanel,BorderLayout.NORTH);//将上面板加到该窗口的上部分
        add(new JScrollPane(resultArea),BorderLayout.CENTER);//将结果的多行输出加入滚动面板，再把滚动面板加入该窗口的中部分
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setBounds(100,100,460,260);
        //设置监听器
        simpleListener=new SimpleListener();
        simpleListener.setResultArea(resultArea);
        simpleListener.setTextFieldA(textFieldA);
        simpleListener.setTextFieldB(textFieldB);
        simpleListener.setTextFieldC(textFieldC);
        //添加监听器
        caculateBtn.addActionListener(simpleListener);
    }
}

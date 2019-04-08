import javax.swing.*;
import java.awt.*;

public class SimpleForm extends JFrame {
    private JTextField inputTextField;
    private JTextArea resultTextArea;
    private JButton executeBtn;
    private InteractorListener listener;
    public SimpleForm()
    {
        //GUI部分
        setLayout(new FlowLayout());
        inputTextField=new JTextField(10);
        resultTextArea=new JTextArea(9,30);
        executeBtn=new JButton("执行");
        add(new JScrollPane(resultTextArea));//将多行文本输入放入滚条面板，把滚条面板加入该面板
        add(inputTextField);
        add(executeBtn);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("交互演示");
        setBounds(100,100,460,360);
        //设置监听器
        listener=new InteractorListener();//实例化监听器
        listener.setJTextField(inputTextField);//设置获取值组件
        listener.setJTextArea(resultTextArea);//设置输出值的组件
        inputTextField.addActionListener(listener);//为输入框事件源添加监听器：即代表回车后会触发事件
        executeBtn.addActionListener(listener);//为按钮事件源添加监听器：即代表按钮点击后会触发事件
    }
}

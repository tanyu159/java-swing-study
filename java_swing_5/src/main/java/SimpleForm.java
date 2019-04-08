import javax.swing.*;
import java.awt.*;

/**
 * 一个简单的窗口
 */
public class SimpleForm extends JFrame {
    private JTextField textField;//一个输入框
    private InputListener inputListener;//一个实现了ActionListener接口的监视器
    public SimpleForm()
    {
        //设置GUI
        setLayout(new FlowLayout());
        textField=new JTextField(10);
        add(textField);
        setBounds(100,100,310,260);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        //设置监听器
        inputListener=new InputListener();//监听器初始化
        textField.addActionListener(inputListener);//为该组件添加监视器
        inputListener.setJTextField(textField);//【法2】通过引用来拿到组件中的值
    }

}

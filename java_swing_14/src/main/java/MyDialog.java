

import javax.swing.*;

/**
 * 自定义的对话框
 */
public class MyDialog extends JDialog {
    private JTextField textField;
    private JButton button;

    /**
     * 自定义构造函数必须有JFrame参数，否则窗口没有依托将不会显示
     * @param frame
     * @param s
     */
    public MyDialog(JFrame frame,String s)
    {
        //GUI部分
        super(frame,s);//显式调用父类构造函数
        textField=new JTextField(10);
        button=new JButton("按钮");
        add(textField);
        add(button);
        setModal(true);//设置为有模式对话框
        setBounds(60,60,100,100);
        //setVisible(true);对话框事先不设置可视性，不可视。
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}

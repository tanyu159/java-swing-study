import javax.swing.*;

/**
 * 自定义的空布局面板
 */
public class NullPanel extends JPanel {
    JButton button;
    JTextField textField;
    public NullPanel(){
        setLayout(null);//设置布局类型
        button=new JButton("确定");//实例化组件
        textField=new JTextField();//实例化组件
        //将组件加入该面板
        add(button);
        add(textField);
        //设置他们大小和位置
        textField.setBounds(100,30,90,30);
        button.setBounds(190,30,66,30);
    }
}

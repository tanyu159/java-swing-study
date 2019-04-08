import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InteractorListener implements ActionListener {
    private JTextField textField;
    private JTextArea textArea;
    public void setJTextField(JTextField textField)
    {
        this.textField=textField;

    }
    public void setJTextArea(JTextArea textArea)
    {
        this.textArea=textArea;
    }

    /**
     * 实现接口函数
     */
    public void actionPerformed(ActionEvent e)
    {
        String input=textField.getText();//获取到文本框的输入
        textArea.append("输入的是"+input+"长度为"+input.length()+"\n");//再将该输入作用到窗口中的组件
    }
}

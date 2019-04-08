import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputListener implements ActionListener {
    //通过拿到组件引用获得里面的值的方法
    private JTextField textField;
    public void setJTextField(JTextField textField)
    {
        this.textField=textField;
    }


    /**
     * 实现该接口的方法
     * @param e
     */
    public void actionPerformed(ActionEvent e)
    {
        //通过ActionEvent对象来获得输入
        //String str=e.getActionCommand();
        //System.out.println("输入了"+str+"长度为："+str.length());

        //不使用ActionEvent对象来获得组件的值，通过组件引用来拿到值
        String str=textField.getText();
        System.out.println("输入了"+str+"长度为："+str.length());
    }
}

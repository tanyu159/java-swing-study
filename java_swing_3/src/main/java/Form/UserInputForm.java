package Form;

import javax.swing.*;
import java.awt.*;

/**
 * 展示java swing中的常见组件
 */
public class UserInputForm extends JFrame{
    JLabel usernameLabel;
    JLabel passwordLabel;
    JLabel personalInfoLabel;
    JTextField usernameInput;
    JPasswordField passwordInput;
    JTextArea personalInputArea;
    JCheckBox checkBox1;
    JCheckBox checkBox2;
    JRadioButton men;
    JRadioButton women;
    JComboBox<String> countryComboBox;
    ButtonGroup buttonGroup;//用于单选框的归组
    JButton submitBtn;
    public UserInputForm(String title,int posX,int posY,int width,int height)
    {
        init();
        setTitle(title);
        setLocation(posX,posY);
        setSize(width,height);
        setVisible(true);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    private void init()
    {
        setLayout(new FlowLayout());//设置布局
        usernameLabel=new JLabel("用户名");
        passwordLabel=new JLabel("密码");
        personalInfoLabel=new JLabel("个人信息");
        usernameInput=new JTextField();
        passwordInput=new JPasswordField();
        personalInputArea=new JTextArea();
        checkBox1=new JCheckBox("哈哈");
        checkBox2=new JCheckBox("嘻嘻");
        men=new JRadioButton("男");
        women=new JRadioButton("女");
        buttonGroup=new ButtonGroup();
        buttonGroup.add(men);
        buttonGroup.add(women);
        countryComboBox=new JComboBox<String>();
        countryComboBox.addItem("下拉选项1");
        countryComboBox.addItem("下拉选项2");
        submitBtn=new JButton("提交");
        //将这些组件加入到这个窗口中-才可以显示
        add(usernameLabel);
        add(passwordLabel);
        add(personalInfoLabel);
        add(usernameInput);
        add(passwordInput);
        add(personalInputArea);
        add(checkBox1);
        add(checkBox2);
        add(men);
        add(women);
        add(countryComboBox);
        add(submitBtn);
    }
}

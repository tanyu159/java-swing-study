package BoxLayoutDemo;

import javax.swing.*;

public class UserInputPanel extends JFrame {
    private Box userInputBox;//用户输入部分的盒子，主要包含了用户名和密码,垂直排列
    private Box usernameBox;//用户名盒子，包含两个部分，一个label一个TextFiled,水平排列
    private Box passwordBox;//密码盒子，包含两个部分，一个label一个passwordField,水平排列
    private Box buttonBox;//按钮盒子，包含登录和忘记密码两个按钮,水平排列
    private JLabel userNameLabel;//
    private JLabel passwordLabel;//两个label组件提示用户
    private JTextField userNameInput;//用户名输入框
    private JPasswordField passwordInput;//密码输入框
    private JButton loginBtn;//登录按钮
    private JButton forgetPasswordBtn;//忘记密码按钮
    public UserInputPanel()
    {

        //实例化所有的对象
        userNameLabel=new JLabel("用户名");
        passwordLabel=new JLabel("密码");
        userNameInput=new JTextField();
        passwordInput=new JPasswordField();
        loginBtn=new JButton("登录");
        forgetPasswordBtn=new JButton("忘记密码");
        userInputBox=Box.createVerticalBox();//内部组件，垂直排列
        buttonBox=Box.createHorizontalBox();//内部组件，水平排列
        usernameBox=Box.createHorizontalBox();//内部组件，水平排列
        passwordBox=Box.createHorizontalBox();//内部组件，水平排列
        //将用户名相关内容加入用户名盒子
        usernameBox.add(userNameLabel);
        usernameBox.add(Box.createHorizontalStrut(10));//输入框与label的横向间隔
        usernameBox.add(userNameInput);
        //将密码相关内容加入密码盒子
        passwordBox.add(passwordLabel);
        passwordBox.add(Box.createHorizontalStrut(10));//输入框和label的横向间距
        passwordBox.add(passwordInput);
        //将用户名盒子和密码盒子加入用户输入userInputBox盒子
        userInputBox.add(usernameBox);
        userInputBox.add(Box.createVerticalStrut(10));//两行之间的间距
        userInputBox.add(passwordBox);
        //将两个按钮加入到按钮盒子
        buttonBox.add(Box.createHorizontalStrut(20));//第一个按钮和左边界的距离
        buttonBox.add(loginBtn);
        buttonBox.add(Box.createHorizontalStrut(10));//两个按钮之间的间距
        buttonBox.add(forgetPasswordBtn);
        //这个面板为空布局
        //设置这两个大盒子userInputBox和buttonBox的位置
        setLayout(null);
        setBounds(50,50,500,400);//该窗口本身的位置和大小
        //加入这两个大Box
        add(userInputBox);
        add(buttonBox);
        //设置这两个大Box的位置和大小
        userInputBox.setBounds(20,20,400,100);
        buttonBox.setBounds(20,200,400,100);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        validate();
    }
}

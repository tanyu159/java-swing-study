import org.omg.PortableInterceptor.INACTIVE;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.RandomAccessFile;

public class InputForm extends JFrame {
    private File file;
    private RandomAccessFile out;
    //以下这个大盒子内部元素，垂直排布【即把4个中盒子垂直排布】
    private Box mainBox;
    //以下这4个中盒子内部元素,水平排布
    private Box nameInputBox;
    private Box emailInputBox;
    private Box phoneInputBox;
    private Box buttonBox;
    //姓名部分
    private JLabel nameLabel;
    private JTextField nameText;
    //邮箱部分
    private JLabel emailLabel;
    private JTextField emailText;
    //电话部分
    private JLabel phoneLabel;
    private JTextField phoneText;
    //录入按钮
    private JLabel inputButtonLabel;
    private JButton inputButton;

    private InputFormListener inputFormListener;

    public InputForm()
    {
        //GUI部分
        nameLabel=new JLabel("姓名");
        emailLabel=new JLabel("邮箱");
        phoneLabel=new JLabel("电话");
        inputButtonLabel=new JLabel("单击录入");
        nameText=new JTextField(8);
        emailText=new JTextField(8);
        phoneText=new JTextField(8);
        inputButton=new JButton("录入");
        setLayout(new FlowLayout());
        mainBox=Box.createVerticalBox();//该盒子内部元素垂直分布
        nameInputBox=Box.createHorizontalBox();//以下4个中盒子内组件是水平分布
        emailInputBox=Box.createHorizontalBox();
        phoneInputBox=Box.createHorizontalBox();
        buttonBox=Box.createHorizontalBox();
        //将组件加入盒子
        nameInputBox.add(nameLabel);
        nameInputBox.add(Box.createHorizontalStrut(10));
        nameInputBox.add(nameText);
        emailInputBox.add(emailLabel);
        emailInputBox.add(Box.createHorizontalStrut(10));
        emailInputBox.add(emailText);
        phoneInputBox.add(phoneLabel);
        phoneInputBox.add(Box.createHorizontalStrut(10));
        phoneInputBox.add(phoneText);
        buttonBox.add(inputButtonLabel);
        buttonBox.add(Box.createHorizontalStrut(10));
        buttonBox.add(inputButton);
        //中盒子加入大盒子
        mainBox.add(nameInputBox);
        mainBox.add(emailInputBox);
        mainBox.add(phoneInputBox);
        mainBox.add(buttonBox);
        //大盒子加入界面
        add(mainBox);
        setVisible(true);
        setSize(200,200);
        //设置监听器
        inputFormListener=new InputFormListener();
        inputFormListener.setEmail(emailText);
        inputFormListener.setName(nameText);
        inputFormListener.setPhone(phoneText);
        //添加监听器
        inputButton.addActionListener(inputFormListener);
    }
}

import javax.swing.*;
import java.awt.*;

/**
 * 演示一个计算器
 */
public class CaculatorForm extends JFrame {
    private JTextField inputNum1;//第一个操作数
    private JTextField inputNum2;//第二个操作数
    private JComboBox choiceFuhao;//操作符
    private JButton caculateBtn;//进行计算
    private JTextArea resTextArea;//结果显示区
    //监视器定义
    private CaculateListener caculateListener;
    private FuhaoListener fuhaoListener;

    public CaculatorForm()
    {
        //GUI部分
        setLayout(new FlowLayout());
        inputNum1=new JTextField(10);
        inputNum2=new JTextField(10);
        choiceFuhao=new JComboBox();
        String []fuhaos={"+","-","*","/"};
        for(String temp:fuhaos)
        {
            choiceFuhao.addItem(temp);
        }
        caculateBtn=new JButton("计算");
        resTextArea=new JTextArea(9,30);
        add(inputNum1);
        add(inputNum2);
        add(choiceFuhao);
        add(caculateBtn);
        add(resTextArea);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setBounds(100,100,390,360);
        setTitle("计算器");


        //设置监听器
        caculateListener=new CaculateListener();
        fuhaoListener=new FuhaoListener();
        //设置组件
        fuhaoListener.setCaculateListener(caculateListener);//最重要的一步，因为该窗体涉及到两个监听器，且之间有通讯
        caculateListener.setNum1(inputNum1);
        caculateListener.setNum2(inputNum2);
        caculateListener.setCaculateBtn(caculateBtn);
        caculateListener.setResultArea(resTextArea);
        fuhaoListener.setFuhaoBox(choiceFuhao);

        //添加监听
        choiceFuhao.addItemListener(fuhaoListener);
        caculateBtn.addActionListener(caculateListener);
    }

}

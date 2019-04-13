package Controller;

import Model.Triangle;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleListener implements ActionListener {
    private JTextArea resultArea;//视图显示结果
    private JTextField textFieldA;//输入的边
    private JTextField textFieldB;
    private JTextField textFieldC;

    public void setResultArea(JTextArea resultArea) {
        this.resultArea = resultArea;
    }

    public void setTextFieldA(JTextField textFieldA) {
        this.textFieldA = textFieldA;
    }

    public void setTextFieldB(JTextField textFieldB) {
        this.textFieldB = textFieldB;
    }

    public void setTextFieldC(JTextField textFieldC) {
        this.textFieldC = textFieldC;
    }

    /**
     * 触发该函数的只能是那一个按钮，所以不用ActionEvent去判定他的ActionCommand
     * @param e
     */
    public void actionPerformed(ActionEvent e)
    {
        //获得三条边值
        try {
            double a = Double.parseDouble(textFieldA.getText());
            double b = Double.parseDouble(textFieldB.getText());
            double c = Double.parseDouble(textFieldC.getText());
            //构建Model对象
            Triangle triangle=new Triangle(a,b,c);
            String areaStr=triangle.getArea();
            resultArea.append("面积是："+areaStr+"\n");
        }catch (Exception exception)
        {
            System.out.println("解析数据发生异常。异常信息："+e);
            resultArea.setText("请输入数字");//提示用户输入有误
        }

    }
}

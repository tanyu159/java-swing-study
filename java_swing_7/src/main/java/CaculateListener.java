import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CaculateListener implements ActionListener {
    private String fuhao;
    public void setFuhao(String fuhao)
    {
        this.fuhao=fuhao;
    }
    private JTextField num1;
    private JTextField num2;
    private JButton caculateBtn;
    private JTextArea resultArea;

    public void setNum1(JTextField num1) {
        this.num1 = num1;
    }

    public void setNum2(JTextField num2) {
        this.num2 = num2;
    }

    public void setCaculateBtn(JButton caculateBtn) {
        this.caculateBtn = caculateBtn;
    }

    public void setResultArea(JTextArea resultArea) {
        this.resultArea = resultArea;
    }

    /**
     * 实现该接口的函数
     * @param actionEvent
     */
    public void actionPerformed(ActionEvent actionEvent)
    {
        try {
            double d1 = Double.parseDouble(num1.getText());
            double d2=Double.parseDouble(num2.getText());
            double res=0;
            if(fuhao.equals("+"))
            {
                res=d1+d2;
            }else if(fuhao.equals("-"))
            {
                res=d1-d2;
            }else if(fuhao.equals("*"))
            {
                res=d1*d2;
            }else if(fuhao.equals("/"))
            {
                res=d1/d2;
            }
            resultArea.append(d1+fuhao+d2+"结果为"+res+"\n");
        }catch (Exception e)
        {
            System.out.println("发生运算错误，异常信息为："+e);
        }
    }
}

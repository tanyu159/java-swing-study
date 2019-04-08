import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SimpleListener extends WindowAdapter implements ActionListener {

    private JLabel tipLabel;//提示框
    private JTextField input;//输入数字的框
    private int randomNum=0;

    public void setTipLabel(JLabel tipLabel) {
        this.tipLabel = tipLabel;
    }

    public void setInput(JTextField input) {
        this.input = input;
    }

    /**
     * 实现ActionListener接口的函数，其监听两个按钮的点击，通过actionCommand来判断不同的按钮【需在GUI代码时设置actionCommand且设置相同的Listener，即这个】
     * @param e
     */
    public void actionPerformed(ActionEvent e)
    {

        if(e.getActionCommand().equals("spawnButton"))
        {
            randomNum=(int)(Math.random()*100+1);
            tipLabel.setText("请输入");
            System.out.println("随机生成的数是"+randomNum);

        }else if(e.getActionCommand().equals("enterButton"))
        {
            int guess=0;
            try {
                guess=Integer.parseInt(input.getText());
                System.out.println("输入的数是"+guess);
                if(guess==randomNum)
                {
                    tipLabel.setText("猜对了");
                }else if(guess>randomNum)
                {
                    tipLabel.setText("猜大了");
                }else if(guess<randomNum)
                {
                    tipLabel.setText("猜小了");
                }
            }catch (Exception e1){
                System.out.println("发生解析异常,异常信息为："+e1);
            }

        }
    }

    /**
     * 重写WIndowAdpater中的函数，关闭时调用
     * @param event
     */
    @Override
    public void windowClosing(WindowEvent event)
    {
        System.out.println("窗口关闭中");
    }

}

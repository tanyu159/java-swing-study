import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args)
    {
        //java Swing学习
        //生成窗口
        JFrame windows1=new JFrame("窗口1");
        JFrame windows2=new JFrame("窗口2");
        Container container1=windows1.getContentPane();//获得这个窗口的内容面板
        container1.setBackground(Color.blue);//设置背景颜色
        windows1.setBounds(60,100,188,108);//设置位置大小
        windows2.setBounds(260,100,188,108);
        windows1.setVisible(true);//可视性设置
        windows1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//设置按x后的操作.[这个只是关闭那个窗口]
        windows2.setVisible(true);
        windows2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置按x后的操作.[这个是关闭整个程序,将会关闭所有窗口]
    }

}

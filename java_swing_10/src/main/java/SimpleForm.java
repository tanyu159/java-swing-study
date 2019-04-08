import javax.swing.*;
import java.awt.*;

public class SimpleForm extends JFrame {

    private JTextArea outPut;
    private MouseDragListener listener;
    public SimpleForm()
    {
        //GUI部分
        setLayout(new FlowLayout());
        outPut=new JTextArea(9,15);
        add(outPut);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setBounds(10,10,460,360);

        //设置监听器
        listener=new MouseDragListener();
        listener.setOutPut(outPut);
        //添加监听器
        addMouseMotionListener(listener);//本窗口添加监听器
        outPut.addMouseMotionListener(listener);
    }
}

import javax.swing.*;
import java.awt.*;

/**
 * 用于演示的主面板-其自身也使用了BorderLayout布局
 */
public class MixedForm extends JFrame {
    private GridPanel gridPanel;//自定义的格子面板对象
    private NullPanel nullPanel;//自定义的空布局面板对象
    private JTabbedPane tabbedPane;//选项卡面板
    public MixedForm()
    {
        gridPanel=new GridPanel();//实例化格子面板对象
        nullPanel=new NullPanel();//实例化空布局面板对象
        tabbedPane=new JTabbedPane();//实例化选项卡面板
        //将两个自定义的面板加入到选项卡面板下，通过选项卡可进行切换
        tabbedPane.add("格子布局面板",gridPanel);
        tabbedPane.add("空布局面板",nullPanel);
        //设置这个MixedForm的布局模式为BorderLayout
        setLayout(new BorderLayout());
        //将这个选项卡面板添加入该MixedForm的中区域
        add(tabbedPane,BorderLayout.CENTER);
        //随便填充几个，将东南西北填充完
        add(new JButton("东"),BorderLayout.EAST);
        add(new JButton("南"),BorderLayout.SOUTH);
        add(new JButton("西"),BorderLayout.WEST);
        add(new JButton("北"),BorderLayout.NORTH);
        //设置MixedForm的相关属性
        setBounds(10,10,570,390);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
}

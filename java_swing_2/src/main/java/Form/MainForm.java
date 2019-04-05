package Form;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * 创建一个带菜单条，菜单项，子菜单的窗口
 */
public class MainForm extends JFrame {
    JMenuBar menuBar;//菜单条
    JMenu menu1,menu2,submenu;//菜单
    JMenuItem item1,item2;//菜单项

    /**
     * 创建这个窗口的构造函数
     * @param title 窗口名字
     * @param posX X坐标
     * @param posY Y坐标
     * @param width 宽
     * @param height 高
     */
    public MainForm(String title,int posX,int posY,int width,int height)
    {
        init(title);

        //setIconImage();//设置窗体图标
        setLocation(posX,posY);//该函数继承至JFrame用于设置位置
        setSize(width,height);//该函数继承至JFrame用于设置大小
        setVisible(true);//同上，设置可视性
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//同上，设置关闭时的操作
    }

    private void init(String title)
    {
        setTitle(title);//继承至JFrame,设置窗口标题
        menuBar =new JMenuBar();//实例化菜单条
        menu1=new JMenu("菜单1");//实例化菜单
        menu2=new JMenu("菜单2");//同上
        submenu=new JMenu("子菜单1");//同上
        item1=new JMenuItem("菜单项1",new ImageIcon("/home/zuikaku/图片/1.png"));//实例化菜单项并设置图标
        item2=new JMenuItem("菜单项2",new ImageIcon("/home/zuikaku/图片/1.png"));//实例化菜单项并设置图标
        item1.setAccelerator(KeyStroke.getKeyStroke('A'));//设置快捷键
        item2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,KeyEvent.CTRL_MASK));//设置组合快捷键
        menu1.add(item1);//将菜单项添加入菜单中
        menu1.addSeparator();
        menu1.add(item2);//同上
        menu1.add(submenu);//将菜单加入菜单中，即作为其子菜单
        submenu.add(new JMenuItem("子菜单项1",new ImageIcon("/home/zuikaku/图片/1.png")));//子菜单中添加菜单项
        submenu.add(new JMenuItem("子菜单项2",new ImageIcon("/home/zuikaku/图片/1.png")));//子菜单中添加菜单项
        menuBar.add(menu1);//菜单条中添加菜单
        menuBar.add(menu2);//同上
        setJMenuBar(menuBar);//将该菜单条设置给这个窗口
    }

}

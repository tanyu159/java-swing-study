import javax.swing.*;
import java.awt.*;
import java.io.File;

public class MainForm extends JFrame {
    private File file;
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem input,show;//两个菜单项
    private JTextArea textArea;
    //private InputForm inputForm;//录入窗口
    private MainFormListener mainFormListener;

    public MainForm()
    {
        file=new File("PhoneNumberBook.txt");
        //GUI部分
        menuBar=new JMenuBar();
        menu=new JMenu("菜单选项");
        input=new JMenuItem("录入");
        input.setActionCommand("input");//设置ActionCommand方便listener分辨
        show=new JMenuItem("刷新显示");
        show.setActionCommand("show");//设置ActionCommand方便listener分辨
        menu.add(input);
        menu.add(show);
        menuBar.add(menu);
        setJMenuBar(menuBar);
        textArea=new JTextArea(12,20);
        add(new JScrollPane(textArea));
        setVisible(true);
        setBounds(100,50,420,380);
        //设置监听器
        mainFormListener=new MainFormListener();
        mainFormListener.setFile(file);
        mainFormListener.setTextArea(textArea);

        //添加监听器
        show.addActionListener(mainFormListener);
        input.addActionListener(mainFormListener);
    }


}

import javax.swing.*;
import java.awt.*;

public class DocumentForm extends JFrame {
    private JTextArea inputText,outputText;
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem copy,cut,paste;
    //监听器
    private EditorListener editorListener;
    private MenuItemListener menuItemListener;

    public DocumentForm()
    {
        //GUI部分
        setLayout(new FlowLayout());
        inputText=new JTextArea(15,20);
        outputText=new JTextArea(15,20);
        outputText.setLineWrap(true);//设置文本区自动换行
        outputText.setWrapStyleWord(true);//设置自动换行，以单词
        menuBar=new JMenuBar();
        menu=new JMenu("编辑");
        copy=new JMenuItem("复制");
        cut=new JMenuItem("剪切");
        paste=new JMenuItem("粘贴");
        copy.setActionCommand("copy");//设置代号-为使MenuItemListener能够判别具体的是哪个菜单项被点击
        cut.setActionCommand("cut");//同上
        paste.setActionCommand("paste");//同上
        //将菜单项加入菜单中
        menu.add(copy);
        menu.add(cut);
        menu.add(paste);
        //菜单加入菜单条
        menuBar.add(menu);
        //界面加入这些组件，以滚动文本域的方式
        add(new JScrollPane(inputText));
        add(new JScrollPane(outputText));
        setJMenuBar(menuBar);
        setVisible(true);
        setBounds(100,100,590,500);
        setTitle("单词排序");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        //设置监听器
        editorListener=new EditorListener();
        menuItemListener=new MenuItemListener();
        editorListener.setInputArea(inputText);
        editorListener.setOutputArea(outputText);
        menuItemListener.setInputArea(inputText);
        menuItemListener.setOutputArea(outputText);
        //添加监听器
        inputText.getDocument().addDocumentListener(editorListener);//DocumentListener
        //菜单项中3个的Listener使用的是相同的
        copy.addActionListener(menuItemListener);
        cut.addActionListener(menuItemListener);
        paste.addActionListener(menuItemListener);

    }
}

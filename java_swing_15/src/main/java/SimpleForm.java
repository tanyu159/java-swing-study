import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.xml.bind.annotation.XmlType;
import java.awt.*;

public class SimpleForm extends JFrame {
    private JTree tree;//树组件
    private JTextArea textArea;//显示信息
    private SimpleListener listener;
    public SimpleForm()
    {
        //Gui部分
        setLayout(new GridLayout(1,2));
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        setBounds(80,80,300,300);
        textArea=new JTextArea();
        add(new JScrollPane(textArea));
        //树结构部分
        DefaultMutableTreeNode rootNode=new DefaultMutableTreeNode("商品");//定义根节点
        DefaultMutableTreeNode TVtypeNode=new DefaultMutableTreeNode("电视类");//定义子节点（有分支）
        DefaultMutableTreeNode PhoneTypeNode=new DefaultMutableTreeNode("手机类");//定义子节点（有分支
        //定义叶节点的对象
        Goods changhongTV=new Goods("长虹电视",1000);
        Goods haierTV=new Goods("海尔电视",2000);
        Goods nokiaPhone=new Goods("诺基亚手机",500);
        Goods samsungPhone=new Goods("三星手机",600);
        //创建叶节点
        DefaultMutableTreeNode changhongTvNode=new DefaultMutableTreeNode(changhongTV);
        DefaultMutableTreeNode haierTvNode=new DefaultMutableTreeNode(haierTV);
        DefaultMutableTreeNode nokiaNode=new DefaultMutableTreeNode(nokiaPhone);
        DefaultMutableTreeNode samsungNode=new DefaultMutableTreeNode(samsungPhone);
        //指定父子关系
        TVtypeNode.add(changhongTvNode);
        TVtypeNode.add(haierTvNode);
        PhoneTypeNode.add(nokiaNode);
        PhoneTypeNode.add(samsungNode);
        rootNode.add(TVtypeNode);
        rootNode.add(PhoneTypeNode);
        //实例化树，并设置根节点
        tree=new JTree(rootNode);
        //把树加入该界面进行显示
        add(new JScrollPane(tree));
        //设置监听器
        listener=new SimpleListener();
        listener.setTree(tree);
        listener.setTextArea(textArea);
        //添加监听器
        tree.addTreeSelectionListener(listener);
    }
}

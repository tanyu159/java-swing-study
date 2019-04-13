import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

public class SimpleListener implements TreeSelectionListener {
    private JTree tree;//这个树
    private JTextArea textArea;//显示区域
    public void setTree(JTree tree) {
        this.tree = tree;
    }

    public void setTextArea(JTextArea textArea) {
        this.textArea = textArea;
    }

    public void valueChanged(TreeSelectionEvent e) {
        //获得当前树选中的叶子节点
        DefaultMutableTreeNode selectedNode=(DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
        if(selectedNode.isLeaf())
        {
            //选中的节点为叶子节点的情况下。JtextArea才会有变化
            Goods selectGoods=(Goods) selectedNode.getUserObject();//获得选中节点存储的东西
            //将该商品信息进行显示
            textArea.append(selectGoods.getName()+"价格为"+selectGoods.getPrice()+"\n");
        }

    }
}

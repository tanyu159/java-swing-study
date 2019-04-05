import javax.swing.*;
import java.awt.*;

/**
 * 格子布局演示
 */
public class GridPanel extends JPanel {
    public GridPanel()
    {
        GridLayout gridLayout=new GridLayout(12,12);//生成格子布局对象。构造时设置格子
        setLayout(gridLayout);//为该panel设置布局
        JLabel [][]labels=new JLabel[12][12];//格子中的组件
        for(int i=0;i<=11;i++)
        {
            for(int j=0;j<=11;j++)
            {
                labels[i][j]=new JLabel();
                if((i+j)%2==0)
                    labels[i][j].setText("A");
                else
                    labels[i][j].setText("B");
                add(labels[i][j]);//将该组件加入到面板中
            }
        }
    }
}

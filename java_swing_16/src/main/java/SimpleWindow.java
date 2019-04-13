import javax.swing.*;
import java.awt.*;

public class SimpleWindow extends JFrame {
    private JTable table;
    private Object [][]data;
    private Object []columName;
    private JButton button;
    private SimpleListener listener;

    public SimpleWindow()
    {
        //GUI部分
        setLayout(new BorderLayout());
        columName=new Object[]{"姓名","英语","数学","总成绩"};//该表格表头
        data=new Object[8][4];//该表格将会是8行4列
        for(int i=0;i<=data.length-1;i++)
        {
            for(int j=0;j<=data[i].length-1;j++)
            {
                if(j!=0)
                {
                    //即非第一列，第一列应该为姓名，其余列默认都为0
                    data[i][j]=0;
                }else {
                    //第一列设置为姓名
                    data[i][j]="姓名";
                }
            }
        }
        button=new JButton("计算总成绩");
        table=new JTable(data,columName);
        add(new JScrollPane(table),BorderLayout.CENTER);
        add(button,BorderLayout.SOUTH);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setBounds(100,100,200,200);
        //设置监听器
        listener=new SimpleListener();
        listener.setData(data);
        listener.setTable(table);
        //添加监听器
        button.addActionListener(listener);
    }
}

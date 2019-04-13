import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleListener implements ActionListener {
    private JTable table;
    private Object [][]data;

    public void setTable(JTable table) {
        this.table = table;
    }

    public void setData(Object[][] data) {
        this.data = data;
    }

    public void actionPerformed(ActionEvent actionEvent)
    {
        for(int i=0;i<8;i++)
        {
            double sum=0;
            boolean isNum=true;
            for(int j=1;j<=2;j++) {
                try {
                    sum += Double.parseDouble(data[i][j].toString());
                } catch (Exception e) {
                    //说明输入了不是数字的内容
                    isNum = false;
                    table.repaint();//表格重新绘制
                }
                if (isNum == true) {
                    //总分一栏
                    data[i][3] = String.valueOf(sum);
                    table.repaint();//表格重新绘制
                }
            }
        }
    }
}

import javax.print.attribute.standard.NumberUp;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.RandomAccessFile;

public class MainFormListener implements ActionListener {
    private File file;
    private JTextArea textArea;

    public void setFile(File file) {
        this.file = file;
    }

    public void setTextArea(JTextArea textArea) {
        this.textArea = textArea;
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("show"))
        {
            textArea.setText(null);//清空原有
            try{
                int idx=1;
                RandomAccessFile in=new RandomAccessFile(file,"r");
                String name=null;
                while((name=in.readUTF())!= null)
                {
                    //读的顺序和写入时是相同的
                    textArea.append("\n"+idx+" "+name);//读名字
                    textArea.append("\t"+in.readUTF());//读email
                    textArea.append("\t"+in.readUTF());//读phone
                    idx++;//
                }
                in.close();
            }catch (Exception e1)
            {
                System.out.println(e1);
            }

        }else if(e.getActionCommand().equals("input"))//点击的是录入
        {
            new InputForm();
        }
    }
}

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.RandomAccessFile;

public class InputFormListener implements ActionListener {
    private JTextField name;
    private JTextField email;
    private JTextField phone;

    public void setName(JTextField name) {
        this.name = name;
    }

    public void setEmail(JTextField email) {
        this.email = email;
    }

    public void setPhone(JTextField phone) {
        this.phone = phone;
    }

    public void actionPerformed(ActionEvent e) {
        //触发该函数只可能是录入按钮点击，所以不用判断ActionEvent
        try{
            File file=new File("PhoneNumberBook.txt");
            RandomAccessFile out=new RandomAccessFile(file,"rw");
            if(file.exists())
            {
                //如果文件存在，那么需基于已有的数据写入，所以要设置seek位置，否则以前的内容将会丢失
                long length= file.length();
                out.seek(length);
            }
            out.writeUTF("姓名："+name.getText());
            out.writeUTF("邮箱："+email.getText());
            out.writeUTF("电话："+phone.getText());
            out.close();
        }catch (Exception e1)
        {
            System.out.println(e1);
        }
    }
}

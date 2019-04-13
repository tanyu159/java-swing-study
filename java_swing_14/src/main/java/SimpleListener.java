import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleListener implements ActionListener {
    public void setMyDialog(MyDialog myDialog) {
        this.myDialog = myDialog;
    }

    private MyDialog myDialog;


    public void actionPerformed(ActionEvent event)
    {
        //开启这个自定义对话框
        myDialog.setVisible(true);
    }
}

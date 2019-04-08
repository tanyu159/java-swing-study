import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuItemListener implements ActionListener {
    private JTextArea inputArea,outputArea;
    public void setInputArea(JTextArea inputArea)
    {
        this.inputArea=inputArea;

    }
    public void setOutputArea(JTextArea outputArea)
    {
        this.outputArea=outputArea;
    }


    public void actionPerformed(ActionEvent e)
    {
        //判断按下的是哪个菜单项，因为3个菜单项共有一个Listener
        String actionCommand=e.getActionCommand();
        if(actionCommand.equals("copy"))
        {
            outputArea.copy();
        }else if(actionCommand.equals("cut"))
        {
            outputArea.cut();
        }else if(actionCommand.equals("paste"))
        {
            inputArea.paste();
        }
    }
}

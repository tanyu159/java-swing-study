import javax.swing.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SimpleListener implements KeyListener, FocusListener {
    public void focusGained(FocusEvent e){
        JTextField textField=(JTextField) e.getSource();
        textField.setText(null);
    }
    public void focusLost(FocusEvent e){}

    public void keyTyped(KeyEvent e){}
    public void keyPressed(KeyEvent e){
        JTextField t=(JTextField) e.getSource();
        if(t.getCaretPosition()>=5)
        {
            t.transferFocus();//每一个小栏只能输入6个，超过6个就换下一个
        }
    }
    public void keyReleased(KeyEvent e){

    }

}

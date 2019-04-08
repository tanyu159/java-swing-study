import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MousePushListener implements MouseListener {
    private JTextArea outPut;

    public void setOutPut(JTextArea outPut) {
        this.outPut = outPut;
    }

    public void mouseClicked(MouseEvent e){
        if(e.getClickCount()>=2)
        {
            outPut.append("鼠标连击，位置"+e.getX()+","+e.getY()+"\n");
        }
    }

    /**
     * Invoked when a mouse button has been pressed on a component.
     */
    public void mousePressed(MouseEvent e){
        outPut.append("鼠标按下：位置"+e.getX()+","+e.getY()+"\n");
    }

    /**
     * Invoked when a mouse button has been released on a component.
     */
    public void mouseReleased(MouseEvent e){
        outPut.append("鼠标释放：位置"+e.getX()+","+e.getY()+"\n");
    }

    /**
     * Invoked when the mouse enters a component.
     */
    public void mouseEntered(MouseEvent e){
        if(e.getSource() instanceof JButton)
        {
            outPut.append("鼠标进入按钮，位置"+e.getX()+","+e.getY()+"\n");
        }
        if(e.getSource() instanceof JTextField)
        {
            outPut.append("鼠标进入文本框，位置"+e.getX()+","+e.getY()+"\n");
        }
        if(e.getSource() instanceof JFrame)
        {
            outPut.append("鼠标进入窗口，位置"+e.getX()+","+e.getY()+"\n");
        }
    }

    /**
     * Invoked when the mouse exits a component.
     */
    public void mouseExited(MouseEvent e){
        outPut.append("鼠标退出，位置"+e.getX()+","+e.getY()+"\n");
    }

}

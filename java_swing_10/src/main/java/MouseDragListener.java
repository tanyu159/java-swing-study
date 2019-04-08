import org.omg.CORBA.PUBLIC_MEMBER;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseDragListener implements MouseMotionListener {
    private JTextArea outPut;

    public void setOutPut(JTextArea outPut) {
        this.outPut = outPut;
    }

    /**
     * 需实现的函数：鼠标拖拽时调用
     * @param e
     */

    public void mouseDragged(MouseEvent e)
   {
        outPut.setText("鼠标处于拖动状态,位置："+e.getX()+","+e.getY());
   }

    /**
     * 需实现的函数：鼠标移动时调用
     * @param e
     */
   public void mouseMoved(MouseEvent e)
   {
       outPut.setText("鼠标处于移动状态,位置："+e.getX()+","+e.getY());
   }


}

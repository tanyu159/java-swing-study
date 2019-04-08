import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class FuhaoListener implements ItemListener {
    private JComboBox fuhaoBox;//获得符号下拉菜单的引用，以便获取其中选到的值
    public void setFuhaoBox(JComboBox fuhaoBox)
    {
        this.fuhaoBox=fuhaoBox;
    }
    private CaculateListener caculateListener;//获得另一个监听器的引用，因为需要吧选则的运算符传过去
    public void setCaculateListener(CaculateListener listener)
    {
        this.caculateListener=listener;
    }


    /**
     * 实现函数
     * @param e
     */
    public void itemStateChanged(ItemEvent e)
    {
        System.out.println("符号设置了");
        String fuhao=fuhaoBox.getSelectedItem().toString();
        //要把这个符号设置给另一个Listener，让他知道运算符是啥
        caculateListener.setFuhao(fuhao);
    }

}

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.lang.ref.PhantomReference;
import java.lang.reflect.Array;
import java.util.Arrays;

public class EditorListener implements DocumentListener {
    private JTextArea inputArea;
    private JTextArea outputArea;


    public void setInputArea(JTextArea inputArea) {
        this.inputArea = inputArea;
    }

    public void setOutputArea(JTextArea outputArea) {
        this.outputArea = outputArea;
    }

    //实现该接口的3个核心函数
    //该案例的需求，只要变动了就进行排序，所以这3个函数执行的内容都是相同的，为了避免代码重复可以
    public void insertUpdate(DocumentEvent e)
    {
        sort();
    }
    public void removeUpdate(DocumentEvent e)
    {
        sort();
    }
    public void changedUpdate(DocumentEvent e)
    {
        sort();
    }

    /**
     * 排序单词函数
     */
    private void sort()
    {
        String regex="[\\s\\d\\p{Punct}]+";
        String inputStr=inputArea.getText();
        String[] words=inputStr.split(regex);
        Arrays.sort(words);
        outputArea.setText(null);
        for(String temp:words)
        {
            outputArea.append(temp+",");
        }
    }
}

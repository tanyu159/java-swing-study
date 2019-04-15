package com.zuikaku;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class SimpleListener implements ActionListener {
    private JTextArea textArea;
    private JFileChooser fileChooser;



    public void setFileChooser(JFileChooser fileChooser) {
        this.fileChooser = fileChooser;
    }

    public void setTextArea(JTextArea textArea) {
        this.textArea = textArea;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("open"))
        {
            //即打开文件 菜单项被点击
            int state= fileChooser.showOpenDialog(null);
            if(state==JFileChooser.APPROVE_OPTION) {
                File dir = fileChooser.getCurrentDirectory();//得到当前文件路径
                String fileName = fileChooser.getSelectedFile().getName();//获得文件名
                File file = new File(dir, fileName);
                try {
                    FileReader fileReader = new FileReader(file);
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    String content = "";
                    while ((content = bufferedReader.readLine()) != null)//循环读取其中内容
                    {
                        textArea.append(content + "\n");//在面板中显示
                    }
                    //关闭流
                    bufferedReader.close();
                    fileReader.close();
                } catch (IOException e2) {

                }
            }

        }else if(e.getActionCommand().equals("save"))
        {
            //即保存文件 菜单项被点击
            int state=fileChooser.showSaveDialog(null);//打开保存文件对话框
            if(state==JFileChooser.APPROVE_OPTION) {

                File dir = fileChooser.getCurrentDirectory();//得到当前文件路径
                String fileName = fileChooser.getSelectedFile().getName();//获得文件名
                File file = new File(dir, fileName);
                try {
                    FileWriter fileWriter = new FileWriter(file);//创建文件字符输出流
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);//创建缓冲输出流
                    bufferedWriter.write(textArea.getText());//写入多行文本框中的文字
                    //关闭流
                    bufferedWriter.close();
                    fileWriter.close();
                } catch (IOException e1) {

                }
            }
        }
    }
}

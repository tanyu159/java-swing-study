package com.zuikaku;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.image.DataBufferUShort;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class NotepadForm extends JFrame {
    //UI控件
    private JFileChooser fileChooser;
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem save,open;
    private JTextArea textArea;

    //监听器
    private SimpleListener listener;

    public NotepadForm()
    {
        //GUI部分
        setLayout(new FlowLayout());
        textArea=new JTextArea(10,10);
        textArea.setFont(new Font("楷体_gb2312",Font.PLAIN,28));
        add(new JScrollPane(textArea));
        menuBar=new JMenuBar();
        menu=new JMenu("文件");
        save=new JMenuItem("保存文件");
        save.setActionCommand("save");
        open=new JMenuItem("打开文件");
        open.setActionCommand("open");
        menu.add(open);
        menu.add(save);
        menuBar.add(menu);
        setJMenuBar(menuBar);
        setSize(300,400);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        //设置文件对话框
        fileChooser=new JFileChooser();
        FileNameExtensionFilter filter=new FileNameExtensionFilter("文本文件","txt");
        fileChooser.setFileFilter(filter);//设置文件过滤器
        //设置监听器
        listener=new SimpleListener();
        listener.setFileChooser(fileChooser);
        listener.setTextArea(textArea);
        //添加监听器
        save.addActionListener(listener);
        open.addActionListener(listener);
    }
}

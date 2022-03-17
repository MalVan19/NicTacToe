package com.company;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.util.Scanner;

public class fwb implements ActionListener{

    //массив, который запишеться
    JTextField jtField;
    JTextField jtF1;
    String str, str1;
    String [] str3={str,str1};
    String s = "test.txt";

    //Создаем окно с кнопкой
    fwb(){
        JFrame jfrm;
        JButton jbt1;
JLabel jl;
JLabel jl1;
        JTextField jtField1;
        jfrm = new JFrame("Игроки");
        jfrm.setLayout(null);
        jfrm.setSize(300,300);
        jfrm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jfrm.setResizable(false);
        jfrm.setVisible(true);

        jbt1 = new JButton("Save");
        jbt1.setBounds(100,100,100,50);
        jbt1.addActionListener(this);
        jfrm.add(jbt1);

        jl= new JLabel("Первый игрок");
        jl.setBounds(10,49,160,20);

        jl1= new JLabel("Второй игрок");
        jl1.setBounds(10,20,160,20);
        jfrm.add(jl1);

        jtField = new JTextField();
        jtF1 = new JTextField();
        jtField.setBounds(96, 49, 160, 20);

        jtF1.setBounds(96, 20, 160, 20);
        jfrm.add(jtField);
        jfrm.add(jtF1);

    }

    //метод записи массива в файл
  void filewrite()throws Exception{

        FileWriter fw = new FileWriter(s,true);
str= jtField.getText();
str1= jtF1.getText();
      fw.write("Первый игрок " +str+"\n");
      fw.write("Второй игрок "+str1+"\n");
        fw.close();
    }


    public void actionPerformed(ActionEvent ae) {
        try {
            filewrite();
        }
        catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}

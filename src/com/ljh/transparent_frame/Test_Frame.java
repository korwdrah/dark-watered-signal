package com.ljh.transparent_frame;

import java.awt.*;

public class Test_Frame {
    public static void main(String[] args) {
        System.out.println("This is a test frame");
        new MyFrame();
    }
}


class MyFrame extends Frame{
    public MyFrame()
    {
        setVisible(true);
        setBackground(Color.GRAY);
        setBounds(200,200,750,500);

    }
}
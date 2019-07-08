package com.t3h.game;

import javax.swing.*;

public class MyFrame extends JFrame {
    MyPanel myPanel;

    MyFrame(){
        setSize(500, 800);
        setLocationRelativeTo(null);

        myPanel = new MyPanel();
        setLayout(null);
        //dan giay len Frame
        add(myPanel);
    }
}

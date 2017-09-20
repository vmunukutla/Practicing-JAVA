package com.java21days;

import javax.swing.*;

class DVR extends JFrame{
    JButton play = new JButton("play");
    JButton stop_eject = new JButton("stop/eject");
    JButton rewind = new JButton("rewind");
    JButton fast_forward = new JButton("fast-forward");
    JButton pause = new JButton("pause");
        
    public DVR(){
        super("Excercise 1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pane = new JPanel();
        pane.add(play);
        pane.add(stop_eject);
        pane.add(rewind);
        pane.add(fast_forward);
        pane.add(pause);
        add(pane);
        pack();
        setVisible(true);
    }
    
    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception exc) {
            //ignore error
        }
    }
    
    
    public static void main(String[] arguments) {
        DVR.setLookAndFeel();
        DVR dr = new DVR();
    }
}
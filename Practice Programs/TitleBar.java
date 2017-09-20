package com.java21days;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class TitleBar extends JFrame implements ActionListener {
    JButton r, g;
    
    public TitleBar() {
        super("Title Bar");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        r = new JButton("Rosencrantz");
        g = new JButton("Guildenstern");
        r.addActionListener(this);
        g.addActionListener(this);
        FlowLayout flow = new FlowLayout();
        setLayout(flow);
        add(r);
        add(g);
        pack();
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent evt) {
        JButton source = (JButton)evt.getSource();
        setTitle(source.getText());
        repaint();
    }
    
    
    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception exc) {
            System.err.println("Couldn't use the system "
                + "look and feel: " + exc);
        }
    }
    
    public static void main(String[] arguments){
        TitleBar frame = new TitleBar();
    } 
}
package com.java21days;

import javax.swing.*;

class InputSetTitle extends JFrame{
    
    InputSetTitle() {
        super();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        String response = JOptionPane.showInputDialog(null, "Set Input Dialog Title");
        this.setTitle(response);
        pack();
        setVisible(true);
    }
    
    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e) {
            System.err.println("Couldn't use the system "
                + "look and feel: " + e);
        }
    }
    
    public static void main(String[] arguments) {
        InputSetTitle inst = new InputSetTitle();
    }
}
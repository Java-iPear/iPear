/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_pear;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Diego,Alessio
 */
public class GUI extends JFrame {
    
    MenuBar menu_bar    = new MenuBar();
    JPanel page         = new JPanel();
    
    
    public GUI() throws HeadlessException {
        this.menu_bar.setPreferredSize(new Dimension(584, 48));
        this.setLayout(new BorderLayout());
        this.add(this.menu_bar, BorderLayout.NORTH);
    }
    
    
}

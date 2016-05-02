/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_pear;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.swing.*;

/**
 *
 * @author Diego, Alessio
 */
public class MenuBar extends JPanel {
    
    JButton home_button     = new JButton("Home");
    JButton pc_button       = new JButton("PC & Laptop");
    JButton tablet_button   = new JButton("Tablet");
    JButton phone_button    = new JButton("SmartPhone");
    JButton shop_button     = new JButton("Carrello");
    
    GridLayout layout_panel  = new GridLayout(1, 9);

    public MenuBar(){
        this.add(new JLabel());
        
        this.setBackground(new Color(51,51,51));
        this.pc_button.setBackground(new Color(51,51,51));
        this.pc_button.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
        this.pc_button.setForeground(Color.white);
        this.pc_button.setBorderPainted(false);
        
        this.tablet_button.setBackground(new Color(51,51,51));
        this.tablet_button.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
        this.tablet_button.setForeground(Color.white);
        this.tablet_button.setBorderPainted(false);
        
        
        this.phone_button.setBackground(new Color(51,51,51));
        this.phone_button.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
        this.phone_button.setForeground(Color.white);
        this.phone_button.setBorderPainted(false);
        
        
        this.shop_button.setBackground(new Color(51,51,51));
        this.shop_button.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
        this.shop_button.setForeground(Color.white);
        this.shop_button.setBorderPainted(false);
        
        
        this.home_button.setBackground(new Color(51,51,51));
        this.home_button.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
        this.home_button.setForeground(Color.white);
        this.home_button.setBorderPainted(false);
        
        
        
        this.add(this.home_button);
        this.add(this.pc_button);
        this.add(this.tablet_button);
        this.add(this.phone_button);
        this.add(this.shop_button);
        this.add(new JLabel());
        this.setLayout(this.layout_panel);
        
    }
    
}

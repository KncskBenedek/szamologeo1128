/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nezet;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Label;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

/**
 *
 * @author koncsik.benedek
 */
public class SzamoloGepGui extends javax.swing.JFrame {

    public JLabel szam1Label;
    public JLabel szam2Label;
    public JSpinner szam1Field;
    public JSpinner szam2Field;
    public JButton kivonas;
    public JButton osszead;
    public JPanel szamokPanel;
    public JPanel muvPanel;

    public SzamoloGepGui() {
        
        this.muvPanel = new JPanel();
        this.szamokPanel = new JPanel();
        this.szam1Label = new JLabel("1. szám");
        this.szam2Label = new JLabel("2. Szám");
        this.szam1Field = new JSpinner();
        this.szam2Field = new JSpinner();
        this.kivonas = new JButton("kivonás");
        this.osszead = new JButton("összeadás");
        
        this.add((Component) this.szamokPanel);
        this.add((Component) this.muvPanel);
        this.szamokPanel.add((Component) this.szam1Label);
        this.szamokPanel.add((Component) this.szam1Field);
        this.szamokPanel.add((Component) this.szam2Label);
        this.szamokPanel.add((Component) this.szam2Field);
        this.add((Component) this.muvPanel);
        this.muvPanel.add((Component) this.osszead);
        this.muvPanel.add((Component) this.kivonas);
        this.setLayout(new GridLayout(1, 2));
        this.szamokPanel.setLayout(new GridLayout(2, 3));
        this.szamokPanel.setLayout(new GridLayout(2, 1));

        this.setSize(300,400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public JSpinner getSzam1Field() {
        return szam1Field;
    }

    public JSpinner getSzam2Field() {
        return szam2Field;
    }

    public JButton getKivonas() {
        return kivonas;
    }

    public JButton getOsszead() {
        return osszead;
    }

    public void eredmeny(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    

}

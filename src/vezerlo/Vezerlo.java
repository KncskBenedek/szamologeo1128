/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vezerlo;

import modell.SzamoloModell;
import nezet.KonzolosNezet;
import nezet.SzamoloGepGui;

/**
 *
 * @author koncsik.benedek
 */
public class Vezerlo {

    SzamoloModell szamologepMod;
    SzamoloGepGui guiNezet;
//    KonzolosNezet konzNezet;

    public Vezerlo() {

//        this.konzNezet = new KonzolosNezet();
//
//        Double szm1 = konzNezet.beker();
//        Double szm2 = konzNezet.beker();
//        this.szamologepMod = new SzamoloModell(szm1, szm2);
//
//        this.szamologepMod.osszead();
//
//        this.konzNezet.eredmeny(this.szamologepMod.toString());
//
//        this.szamologepMod.ujSzam(konzNezet.beker());
//        this.szamologepMod.kivon();
//        this.konzNezet.eredmeny(this.szamologepMod.toString());
        this.guiNezet = new SzamoloGepGui();

        this.guiNezet.getKivonas().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kivon();
            }
        });
        this.guiNezet.getOsszead()
                .addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        System.out.println("cica");
                        osszead();
                    }
                });
        this.guiNezet.setVisible(true);

    }

    public void kivon() {
        if (this.guiNezet.getSzam1Field().isEnabled()) {
            double szam1 = (double) this.guiNezet.getSzam1Field().getValue();
            double szam2 = (double) this.guiNezet.getSzam2Field().getValue();
            this.szamologepMod = new SzamoloModell(szam1, szam2);

        }
        this.szamologepMod.kivon();
        this.guiNezet.eredmeny(this.szamologepMod.toString());
    }

    public void osszead() {
        if (this.guiNezet.getSzam1Field().isEnabled()) {
            double szam1 =  (int) this.guiNezet.getSzam1Field().getValue();
            double szam2 = (int) this.guiNezet.getSzam2Field().getValue();
            //this.szamologepMod = new SzamoloModell(szam1, szam2);

        }
        //this.szamologepMod.osszead();
        //this.guiNezet.eredmeny(this.szamologepMod.toString());
    }
}

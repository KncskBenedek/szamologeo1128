/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

import java.util.ArrayList;

/**
 *
 * @author koncsik.benedek
 */
public class SzamoloModell {
    public  ArrayList<Double> szamok;
    public  ArrayList<Character> muveletek;
    public Double szam1;
    public Double szam2;

    public SzamoloModell() {
        this.muveletek = new ArrayList<>();
        this.szamok = new ArrayList<>();
    }

    
    
    public SzamoloModell(Double szam1, Double szam2) {
        this.muveletek = new ArrayList<>();
        this.szamok = new ArrayList<>();
        this.szam1 = szam1;
        this.szam2 = szam2;
        this.szamok.add(this.szam1);
        this.szamok.add(this.szam2);
    }

    public void ujSzam(Double szam){
        this.szamok.add(szam);
        this.szam2 = szam;
    }
    
    public void osszead(){
        this.muveletek.add('+');
        this.szam1 = this.szam1 + this.szam2;
        this.szam2 = 0.0;
    }
    
        
    public void kivon(){
       this.muveletek.add('-');
       this.szam1 = this.szam1 - this.szam2;
    }

    @Override
    public String toString() {
       String kimenet = "";
        for (int i = 0; i < muveletek.size(); i++) {
            kimenet += szamok.get(i) + " ";
            kimenet += muveletek.get(i) + " ";
        }
        kimenet += szamok.get(szamok.size()-1) + " ";
        kimenet += "= "+this.szam1;
        return kimenet;
    }

    public Double getSzam1() {
        return szam1;
    }

    public Double getSzam2() {
        return szam2;
    }
    

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nezet;

import java.util.Scanner;

/**
 *
 * @author koncsik.benedek
 */
public class KonzolosNezet {
    Scanner scn;
    public KonzolosNezet() {
        scn = new Scanner(System.in);
    }
     
    public Double beker(){
        System.out.println("1, szám");
        Double szam = scn.nextDouble();
        return szam;
    }
    
    public void eredmeny(String eredmeny){
        System.out.println(eredmeny);
    }
}

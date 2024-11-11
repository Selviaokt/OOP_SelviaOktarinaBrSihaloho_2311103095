/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop_2311103095_selviaoktarinabrsihaloho;

/**
 *
 * @author Selvi
 */
public class OOP_2311103095_SelviaOktarinaBrSihaloho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("******************************************");
        System.out.println("                 WELCOME                ");
        System.out.println("         WARNET SELVIA UHUY     ");
        System.out.println("******************************************\n");
        Komputer komputer = new Komputer(20, "Warnet Selvia", 15000);
        komputer.informasi();
        System.out.println("******************************************");

        KomputerVIP komputerVIP = new KomputerVIP(15, "Warnet Selvia ", 37000, true); //ini misale punya VIP CARD "true" kalo ga punya ya "false"
        System.out.println("******************************************");

        komputerVIP.informasi();
        komputerVIP.tambahJam("Sihaloho", 2, 3);
        System.out.println("******************************************");

        KomputerPremium komputerPremium = new KomputerPremium(5, "Warnet Selvia", 50000, true);
        komputerPremium.informasi();
        komputerPremium.pesan(5);
        komputerPremium.tambahLayanan("Mie Aceh");
        komputerPremium.tambahLayanan("Mie Aceh", "Es Teh");
        
    }
 }
    

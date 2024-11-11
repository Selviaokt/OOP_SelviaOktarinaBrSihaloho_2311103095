/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_2311103095_selviaoktarinabrsihaloho;

/**
 *
 * @author Selvi
 */
class KomputerVIP extends Komputer {
    private boolean vipCard;
    
    public KomputerVIP(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean vipCard){
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.vipCard = vipCard;
    }
    
    @Override
    public void informasi(){
        super.informasi();
        System.out.println("Status                   : "+(vipCard ? "VIP" : "Non VIP"));
        System.out.println("Benefit member VIP       : "+(vipCard ? "\nDiskon 10% untuk bermain diatas 3 jam\nGratis minuman setia 3 jam" : "jangan ngarep benefit yeahh"));
    }
    
    public void tambahJam(String username, int jam, int menitTambahan){
        System.out.println("Login dengan username    : "+username);
                System.out.println("Bermain selama           : "+jam+ " jam");
        System.out.println("Nambah biling selama     : "+jam+ " jam " +menitTambahan+ " menit");
    } 
}

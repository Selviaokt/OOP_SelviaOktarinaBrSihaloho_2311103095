/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_2311103095_selviaoktarinabrsihaloho;

/**
 *
 * @author Selvi
 */
class KomputerPremium extends Komputer {
    private boolean ruangPrivat;

    public KomputerPremium(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean ruangPrivat) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.ruangPrivat = ruangPrivat;
    }

    @Override
    public void informasi() {
        super.informasi();
        System.out.println("Status                   : " + (ruangPrivat ? "Ruangan Premium" : "Ruangan Standar"));
        System.out.println("Fasilitas Ruang " + (ruangPrivat ? "Premium" : "Standar") + "  :");
        if (ruangPrivat) {
            System.out.println("- Ruangan ber-AC pribadi");
            System.out.println("- Sofa gaming exclusive");
            System.out.println("- Komputer spesifikasi tinggi");
            System.out.println("- Koneksi internet dedicated 100Mbps");
        } else {
            System.out.println("- Ruangan gerah");
            System.out.println("- Sofa majapahit");
            System.out.println("- Komputer spesifikasi rendah");
            System.out.println("- Koneksi internet dedicated 1Mbps");
        }
    }

    public void pesan(int nomorKomputer) {
        System.out.println("Memesan komputer nomor   : " + nomorKomputer);
    }

    public void tambahLayanan(String makanan) {
        System.out.println("Menambah layanan makanan : " + makanan);
    }

    public void tambahLayanan(String makanan, String minuman) {
        System.out.println("Menambah layanan makanan : " + makanan + " dan minuman: " + minuman);
    }
}



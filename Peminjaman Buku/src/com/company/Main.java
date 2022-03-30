package com.company;

import java.time.LocalDate;

class Mahasiswa {
    String nama;
    int NPM;
    String fakultas;
    String prodi;
    Buku buku;
    Waktu waktu;

    void pinjambuku(Buku buku){
        this.buku = buku;
    }
    void bataswaktu(Waktu waktu){
        this.waktu = waktu;
    }

    Mahasiswa (String nama, int NPM, String fakultas, String prodi){
        this.nama = nama;
        this.NPM = NPM;
        this.fakultas = fakultas;
        this.prodi = prodi;
    }
    void datapeminjam(){
        System.out.println("\nPeminjam\n========================\n");
        System.out.println("Nama    : " + nama);
        System.out.println("NPM     : " + NPM);
        System.out.println("Fakultas: " + fakultas);
        System.out.println("Prodi   : " + prodi);
        System.out.println("\nBuku Yang Dipinjam\n========================\n");
        buku.databuku();
        System.out.println("\nBatas Waktu Peminjaman\n========================\n");
        waktu.bataswaktu();
    }

}
class Buku{
    String judul;
    String penulis;
    String penerbit;
    int tahun_terbit;

    Buku(String judul,String penulis, String penerbit, int tahun_terbit){
        this.judul = judul;
        this.penulis = penulis;
        this. penerbit = penerbit;
        this.tahun_terbit = tahun_terbit;
    }
    void databuku(){
        System.out.println("Judul   :" + judul);
        System.out.println("Penulis :" + penulis);
        System.out.println("Penerbit:" + penerbit);
        System.out.println("Tahun   :" + tahun_terbit);
    }

}
class Waktu{
    String pengembalian_buku;
    LocalDate tanggal_pinjam = LocalDate.now();

    Waktu(String pengembalian_buku){
        this.pengembalian_buku = pengembalian_buku;
    }
    void bataswaktu(){
        System.out.println("Tanggal Pinjam      :" + tanggal_pinjam.toString());
        System.out.println("Pengembalian Buku   :" + pengembalian_buku);
    }
}


public class Main {

    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Rendy", 2015061010, "Teknik", "TI");
        Buku buku1 = new Buku("Sherlock Holmes", "Sir Arthur", "Immortal Publishing", 2019);
        Waktu bataswaktu1 = new Waktu( "1 minggu");

        mhs1.pinjambuku(buku1);
        mhs1.bataswaktu(bataswaktu1);

        mhs1.datapeminjam();

    }
}

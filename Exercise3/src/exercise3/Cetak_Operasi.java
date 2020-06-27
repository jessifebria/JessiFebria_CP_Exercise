
package exercise3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cetak_Operasi {
    
    private static void cetaksemua(Operasi_Angka OB,double x, double y){
        OB.setA(x);
        OB.setB(y);
        OB.setC();
        OB.tampil();
    }
    
    static void menu(){
        Scanner scan= new Scanner(System.in);
        int p=0;
        double a=0;
        double b=0;
        int pilih=0;
        System.out.println("");
        System.out.println("========================================");
        System.out.println("M E N U    A W A L");
        System.out.println("1. Hitung Luas Persegi");
        System.out.println("2. Hitung Luas Persegi Panjang");
        System.out.println("3. Hitung Luas Segitiga");
        System.out.println("4. Hitung Luas Jajar Genjang");
        System.out.println("5. Hitung Luas Lingkaran");
        System.out.println("6. Keluar Program");
        System.out.print("Masukkan pilihan anda [1-6] : ");
        try {
            pilih=scan.nextInt();
        if (pilih==1) {
            System.out.println("--- HITUNG LUAS PERSEGI PANJANG ---");
            System.out.print("Masukkan panjang sisi persegi : ");
            a=scan.nextInt();
            Persegi persegi = new Persegi();
            cetaksemua(persegi,a,1);
            menu();
        }
        
        else if (pilih==2) {
            System.out.println("--- HITUNG LUAS PERSEGI PANJANG ---");
            System.out.print("Masukkan panjang : ");
            a=scan.nextInt();
            System.out.print("Masukkan lebar : ");
            b=scan.nextInt();
            Persegi_Panjang persegi_panjang = new Persegi_Panjang();
             cetaksemua(persegi_panjang,a,b);
            menu();
        }
        else if (pilih==3) {
            System.out.println("--- HITUNG LUAS SEGITIGA ---");
            System.out.print("Masukkan alas : ");
            a=scan.nextInt();
            System.out.print("Masukkan tinggi : ");
            b=scan.nextInt();
            Segitiga segitiga = new Segitiga();
            cetaksemua(segitiga,a,b);
            menu();
        }
        else if (pilih==4) {
            System.out.println("--- HITUNG LUAS JAJAR GENJANG ---");
            System.out.print("Masukkan alas : ");
            a=scan.nextInt();
            System.out.print("Masukkan tinggi : ");
            b=scan.nextInt();
            Jajar_Genjang jajar_genjang = new Jajar_Genjang();
            cetaksemua(jajar_genjang,a,b);
            menu();
        }
        else if (pilih==5) {
            System.out.println("--- HITUNG LUAS LINGKARAN ---");
            System.out.print("Masukkan jari-jari : ");
            a=scan.nextInt();
            Lingkaran lingkaran = new Lingkaran();
            cetaksemua(lingkaran,a,1);
            menu();
        }
        else if (pilih==6) {
            System.out.println("Anda akan keluar dari program");
            System.exit(0);
        }
        else{
            System.out.println("Pilihan tidak diketahui, mohon masukkan pilihan menu dengan benar [1-6]");
            menu();
        }
        }
        catch(InputMismatchException e){
            System.out.println("Maaf, program error! Jenis error : "+e);
            System.out.println("Program akan diulang");
            menu();
        }
    }
    
    public static void main(String[] args) {
        menu();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tatangsulaeman.tabungan.uts;
import java.util.Scanner;
/**
 * @author 
 * NAMA     : TATANG SULAEMAN
 * KELAS    : PBOIF2
 * NIM      : 10119068
 * UTS
 */
public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int saldo ,jumlah;
        
        System.out.println("=====Program Penarikan Uang=====");
        System.out.print("Masukan saldo awal : ");
        saldo = scanner.nextInt();
        Tabungan tabungan = new Tabungan(saldo);
        System.out.print("Jumlah uang yang diambil : ");
        jumlah = scanner.nextInt();
        System.out.println("Saldo Anda Sekarang : " + tabungan.ambilUang(jumlah));
        
        
    }
}

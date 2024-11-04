/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si.pkg23176014.latihan28.gantikata;

/**
 *
 * @author User
 * NAMA     : Muhammad Nur Khikam
 * KELAS    : Sistem Informasi
 * NIM      : 23176014
 * Deskripsi Program :Program ini adalah program sederhana untuk mengganti kata dalam sebuah kalimat
 */
import java.util.Scanner;

public class SI23176014Latihan28GantiKata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Kalimat: ");
        String kalimat = scanner.nextLine();

        System.out.print("Ganti Kata: ");
        String kataAsli = scanner.nextLine();

        System.out.print("Menjadi Kata: ");
        String kataBaru = scanner.nextLine();

        String kalimatBaru = kalimat.replaceAll(kataAsli, kataBaru);

        System.out.println("Kalimat awal: " + kalimat);
        System.out.println("Kalimat baru: " + kalimatBaru);
    }
}
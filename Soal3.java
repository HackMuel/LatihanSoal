package LatihanSoal;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        String kalimat;
        Scanner input = new Scanner(System.in);
        int sumkata = 1;
        System.out.print("Masukkan Kalimat Dalam Camecase :  ");
        kalimat = input.next();
        char[] kata = kalimat.toCharArray();

        char karakterPertama = kalimat.charAt(0);
        if ((int) karakterPertama >= 65 && (int) karakterPertama <= 90) {
            System.out.print("Kalimat yang Anda masukan tidak dalam format Camecase !! ");
        }else {
            for (char huruf : kata) {
                if ((int) huruf >= 65 && (int) huruf <= 90) {
                    sumkata++;
                }
            }
            System.out.println("Jumlah kata : " + sumkata);
        }
    }
}

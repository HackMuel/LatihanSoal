package LatihanSoal;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nilai N : ");
        n = input.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {


                if (j >= (n - i)) {
                    System.out.println("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("\n");
        }
    }
}


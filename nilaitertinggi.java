//Buatlah sebuah program untuk mencari nilai tertinggi dari sekumpulan data. User perlu memasukkan
//terlebih dahulu jumlah data yang diinginkan (minimal 5 data), kemudian nomor urutan dan nilai pada
//setiap datanya diisi dan disimpan dalam variabel array 1 demensi. Program harus membandingkan setiap 
//nilai yang dimasukkan untuk menadpatkan nilai tertinggi. Tampilkan nilai tertinggi beserta posisi indeks
//array-nya
//Nama: Alexandria Brilliant Christova
//NIM: 25410100008

import java.util.Scanner;
public class nilaitertinggi {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahData;

    // 1. Meminta input jumlah data dengan validasi minimal 5
        do {
            System.out.print("Masukkan jumlah data (minimal 5): ");
            jumlahData = input.nextInt();
            
            if (jumlahData < 5) {
                System.out.println("Maaf, data harus minimal 5. Silakan coba lagi.");
            }
        } while (jumlahData < 5);

        // 2. Deklarasi Array 1 Dimensi
        int[] dataNilai = new int[jumlahData];

        // 3. Input nilai ke dalam array
        System.out.println("--- Masukkan Nilai ---");
        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Data ke-" + (i + 1) + ": ");
            dataNilai[i] = input.nextInt();
        }

        // 4. Proses mencari nilai tertinggi dan indeksnya
        int nilaiTertinggi = dataNilai[0];
        int indeksTertinggi = 0;

        for (int i = 1; i < jumlahData; i++) {
            if (dataNilai[i] > nilaiTertinggi) {
                nilaiTertinggi = dataNilai[i];
                indeksTertinggi = i;
            }
        }

        // 5. Menampilkan hasil
        System.out.println("\n--- Hasil Pencarian ---");
        System.out.println("Nilai Tertinggi      : " + nilaiTertinggi);
        System.out.println("Berada pada Indeks ke: " + indeksTertinggi);
        
        input.close();
    }
}
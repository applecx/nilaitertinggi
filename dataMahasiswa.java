import java.util.Scanner;

public class dataMahasiswa {
    public static void tampilkanMahasiswa(String nama, String nim, double ipk) {
        System.out.println("\n---------------------------------");
        System.out.println("         KARTU MAHASISWA         ");
        System.out.println("---------------------------------");
        System.out.println("Nama lengkap : " + nama);
        System.out.println("NIM          : " + nim);
        System.out.println("IPK Terakhir : " + ipk);
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine(); 

        System.out.print("Masukkan NIM : ");
        String nim = input.nextLine(); 

        System.out.print("Masukkan IPK : ");
        String inputIpk = input.nextLine(); 
        
        double ipk = Double.parseDouble(inputIpk); 

        tampilkanMahasiswa(nama, nim, ipk);
        
        input.close();
    }
}
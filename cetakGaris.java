public class cetakGaris {

    public static void cetakGaris() {
        for (int i = 0; i < 30; i++) {
            System.out.print("=");
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        // Cukup panggil 3 kali berturut-turut sesuai perintah
        cetakGaris();
        cetakGaris();
        cetakGaris();
    }
}

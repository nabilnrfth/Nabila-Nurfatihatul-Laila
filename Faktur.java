// Main class

import java.util.Scanner;

public class Faktur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
             // Mengambil input dari pengguna
            System.out.print("Masukkan No Faktur: ");
            String noFaktur = scanner.nextLine();

            System.out.print("Masukkan Kode Barang: ");
            String kodeBarang = scanner.nextLine();

            System.out.print("Masukkan Nama Barang: ");
            String namaBarang = scanner.nextLine();

            System.out.print("Masukkan Harga Barang: ");
            double hargaBarang = scanner.nextDouble(); // Konversi string ke double

            System.out.print("Masukkan Jumlah Beli: ");
            int jumlahBeli = scanner.nextInt(); // Konversi string ke integer

            // Validasi input: Harga atau jumlah tidak boleh negatif
            if (hargaBarang < 0 || jumlahBeli < 0) {
                throw new IllegalArgumentException("Harga atau jumlah tidak boleh negatif.");
            }

             // Membuat objek Transaksi (menggunakan inheritance)
            Transaksi transaksi = new Transaksi(noFaktur, kodeBarang, namaBarang, hargaBarang, jumlahBeli);
            transaksi.tampilkanDetail();

        } catch (IllegalArgumentException e) {
            // Menangani exception jika input tidak valid (contoh: harga/jumlah negatif)
            System.out.println("Error: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Error: Input tidak valid.");

        } finally {
            scanner.close();
        }
    }
}
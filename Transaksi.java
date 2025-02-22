// Child class yang mewarisi (inherits) dari parent class Barang
class Transaksi extends Barang {
    private String noFaktur;
    private int jumlahBeli;

     // Constructor pada child class, memanggil constructor dari parent class dengan `super()`
    public Transaksi(String noFaktur, String kodeBarang, String namaBarang, double hargaBarang, int jumlahBeli) {
        super(kodeBarang, namaBarang, hargaBarang);  // Memanggil constructor dari parent class
        this.noFaktur = noFaktur;
        this.jumlahBeli = jumlahBeli;
    }

    // Metode untuk menampilkan detail transaksi
    public void tampilkanDetail() {
        double total = hitungTotal(jumlahBeli); // Menggunakan metode yang diwarisi dari parent class
        System.out.println("\n--- Detail Transaksi ---");
        System.out.println("No Faktur    : " + noFaktur);
        System.out.println("Kode Barang  : " + kodeBarang);
        System.out.println("Nama Barang  : " + namaBarang);
        System.out.println("Harga Barang : Rp " + hargaBarang);
        System.out.println("Jumlah Beli  : " + jumlahBeli);
        System.out.println("Total Bayar  : Rp " + total);
    }
}
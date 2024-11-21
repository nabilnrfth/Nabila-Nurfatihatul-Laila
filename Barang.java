// Parent class
class Barang {
    protected String kodeBarang;
    protected String namaBarang;
    protected double hargaBarang;

     // Constructor pada parent class
    public Barang(String kodeBarang, String namaBarang, double hargaBarang) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
    }

    // Metode untuk menghitung total harga (digunakan oleh child class)
    public double hitungTotal(int jumlah) {
        return hargaBarang * jumlah;
    }
}






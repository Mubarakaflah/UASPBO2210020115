public class Buku {
    private int id;
    private String judul;
    private String penulis;
    private int jumlahHalaman;
    private double harga;

    public void DaftarBuku() {
        System.out.println("Ini method untuk Baca Buku");
    }
    public void DiscountBuku() {
        System.out.println("Ini method untuk menandai halaman");
    }
    public void PromoBuku() {
        System.out.println("Ini method untuk Menutup Buku");
    }
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getJudul() {
        return this.judul;
    }
    public void setJudul(String judul) {
        this.judul = judul;
    }
    public String getPenulis() {
        return this.penulis;
    }
    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }
    public int getJumlahHalaman() {
        return this.jumlahHalaman;
    }
    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }
    public double getHarga() {
        return this.harga;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }
    public Buku() {
        System.out.println("Object Buku telah diciptakan");
    }
    public void naikkanHarga() {
        System.out.println("Harga buku telah dinaikkan sebesar 10. Harga baru: " + this.harga);
    }
    public void naikkanHarga(double kenaikan) {
        System.out.println("Harga buku telah dinaikkan sebesar " + kenaikan + ". Harga baru: " + this.harga);
        
    }
}

public class Museum {
    private int id;
    private String nama;
    private String lokasi;

    // Konstruktor
    public Museum(int id, String nama, String lokasi) {
        this.id = id;
        this.nama = nama;
        this.lokasi = lokasi;
        System.out.println("Objek Museum telah dibuat!");
    }

    // Getter
    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getLokasi() {
        return lokasi;
    }

    // Setter
    public void setId(int id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    // Metode lainnya
    public void cetakDetail() {
        System.out.println("ID: " + id + ", Nama: " + nama + ", Lokasi: " + lokasi);
        public class MuseumSejarah extends Museum {
            private String eraSejarah;
        
            // Konstruktor
            public MuseumSejarah(int id, String nama, String lokasi, String eraSejarah) {
                super(id, nama, lokasi);
                this.eraSejarah = eraSejarah;
            }
        
            // Overloading
            public void cetakDetail(String prefix) {
                System.out.println(prefix + "ID: " + getId() + ", Nama: " + getNama() + ", Lokasi: " + getLokasi() + ", Era Sejarah: " + eraSejarah);
            }
        
            // Overriding
            @Override
            public void cetakDetail() {
                System.out.println("ID: " + getId() + ", Nama: " + getNama() + ", Lokasi: " + getLokasi() + ", Era Sejarah: " + eraSejarah);
       
    }
}

public class Tamu extends Pengguna {
    private int sisaMasaAktif;

    public void menambahkanMasaAktif(){
        this.sisaMasaAktif = this.sisaMasaAktif + tambahan;
    }

    public void hapus() {
        System.out.println("DELETE FROM pengguna WHERE status='Tamu'");
    }
    public void login() {
        System.out.println("Login sebagai tamu");
    }
}

public class Produk {
    private String kodeProduk;
    private String nama;
    private int stok;

    public Produk(String kodeProduk, String nama, int stok) {
        this.kodeProduk = kodeProduk;
        this.nama = nama;
        this.stok = stok;
        }

    public String getKodeProduk() {
        return kodeProduk;
    }    

    public void setKodeProduk(String kodeProduk) {
        this.kodeProduk = kodeProduk;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void tampilkanInfo() {
        System.out.println("kode: " + kodeProduk + " | Nama: " + nama + " | Stok: " + stok);
        
    }
}
import java.util.HashMap;

public class MainInventaris {
    public static void main(String[] args) {
        HashMap<String, Produk> mapInventaris = new HashMap<>();

        mapInventaris.put("P001", new Produk("P001", "Laptop LOQ", 10));
        mapInventaris.put("P002", new Produk("P002", "Iphone", 25));
        mapInventaris.put("P003", new Produk("P003", "Headset Wireless", 15));
        mapInventaris.put("P004", new Produk("P004", "Kacamata AI", 8));
        mapInventaris.put("P005", new Produk("P005", "Topi",12));

        System.out.println("=== DAFTAR INVENTARIS BARANG (AWAL) ===");
        int totalStokAwal = 0;
        for (String key : mapInventaris.keySet()) {
            Produk p = mapInventaris.get(key);
            p.tampilkanInfo();
            totalStokAwal += p.getStok(); 
        }
        System.out.println("Total Stok Barang Saat Ini: " + totalStokAwal);
        System.out.println("----------------------------------------");

        String kodeUpdate = "P002" ;
        if (mapInventaris.containsKey(kodeUpdate)) {
            System.out.println("\n[UPDATE] Mengubah stok produk" + kodeUpdate + " (Iphone)");
        }

        String kodeHapus = "P005" ;
        if (mapInventaris.containsKey(kodeHapus)) {
            System.out.println("[HAPUS] Menghapus produk " + kodeHapus + " (Topi) dari inventaris");
        }
        System.out.println("\n=== DAFTAR INVENTARIS BARANG (AKHIR) ===");
        int totalStokAkhir = 0;
        for (String key : mapInventaris.keySet()) {
            Produk p = mapInventaris.get(key);
            p.tampilkanInfo();
            totalStokAkhir += p.getStok();
        }
        System.out.println("Total Stok Barang Sekarang: " + totalStokAkhir);


    }
}
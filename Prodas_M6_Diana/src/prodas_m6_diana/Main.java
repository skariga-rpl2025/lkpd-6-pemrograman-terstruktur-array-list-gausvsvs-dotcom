package prodas_m6_diana;

public class Main {

    public static void main(String[] args) {

        Perpustakaan perpus = new Perpustakaan();
        perpus.tambahBuku("Belajar JAVA", "Umar Bakrie");
        perpus.tambahBuku("Java untuk pemula", "Amir Mahmud");
        perpus.tambahBuku("Java untuk ahli", "Salim Iklim");
        System.out.println("Jumlah Buku ; " + perpus.jumlahBuku());
        perpus.tambahBuku("Java untuk mahasiswa","Farid Akbar");
        
        //cari Buku
        String cari = "Penulis";
        System.out.println("Cari buku dengan kata kunci : " + cari);
        Buku buku = perpus.cariBuku(cari);
        if (buku == null) {
            System.out.println("Buku tidak ditemukan");
        } else {
        }
        System.out.println("Buku ditemukan dengan judul : " + buku.getJudul() + ",pengarang : " + buku.getPengarang());
        
        //ganti buku
        perpus.gantiBuku(0, "Belajar JAVA Baru" , "Umar Barkie Salim");
        buku = perpus.lihatBuku(0);
        System.out.println("Buku doganti dengan judul : " + buku.getJudul() + ", pengarang : " + buku.getPengarang());
        
        //hapus buku
        perpus.hapusBuku(0);
        System.out.println("Jumlah Buku" + perpus.jumlahBuku());
    }
}
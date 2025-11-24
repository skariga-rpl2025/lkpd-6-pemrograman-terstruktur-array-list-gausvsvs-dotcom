package prodas_m6_diana;

import java.util.ArrayList;

public class Perpustakaan {

    private ArrayList<Buku> koleksiBuku = new ArrayList<>();

    //jumlah Buku
    public int jumlahBuku() {
        return koleksiBuku.size();
    }

    //Tambah Buku
    public void tambahBuku(String judul, String pengarang) {
        koleksiBuku.add(new Buku(judul, pengarang));
    }

    //edit Buku baru
    public void gantiBuku(int index, String judul, String pengarang) {
        koleksiBuku.set (index, new Buku(judul, pengarang));
    }
    
    //edit buku dengan buku lama
    public void gantiBuku(int index, Buku baru){
        koleksiBuku.set(index, baru);
    }
    
    //hapus dari array
    public void hapusBuku(int index){
        koleksiBuku.remove(index);
    }
    
    //cari buku berdasarkan index
    public Buku lihatBuku (int index){
        return koleksiBuku.get(index);
    }
    
    // cari buku berdasarkan judul
    public Buku cariBuku(String judul){
        for(Buku buku : koleksiBuku){
            if (buku.getJudul().contains(judul)){
                return buku;
            }
        }
        return null;
    }
    
    // cari index buku berdasarkan objek buku
    public int cariIndex(Buku buku){
        for (int i = 0; i < koleksiBuku.size(); i++){
            if (koleksiBuku.get(i).equals(buku)){
                return i;
            }
        }
        return -1;
    }
}

package Tugas;

import java.util.ArrayList;

public class DataMahaSiswa {

    private ArrayList<MahaSiswa> daftar = new ArrayList<>();

    public void tambah(MahaSiswa mhs) {
        daftar.add(mhs);
        System.out.println("Data berhasil ditambahkan!");
    }

    public MahaSiswa cari(String npm) {
        for (MahaSiswa m : daftar) {
            if (m.getNpm().equals(npm)) {
                return m;
            }
        }
        return null;
    }
    
    public void edit(String npm, String namaBaru, String alamatBaru){
        MahaSiswa m = cari(npm);
        if (m != null) {
            m.setNama(namaBaru);
            m.setAlamat(alamatBaru);
            System.out.println("Data hasil diubah!");
            
        }else{
            System.out.println("Data tidak ditemukan");
        }
    }
    
    public void hapus (String npm) {
        MahaSiswa m = cari (npm);
        if (m != null){
        daftar.remove(m);
            System.out.println("Data berhasil dihapus!");
    }else{
            System.out.println("Data tidak ditemukan!");
        }
    }
    
    public void tampil(){
        System.out.println("====== DATA MAHASISWA =======");
        for (MahaSiswa m : daftar){
            System.out.println("m");
        }
        System.out.println("==============================");
    }
}

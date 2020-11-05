/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119040.latihan13.perkenalanmahasiswa;
import if1.pkg10119040.latihan13.perkenalanmahasiswa.dataMhs;
/**
 *
 * @author Acer
 * Nama : Agus Deri Dermawan
 * Kelas: IF1
 * NIM  : 10119040
 * program menampilkan perkenalan diri
 */
public class IF110119040Latihan13PerkenalanMahasiswa {

    public static void perkenalanDiri(){
       dataMhs mahasiswa1 = new dataMhs();
       mahasiswa1.nim = "10119038";
       mahasiswa1.nama = "Diva Sanila Ramadhan";
       mahasiswa1.perkenalanDiri();
       
       dataMhs mahasiswa2 = new dataMhs();
       mahasiswa2.nim = "10119039";
       mahasiswa2.nama = "Rahman Ardiansyah";
       mahasiswa1.perkenalanDiri();
       
       dataMhs mahasiswa3 = new dataMhs();
       mahasiswa3.nim = "10119040";
       mahasiswa3.nama = "Agus Deri Dermawan";
       mahasiswa1.perkenalanDiri();
       
       dataMhs mahasiswa4 = new dataMhs();
       mahasiswa4.nim = "10119030";
       mahasiswa4.nama = "Rendi dermawan";
       mahasiswa1.perkenalanDiri();
    }
    public static void main(String[] args) {
        perkenalanDiri();
    }
    
}

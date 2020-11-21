/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119005.latihan59.objectorienteddetectiveconan;

/**
 *
 * @author Hayin
 * NAMA     : Hayin Ananta
 * KELAS    : IF-1
 * NIM      : 10119005
 * Deskripsi Program : Program ini menampilkan Identitas karakter Detective conan
 *                     dengan berbasis objek
 */
public class Karakter extends Manusia {
    private String role, kepribadian;
    
    public String getRole() {
        return this.role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }
    
    public String getKepribadian() {
        return this.kepribadian;
    }
    
    public void setKepribadian(String kepribadian) {
        this.kepribadian = kepribadian;
    }
    
    public void tampilKarakter() {
        System.out.println("Nama\t\t: " + super.getNama());
        System.out.println("Umur\t\t: " + super.getUmur());
        System.out.println("Kepribadian\t: " + getKepribadian());
        System.out.println("Role\t\t: " + getRole());
        System.out.println();
    }
}
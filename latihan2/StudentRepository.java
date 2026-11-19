// Abstraksi penyimpanan data (DIP): cara penyimpanan bisa diganti tanpa mengubah kelas lain
public interface StudentRepository {
    void simpan(String nama, double nilai);
}

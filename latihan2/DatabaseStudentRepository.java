// Tanggung jawab tunggal: menyimpan data ke database
public class DatabaseStudentRepository implements StudentRepository {
    @Override
    public void simpan(String nama, double nilai) {
        System.out.println("Menyimpan ke database: " + nama + " = " + nilai);
    }
}

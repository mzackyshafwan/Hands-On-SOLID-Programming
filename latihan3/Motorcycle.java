// Jenis kendaraan baru: cukup menambah kelas baru tanpa mengubah kode lama (OCP)
public class Motorcycle implements Movable, EngineStartable, Refuelable {
    @Override
    public void startEngine() {
        System.out.println("Menyalakan mesin sepeda motor...");
    }

    @Override
    public void isiBahanBakar() {
        System.out.println("Mengisi bensin sepeda motor...");
    }

    @Override
    public void move() {
        System.out.println("Sepeda motor melaju.");
    }
}

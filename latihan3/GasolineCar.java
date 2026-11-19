public class GasolineCar implements Movable, EngineStartable, Refuelable {
    @Override
    public void startEngine() {
        System.out.println("Menyalakan mesin mobil bensin...");
    }

    @Override
    public void isiBahanBakar() {
        System.out.println("Mengisi bahan bakar kendaraan...");
    }

    @Override
    public void move() {
        System.out.println("Mobil bensin berjalan.");
    }
}

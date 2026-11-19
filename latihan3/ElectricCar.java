public class ElectricCar implements Movable, EngineStartable, Rechargeable {
    @Override
    public void startEngine() {
        System.out.println("Menyalakan motor listrik mobil...");
    }

    @Override
    public void isiBaterai() {
        System.out.println("Mengisi baterai kendaraan listrik...");
    }

    @Override
    public void move() {
        System.out.println("Mobil listrik berjalan.");
    }
}

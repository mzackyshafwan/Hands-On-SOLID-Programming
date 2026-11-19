import java.util.List;

public class Main {
    public static void main(String[] args) {
        ElectricCar mobilListrik = new ElectricCar();
        mobilListrik.startEngine();
        mobilListrik.isiBaterai();

        Bicycle sepeda = new Bicycle();
        sepeda.move();
        // sepeda.startEngine();  // tidak bisa dikompilasi: sepeda tidak punya mesin

        // Semua kendaraan diperlakukan lewat abstraksi Movable
        List<Movable> armada = List.of(mobilListrik, new GasolineCar(), sepeda, new Motorcycle());
        for (Movable kendaraan : armada) {
            kendaraan.move();
        }
    }
}

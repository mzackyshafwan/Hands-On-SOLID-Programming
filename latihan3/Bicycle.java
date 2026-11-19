// Sepeda hanya Movable: tidak dipaksa punya mesin, bahan bakar, atau baterai
public class Bicycle implements Movable {
    @Override
    public void move() {
        System.out.println("Sepeda dikayuh.");
    }
}

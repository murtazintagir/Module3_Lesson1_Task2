package Flowershop.Flowers;

public class Rose extends Flower implements Flowershop.Flower {
    String name = "Роза";
    double cost = 100.0;

    @Override
    public String toString() {
        return "Rose{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}

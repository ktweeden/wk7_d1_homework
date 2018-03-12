import java.util.ArrayList;

public abstract class Rollercoaster implements IPaymentHandler{
    private int cost;
    private String name;
    private int takings;

    public Rollercoaster(int cost, String name) {
        this.cost = cost;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getCost() {
        return this.cost;
    }

    @Override
    public int getTakings() {
        return this.takings;
    }

    @Override
    public void incrementTakings(int amount) {
        this.takings += amount;
    }


}

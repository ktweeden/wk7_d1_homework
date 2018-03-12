public class Shop implements IPaymentHandler {

    private int cost;
    private String name;
    private int takings;

    public Shop(int cost, String name) {
        this.cost = cost;
        this.name = name;
        this.takings = 0;
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    @Override
    public void takePayment(IPayer payer) {
        if (payer.pay(this.getCost())) {
            this.incrementTakings(this.getCost());
        }
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

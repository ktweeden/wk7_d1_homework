public class ExtremeRollercoaster extends Rollercoaster {

    private int minHeight;

    public ExtremeRollercoaster(int cost, String name, int minHeight) {
        super(cost, name);
        this.minHeight = minHeight;
    }

    public int getMinHeight() {
        return minHeight;
    }

    @Override
    public void takePayment(IPayer payer) {
        if (payer.pay(this.getCost())) {
            this.incrementTakings(this.getCost());
        }
    }

    public boolean checkHeight(Customer customer) {
        if (customer.getHeight() >= this.minHeight) {
            return true;
        }
        else {return false;}
    }
}

public class MildRollercoaster extends Rollercoaster {

    public MildRollercoaster(int cost, String name) {
        super(cost, name);
    }

    @Override
    public void takePayment(IPayer payer) {
        if (payer.pay(this.getCost())) {
            this.incrementTakings(this.getCost());
        }
    }
}

public interface IPaymentHandler {

    public void takePayment(IPayer payer);

    public int getTakings();

    public void incrementTakings(int amount);
}

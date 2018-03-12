public class Customer implements IPayer {

    private int wallet;
    private int height;

    public Customer(int wallet, int height) {
        this.height = height;
        this.wallet = wallet;
    }

    public int getHeight() {
        return height;
    }

    public int getWallet() {
        return wallet;
    }

    @Override
    public boolean pay(int amount) {
        if (this.wallet > amount) {
            this.wallet -= amount;
            return true;
        }
        else {return false;}
    }

}

import java.util.ArrayList;

public class ThemePark {

    private String name;
    private ArrayList<Rollercoaster> rollercoasters;
    private ArrayList<Shop> shops;

    public ThemePark(String name) {
        this.name = name;
        this.rollercoasters = new ArrayList<>();
        this.shops = new ArrayList<>();
    }

    public String getName() {
        return name;
    }


    public ArrayList<Rollercoaster> getRollercoasters() {
        return rollercoasters;
    }

    public ArrayList<Shop> getShops() {
        return shops;
    }

    public void addRollercoaster(Rollercoaster rollercoaster) {
        this.rollercoasters.add(rollercoaster);
    }

    public void addShop(Shop shop) {
        this.shops.add(shop);
    }
}

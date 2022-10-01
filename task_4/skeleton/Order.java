public class Order {

    private int charge;
    private ArrayList<AuctionAsset> assetList;

    public Order(int charge, ArrayList<AuctionAsset> assets) {}

    public void removeAssets(ArrayList<AuctionAsset> assets) {
        Inventory i = new Inventory.getInstance()
        for(ArrayList<AuctionAsset> a : assets)
            i.removeEntry(a);
    }
}
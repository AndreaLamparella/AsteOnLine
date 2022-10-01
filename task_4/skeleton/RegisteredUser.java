public class RegisteredUser extends User{
	
    private String address;
    private String cellNumber;
    private String paymentData;

    private ArrayList<Auction> auctions;
    private ArrayList<AuctionAsset> goods;
    private ArrayList<Search> search;
    private ArrayList<Order> orders;
    private ArrayList<Bid> bids;    

    private RUControler controller = RUControler.getInstance(); 

    public void searchAuction(Search s) {
        controller.searchAuction(s);
    }
    public void login(String username, String password) {}

    public boolean insertAuctionAsset(AuctionAsset asset) {
        return controller.addAuctionAsset(asset);
    }

    public boolean modifyAuctionAsset(AcutionAsset _new, AuctionAsset _old) {
        return controller.modifyAuctionAsset(_new, _old);
    }

    public boolean subscribeAuction(String auctionName) {
        return controller.subscribeAuction(auctionName);
    }

    public void showAuctionResult(auctions) {
        controller.showAuctionResult(auctions);
    }
    
    public void showWonAuction(auctions) {
        controller.showWonAuction(auctions);
    }

    public boolean checkout(int amount) {
        return controller.makePayment(amount);
    }

    public boolean bid(int amount, String auctionAssetID) {
        return controller.bidAuctionAsset(amount, auctionAssetID);
    }
}
public class Mediator {

    private SwedishBuyer swedishBuyer;
    private FrenchBuyer frenchBuyer;
    private AmericanSeller americanSeller;
    private DollarConverter dollarConverter;

    public void registerSwedishBuyer(SwedishBuyer swedishBuyer) {
        this.swedishBuyer = swedishBuyer;
    }

    public void registerFrenchBuyer(FrenchBuyer frenchBuyer) {
        this.frenchBuyer = frenchBuyer;
    }

    public void registerAmericanSeller(AmericanSeller americanSeller) {
        this.americanSeller = americanSeller;
    }

    public void registerDollarConverter(DollarConverter dollarConverter) {
        this.dollarConverter = dollarConverter;
    }

    public boolean placeBid(float bid, String currency) {
        // Convert the bid to dollars using the DollarConverter
        float bidInDollars = dollarConverter.convertCurrencyToDollars(bid, currency);

        // Check with the AmericanSeller if the bid is acceptable
        return americanSeller.isBidAccepted(bidInDollars);
    }
}
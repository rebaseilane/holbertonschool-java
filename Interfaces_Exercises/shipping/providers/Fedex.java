package providers;

public class Fedex implements ShippingProvider {

    @Override
    public Shipping calculateShipping(double weight, double value) {
        double cost = (weight > 1000) ? value * 0.10 : value * 0.05;
        return new Shipping(cost, getShippingProviderType());
    }

    @Override
    public ShippingProviderType getShippingProviderType() {
        return ShippingProviderType.FEDEX;
    }
}
